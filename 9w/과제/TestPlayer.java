import java.util.Scanner;

public class TestPlayer {
    public static void main(String[] args) {
        // Controllable �������̽��� �����ϴ� VideoPlayer �ν��Ͻ��� ����
        
        Controllable videoPlayer = new Controllable() {
            private boolean isPlaying = false;

            @Override
            public void play() {
                if (isPlaying)
                {
                    System.out.println("������ �̹� ��� ���Դϴ�.");
                }
                
                else
                {
                    isPlaying = true;
                    System.out.println("���� ����� �����մϴ�.");
                }
            }

            @Override
            public void stop() {
                if (isPlaying)
                {
                    isPlaying = false;
                    System.out.println("������ �����մϴ�.");
                }
                else
                {
                    System.out.println("������ ����ǰ� ���� �ʽ��ϴ�.");
                }
            }
        };

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("���ϴ� ����� �����ϼ���. (���, ����): ");
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("���")) {
                videoPlayer.play();
            }
            else if (choice.equals("����")) {
                videoPlayer.stop();
            }
            else {
                System.out.println("�߸��� ����Դϴ�.");
            }
        }
    }
}



//("���".equals(choice)
//()"����".equals(choice)