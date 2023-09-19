public class Add //클래스 정의
{
    public static void main(String[] args)
    {
        int x , y , sum, z;

        x=100;
        y=200;
        z = addition(1,9);
        sum=x+y+z;
        System.out.println(sum);
    }
    public static int addition(int x, int y)
    {
        int sum = x + y;
        return sum;
    }