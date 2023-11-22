import javax.swing.*;
import java.awt.FlowLayout;


public class Buttons extends JFrame {
      public Buttons() {
            setSize(300, 300);
            setTitle("다양한 버튼 만들기");

            setLayout(new FlowLayout());

            JButton b1 = new JButton("왼쪽 버튼");
            
            JButton b2 = new JButton("중앙 버튼");

            JButton b3 = new JButton("오른쪽 버튼");
            b3.setEnabled(false);
            add(b1);
            add(b2);
            add(b3);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
      public static void main(String[] args) {
            Buttons f = new Buttons();
      }
}