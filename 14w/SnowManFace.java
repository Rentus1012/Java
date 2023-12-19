import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class SnowManFace extends JFrame {
	class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(50, 80, 50, 50, 180, 180); // 왼쪽 눈
			g.drawArc(140, 80, 50, 50, 180, 180); // 오른쪽 눈
			g.drawArc(70, 130, 100, 70, 180, -180); // 입
		}
	}
	public SnowManFace() {
		setSize(300, 300);
		setTitle("눈사람 얼굴");
		setVisible(true);
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}