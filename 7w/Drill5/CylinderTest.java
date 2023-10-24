public class CylinderTest
{
    public static void main(String[] args)
    {
        Cylinder obj1 = new Cylinder(0.0, 0.0);
        System.out.println("Cricle 생성자를 호출합니다. 초기값은"+ obj1.getRadius() +"입니다.");
        System.out.println("Cylinder 생성자를 호출합니다. 초기값 radius는"+ obj1.getRadius() +"입니다.");
        System.out.println("obj1 객체의 radius는"+obj1.getRadius()+"이고, heigth는"+obj1.getHeight()+"입니다.");
        Cylinder obj2 = new Cylinder(5.0, 3.0);

        System.out.println("Circle 생성자를 호출하였습니다. radius는"+obj2.getRadius()+"입니다.");
        System.out.println("Cylinder 생성자를 호출합니다. 초기값 height는"+obj2.getRadius()+"입니다.");
        System.out.println("obj2 객체의 면적은"+obj2.getArea()+"이고, 부피는"+obj2.getVolume()+"입니다.");



    }
}
