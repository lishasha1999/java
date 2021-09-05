package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author rustle
 * @date 2021-09-05 17:03
 * @Description
 * @return
 */
public class Server {
    private ServerSocket server;

    public Server(){
        try {
            System.out.println("正在启动服务端");
            server = new ServerSocket(8088);
            System.out.println("启动服务端完毕");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            while (true){
                System.out.println("等待客户端连接");
                Socket socket=server.accept();
                System.out.println("客户端已连接");

                ClientHandler handler = new ClientHandler(socket);
                Thread t=new Thread(handler);
                t.start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server=new Server();
        server.start();
    }

    private class ClientHandler implements Runnable{
        private Socket socket;
        public ClientHandler(Socket socket){
            this.socket=socket;
        }

        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(in,"utf-8");
                BufferedReader br=new BufferedReader(isr);

                String message=null;
                while ((message=br.readLine())!=null){
                    System.out.println(message);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
