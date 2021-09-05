package day08;

import java.awt.*;
import java.io.IOException;

/**
 * @author rustle
 * @date 2021-09-05 8:38
 * @Description
 * @return
 */
public class ThrowsDemo {
    public static void main(String[] args) {
    }
}
class Super{
    public void dosome() throws IOException, AWTException {}
}
class Sub extends Super{
    //完全共同的重写
//    public void dosome() throws IOException, AWTException{}

    //可以仅抛出部分异常
//    public void dosome() throws IOException {}
    //可以不再抛出任何异常
//    public void dosome(){}
    //可以抛出父类方法中抛出异常的子类型异常
//    public void dosome() throws FileNotFoundException {}

    //不允许抛出额外的异常
//    public void dosome() throws SQLException{}
    //不允许抛出父类方法抛出异常的父类型异常
//    public void dosome() throws Exception{}

}