package day05;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-03 20:14
 * @Description »ùÓÚÖ¸Õë¶ÁÐ´API
 * @return
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =new RandomAccessFile("./test.dat","rw");
        raf.write(97);
        raf.close();
    }
}
