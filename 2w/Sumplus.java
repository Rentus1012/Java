import java.util.Scanner; 
 
public class Sumplus {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y,sum;
        System.out.print("첫번쨰 숫자 입력: ");
        x=sc.nextInt();

        System.out.print("두번째 숫자 입력: ");
        y=sc.nextInt();

        sum=x+y;
        System.out.println(sum);
       }
    }