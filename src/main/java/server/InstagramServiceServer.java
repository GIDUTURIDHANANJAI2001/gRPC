package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import instagramService.*; // Assuming instagramService is the package containing your gRPC service implementation

public class InstagramServiceServer {
    public static void main(String[] args) {
        InstagramServiceServer server = new InstagramServiceServer();
        server.start();
    }

    private void start() {
        int port = 9051; // Change port number to your desired port

        Server server = ServerBuilder.forPort(port)
                                     .addService(new instagramService()) // Assuming instagramService is the service implementation
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
