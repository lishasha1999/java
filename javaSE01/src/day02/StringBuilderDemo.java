package day02;

/**
 * @author rustle
 * @date 2021-07-29 21:59
 * @Description �ַ�����ɾ�Ĳ�
 * @return
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String line="�ú�ѧϰjava";
        StringBuilder stringBuilder=new StringBuilder(line);
        stringBuilder.append(",Ϊ���Ҹ��ù���");
        System.out.println(stringBuilder);

        stringBuilder.replace(9,16,"����Ϊ�˸ı�����");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,8);
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"����");
        System.out.println(stringBuilder);
    }
}
