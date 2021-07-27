package day01;

/**
 * @author rustle
 * @date 2021-07-27 21:58
 * @Description substring(int start,int end)
 * 截取当前字符串指定范围的字符串
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String line="www.tedu.cn";
        System.out.println(line.substring(4,8));
        System.out.println(line.substring(4));
        System.out.println(getHostName(line));

        String address="http://www.baidu.com";
        System.out.println(getHostName(address));
    }

    public static String getHostName(String str){
        int i=str.indexOf(".");
        int j=str.indexOf(".",i+1);
        return str.substring(i+1,j);
    }
}
