public class Cartest
{
    public static void main(String[] args)
    {
        System.out.println("1. �ʱ����");

        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 10;
        myCar.gear = 5;
        System.out.println(" -myCar:" +myCar.print());
        //ĥ�ǿ� ���°� ó�� ���� �Ǹ� ������ ����.
        //car �� 10���� ó�� �ؾ� �Ѵ�ϴ�.
        


        Car yourCar = new Car();
        yourCar.color = "Blue";
        yourCar.speed = 6;
        yourCar.gear = 4;
        yourCar.print();
        System.out.println(" -yourCar:" +yourCar.print());


        System.out.println("2. myCar, yourCar ����");
        myCar.speedUp();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());


        System.out.println("3. myCar ����, yourCar ����");
        myCar.speedDown();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());

        System.out.println("4. myCar ����, yourCar ����");
        myCar.speedDown();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());
    }
}
