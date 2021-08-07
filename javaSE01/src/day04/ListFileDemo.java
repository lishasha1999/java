package day04;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @author rustle
 * @date 2021-08-03 19:53
 * @Description 文件过滤器
 * @return
 */
public class ListFileDemo {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
            FileFilter filter=new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name=file.getName();
                    System.out.println("正在过滤："+name);
                    ////return name.startsWith(".");
                    return file.isFile();
                }
            };
            File[] subs=dir.listFiles(filter);
            for (File file:subs){
                System.out.println(file.getName());
            }
        }
    }
}
