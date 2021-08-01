package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:27
 * @Description
 * @return
 */
public class DeleteDirTest {
    public static void main(String[] args) {
        File dir=new File("./a");
        delete(dir);
    }

    private static void delete(File dir) {
        if(dir.isDirectory()){
            File[] subs=dir.listFiles();
            for(File file:subs){
                delete(file);
            }
        }
        dir.delete();
    }
}
