public class Car{
    String color;
    int speed;
    int gear;

    @Override//이게 뭐임?
    //그 아래에 있는 메서드는 이미 있는거임. 이 프로ㅓ그램에서 업글하겠다.

    public String toString()
    {
        //문자열 반환
        //return "문자열"
        return "Car[color=" + color + ", speed=" + speed + ", gear=" + gear+"]";
    }


    void changeGear(int g){ gear = g; }
    void speedUp(){ speed = speed + 10; }
    void speedDown(){ speed = speed - 10; }
}