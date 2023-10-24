public class Boxtest {
    public static void main(String[] args)
    {
        Box b1;
        b1 = new Box();
        b1.setWidth(2.0);
        b1.setLength(2.0);
        b1.setHeight(3.0);
        System.out.printf("상자의 가로, 세로, 높이는 %.2f, %.2f, %.2f 입니다.\n", b1.getWidth(), b1.getLength(), b1.getHeight());

        System.out.println("부피는 "+b1.getVolume()+"입니다.");
        b1.setHeight(3.45);
        System.out.println("높이를 "+b1.getHeight()+"로 변경합니다.");
        System.out.println("부피는 "+b1.getVolume()+"입니다.");
    }
}
