package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-08 21:36
 * ����ת��
 */
public class Demo10 {
    public static void main(String[] args) {
        //����������
        int i=5;
        long l=i;//int תlong

        //С����С��
        float f =1.0f;
        double d=f;//floatתdouble

        //������С��
        int k=10;
        double d1=2.6;
        double k2=k+d1;//intתdouble

        //ǿ������ת��
        //����������֮��
        short s1=120;
        byte b1= (byte) s1;
        System.out.println(b1);

        //��ǿ��ת���Ĺ����У������������Ч��Χ���ᷢ�����
        short s2=200;
        byte b2=(byte) s2;
        System.out.println(b2);

        long l1=123456l;
        int i1= (int) l1;
        System.out.println(i1);

        long l2=1000000000000l;
        int i2=(int) l2;
        System.out.println(i2);

        //С����С��֮��:�ں���Χ�ڿ���ת���ɹ������ᾫ��ȱʧ
        double d2=2.5;
        float f1= (float) d2;
        System.out.println(f1);

        double d3=1.0/3;
        float f2=(float) d3;
        System.out.println(f2);
    }
}
