package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 *用户注册功能
 *  程序启动后，用户输入用户名，密码，昵称，年龄四项，然后将信息写入到user.dat文件中。
 *  其中用户名，密码，昵称为字符串，年龄为int类型
 *
 *  格式: 每条记录占用固定的100字节
 *  其中用户名，密码，昵称各占32字节，为字符串，年龄为int值，固定4字节。
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
        long seek = 0;
        Scanner scanner=new Scanner(System.in);
        String user,password,name;
        int age;
        System.out.println("用户注册：");
        System.out.println("请输入用户名：");
        user=scanner.nextLine();
        System.out.println("请输入密码：");
        password=scanner.nextLine();
        System.out.println("请输入昵称：");
        name=scanner.nextLine();
        System.out.println("请输入年龄：");
        age= scanner.nextInt();

        if (raf.length() == 0) {
            raf.seek(0);
        } else {
            raf.seek(seek=(raf.length() / 100 + 1) * 100);
        }
        byte[] users=user.getBytes("utf-8");
        users= Arrays.copyOf(users,32);
        byte[] passwords=password.getBytes("utf-8");
        passwords= Arrays.copyOf(passwords,32);
        byte[] names=name.getBytes("utf-8");
        names= Arrays.copyOf(names,32);
        raf.write(users);
        raf.seek(seek=seek+32);
        raf.write(passwords);
        raf.seek(seek=seek+32);
        raf.write(names);
        raf.seek(seek=seek+32);
        raf.write(age);
        raf.close();
    }
}
