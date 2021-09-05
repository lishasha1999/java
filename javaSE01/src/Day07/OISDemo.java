package Day07;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author rustle
 * @date 2021-09-04 21:53
 * @Description
 * @return
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        /*
        readObject的工作进行对象的反序列化
         */
        Person p = (Person) ois.readObject();
        System.out.println(p);

        ois.close();
    }
}
