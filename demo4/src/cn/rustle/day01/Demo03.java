package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 21:17
 * �����Լ�����
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
         * a++��һ�����ʽ
         * ��Ӽӣ��ȸ�ֵ��������
         */
        int a=1;
        System.out.println(a++);
        System.out.println(a);

        /*
         * ++b��һ�����ʽ
         * ǰ�Ӽӣ������㣬��ֵ
         */
        int b=2;
        System.out.println(++b);
        System.out.println(b);

        /*
         * c--��һ�����ʽ
         * ��������ȸ�ֵ��������
         */
        int c=5;
        System.out.println(c--);
        System.out.println(c);

        /*
         * --c��һ�����ʽ
         * ǰ�����������㣬��ֵ
         */
        int d=6;
        System.out.println(--d);
        System.out.println(d);
    }
}
