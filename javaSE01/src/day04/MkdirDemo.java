package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:21
 * @Description
 * @return
 */
public class MkdirDemo {
    public static void main(String[] args) {
        File dir=new File("demo");
        if(dir.exists()){
            System.out.println("目录已存在");
        }else{
            dir.mkdir();
            System.out.println("目录已创建");
        }
    }
}
