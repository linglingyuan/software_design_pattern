package homework;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(888);
            while(true){
                Socket socket = serverSocket.accept();
                Sockethandler sockethandler = new Sockethandler(socket);
                Thread thread = new Thread(sockethandler);
                thread.start();
            }


    }
}
