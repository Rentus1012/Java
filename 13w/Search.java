import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Search extends JFrame {

    public Search() {
        setTitle("로그인 창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 체크박스 생성
        JCheckBox ch1 = new JCheckBox("대소문자 구별하기");
        JCheckBox ch2 = new JCheckBox("반복");
        JCheckBox ch3 = new JCheckBox("전체 단어 배치");
        JCheckBox ch4 = new JCheckBox("역순으로");

        // 체크박스를 담을 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        

        // 패널을 프레임에 추가
        add(panel);

        panel.add(new JLabel("찾기 대화 상자"));
		panel.add(new JTextField(10));
		

		JButton find = new JButton("찾기");
		panel.add(find);
        JButton cancel = new JButton("취소");
        panel.add(cancel);
		

        // 패널에 체크박스 추가
        panel.add(ch1);
        panel.add(ch2);
        panel.add(ch3);
        panel.add(ch4);


		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


        // ItemListener 구현
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // 체크박스의 상태가 변경될 때의 동작 정의
                // 예제에서는 간단한 출력만 수행
                System.out.println("Checkbox State Changed");
            }
        };

        // 각 체크박스에 ItemListener 추가
        ch1.addItemListener(itemListener);
        ch2.addItemListener(itemListener);
        ch3.addItemListener(itemListener);
        ch4.addItemListener(itemListener);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Search();
        });
    }
}
