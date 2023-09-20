import java.util.Scanner;
public class Money

{
    public static void main(String[] args)
    {
        int h = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하시오: ");
        h = sc.nextInt();

        double tot = 0;

        if (h > 8)
        {
            tot = 9620 * (h * 1.5);
            System.out.println("임금은"+tot+"입니다.");
        }
        if (h < 8)
        {
            tot = 9620 * h;
            System.out.println("임금은"+tot+"입니다.");
        }
        System.out.println(h);
    }
}