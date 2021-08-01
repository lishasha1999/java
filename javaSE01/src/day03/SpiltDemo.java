package day03;

import java.util.Arrays;

/**
 * @author rustle
 * @date 2021-07-31 21:01
 * @Description 字符串拆分
 * 表达式：spilt (string regex)
 * @return
 */
public class SpiltDemo {
    public static void main(String[] args) {
        String str="abc123def456ghi";
        String regex="\\d+";
        String[] data=str.split(regex);
        System.out.println(Arrays.toString(data));

        String regex1="[a-z]+";
        String[] data1=str.split(regex1);
        System.out.println(Arrays.toString(data1));

        String  imageName="123.jpg";
        String regex2="\\.";
        String[] name=imageName.split(regex2);
        System.out.println(System.currentTimeMillis()+"."+name[name.length-1]);
    }
}
