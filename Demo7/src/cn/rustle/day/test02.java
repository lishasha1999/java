package cn.rustle.day;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个0-100之间的数字：");
        int guess;
        while(true){
            guess=sc.nextInt();
            if(guess>num){
                System.out.println("猜大了，请重新输入：");
            }else if(guess<num){
                System.out.println("猜小了，请重新输入：");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
