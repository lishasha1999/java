package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-08 20:11
 * char����
 */
public class Demo08 {
    public static void main(String[] args) {
        //�ַ�ֱ������ֵ
        char c1= '��';
        System.out.println(c1);

        //����ֱ������ֵ
        char c2=26468;
        System.out.println(c2);

        //Unicode���븳ֵ
        char c3='\u1440';
        System.out.println(c3);

        System.out.println('A'+20+"���");

        //ת���ַ�
        char a1='\'';
        System.out.println(a1);
        char a2 ='\"';
        System.out.println(a2);
        char a3='\\';
        System.out.println(a3);
        char a4='\n';//����
        System.out.println("a4:"+a4);
        char a5='\r';//�س�
        System.out.println("a5��"+a5);
        System.out.println(a1);
    }
}
