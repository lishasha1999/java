package Day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 *�û�ע�Ṧ��
 *  �����������û������û��������룬�ǳƣ��������Ȼ����Ϣд�뵽user.dat�ļ��С�
 *  �����û��������룬�ǳ�Ϊ�ַ���������Ϊint����
 *
 *  ��ʽ: ÿ����¼ռ�ù̶���100�ֽ�
 *  �����û��������룬�ǳƸ�ռ32�ֽڣ�Ϊ�ַ���������Ϊintֵ���̶�4�ֽڡ�
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
        long seek = 0;
        Scanner scanner=new Scanner(System.in);
        String user,password,name;
        int age;
        System.out.println("�û�ע�᣺");
        System.out.println("�������û�����");
        user=scanner.nextLine();
        System.out.println("���������룺");
        password=scanner.nextLine();
        System.out.println("�������ǳƣ�");
        name=scanner.nextLine();
        System.out.println("���������䣺");
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
