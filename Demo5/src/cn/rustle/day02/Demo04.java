package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-19 21:32
 * 判断用户名密码是否一致
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String password =sc.next();
        if(user.equals(password))
        {
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败");
        }
    }
}
