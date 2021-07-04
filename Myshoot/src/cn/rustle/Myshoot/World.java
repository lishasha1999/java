package cn.rustle.Myshoot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel {

    Sky s;
//    Hero h;
//    Airplane[] as;
//    Bigplane[] bas;
//    Bee[] bs;
//    Bullet[] bts;

    /**
     * 构造方法
     */
    World() {
        s = new Sky(400, 700, 0, 0, 1, -700);
    }

    void action() {
        Timer timer = new Timer();
    }


    public void paint(Graphics g) {
        s.paintObject(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        frame.add(world);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        world.action();
    }
}
