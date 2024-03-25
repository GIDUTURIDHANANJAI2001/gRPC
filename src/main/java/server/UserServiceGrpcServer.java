package server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import userService.UserService;


public class UserServiceGrpcServer {
public static void main(String[] args) {
	UserServiceGrpcServer userServiceGrpcServer = new UserServiceGrpcServer();
	userServiceGrpcServer.start();
	
}

public void start() {
 // Change port number to 9091 or any other available port

    int port = 9090; // Change this port number to a different one if 9090 is already in use
    Server server = ServerBuilder.forPort(port)
                                 .addService(new UserService())
                                 .build();


    try {
        server.start();
        System.out.println("Server started, listening on port " + port);
        server.awaitTermination();
    } catch (Exception e) {
        System.err.println("Server encountered an error: " + e.getMessage());
        e.printStackTrace();
    } finally {
        System.out.println("Shutting down server");
        server.shutdown();
    }
}
}
