package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-08-05 21:04
 * @Description
 * @return
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件名：");
        String console= scanner.nextLine();
        RandomAccessFile raf=new RandomAccessFile(console,"rw");
        while ((true)){
            String line= scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            raf.write(line.getBytes("utf-8"));
        }
        System.out.println("close");
        raf.close();
    }
}
