package day04;

import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:14
 * @Description
 * @return
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        File file=new File("./show.txt");
        if(file.exists()){
            file.delete();
            System.out.println("�ļ���ɾ��");
        }else{
            System.out.println("�ļ�������");
        }
    }
}
