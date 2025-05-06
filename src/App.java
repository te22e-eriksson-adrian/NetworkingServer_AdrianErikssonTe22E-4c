import java.net.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ServerSocket server = null;
        Socket client;

        int portnumber = 21;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }

        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);
    }
}
