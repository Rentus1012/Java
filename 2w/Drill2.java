import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        double width;
        Scanner sc = new Scanner(System.in);
        System.out.print("����: ");
        width = sc.nextDouble();
        
        double height;
        System.out.print("����: ");
        height = sc.nextDouble();
        
        double parameter;//�ѷ�
        parameter = 2*(width + height);
        
        double area;
        area = width * height;
        
        System.out.println("�ѷ�: "+parameter);
        System.out.println("����: "+area);
    }
}