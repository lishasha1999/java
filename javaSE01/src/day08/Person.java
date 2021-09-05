package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:33
 * @Description
 * @return
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws IllegalAgeException {
        if(age<0||age>100){
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
