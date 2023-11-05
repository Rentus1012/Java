import java.util.Scanner;

public class TestPlayer {
    public static void main(String[] args) {
        // Controllable 인터페이스를 구현하는 VideoPlayer 인스턴스를 생성
        
        Controllable videoPlayer = new Controllable() {
            private boolean isPlaying = false;

            @Override
            public void play() {
                if (isPlaying)
                {
                    System.out.println("비디오가 이미 재생 중입니다.");
                }
                
                else
                {
                    isPlaying = true;
                    System.out.println("비디오 재생을 시작합니다.");
                }
            }

            @Override
            public void stop() {
                if (isPlaying)
                {
                    isPlaying = false;
                    System.out.println("비디오를 정지합니다.");
                }
                else
                {
                    System.out.println("비디오가 재생되고 있지 않습니다.");
                }
            }
        };

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("원하는 기능을 선택하세요. (재생, 정지): ");
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("재생")) {
                videoPlayer.play();
            }
            else if (choice.equals("정지")) {
                videoPlayer.stop();
            }
            else {
                System.out.println("잘못된 명령입니다.");
            }
        }
    }
}



//("재생".equals(choice)
//()"정지".equals(choice)