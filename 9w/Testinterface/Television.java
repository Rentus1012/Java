public class Television implements RemoteControl
{
    boolean on;
    public void turnOn()
    {
        on = true;
        System.out.println("TV �� �������ϴ�.");
    }  

    public void turnOff()
    {
        on = false;
        System.out.println("TV�� �������ϴ�.");
    }
    public void printBrand()
    {
        System.out.println("power java TV �Դϴ�.");
    }
    
}    

