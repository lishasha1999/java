package day01;

/**
 * @author rustle
 * @date 2021-07-27 21:15
 * @Description String.IndexOf(str)
 * @return  ��ѯ�����ַ����ڵ�ǰ�ַ�����λ��,�������ڷ���-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        System.out.println(str.indexOf("in" ));

        System.out.println(str.indexOf("in",3));
        System.out.println(str.lastIndexOf("in"));
    }
}
