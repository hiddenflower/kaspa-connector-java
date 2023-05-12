package protowire;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: messages.proto")
public final class RPCGrpc {

  private RPCGrpc() {}

  public static final String SERVICE_NAME = "protowire.RPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protowire.KaspadMessage,
      protowire.KaspadMessage> getMessageStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MessageStream",
      requestType = protowire.KaspadMessage.class,
      responseType = protowire.KaspadMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<protowire.KaspadMessage,
      protowire.KaspadMessage> getMessageStreamMethod() {
    io.grpc.MethodDescriptor<protowire.KaspadMessage, protowire.KaspadMessage> getMessageStreamMethod;
    if ((getMessageStreamMethod = RPCGrpc.getMessageStreamMethod) == null) {
      synchronized (RPCGrpc.class) {
        if ((getMessageStreamMethod = RPCGrpc.getMessageStreamMethod) == null) {
          RPCGrpc.getMessageStreamMethod = getMessageStreamMethod =
              io.grpc.MethodDescriptor.<protowire.KaspadMessage, protowire.KaspadMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MessageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protowire.KaspadMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protowire.KaspadMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RPCMethodDescriptorSupplier("MessageStream"))
              .build();
        }
      }
    }
    return getMessageStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPCStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPCStub>() {
        @java.lang.Override
        public RPCStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPCStub(channel, callOptions);
        }
      };
    return RPCStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPCBlockingStub>() {
        @java.lang.Override
        public RPCBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPCBlockingStub(channel, callOptions);
        }
      };
    return RPCBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RPCFutureStub>() {
        @java.lang.Override
        public RPCFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RPCFutureStub(channel, callOptions);
        }
      };
    return RPCFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RPCImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<protowire.KaspadMessage> messageStream(
        io.grpc.stub.StreamObserver<protowire.KaspadMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMessageStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessageStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                protowire.KaspadMessage,
                protowire.KaspadMessage>(
                  this, METHODID_MESSAGE_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class RPCStub extends io.grpc.stub.AbstractAsyncStub<RPCStub> {
    private RPCStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<protowire.KaspadMessage> messageStream(
        io.grpc.stub.StreamObserver<protowire.KaspadMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMessageStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RPCBlockingStub extends io.grpc.stub.AbstractBlockingStub<RPCBlockingStub> {
    private RPCBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RPCFutureStub extends io.grpc.stub.AbstractFutureStub<RPCFutureStub> {
    private RPCFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MESSAGE_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.messageStream(
              (io.grpc.stub.StreamObserver<protowire.KaspadMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protowire.Messages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPC");
    }
  }

  private static final class RPCFileDescriptorSupplier
      extends RPCBaseDescriptorSupplier {
    RPCFileDescriptorSupplier() {}
  }

  private static final class RPCMethodDescriptorSupplier
      extends RPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RPCMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPCFileDescriptorSupplier())
              .addMethod(getMessageStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
