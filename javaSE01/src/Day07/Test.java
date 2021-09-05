package Day07;

import java.io.*;
import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-09-04 22:27
 * @Description
 * @return
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输出文件名:");
        String fileName = scan.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        在流连接中创建PW时，构造方法允许我们在传入一个boolean型参数
        (注: 构造方法第一个参数是流类型才可以)。
        当值true时，那么当前PW就具有自动行刷新功能。
        (println方法会自动调用flush方法，需要注意print是不会自动flush方法)
         */
        PrintWriter pw = new PrintWriter(bw,true);

        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
//            pw.flush();
        }

        System.out.println("再见");
        pw.close();


    }
}
