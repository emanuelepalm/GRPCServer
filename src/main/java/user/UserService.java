package user;
import io.grpc.stub.StreamObserver;
import it.palm.User;
import it.palm.connection.Database;
import it.palm.userGrpc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService extends userGrpc.userImplBase{

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.LoginResponse> responseObserver) {
        int counter = 0;
        System.out.println("Login Called");
        String username = request.getUsername();
        String password = request.getPassword();

        Database.connect("test.db");
        Connection conn = Database.getConn();

        User.LoginResponse.Builder response = User.LoginResponse.newBuilder();
        System.out.println(username + " " + password);
        String q = "SELECT * FROM UserTable WHERE username = '" + username + "';";
        System.out.println(q);

        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(q);
            while (result.next()) {
                counter++;
                System.out.println(result.getString("password"));
                if (result.getString("password").equals(password)) {
                    response.setResponseCode(0).setToken("Welcome " + username + "Token: TKN6969");
                    break;
                } else {
                    response.setResponseCode(14).setToken("Invalid Password");
                }
            }
            if(counter == 0 && !result.next()){
                response.setResponseCode(14).setToken("Invalid Username");
            }
        } catch (SQLException e){
            response.setResponseCode(14).setToken("ERR");
            System.out.println(e.getMessage());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        Database.close();
    }

    @Override
    public void logout(User.Logout request, StreamObserver<User.EmptyResponse> responseObserver) {
        System.out.println("Logout Called");
        User.EmptyResponse.Builder response = User.EmptyResponse.newBuilder();
        System.out.println("Logout Succeded");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}
