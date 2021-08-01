package day03;

/**
 * @author rustle
 * @date 2021-07-31 21:51
 * @Description ×Ö·û´®Ìæ»»
 * replace (String regex)
 * @return
 */
public class ReplaceDemo {
    public static void main(String[] args) {
        String str="abc123def456ghi";
        System.out.println(str.replaceAll("[0-9]+","#NUMBER#"));
    }
}
