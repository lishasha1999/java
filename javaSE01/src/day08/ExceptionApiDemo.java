package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:22
 * @Description
 * @return
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            String str="a";
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            e.printStackTrace();
            String str=e.getMessage();
            System.out.println(str);
        }
    }
}
