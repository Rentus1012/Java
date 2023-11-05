//추상적 메서드를 가지지 않아서 오류가 나옴.


interface RemoteControl
{
    void turnOn();
    void turnOff();

    public default void printBrand(){
        System.out.println("Remote Control 기능 TV");
    }
}
