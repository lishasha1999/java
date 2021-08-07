package day05;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-03 21:57
 * @Description
 * @return
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("./test.txt", "r");
        RandomAccessFile desc = new RandomAccessFile("./test_new.log", "rw");
        byte[] data = new byte[10 * 1024];
        int len = -1;
        while ((len=src.read(data)) != -1){
            desc.write(data,0,len);
        }
        src.close();
        desc.close();
    }
}
