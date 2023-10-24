public class Box
{
    private int width;
    private int length;
    private int height; //필드


    public int getWidth()//접근자
        {return width;}
    public int getLength()
        {return length;}
    public int getHeight()
        {return height;}



    public void setWidth(int sw)//설정자
        {width = sw;}
    public void setLength(int sl)
        {length = sl;}
    public void setHeight(int sh)
        {height = sh;}

    public int getVolume()
    {
        return length * width * height;
    }
    
    String print()
    {
        return String.format("(%d, %d, %d)", width, length, height);
    }

}

