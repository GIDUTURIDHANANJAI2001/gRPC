package com.Instagramjavastubs.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Instagram.proto")
public final class InstagramServiceGrpc {

  private InstagramServiceGrpc() {}

  public static final String SERVICE_NAME = "InstagramService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Instagramjavastubs.grpc.Instagram.signupRequest,
      com.Instagramjavastubs.grpc.Instagram.signupResponse> getSignupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signup",
      requestType = com.Instagramjavastubs.grpc.Instagram.signupRequest.class,
      responseType = com.Instagramjavastubs.grpc.Instagram.signupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Instagramjavastubs.grpc.Instagram.signupRequest,
      com.Instagramjavastubs.grpc.Instagram.signupResponse> getSignupMethod() {
    io.grpc.MethodDescriptor<com.Instagramjavastubs.grpc.Instagram.signupRequest, com.Instagramjavastubs.grpc.Instagram.signupResponse> getSignupMethod;
    if ((getSignupMethod = InstagramServiceGrpc.getSignupMethod) == null) {
      synchronized (InstagramServiceGrpc.class) {
        if ((getSignupMethod = InstagramServiceGrpc.getSignupMethod) == null) {
          InstagramServiceGrpc.getSignupMethod = getSignupMethod = 
              io.grpc.MethodDescriptor.<com.Instagramjavastubs.grpc.Instagram.signupRequest, com.Instagramjavastubs.grpc.Instagram.signupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InstagramService", "signup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Instagramjavastubs.grpc.Instagram.signupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Instagramjavastubs.grpc.Instagram.signupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InstagramServiceMethodDescriptorSupplier("signup"))
                  .build();
          }
        }
     }
     return getSignupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstagramServiceStub newStub(io.grpc.Channel channel) {
    return new InstagramServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstagramServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstagramServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstagramServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstagramServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InstagramServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void signup(com.Instagramjavastubs.grpc.Instagram.signupRequest request,
        io.grpc.stub.StreamObserver<com.Instagramjavastubs.grpc.Instagram.signupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Instagramjavastubs.grpc.Instagram.signupRequest,
                com.Instagramjavastubs.grpc.Instagram.signupResponse>(
                  this, METHODID_SIGNUP)))
          .build();
    }
  }

  /**
   */
  public static final class InstagramServiceStub extends io.grpc.stub.AbstractStub<InstagramServiceStub> {
    private InstagramServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstagramServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstagramServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstagramServiceStub(channel, callOptions);
    }

    /**
     */
    public void signup(com.Instagramjavastubs.grpc.Instagram.signupRequest request,
        io.grpc.stub.StreamObserver<com.Instagramjavastubs.grpc.Instagram.signupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstagramServiceBlockingStub extends io.grpc.stub.AbstractStub<InstagramServiceBlockingStub> {
    private InstagramServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstagramServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstagramServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstagramServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.Instagramjavastubs.grpc.Instagram.signupResponse signup(com.Instagramjavastubs.grpc.Instagram.signupRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignupMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstagramServiceFutureStub extends io.grpc.stub.AbstractStub<InstagramServiceFutureStub> {
    private InstagramServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstagramServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstagramServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstagramServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Instagramjavastubs.grpc.Instagram.signupResponse> signup(
        com.Instagramjavastubs.grpc.Instagram.signupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGNUP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstagramServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstagramServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGNUP:
          serviceImpl.signup((com.Instagramjavastubs.grpc.Instagram.signupRequest) request,
              (io.grpc.stub.StreamObserver<com.Instagramjavastubs.grpc.Instagram.signupResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InstagramServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstagramServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Instagramjavastubs.grpc.Instagram.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstagramService");
    }
  }

  private static final class InstagramServiceFileDescriptorSupplier
      extends InstagramServiceBaseDescriptorSupplier {
    InstagramServiceFileDescriptorSupplier() {}
  }

  private static final class InstagramServiceMethodDescriptorSupplier
      extends InstagramServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstagramServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstagramServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstagramServiceFileDescriptorSupplier())
              .addMethod(getSignupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
