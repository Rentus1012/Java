import java.util.Scanner;
public class Money

{
    public static void main(String[] args)
    {
        int h = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("�ð��� �Է��Ͻÿ�: ");
        h = sc.nextInt();

        double tot = 0;

        if (h > 8)
        {
            tot = 9620 * (h * 1.5);
            System.out.println("�ӱ���"+tot+"�Դϴ�.");
        }
        if (h < 8)
        {
            tot = 9620 * h;
            System.out.println("�ӱ���"+tot+"�Դϴ�.");
        }
        System.out.println(h);
    }
}