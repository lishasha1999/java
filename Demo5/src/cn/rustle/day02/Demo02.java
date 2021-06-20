package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-19 20:27
 * ifÓï¾ä
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈë½ð¶î£º");
        double total =sc.nextInt();
        if(total>500){
            total*=0.8;
        }
        System.out.println("Ö§¸¶½ð¶î£º"+total);
    }
}
