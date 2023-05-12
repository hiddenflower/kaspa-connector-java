package ClientP2P;

import ApplicationProperties.ApplicationProperties;
import io.grpc.stub.StreamObserver;
import protowire.KaspadMessage;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import protowire.P2PGrpc;
import protowire.P2PGrpc.P2PStub;

import java.util.concurrent.CountDownLatch;

// public class ClientP2P {
//    private static final Logger log = LogManager.getLogger(ClientP2P.class);
//
//    public static void main(String[] args) throws InterruptedException {
//        log.info("Client is starting...");
//
//        Channel channel =  Grpc.newChannelBuilder(
//                ApplicationProperties.getServerHost() + ":" + ApplicationProperties.getServerPort(),
//                        InsecureChannelCredentials.create())
//                .build();
//
//        ClientP2PStreamObserver<KaspadMessage> clientP2PStreamObserver = new ClientP2PStreamObserver<KaspadMessage>();
//
//
//
//        log.info("Client is shutting down...");
//    }
//}

public class ClientP2P {
    private static final Logger log = LogManager.getLogger(ClientP2P.class);

    public static void main(String[] args) throws InterruptedException {
        log.info("Client is starting...");

        var managedChannel = Grpc.newChannelBuilder(
                ApplicationProperties.getServerHost() +":" + ApplicationProperties.getServerPort(),
                        InsecureChannelCredentials.create()
                )
                .build();

        P2PStub asyncClient = P2PGrpc.newStub(managedChannel);

        var latch = new CountDownLatch(1);
        StreamObserver<KaspadMessage> kaspadMessageStreamObserver = asyncClient.messageStream(new ClientP2PStreamObserver<KaspadMessage>(latch));
        latch.await();

        log.info("Client is shutting down...");
        managedChannel.shutdown();
    }

    private static KaspadMessage kaspadMessageRequest() {
        return KaspadMessage.newBuilder()
                .build();
    }
}
