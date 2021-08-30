import contact.ContactService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class GRPCServer {


    public static void main(String[] args) throws Exception {
        System.out.println("Server starting");
        Server server = ServerBuilder.forPort(8080).addService( new UserService()).addService(new ContactService()).build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}
