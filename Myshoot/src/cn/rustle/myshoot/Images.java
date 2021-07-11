package cn.rustle.myshoot;

import javax.swing.*;

/**
 * @author rustle
 * @date 2021-07-08 19:45
 * Í¼Æ¬Êý×é
 */
public class Images {

    //¶àÕÅÍ¼Æ¬´æ´¢

    public static ImageIcon[] airplane;
    public static ImageIcon[] bigplane;
    public static ImageIcon[] bee;
    public static ImageIcon[] hero;
    public static ImageIcon[] bom;

    //µ¥ÕÅÍ¼Æ¬´æ´¢

    public static ImageIcon bullet;
    public static ImageIcon sky;
    public static ImageIcon start;
    public static ImageIcon pause;
    public static ImageIcon gameover;

    //¾²Ì¬´úÂë¿é

    static {
        airplane = new ImageIcon[2];
        bigplane = new ImageIcon[2];
        bee = new ImageIcon[2];
        hero = new ImageIcon[2];
        bom = new ImageIcon[4];
        for (int i = 0; i < airplane.length; i++) {
            airplane[i] = new ImageIcon("images/airplane" + i + ".png");
        }
        for (int i = 0; i < bigplane.length; i++) {
            bigplane[i] = new ImageIcon("images/bigairplane" + i + ".png");
        }
        for (int i = 0; i < bee.length; i++) {
            bee[i] = new ImageIcon("images/bee" + i + ".png");
        }
        for (int i = 0; i < hero.length; i++) {
            hero[i] = new ImageIcon("images/hero" + i + ".png");
        }
        for (int i = 0; i < bom.length; i++) {
            bom[i] = new ImageIcon("images/bom" + (i + 1) + ".png");
        }
        bullet = new ImageIcon("images/bullet.png");
        sky = new ImageIcon("images/background.png");
        start = new ImageIcon("images/start.png");
        pause = new ImageIcon("images/pause.png");
        gameover = new ImageIcon("images/gameover.png");
    }

    /**
     * ²âÊÔ
     * ²âÊÔÓë¹¦ÄÜ·ÖÀë
     * 4±íÊ¾¼ÓÔØÊ§°Ü£¬8±íÊ¾¼ÓÔØ³É¹¦
     */
    public static void main(String[] args) {
        for (ImageIcon imageIcon : airplane) {
            System.out.println("Ð¡µÐ»úÍ¼Æ¬£º" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bigplane) {
            System.out.println("´óµÐ»úÍ¼Æ¬£º" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bee) {
            System.out.println("Ð¡ÃÛ·äÍ¼Æ¬£º" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : hero) {
            System.out.println("Ó¢ÐÛ»úÍ¼Æ¬£º" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bom) {
            System.out.println("±¬Õ¨Í¼Æ¬£º" + imageIcon.getImageLoadStatus());
        }
        System.out.println("×Óµ¯Í¼Æ¬£º" + bullet.getImageLoadStatus());
        System.out.println("Ìì¿ÕÍ¼Æ¬£º" + sky.getImageLoadStatus());
        System.out.println("¿ªÊ¼Í¼Æ¬£º" + start.getImageLoadStatus());
        System.out.println("ÔÝÍ£Í¼Æ¬£º" + pause.getImageLoadStatus());
        System.out.println("½áÊøÍ¼Æ¬£º" + gameover.getImageLoadStatus());
    }
}
