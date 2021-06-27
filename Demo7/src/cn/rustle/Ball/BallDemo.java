package cn.rustle.Ball;

import cn.tedu.util.App;

import java.awt.*;
import java.util.Arrays;

public class BallDemo extends App {

    Ball balls[]=new Ball[100];
    public BallDemo() {
        for (int i=0;i<balls.length;i++){
            balls[i]=new Ball();
        }

    }

    public static void main(String[] args) {
        BallDemo ballDemo=new BallDemo();
        ballDemo.start();
    }

    @Override
    public void painting(Graphics2D g) {
        for (int i=0;i<balls.length;i++){
            balls[i].move();
            balls[i].paint(g);
        }
        eaten();
        System.out.println(balls.length);
    }

    public void eaten(){
        //定义eaten方法，定义一组大球，一组小球，并且设置开关，遍历小球数组，如果小球被吃了，则将开关置为true
        Ball[] big=balls;//将生成的小球赋值
        Ball[] small=balls;

        //创建吃掉的标记，默认为false
        boolean[] eaten=new boolean[small.length];
        //定义计数器
        int n=0;
        //遍历每一个大球
        for (int i=0;i<big.length;i++) {
            if (eaten[i] = true) {
                continue;
            }
            //遍历每一个小球
            for (int j = 0; j < small.length; j++) {
                if (i == j) {
                    continue;
                }
                if (eaten[j]) {
                    continue;
                }
                if (big[i].eat(small[j])) {
                    eaten[j] = true;
                    n++;
                }
            }
            if(n==0){
                return; //结束方法
            }
            Ball[] arr=new Ball[small.length];
            int index=0;
            for (int k=0;k<small.length;k++){
                if (!eaten[k]){
                    arr[index++]=small[k];
                }
            }
            balls=Arrays.copyOf(arr,arr.length-n);
        }
        }
    }

