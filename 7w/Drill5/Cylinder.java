public class Cylinder extends Circle
{
    private double height;

    public Cylinder()
    {
        height = 0;
    }
    public Cylinder(double radius)
    {
        this.radius = radius;
    }
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()//ºÎÇÇ
    {
        return radius * radius * height * 3.14;
    }
}
