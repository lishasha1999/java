package Day06;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author rustle
 * @date 2021-08-07 20:00
 * @Description
 * @return
 */
public class ShowDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
        byte[] data=new byte[32];
        raf.read(data);
        String user=new String(data,"utf-8").trim();
        raf.read(data);
        String password=new String(data,"utf-8").trim();
        raf.read(data);
        String name=new String(data,"utf-8").trim();
        int age=raf.readInt();
        System.out.println(user);
        System.out.println(password);
        System.out.println(name);
        System.out.println(age);
        raf.close();
    }
}
