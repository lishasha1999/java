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
            System.out.println("Ŀ¼��ɾ��");
        }else{
            System.out.println("Ŀ¼������");
        }
    }
}
