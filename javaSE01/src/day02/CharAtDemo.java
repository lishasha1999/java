package day02;

/**
 * @author rustle
 * @date 2021-07-29 20:07
 * @Description ��ѯ��n���ַ�
 * @return
 */
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        System.out.println(str.charAt(1));
        /**
         * ������
         */
        String line = "�Ϻ�����ˮ���Ժ���";
        boolean flag = true;
        for (int i = 0; i <= line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("�ǻ���");
        } else {
            System.out.println("���ǻ���");
        }
    }
}
