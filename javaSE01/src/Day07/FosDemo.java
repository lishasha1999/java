package Day07;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-08-07 21:39
 * @Description
 * @return
 */
public class FosDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos.txt",true);
        String str="���ǰɣ����ǰɣ�......";
        byte[] data=str.getBytes("utf-8");
        fos.write(data);
        System.out.println("д�����");
        fos.close();
    }
}
