import java.util.Scanner;

public class Drill3
{
    public static void main(String[] args)
    {
        int year;
        Scanner sc = new Scanner(System.in);
        long distance;
        System.out.print("빛의 이동 시간을 입력(년 단위):");
        year = sc.nextInt();
        distance = (long) 300000L * 365*24*60*60*year;

        System.out.println("빛이 " +year +" 년 동안 이동하는 거리: "+ distance);
    }
}
