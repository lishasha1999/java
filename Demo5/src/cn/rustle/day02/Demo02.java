package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-19 20:27
 * if���
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������");
        double total =sc.nextInt();
        if(total>500){
            total*=0.8;
        }
        System.out.println("֧����"+total);
    }
}
