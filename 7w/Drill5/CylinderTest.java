public class CylinderTest
{
    public static void main(String[] args)
    {
        Cylinder obj1 = new Cylinder(0.0, 0.0);
        System.out.println("Cricle �����ڸ� ȣ���մϴ�. �ʱⰪ��"+ obj1.getRadius() +"�Դϴ�.");
        System.out.println("Cylinder �����ڸ� ȣ���մϴ�. �ʱⰪ radius��"+ obj1.getRadius() +"�Դϴ�.");
        System.out.println("obj1 ��ü�� radius��"+obj1.getRadius()+"�̰�, heigth��"+obj1.getHeight()+"�Դϴ�.");
        Cylinder obj2 = new Cylinder(5.0, 3.0);

        System.out.println("Circle �����ڸ� ȣ���Ͽ����ϴ�. radius��"+obj2.getRadius()+"�Դϴ�.");
        System.out.println("Cylinder �����ڸ� ȣ���մϴ�. �ʱⰪ height��"+obj2.getRadius()+"�Դϴ�.");
        System.out.println("obj2 ��ü�� ������"+obj2.getArea()+"�̰�, ���Ǵ�"+obj2.getVolume()+"�Դϴ�.");



    }
}
