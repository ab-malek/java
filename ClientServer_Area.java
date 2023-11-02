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

        double radius = dis.readDouble();
        double area = radius*radius*3.1416;
        dos.writeDouble(area);
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
        double radius = sc.nextDouble();

        dos.writeDouble(radius);

        double area = dis.readDouble();

        System.out.println("From server : "+area);

    }
}
