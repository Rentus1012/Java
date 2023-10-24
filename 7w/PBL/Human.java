public class Human
{
    private String name;
    private int age;

    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "이름:" + name +"나이:" + age+ "세";
    }
    public String getName()
    {
        return name;
    }
    public setName(String name)
    {
        this.name = name;
    }
    public setAge(int age)
    {
        this.age = age;
    }
}
