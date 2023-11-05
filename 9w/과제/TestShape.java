public class TestShape {
    public static void main(String[] args) {
        // Shape를 상속받는 다양한 도형 객체를 생성하여 면적을 계산, 출력
        Shape redRectangle = new Rectangle("빨강", 5.0, 4.0);
        Shape blueTriangle = new Triangle("파랑", 6.0, 8.0);

        System.out.println(redRectangle.toString());
        System.out.println("면적: " + redRectangle.calcArea());

        System.out.println(blueTriangle.toString());
        System.out.println("면적: " + blueTriangle.calcArea());
    }
}