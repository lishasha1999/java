package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-08-07 20:27
 * @Description
 * @return
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user1= scanner.nextLine();
        System.out.println("请输入新的昵称：");
        String name1=scanner.nextLine();
        boolean update=false;
        byte[] data = new byte[32];
        raf.seek(0);
        for (int i = 0; i < (int)raf.length()/100; i++) {
            int seek=i*100;
            raf.read();
            String user=new String(data,"utf-8").trim();
            seek+=64;
            raf.read();
            String name=new String(data,"utf-8").trim();
            if(user.equals(user1)){
                byte[] names=name.getBytes(name1);
                names= Arrays.copyOf(names,32);
                raf.seek(seek);
                raf.write(names);
                update=true;
            }
        }
        raf.close();
        if (update){
            System.out.println("修改成功");
        }else{
            System.out.println("查无此人");
        }
    }
}
//\]'/*