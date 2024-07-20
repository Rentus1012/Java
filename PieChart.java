import javax.swing.JFrame;

public class PieChart extends JFrame {
	public PieChart() {
		setSize(600, 300);
		setTitle("Pie Chart");
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		PieChart c = new PieChart();
	}
}
