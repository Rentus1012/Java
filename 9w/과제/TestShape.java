public class TestShape {
    public static void main(String[] args) {
        // Shape�� ��ӹ޴� �پ��� ���� ��ü�� �����Ͽ� ������ ���, ���
        Shape redRectangle = new Rectangle("����", 5.0, 4.0);
        Shape blueTriangle = new Triangle("�Ķ�", 6.0, 8.0);

        System.out.println(redRectangle.toString());
        System.out.println("����: " + redRectangle.calcArea());

        System.out.println(blueTriangle.toString());
        System.out.println("����: " + blueTriangle.calcArea());
    }
}