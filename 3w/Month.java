import java.util.Scanner;

public class Month
{
    public static void main(String[] args)
    {
        String month;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");

        String in = sc.next();
        
        int day = 0;
        switch(in)
        {
            case "January": day = 31; break;
            case "February": day = 28; break;
            case "March": day = 31; break;
            case "April": day = 30; break;
            case "May": day = 31; break;
            case "June": day = 30; break;
            case "July": day = 31; break;
            case "August": day = 31; break;
            case "September": day = 30; break;
            case "October": day = 31; break;
            case "November": day = 30; break;
            case "December": day = 31; break;
            
            //default는 일일이 다 쓰면 안달아도 되나봄
        }
        System.out.println("월의 날수는"+day+"일 입니다.");
    }
}