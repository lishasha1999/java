package cn.rustle.day02;

/**
 * @author rustle
 * @date 2021-06-15 20:39
 * ����
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
         *�������������Ϊ����Ϊ�棬��falseΪfalse
         */
        int age=18;
        boolean b=age>=20 & age<30;
        //         false  &     true
        System.out.println(b);//false

        /*
         * �����㣬��һ��Ϊ����Ϊ��
         */
        boolean flag=true;
        int n=200;
        boolean b1 = flag | n<100;
        //          true  | false �������ֻҪһ������������Ϊ��
        System.out.println(b1);

        /*
         *������ ֻ��һ��Boolean�������㣬ֵȡ��
         */
        boolean flag1=true;
        boolean b2=!flag1;
        System.out.println(b2);
    }
}
