package cn.rustle.day;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        Scanner sc =new Scanner(System.in);
        System.out.println("������һ��0-100֮������֣�");
        int guess;
        while(true){
            guess=sc.nextInt();
            if(guess>num){
                System.out.println("�´��ˣ����������룺");
            }else if(guess<num){
                System.out.println("��С�ˣ����������룺");
            }else{
                System.out.println("�¶���");
                break;
            }
        }
    }
}
