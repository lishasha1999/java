package day03;

/**
 * @author rustle
 * @date 2021-07-31 20:10
 * @Description 正则表达式
 * 表达式方法一：boolean matches(String regex) 完全匹配验证
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email="lishasha0601@icloud.com";

        String regex="\\w+@\\w+(\\.\\w+)+";

        boolean b=email.matches(regex);
        if (b){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }

        String phone="18167260200";
        String regex1="1[3578]\\d{9}";
        System.out.println(phone.matches(regex1));
    }
}
