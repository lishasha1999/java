package Day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author rustle
 * @date 2021-09-04 21:35
 * @Description
 * @return
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="苍老师";
        int age=18;
        String gender="女";
        String[] otherInfo={"摄像","教学","演员"};

        Person p=new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("1");
        oos.close();
    }
}
