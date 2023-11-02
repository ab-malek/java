import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {
        System.out.println("Waiting for client...");
        ServerSocket ss = new ServerSocket(4545);
        Socket socket = ss.accept();
        System.out.println("Connection established");

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        String name = dis.readUTF();
        name = name.toUpperCase();
        dos.writeUTF(name);
    }
}


import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client started");
        Socket socket = new Socket("localhost",4545);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();

        dos.writeUTF(name);

        name = dis.readUTF();

        System.out.println("From server : "+name);

    }
}
