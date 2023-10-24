public class BoxTest
{
    public static void main(String[] args)
    {
        
        Box b1 = new Box();

        b1.setWidth(100);
        b1.setLength(100);
        b1.setHeight(100);
        b1.getVolume();

        System.out.printf("box1: 가로, 세로, 높이가 %s로 설정 되었습니다.\n", b1.print());
        System.out.printf("box1: 부피는 %d 입니다.\n", b1.getVolume());



        Box b2 = b1;

        b2.setWidth(200);
        b2.setLength(200);
        b2.setHeight(200);

        System.out.printf("box2: 가로, 세로, 높이가 %s로 설정 되었습니다.\n", b2.print());
        System.out.printf("box1: 설정된 가로, 세로, 높이는 %s 입니다.\n", b1.print());

    }    
}
