public class Cartest
{
    public static void main(String[] args)
    {
        System.out.println("1. 초기상태");

        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 10;
        myCar.gear = 5;
        System.out.println(" -myCar:" +myCar.print());
        //칠판에 나온것 처럼 쓰게 되면 문제가 있음.
        //car 의 10번줄 처럼 해야 한답니당.
        


        Car yourCar = new Car();
        yourCar.color = "Blue";
        yourCar.speed = 6;
        yourCar.gear = 4;
        yourCar.print();
        System.out.println(" -yourCar:" +yourCar.print());


        System.out.println("2. myCar, yourCar 가속");
        myCar.speedUp();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());


        System.out.println("3. myCar 감속, yourCar 가속");
        myCar.speedDown();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());

        System.out.println("4. myCar 감속, yourCar 가속");
        myCar.speedDown();
        yourCar.speedUp();
        System.out.println(" -myCar:" +myCar.print());
        System.out.println(" -yourCar:" +yourCar.print());
    }
}
