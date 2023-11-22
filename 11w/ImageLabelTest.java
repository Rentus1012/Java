import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JButton button;

	public ImageLabelTest() {
		setTitle("레이블 테스트");
		setSize(400, 250);

		panel = new JPanel();
		label = new JLabel("stonks");
		ImageIcon icon = new ImageIcon("D:\\객체지향\\11w\\stonks.png");
		label.setIcon(icon);

		button = new JButton("이 버튼을 클릭하면 당신의 주식이 떡상합니다!");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		ImageLabelTest t = new ImageLabelTest();
	}
}