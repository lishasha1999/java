package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:25
 * @Description
 * @return
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            String str = "";
            System.out.println(str.length());
            return;
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.out.println("return");
        }
        System.out.println("end");
    }
}
