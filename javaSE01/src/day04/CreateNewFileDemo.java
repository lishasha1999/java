package day04;

import java.io.File;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-08-01 17:12
 * @Description
 * @return
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("./show.txt");
        if(file.exists()){
            System.out.println("文件已存在");
        }else{
            file.createNewFile();
            System.out.println("文件已创建");
        }
    }
}
