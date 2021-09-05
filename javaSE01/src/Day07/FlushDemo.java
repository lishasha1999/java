package Day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-04 22:20
 * @Description
 * @return
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        String str = "夜空中最亮的星，能否想起。";

        bos.write(str.getBytes());

        //bos.flush();

        System.out.println("1");
        bos.close();
    }
}
