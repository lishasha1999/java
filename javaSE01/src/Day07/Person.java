package Day07;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author rustle
 * @date 2021-09-04 21:37
 * @Description
 * @return
 */
public class Person implements Serializable {
    //序列号
    private static final long serializableUID = 1;

    private String name;
    private int age;
    private String gender;

    /**
     * transient：被修饰的属性在该对象进行序列化时值会被忽略。
     * 忽略不必要的属性值可以达到对象序列化时的“瘦身”效果，减少资源的开销。
     */
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.otherInfo=otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return name+","+age+","+gender+","+Arrays.toString(otherInfo);
    }
}
