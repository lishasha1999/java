package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-06 11:46
 * Long类型
 */
public class Demo04 {
    public static void main(String[] args) {
        long max_value=Long.MAX_VALUE;
        long min_value=Long.MIN_VALUE;
        System.out.println(max_value);
        System.out.println(min_value);

        long l =100L;
        System.out.println(l);

        //时间毫秒值
        long time=System.currentTimeMillis();
        System.out.println(time);
        long year =time/1000/60/60/24/365 +1970L;
        System.out.println(year);
        long day=(time-(year-1970)*1000*60*60*24*365)/1000/60/60/24L;
        System.out.println(day);



    }
}
