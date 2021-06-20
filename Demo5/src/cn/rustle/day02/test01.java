package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-20 7:51
 */
public class test01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入金额：");
        double total=scanner.nextDouble();
        if(total>=800){
            total *=0.7;
        }
        else if(total>=500){
            total *=0.8;
        }
        else if(total>=200) {
            total *= 0.9;
        }
        else {
            total *= 0.95;
        }
        System.out.println("折后金额："+total);
    }
}
