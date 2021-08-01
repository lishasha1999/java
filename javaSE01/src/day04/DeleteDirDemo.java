package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:26
 * @Description
 * @return
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir=new File("demo");
        if(dir.exists()){
            dir.delete();
            System.out.println("目录已删除");
        }else{
            System.out.println("目录不存在");
        }
    }
}
