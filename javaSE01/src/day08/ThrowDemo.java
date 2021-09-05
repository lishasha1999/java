package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:35
 * @Description
 * @return
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setAge(1000);
        }catch (IllegalAgeException e){
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }
}
