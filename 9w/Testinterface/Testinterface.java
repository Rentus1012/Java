public class Testinterface
{
    public static void main(String[] args)
    {
        RemoteControl obj = new Television();

        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}