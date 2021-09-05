package Day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-04 22:13
 * @Description
 * @return
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("tomcat.zip");
        FileOutputStream fos=new FileOutputStream("tomcat_cp.zip");

        byte[] data=new byte[1024*8];
        int len=-1;
        while ((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("1");
        fis.close();
        fos.close();
    }
}
