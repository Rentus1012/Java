abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea() ;// 모든 도형에 대한 기본 구현
    

    @Override
    public String toString() {
        return "도형: " + getClass().getSimpleName() + ", 색상: " + color;
    }
}
