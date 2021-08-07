package day05;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-03 21:29
 * @Description
 * @return
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("./test.txt","r");
        RandomAccessFile desc=new RandomAccessFile("./test_new.log","rw");
        int d=0;
        ////System.out.println(src.length());
        //for
        for (int i=0;i<src.length();i++){
            desc.write(src.read());
        }

        //while
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        src.close();
        desc.close();
    }
}
