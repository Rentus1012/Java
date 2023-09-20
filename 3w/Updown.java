import java.util.Scanner;
import java.util;

public class Updown
{
    public static void main(String[] args)
    {
        int min = 0, max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("수의 범위를 입력하세요(낮은수부터 순서대로): ");
        min = sc.nextInt();
        max = sc.nextInt();
        int ans = (int)(Math.random() * max) + min;
        System.out.println(ans); //정답을 알면 안됨

        int user = 0;
        while(user != ans)
        {
            System.out.println("수를 입력하세요:");
            user = sc.nextInt();
            if (user < ans)
                System.out.println("Up");
            if (user > ans)
                System.out.println("Down");
        }
        System.out.println("같습니다.");
    }
}