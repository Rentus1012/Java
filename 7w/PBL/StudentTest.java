public class StudentTest
{
    public static void main(String[] args)
    {
        Human obj1 = new Human("����", 18);
        Human obj2 = new Human("����", 21);
        Human obj3 = new Human("���", 50);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        Student obj4 = new Student("����", 21, "��ǻ��");
        Student obj5 = new Student("����", 22, "�濵");
        Student obj6 = new Student("����", 24, "����");


        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
    }    
}
