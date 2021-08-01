package day03;

/**
 * @author rustle
 * @date 2021-07-31 22:01
 * @Description
 * @return
 */
public class ReplaceDemo2 {
    public static void main(String[] args) {
        String word="wqnmlgb,Äã¸ölj,Äã¸ösbµÄ,mdzz";
        String regex="(wqnmlgb|wc|lj|tmd|wsdn|sb)";
        System.out.println(word.replaceAll(regex,"*"));
    }
}
