package day05;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-03 21:26
 * @Description
 * @return
 */
public class RandomAccessFileDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =new RandomAccessFile("./test.txt","rw");
        int d=raf.read();
        System.out.println(d);

        d=raf.read();
        System.out.println(d);

        raf.close();
    }
}
