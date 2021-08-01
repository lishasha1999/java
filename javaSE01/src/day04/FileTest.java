package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:28
 * @Description
 * @return
 */
public class FileTest {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles();
            for (File file:subs) {
                System.out.println(file.getName());
            }
        }
    }
}
