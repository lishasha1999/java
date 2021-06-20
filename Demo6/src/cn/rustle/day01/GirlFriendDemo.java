package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-20 10:56
 */
public class GirlFriendDemo {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        System.out.println(girlFriend.name);
        System.out.println(girlFriend.height);
        System.out.println(girlFriend.weight);
        System.out.println(girlFriend.specialty);
    }
}
class GirlFriend{
    String name,specialty;
    double height,weight;
}
