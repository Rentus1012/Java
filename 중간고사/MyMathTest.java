public class MyMathTest
{
    public static void main ( String[] args )
    {
        System.out.println("10의 3승은 "+ MyMath.power(10, 3));
        System.out.println("3의 절대값은" + MyMath.abs(3));
        System.out.println("이제까지 계산한 연산은 총 "+ MyMath.count +"개입니다.");
    }
}