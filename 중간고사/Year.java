import java.util.Scanner;

public class Year
{
    
    
    public static void main(String[] args)
    {
        int month = 0;
        int day = 0;
        Scanner sc = new Scanner(System.in);


        while(true)
        {
            System.out.println("월을 입력하세요:");

            month = sc.nextInt();

            if (month <= 0 || month >=12)
            {
                continue;
            }

            if (month == 1)
                day = 31;

            if (month == 2)
                day = 28;
            
            if (month == 3)
                day = 31;
            
            if (month == 4)
                day = 30;
            
            if (month == 5)
                day = 31;
            
            if (month == 6)
                day = 30;
            
            if (month == 7)
                day = 31;
            
            if (month == 8)
                day = 31;

            if (month == 9)
                day = 30;

            if (month == 10)
                day = 31;

            if (month == 11)
                day = 30;
            
            if (month == 12)
                day = 31;
            
            System.out.println(month+"월은 "+day+"일입니다.");
            break;
        }
    
    }
        
}
