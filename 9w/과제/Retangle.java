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
        return length * width; // �簢�� ���� ���
    }

    @Override
    public String toString() {
        return super.toString() + ", ����: " + length + ", ����: " + width;
    }
}

