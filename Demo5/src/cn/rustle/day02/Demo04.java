package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-19 21:32
 * �ж��û��������Ƿ�һ��
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("�������û�����");
        String user = sc.next();
        System.out.println("���������룺");
        String password =sc.next();
        if(user.equals(password))
        {
            System.out.println("��¼�ɹ�");
        }
        else {
            System.out.println("��¼ʧ��");
        }
    }
}
