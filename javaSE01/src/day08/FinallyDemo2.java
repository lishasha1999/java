package day08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-05 8:27
 * @Description
 * @return
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("fos.txt");
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fos!=null) {
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
