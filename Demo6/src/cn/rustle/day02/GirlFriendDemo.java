package cn.rustle.day02;

/**
 * @author rustle
 * @date 2021-06-20 10:56
 */
public class GirlFriendDemo {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend("WangYiFan","옵갖",165,60);
        System.out.println(girlFriend.name);
        System.out.println(girlFriend.specialty);
        System.out.println(girlFriend.height);
        System.out.println(girlFriend.weight);
    }
}

class GirlFriend{
    String name,specialty;
    double height,weight;

    public GirlFriend()
    {
        name="WangYiFan";
        specialty="옵갖";
        height=160;
        weight=60;
    }

    /**
     *
     * @param _name
     * @param _specialty
     * @param _height
     * @param _weight
     */
    public GirlFriend(String _name,String _specialty,double _height,double _weight){
        this.name=_name;
        this.specialty=_specialty;
        this.height=_height;
        this.weight=_weight;
    }
}
