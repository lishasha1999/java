package cn.rustle.day03;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-17 19:57
 * 闰年计算
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("请输入要判断的年份：");
        Scanner console=new Scanner(System.in);
        int year=console.nextInt();
        System.out.println(((year%400==0) || (year%100!=0 & year%4==0))?year+"年是闰年":year+"年不是闰年");

    }
}
