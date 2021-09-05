package day09;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-09-05 9:12
 * @Description
 * @return
 */
public class Client {
    private Socket socket;

    public Client(){
        try {
            System.out.println("正在连接服务端......");
            socket=new Socket("localhost",8088);
            System.out.println("已连接服务端");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream out=socket.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(out,"utf-8");
            BufferedWriter bw=new BufferedWriter(osw);
            PrintWriter pw=new PrintWriter(bw,true);

            Scanner scan=new Scanner(System.in);
            while (true){
                String message=scan.nextLine();
                pw.println(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client=new Client();
        client.start();
    }
}
