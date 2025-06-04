import java.io.*;
import java.net.*;

public class client {
    public static void main(String... a) throws Exception {
        // Connect to the server on localhost and port 1234
        Socket s = new Socket("localhost", 1234);
        System.out.println("Connected to server: " + s);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("I think you are from MCA");
        System.out.println("Message sent.");
        
        s.close();
    }
}