package Day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rustle
 * @date 2021-09-04 22:03
 * @Description
 * @return
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");

        int d = -1;
        while ((d = isr.read()) != -1){
            System.out.print((char) d);
        }
        isr.close();
    }
}
