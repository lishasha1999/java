package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-08 20:11
 * char类型
 */
public class Demo08 {
    public static void main(String[] args) {
        //字符直接量赋值
        char c1= '中';
        System.out.println(c1);

        //整数直接量赋值
        char c2=26468;
        System.out.println(c2);

        //Unicode编码赋值
        char c3='\u1440';
        System.out.println(c3);

        System.out.println('A'+20+"你好");

        //转义字符
        char a1='\'';
        System.out.println(a1);
        char a2 ='\"';
        System.out.println(a2);
        char a3='\\';
        System.out.println(a3);
        char a4='\n';//换行
        System.out.println("a4:"+a4);
        char a5='\r';//回车
        System.out.println("a5："+a5);
        System.out.println(a1);
    }
}
