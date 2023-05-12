package ClientP2P;

import java.util.concurrent.CountDownLatch;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientP2PStreamObserver<KaspadMessage> implements StreamObserver<KaspadMessage> {
    private static final Logger log = LogManager.getLogger(ClientP2PStreamObserver.class);
    private final CountDownLatch latch;

    public ClientP2PStreamObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(KaspadMessage kaspadMessage) {
        log.info(kaspadMessage.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        log.info(throwable.toString());
    }

    @Override
    public void onCompleted() {
        log.info("Completed");
    }
}