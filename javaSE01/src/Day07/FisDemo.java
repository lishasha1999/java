package Day07;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-04 21:31
 * @Description
 * @return
 */
public class FisDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");

        byte[] data=new byte[1024];
        int len=fis.read(data);

        String line=new String(data,0,len,"utf-8");
        System.out.println(line);

        fis.close();
    }
}
