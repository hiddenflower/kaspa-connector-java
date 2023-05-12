package ClientP2P;

import java.util.concurrent.CountDownLatch;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientP2PStreamObserver<T> implements StreamObserver<T> {
    private static final Logger log = LogManager.getLogger(ClientP2PStreamObserver.class);

    public ClientP2PStreamObserver() {

    }

    @Override
    public void onNext(T response) {
        log.info("new value:{}", response);
    }

    @Override
    public void onError(Throwable e) {
        log.error("got error", e);
    }

    @Override
    public void onCompleted() {
        log.info("request completed");
    }
}