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

        while (true) {
            try {
                
            } catch (Exception e) {
                System.out.println("Waiting for connect request...");
                client = server.accept();

                System.out.println("Connect request accepted...");
                String clientHost = client.getInetAddress().getHostAddress();
                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);

                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
            }
        }
    }
}
