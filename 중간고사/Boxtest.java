public class Boxtest {
    public static void main(String[] args)
    {
        Box b1;
        b1 = new Box();
        b1.setWidth(2.0);
        b1.setLength(2.0);
        b1.setHeight(3.0);
        System.out.printf("������ ����, ����, ���̴� %.2f, %.2f, %.2f �Դϴ�.\n", b1.getWidth(), b1.getLength(), b1.getHeight());

        System.out.println("���Ǵ� "+b1.getVolume()+"�Դϴ�.");
        b1.setHeight(3.45);
        System.out.println("���̸� "+b1.getHeight()+"�� �����մϴ�.");
        System.out.println("���Ǵ� "+b1.getVolume()+"�Դϴ�.");
    }
}
