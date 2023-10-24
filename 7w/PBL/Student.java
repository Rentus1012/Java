public class Student extends Human 
{
    private String major;


    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major = major;
    }
    @Override
    
    public String toString()
    {
        return super.toString() + " Àü°ø:" + major;
    }
}
