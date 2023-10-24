public class StudentTest
{
    public static void main(String[] args)
    {
        Human obj1 = new Human("춘향", 18);
        Human obj2 = new Human("몽룡", 21);
        Human obj3 = new Human("사또", 50);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        Student obj4 = new Student("명진", 21, "컴퓨터");
        Student obj5 = new Student("미현", 22, "경영");
        Student obj6 = new Student("용준", 24, "경제");


        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
    }    
}
