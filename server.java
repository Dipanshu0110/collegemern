import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("I'm waiting...");
        
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str =(String) dis.readUTF();
        System.out.println("Received: " + str);
        
        s.close();
        ss.close();
    }
}