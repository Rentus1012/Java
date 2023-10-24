public class Box {
    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}
