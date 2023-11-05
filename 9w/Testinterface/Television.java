public class Television implements RemoteControl
{
    boolean on;
    public void turnOn()
    {
        on = true;
        System.out.println("TV 가 켜졌습니다.");
    }  

    public void turnOff()
    {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }
    public void printBrand()
    {
        System.out.println("power java TV 입니다.");
    }
    
}    

