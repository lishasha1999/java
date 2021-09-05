package Day07;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rustle
 * @date 2021-09-04 22:09
 * @Description
 * @return
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/day07/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String line=null;

        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
