import java.net.*;
import java.io.*;
import java.util.*;

public class server {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {
        System.out.println("Waiting for client...");
        ServerSocket ss = new ServerSocket(4545);
        Socket socket = ss.accept();
        System.out.println("Connection established");

        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        Object obMessage = ois.readObject();
        String message = (String)obMessage;
        message = message.toUpperCase();
        oos.writeObject(message);
    }
}

import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client started");
        Socket socket = new Socket("localhost",4545);

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Scanner sc  = new Scanner(System.in);
        String message = sc.nextLine();

        oos.writeObject(message);

        Object obMessage = ois.readObject();

        System.out.println("From server : "+(String)obMessage);

    }
}
