import java.util.Scanner;
import java.util;

public class Updown
{
    public static void main(String[] args)
    {
        int min = 0, max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("���� ������ �Է��ϼ���(���������� �������): ");
        min = sc.nextInt();
        max = sc.nextInt();
        int ans = (int)(Math.random() * max) + min;
        System.out.println(ans); //������ �˸� �ȵ�

        int user = 0;
        while(user != ans)
        {
            System.out.println("���� �Է��ϼ���:");
            user = sc.nextInt();
            if (user < ans)
                System.out.println("Up");
            if (user > ans)
                System.out.println("Down");
        }
        System.out.println("�����ϴ�.");
    }
}