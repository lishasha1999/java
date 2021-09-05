package Day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author rustle
 * @date 2021-09-04 22:00
 * @Description
 * @return
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");

        osw.write("夜空中最亮的星，");
        osw.write("能否想起，");
        osw.write("那仰望的人心底的孤独与叹息。");

        System.out.println("1");
        osw.close();
    }
}
