package day08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-05 8:20
 * @Description
 * @return
 */
public class AutoCloseDemo {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("fos.txt")
        ) {
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
