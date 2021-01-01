package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;

public class Application1  {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        int num = random.nextInt(10000);
        Socket socket = new Socket("127.0.0.1",888);
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        int message = num ;
        printStream.println(message);
        printStream.flush();
        String response = bufferedReader.readLine();
        System.out.println("服务器返回的message:  " + response);
        printStream.close();
        bufferedReader.close();
        inputStreamReader.close();
    }
}
