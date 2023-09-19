import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        double width;
        Scanner sc = new Scanner(System.in);
        System.out.print("가로: ");
        width = sc.nextDouble();
        
        double height;
        System.out.print("세로: ");
        height = sc.nextDouble();
        
        double parameter;//둘레
        parameter = 2*(width + height);
        
        double area;
        area = width * height;
        
        System.out.println("둘레: "+parameter);
        System.out.println("면적: "+area);
    }
}