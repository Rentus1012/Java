import javax.swing.*;
import java.awt.FlowLayout;


public class Buttons extends JFrame {
      public Buttons() {
            setSize(300, 300);
            setTitle("�پ��� ��ư �����");

            setLayout(new FlowLayout());

            JButton b1 = new JButton("���� ��ư");
            
            JButton b2 = new JButton("�߾� ��ư");

            JButton b3 = new JButton("������ ��ư");
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