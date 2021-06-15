package cn.rustle.day02;

import java.util.Scanner;
/**
 * @author rustle
 * @date 2021-06-15 20:50
 * 判断闰年
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("请输入要判断的年份：");
        Scanner console=new Scanner(System.in);
        int year=console.nextInt();
        if((year%400==0) | (year%100!=0 & year%4==0))
        {
            System.out.println(year+"是闰年");
        }
        else
        {
            System.out.println(year+"不是闰年");
        }
    }
}
