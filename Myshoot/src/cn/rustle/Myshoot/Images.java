package cn.rustle.myshoot;

import javax.swing.*;

/**
 * @author rustle
 * @date 2021-07-08 19:45
 * ͼƬ����
 */
public class Images {

    //����ͼƬ�洢

    public static ImageIcon[] airplane;
    public static ImageIcon[] bigplane;
    public static ImageIcon[] bee;
    public static ImageIcon[] hero;
    public static ImageIcon[] bom;

    //����ͼƬ�洢

    public static ImageIcon bullet;
    public static ImageIcon sky;
    public static ImageIcon start;
    public static ImageIcon pause;
    public static ImageIcon gameover;

    //��̬�����

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
     * ����
     * �����빦�ܷ���
     * 4��ʾ����ʧ�ܣ�8��ʾ���سɹ�
     */
    public static void main(String[] args) {
        for (ImageIcon imageIcon : airplane) {
            System.out.println("С�л�ͼƬ��" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bigplane) {
            System.out.println("��л�ͼƬ��" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bee) {
            System.out.println("С�۷�ͼƬ��" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : hero) {
            System.out.println("Ӣ�ۻ�ͼƬ��" + imageIcon.getImageLoadStatus());
        }
        for (ImageIcon imageIcon : bom) {
            System.out.println("��ըͼƬ��" + imageIcon.getImageLoadStatus());
        }
        System.out.println("�ӵ�ͼƬ��" + bullet.getImageLoadStatus());
        System.out.println("���ͼƬ��" + sky.getImageLoadStatus());
        System.out.println("��ʼͼƬ��" + start.getImageLoadStatus());
        System.out.println("��ͣͼƬ��" + pause.getImageLoadStatus());
        System.out.println("����ͼƬ��" + gameover.getImageLoadStatus());
    }
}
