package day04;

import javax.sound.midi.Soundbank;
import java.io.File;

/**
 * @author rustle
 * @date 2021-08-01 17:08
 * @Description
 * @return
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file=new File("./demo.txt");

        String name=file.getName();
        System.out.println(name);

        long length=file.length();
        System.out.println(length);

        boolean cr=file.canRead();
        boolean cw=file.canWrite();
        System.out.println("read:"+cr);
        System.out.println("write:"+cw);

        boolean ih=file.isHidden();
        System.out.println("hidden:"+ih);
    }
}
