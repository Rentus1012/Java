public class Car
{
    String color;
    int speed;
    int gear;


    String print()
    {
        return String.format("( %s, %d, %d )\n", color, speed, gear);
    }

    void speedUp()
    {
        speed+=5;
        if (speed>70)
        {
            speed=70;
        }
    }
    void speedDown()
    {
        speed-=3;
        if (speed<0)
        {
            speed=0;
        }
    }
}
