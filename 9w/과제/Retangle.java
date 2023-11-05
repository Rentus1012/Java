class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width; // 사각형 면적 계산
    }

    @Override
    public String toString() {
        return super.toString() + ", 가로: " + length + ", 세로: " + width;
    }
}

