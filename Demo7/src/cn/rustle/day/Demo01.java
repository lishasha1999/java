package cn.rustle.day;

public class Demo01 {
    public static void main(String[] args) {
        String arr[]=new String[] {"1","2","3","4"};
        System.out.println("正序输出");

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("倒序输出");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[arr.length-1-i]);
        }
    }
}
