package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-20 7:55
 */
public class test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("������ɼ���");

        if(scanner.hasNextDouble()){
            double achievement=scanner.nextDouble();
            if(achievement>100||achievement<0){
                System.out.println("�������ܳ���100����С��0��");
            }
            else if(achievement<60){
                System.out.println("�ɼ����ϸ�");
            }
            else if(achievement<90){
                System.out.println("�ɼ��ϸ�");
            }
            else {
                System.out.println("�ɼ�����");
            }
        }
        else{
            System.out.println("�ɼ���ʽ���ԡ�");
        }
    }
}
