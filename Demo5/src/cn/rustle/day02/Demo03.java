package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-19 21:28
 * �ܼ�>=500��8�ۣ�����95��
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ܼۣ�");
        double total =sc.nextDouble();
        if(total>=500){
            total *= 0.8;
        }
        else {
            total *= 0.95;
        }
        System.out.println("�ۺ���Ϊ��"+total);
    }
}
