package day02;

/**
 * @author rustle
 * @date 2021-07-29 20:07
 * @Description 查询第n个字符
 * @return
 */
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        System.out.println(str.charAt(1));
        /**
         * 检测回文
         */
        String line = "上海自来水来自海上";
        boolean flag = true;
        for (int i = 0; i <= line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }
    }
}
