public class Circle
{
    protected double radius;
    protected String color;


    public Circle()
    {
        radius = 0.0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getArea()//����
    {
		return 3.14 * radius * radius;
	}
    public double getRadius()//������
    {
        return radius;
    }
}