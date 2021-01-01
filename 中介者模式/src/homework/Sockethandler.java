package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Sockethandler implements Runnable{
    private Socket socket;
    public Sockethandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStreamReader reader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(reader);
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            String str = "<" + socket.getInetAddress().toString() + ":" + socket.getPort()+">";
            String request = bufferedReader.readLine();
            System.out.println("来自" + str + " say: 客户端产生的随机数字是" + request);
            printStream.println(str + "  I am sending message to you! The number you send is " + request);
            printStream.flush();
            printStream.close();
            bufferedReader.close();
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
