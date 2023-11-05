public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height; // 삼각형 면적 계산
    }

    @Override
    public String toString() {
        return super.toString() + ", 밑변: " + base + ", 높이: " + height;
    }
}
