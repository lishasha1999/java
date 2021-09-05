package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:15
 * @Description
 * @return
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            String str="a";
            System.out.println(Integer.parseInt(str));
            System.out.println("!!!");
        }catch (NullPointerException e){
            System.out.println("出现了空指针");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
        }catch (Exception e){
            System.out.println("程序出错了");
        }
        System.out.println("end");
    }
}
