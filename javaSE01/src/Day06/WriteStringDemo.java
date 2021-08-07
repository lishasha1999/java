package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-05 19:57
 * @Description
 * @return
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
        String str="»ØÊ×£¬ÌÍ~";
        byte[] data=str.getBytes("utf-8");
        raf.write(data);
        System.out.println("----------");
        raf.close();
    }
}
