public class Car{
    String color;
    int speed;
    int gear;

    @Override//�̰� ����?
    //�� �Ʒ��� �ִ� �޼���� �̹� �ִ°���. �� ���Τñ׷����� �����ϰڴ�.

    public String toString()
    {
        //���ڿ� ��ȯ
        //return "���ڿ�"
        return "Car[color=" + color + ", speed=" + speed + ", gear=" + gear+"]";
    }


    void changeGear(int g){ gear = g; }
    void speedUp(){ speed = speed + 10; }
    void speedDown(){ speed = speed - 10; }
}