import java.util.Scanner;

public class PBL1
{
    public static void main(String[] args)
    {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        year = input.nextInt();
        if (year % 4 == 0)
        {
            if (year % 100 != 0 && year % 400 == 0)
            {
                System.out.println(year + "년은 윤년입니다.");
            }
            else
            {
                System.out.println(year + "년은 평년입니다.");
            }
        }
        else
        {
            System.out.println(year + "년은 평년입니다.");
        }
    }
}
