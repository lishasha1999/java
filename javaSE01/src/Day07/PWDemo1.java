package Day07;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author rustle
 * @date 2021-09-04 22:25
 * @Description
 * @return
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
        PW提供了直接对文件操作的构造方法
         PrintWriter(String path)
         PrintWriter(File file)
        可以再传入一个String类型参数为字符集
         */
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");

        pw.println("如果那两个字没有颤抖，");
        pw.println("我不会发现我难受。");

        System.out.println("写出完毕。");

        pw.close();

    }
}
