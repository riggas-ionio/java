import java.io.*;
import java.net.*;

public class SocketClient {

    public static void send(String hostName, int portNumber, String userInput) throws UnknownHostException, IOException{
        Socket echoSocket = null;
        PrintWriter sockOut = null;
        BufferedReader sockIn = null;
        BufferedReader stdIn = null;

        echoSocket = new Socket();
        echoSocket.connect(new InetSocketAddress(hostName, portNumber), 250); // Connect to hostName, portNumber; timeout 250 millisec
        System.out.println("Connected to server: "+echoSocket.getInetAddress()+":"+echoSocket.getPort());
        System.out.println("Local port: "+echoSocket.getLocalPort());
        sockOut = new PrintWriter(echoSocket.getOutputStream(), true);
        sockIn = new BufferedReader(
                new InputStreamReader(echoSocket.getInputStream()));
        sockOut.println(userInput);
        System.out.println("Server echo: " + sockIn.readLine());
        System.out.println("Disconnected from server.");
    }
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println(
                "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try {
            send(hostName, portNumber, "Hello from Javaland");
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        }
    }
}
