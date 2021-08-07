package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * @author rustle
 * @date 2021-08-05 21:09
 * @Description
 * @return
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","r");

        /*
            RandomAccessFile�ṩ�ķ���:
             long length()  ���ڻ�ȡ��������ļ��ĳ���(�ֽ���)
         */
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);
        /*
        String�ṩ�Ĺ��췽����
         String(byte[] data)
          ���������ֽ������е������ֽڰ���ϵͳĬ���ַ���ת��Ϊ�ַ���(������)
         String(byte[] data,String csn)
          ���������ֽ������е������ֽڰ��ո������ַ���ת��Ϊ�ַ���
         */
        String line = new String(data,"utf-8");
        System.out.println(line);
        raf.close();
    }
}
