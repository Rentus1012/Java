public class Boxtest {
    public static void main(String[] args)
    {
        Box b1 = new Box();
        b1.width = 20;
        b1.length = 20;
        b1.height = 30;
        System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d 입니다.\n", (int)b1.width, (int)b1.length, (int)b1.height);

        System.out.println("부피는 "+b1.getVolume()+"입니다.");
    }
}
