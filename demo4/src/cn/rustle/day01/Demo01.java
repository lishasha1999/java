package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 20:13
 * ��������--�ӷ�
 */
public class Demo01 {
    public static void main(String[] args) {
        //һ����������������������ӷ�����
        int a=50;
        int b=100;
        int c=a+b; //����+���������������
        System.out.println(c);

        a=Integer.MAX_VALUE;
        b=8;
        c=a+b;//�������������㣬���������Χ�����
        System.out.println(c);

        a=Integer.MAX_VALUE;
        b=5;
        long l =a+b;//���
        System.out.println(l);
        l=(long) a+b;//�������
        System.out.println(l);

        a=5;
        l=1000;
        l=a;//�Զ�����ת��

        /*
        *byte,short,char ��������ʱ��һ�ɰ���int����
         */
        byte  b1=5;
        short s1=6;
        short s2= (short) (b1+s1);

        //�ַ���ʹ�üӺ�ʵ���ַ���ƴ��
        System.out.println("520"+"1314");
    }
}
