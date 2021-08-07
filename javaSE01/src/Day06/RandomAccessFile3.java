package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author rustle
 * @date 2021-08-05 21:13
 * @Description
 * @return
 */
public class RandomAccessFile3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =new RandomAccessFile("raf.dat","rw");
        long pos=raf.getFilePointer();
        System.out.println(pos);

        int max=Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println(raf.getFilePointer());
        raf.write(max>>>16);
        System.out.println(raf.getFilePointer());
        raf.seek(0);
        raf.write(max>>>8);
        System.out.println(raf.getFilePointer());
        raf.write(max);
        System.out.println(raf.getFilePointer());
        System.out.println("-----------");

        raf.writeLong(123L);
        raf.seek(2);
        System.out.println(raf.readLong());

        raf.writeDouble(123.123);
        raf.seek(3);
        System.out.println(raf.readDouble());
        //raf.seek(0);
//        int i=raf.readInt();
//        System.out.println(i);
        raf.close();
    }
}
