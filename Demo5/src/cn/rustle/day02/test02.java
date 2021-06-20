package cn.rustle.day02;

import java.util.Scanner;

/**
 * @author rustle
 * @date 2021-06-20 7:55
 */
public class test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");

        if(scanner.hasNextDouble()){
            double achievement=scanner.nextDouble();
            if(achievement>100||achievement<0){
                System.out.println("分数不能超过100或者小于0分");
            }
            else if(achievement<60){
                System.out.println("成绩不合格");
            }
            else if(achievement<90){
                System.out.println("成绩合格");
            }
            else {
                System.out.println("成绩优秀");
            }
        }
        else{
            System.out.println("成绩格式不对。");
        }
    }
}
