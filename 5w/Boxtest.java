public class Boxtest {
    public static void main(String[] args)
    {
        Box b1 = new Box();
        b1.width = 20;
        b1.length = 20;
        b1.height = 30;
        System.out.printf("������ ����, ����, ���̴� %d, %d, %d �Դϴ�.\n", (int)b1.width, (int)b1.length, (int)b1.height);

        System.out.println("���Ǵ� "+b1.getVolume()+"�Դϴ�.");
    }
}
