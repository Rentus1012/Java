abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea() ;// ��� ������ ���� �⺻ ����
    

    @Override
    public String toString() {
        return "����: " + getClass().getSimpleName() + ", ����: " + color;
    }
}
