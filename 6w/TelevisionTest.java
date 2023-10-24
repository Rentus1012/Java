public class TelevisionTest
{
        public static void main(String[] args)
        {
            Television t1 = new Television();

            t1.turnOn();
            t1.setChannel(0);
            t1.setVolume(0);

            System.out.printf("1. tv 객체를 생성합니다. 초기 설정 값은 %s 입니다.\n", t1.toString());
            t1.setChannel(99);
            System.out.printf("2. setChannel() 메서드를 호출합니다. 설정값은 %d 입니다.\n" ,t1.getChannel());
            t1.setChannel('+');
            System.out.printf("3. setChannel() 메서드를 호출합니다. 설정값은 '+' 입니다.\n");
            System.out.printf("4. getChannel() 메서드를 호출합니다. 출력값은 %d 입니다.\n", t1.getChannel());
            t1.setChannel('-');
            System.out.printf("5. setChannel() 메서드를 호출합니다. 설정값은 '-' 입니다.\n");
            System.out.printf("6. getChannel() 메서드를 호출합니다. 출력값은 %d 입니다.\n", t1.getChannel());
            System.out.printf("7. getChannel() 메서드를 호출합니다. 출력값은 %d 입니다.\n", t1.getVolume());
            t1.setVolume(30);
            System.out.printf("8. setVolume() 메서드를 호출합니다. 설정값은 %d 입니다.\n", t1.getVolume());
            System.out.printf("9. getVolume() 메서드를 호출합니다. 출력값은 %d 입니다.\n", t1.getVolume());
            System.out.printf("10. turnOn() 메서드를 호출합니다.\n");
            System.out.printf("11. toString() 메서드를 호출합니다. 현재 tv 상태는 %s 입니다.\n", t1.toString());
            System.out.printf("12. turnOff 메서드를 호출합니다.\n");
            t1.turnOff();
            System.out.printf("13. toString() 메서드를 호출합니다. 현재 tv 상태는 %s 입니다.\n", t1.toString());
        }
}
