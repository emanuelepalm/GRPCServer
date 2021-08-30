package it.palm;

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
    comments = "Source: contact.proto")
public final class contactGrpc {

  private contactGrpc() {}

  public static final String SERVICE_NAME = "contact";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<it.palm.Contact.GetRequest,
      it.palm.Contact.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = it.palm.Contact.GetRequest.class,
      responseType = it.palm.Contact.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<it.palm.Contact.GetRequest,
      it.palm.Contact.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<it.palm.Contact.GetRequest, it.palm.Contact.GetResponse> getGetMethod;
    if ((getGetMethod = contactGrpc.getGetMethod) == null) {
      synchronized (contactGrpc.class) {
        if ((getGetMethod = contactGrpc.getGetMethod) == null) {
          contactGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<it.palm.Contact.GetRequest, it.palm.Contact.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contact", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new contactMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<it.palm.Contact.SearchRequest,
      it.palm.Contact.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = it.palm.Contact.SearchRequest.class,
      responseType = it.palm.Contact.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<it.palm.Contact.SearchRequest,
      it.palm.Contact.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<it.palm.Contact.SearchRequest, it.palm.Contact.SearchResponse> getSearchMethod;
    if ((getSearchMethod = contactGrpc.getSearchMethod) == null) {
      synchronized (contactGrpc.class) {
        if ((getSearchMethod = contactGrpc.getSearchMethod) == null) {
          contactGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<it.palm.Contact.SearchRequest, it.palm.Contact.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contact", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.SearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new contactMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<it.palm.Contact.AddRequest,
      it.palm.Contact.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = it.palm.Contact.AddRequest.class,
      responseType = it.palm.Contact.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<it.palm.Contact.AddRequest,
      it.palm.Contact.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<it.palm.Contact.AddRequest, it.palm.Contact.AddResponse> getAddMethod;
    if ((getAddMethod = contactGrpc.getAddMethod) == null) {
      synchronized (contactGrpc.class) {
        if ((getAddMethod = contactGrpc.getAddMethod) == null) {
          contactGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<it.palm.Contact.AddRequest, it.palm.Contact.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contact", "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.AddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new contactMethodDescriptorSupplier("add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<it.palm.Contact.AllRequest,
      it.palm.Contact.AllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = it.palm.Contact.AllRequest.class,
      responseType = it.palm.Contact.AllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<it.palm.Contact.AllRequest,
      it.palm.Contact.AllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<it.palm.Contact.AllRequest, it.palm.Contact.AllResponse> getGetAllMethod;
    if ((getGetAllMethod = contactGrpc.getGetAllMethod) == null) {
      synchronized (contactGrpc.class) {
        if ((getGetAllMethod = contactGrpc.getGetAllMethod) == null) {
          contactGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<it.palm.Contact.AllRequest, it.palm.Contact.AllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "contact", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.palm.Contact.AllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new contactMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static contactStub newStub(io.grpc.Channel channel) {
    return new contactStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static contactBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new contactBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static contactFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new contactFutureStub(channel);
  }

  /**
   */
  public static abstract class contactImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(it.palm.Contact.GetRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void search(it.palm.Contact.SearchRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void add(it.palm.Contact.AddRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void getAll(it.palm.Contact.AllRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.AllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                it.palm.Contact.GetRequest,
                it.palm.Contact.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                it.palm.Contact.SearchRequest,
                it.palm.Contact.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                it.palm.Contact.AddRequest,
                it.palm.Contact.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                it.palm.Contact.AllRequest,
                it.palm.Contact.AllResponse>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class contactStub extends io.grpc.stub.AbstractStub<contactStub> {
    private contactStub(io.grpc.Channel channel) {
      super(channel);
    }

    private contactStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected contactStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new contactStub(channel, callOptions);
    }

    /**
     */
    public void get(it.palm.Contact.GetRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(it.palm.Contact.SearchRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(it.palm.Contact.AddRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(it.palm.Contact.AllRequest request,
        io.grpc.stub.StreamObserver<it.palm.Contact.AllResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class contactBlockingStub extends io.grpc.stub.AbstractStub<contactBlockingStub> {
    private contactBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private contactBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected contactBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new contactBlockingStub(channel, callOptions);
    }

    /**
     */
    public it.palm.Contact.GetResponse get(it.palm.Contact.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public it.palm.Contact.SearchResponse search(it.palm.Contact.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public it.palm.Contact.AddResponse add(it.palm.Contact.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<it.palm.Contact.AllResponse> getAll(
        it.palm.Contact.AllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class contactFutureStub extends io.grpc.stub.AbstractStub<contactFutureStub> {
    private contactFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private contactFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected contactFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new contactFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<it.palm.Contact.GetResponse> get(
        it.palm.Contact.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<it.palm.Contact.SearchResponse> search(
        it.palm.Contact.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<it.palm.Contact.AddResponse> add(
        it.palm.Contact.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_ADD = 2;
  private static final int METHODID_GET_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final contactImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(contactImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((it.palm.Contact.GetRequest) request,
              (io.grpc.stub.StreamObserver<it.palm.Contact.GetResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((it.palm.Contact.SearchRequest) request,
              (io.grpc.stub.StreamObserver<it.palm.Contact.SearchResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((it.palm.Contact.AddRequest) request,
              (io.grpc.stub.StreamObserver<it.palm.Contact.AddResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((it.palm.Contact.AllRequest) request,
              (io.grpc.stub.StreamObserver<it.palm.Contact.AllResponse>) responseObserver);
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

  private static abstract class contactBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    contactBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return it.palm.Contact.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("contact");
    }
  }

  private static final class contactFileDescriptorSupplier
      extends contactBaseDescriptorSupplier {
    contactFileDescriptorSupplier() {}
  }

  private static final class contactMethodDescriptorSupplier
      extends contactBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    contactMethodDescriptorSupplier(String methodName) {
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
      synchronized (contactGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new contactFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getSearchMethod())
              .addMethod(getAddMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
