public class TelevisionTest
{
        public static void main(String[] args)
        {
            Television t1 = new Television();

            t1.turnOn();
            t1.setChannel(0);
            t1.setVolume(0);

            System.out.printf("1. tv ��ü�� �����մϴ�. �ʱ� ���� ���� %s �Դϴ�.\n", t1.toString());
            t1.setChannel(99);
            System.out.printf("2. setChannel() �޼��带 ȣ���մϴ�. �������� %d �Դϴ�.\n" ,t1.getChannel());
            t1.setChannel('+');
            System.out.printf("3. setChannel() �޼��带 ȣ���մϴ�. �������� '+' �Դϴ�.\n");
            System.out.printf("4. getChannel() �޼��带 ȣ���մϴ�. ��°��� %d �Դϴ�.\n", t1.getChannel());
            t1.setChannel('-');
            System.out.printf("5. setChannel() �޼��带 ȣ���մϴ�. �������� '-' �Դϴ�.\n");
            System.out.printf("6. getChannel() �޼��带 ȣ���մϴ�. ��°��� %d �Դϴ�.\n", t1.getChannel());
            System.out.printf("7. getChannel() �޼��带 ȣ���մϴ�. ��°��� %d �Դϴ�.\n", t1.getVolume());
            t1.setVolume(30);
            System.out.printf("8. setVolume() �޼��带 ȣ���մϴ�. �������� %d �Դϴ�.\n", t1.getVolume());
            System.out.printf("9. getVolume() �޼��带 ȣ���մϴ�. ��°��� %d �Դϴ�.\n", t1.getVolume());
            System.out.printf("10. turnOn() �޼��带 ȣ���մϴ�.\n");
            System.out.printf("11. toString() �޼��带 ȣ���մϴ�. ���� tv ���´� %s �Դϴ�.\n", t1.toString());
            System.out.printf("12. turnOff �޼��带 ȣ���մϴ�.\n");
            t1.turnOff();
            System.out.printf("13. toString() �޼��带 ȣ���մϴ�. ���� tv ���´� %s �Դϴ�.\n", t1.toString());
        }
}
