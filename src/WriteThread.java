import java.io.*;
import java.net.*;
import java.util.*;

public class WriteThread extends Thread {
    Scanner sc1=new Scanner(System.in);
    private PrintWriter writer;
    private Socket socket;
    private ChatClient client;
 
    public WriteThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.client = client;
 
        try {
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        } catch (IOException ex) {
            System.out.println("Error getting output stream: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public void run() {
 
    
        System.out.println("\nEnter your name: ");
        String userName = sc1.nextLine();
        client.setUserName(userName);
        writer.println(userName);
 
        String text;
 
        do {
        	System.out.println("[" + userName + "]: ");
            text = sc1.nextLine();
            writer.println(text);
 
        } while (!text.equalsIgnoreCase("bye"));
 
        try {
            socket.close();
        } catch (IOException ex) {
 
            System.out.println("Error writing to server: " + ex.getMessage());
        }
    }
}