package cn.rustle.Day01;

/**
 * @author rustle
 * @date 2021-06-17 20:40
 * ����� Math.random()
 */
public class Demo01 {
    public static void main(String[] args) {
        double r=Math.random();
        //[0,1)
        System.out.println(r);
        //[0,10)
        System.out.println(r*10);
        //[0,100)
        System.out.println(r*100);
        /*
         *�������ʽ
         * ���Ҫ��ĳ����Χ�ڵ������Ϊ��
         * �����*�����ֵ-��Сֵ��+��Сֵ
         */
        //[5,10)
        System.out.println(r*(10-5)+5);

        /*
         *����Math.random���ɵ���[0,1)��С��
         * ���Ҫ��������Ҫǿ������ת��
         */
        //[1,10)
        int n=(int)(Math.random()*(10-1)+1);
        System.out.println(n);
        //[20,100)
        int n1=(int)(Math.random()*(100-20)+20);
        System.out.println(n1);
        //[10,100)
        int n2 =(int)(Math.random()*(100-10)+10);
        System.out.println(n2);
        //[9,99)
        int n3=(int)(Math.random()*(99-9)+9);
        System.out.println(n3);
    }
}
