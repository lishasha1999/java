package day11;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-09-05 17:16
 * @Description
 * @return
 */
public class Client {
    private Socket socket;

    public Client(){
        try {
            System.out.println("正在连接服务端");
            socket=new Socket("localhost",8088);
            System.out.println("已连接服务端");
        }catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /** 客户端开始的方法*/
    public void start(){
        try{
            /*
            Socket提供的方法
             OutputStream getOutputStream();
             通过Socket获取的字节输出流写出的数据会通过网络发送给远端计算机(服务端)
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
//            pw.println("你好!");
            Scanner scan = new Scanner(System.in);
            while(true){
                String message = scan.nextLine();
                pw.println(message);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /** 启动程序*/
    public static void main(String[] args) {
        Client client = new Client();//启动一个客户端
        client.start();//调用启动方法
    }
}
