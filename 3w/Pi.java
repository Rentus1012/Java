import java.util.Scanner;

public class Pi
{
    public static void main(String[] args)
    {
        int t=0, b = 0, i = 0, u = 0;

        double pi = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("반복 횟수를 입력하시오: ");
        u = sc.nextInt();

        for (i = 1 ; i < u ; i++)
        {
            if (i % 2 == 0)
            {
                pi = pi- (float) 4 / (2 * i - 1 );
            }
            else
            {
                pi = pi+ (float) 4 / (2 * i - 1 );
            }
        }
        System.out.println("pi: " + pi);

    }
}