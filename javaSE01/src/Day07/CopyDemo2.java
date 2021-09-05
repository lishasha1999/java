package Day07;

import java.io.*;

/**
 * @author rustle
 * @date 2021-09-04 22:16
 * @Description
 * @return
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("tomcat.zip");
        BufferedInputStream bis=new BufferedInputStream(fis);

        FileOutputStream fos =new FileOutputStream("tomcat_cp.zip");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int d=-1;
        while ((d=bis.read())!=-1){
            bos.write(d);
        }

        System.out.println("1");
        bis.close();
        bos.close();
    }
}
