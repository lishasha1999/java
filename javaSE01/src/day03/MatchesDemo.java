package day03;

/**
 * @author rustle
 * @date 2021-07-31 20:10
 * @Description ������ʽ
 * ���ʽ����һ��boolean matches(String regex) ��ȫƥ����֤
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email="lishasha0601@icloud.com";

        String regex="\\w+@\\w+(\\.\\w+)+";

        boolean b=email.matches(regex);
        if (b){
            System.out.println("������");
        }else {
            System.out.println("��������");
        }

        String phone="18167260200";
        String regex1="1[3578]\\d{9}";
        System.out.println(phone.matches(regex1));
    }
}
