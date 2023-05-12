package ClientP2P;

import ApplicationProperties.ApplicationProperties;
import protowire.KaspadMessage;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ClientP2P {
    private static final Logger log = LogManager.getLogger(ClientP2P.class);

    public static void main(String[] args) throws InterruptedException {
        log.info("Client is starting...");

        Channel channel =  Grpc.newChannelBuilder(
                ApplicationProperties.getServerHost() + ":" + ApplicationProperties.getServerPort(),
                        InsecureChannelCredentials.create())
                .build();

        ClientP2PStreamObserver<KaspadMessage> clientP2PStreamObserver = new ClientP2PStreamObserver<KaspadMessage>();

        log.info("Client is shutting down...");
    }
}
