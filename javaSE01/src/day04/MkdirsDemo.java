package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:23
 * @Description
 * @return
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        File dir=new File("a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("Ŀ¼�Ѵ���");
        }else{
            dir.mkdirs();
            System.out.println("Ŀ¼�Ѵ���");
        }
    }
}
