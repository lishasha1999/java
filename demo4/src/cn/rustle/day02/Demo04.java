package cn.rustle.day02;

import java.util.Scanner;
/**
 * @author rustle
 * @date 2021-06-15 20:50
 * �ж�����
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("������Ҫ�жϵ���ݣ�");
        Scanner console=new Scanner(System.in);
        int year=console.nextInt();
        if((year%400==0) | (year%100!=0 & year%4==0))
        {
            System.out.println(year+"������");
        }
        else
        {
            System.out.println(year+"��������");
        }
    }
}
