public class BoxTest
{
    public static void main(String[] args)
    {
        
        Box b1 = new Box();

        b1.setWidth(100);
        b1.setLength(100);
        b1.setHeight(100);
        b1.getVolume();

        System.out.printf("box1: ����, ����, ���̰� %s�� ���� �Ǿ����ϴ�.\n", b1.print());
        System.out.printf("box1: ���Ǵ� %d �Դϴ�.\n", b1.getVolume());



        Box b2 = b1;

        b2.setWidth(200);
        b2.setLength(200);
        b2.setHeight(200);

        System.out.printf("box2: ����, ����, ���̰� %s�� ���� �Ǿ����ϴ�.\n", b2.print());
        System.out.printf("box1: ������ ����, ����, ���̴� %s �Դϴ�.\n", b1.print());

    }    
}
