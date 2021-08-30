package contact;

import io.grpc.stub.StreamObserver;
import it.palm.Contact;
import it.palm.User;
import it.palm.connection.Database;
import it.palm.contactGrpc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ContactService extends contactGrpc.contactImplBase{
    private List<String> listStringozzi;

    @Override
    public void get(it.palm.Contact.GetRequest request, StreamObserver<it.palm.Contact.GetResponse> responseObserver) {
        Database.connect("test.db");
        Connection conn = Database.getConn();
        int counter = 0;
        Contact.GetResponse.Builder response = Contact.GetResponse.newBuilder();
        String q = "SELECT * FROM Contact;";
        System.out.println(q);
        String stringozzo = "";
        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(q);
            while (result.next()) {
                counter++;
               stringozzo += "\n" + result.getString("firstname") + "\n" + result.getString("lastname") + "\n" + result.getString("contact") + "\n" ;

            }
            if(counter == 0 && !result.next()){
                response.setJson("NO PEOPLE");
            } else {
                response.setJson(stringozzo);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        Database.close();
    }

    @Override
    public void search(Contact.SearchRequest request, StreamObserver<Contact.SearchResponse> responseObserver) {
    }

    @Override
    public void add(Contact.AddRequest request, StreamObserver<Contact.AddResponse> responseObserver) {
    }

    @Override
    public void getAll(Contact.AllRequest request, StreamObserver<Contact.AllResponse> responseObserver) {
        
    }
}
