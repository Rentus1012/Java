public class CarTest//메인 메서드를 가지고 있음. O 라고 표시
{
    public static void main(String[] args){

        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);//my car 객체를 그대로 print로 넣으면 mycar.tostring()이 자동 호출
    }

    
}
