import javax.swing.JPanel;

public class MyPanel extends JPanel {

   Slice[] list = { 
      new Slice(10, Color.red), new Slice(20, Color.blue), 
      new Slice(30, Color.orange), new Slice(40, Color.green) 
   }; 

 public void paintComponent(Graphics g) {
	      double total = 0.0D;
	      for (Slice s : list) {
	         total += s.value;
	      } 
	      double currValue = 0.0;
	      int start = 0;

	      for (Slice s : list) {
	         start = (int) (currValue * 360 / total);
	         int angle = (int) (s.value * 360 / total);
	         
	         g.setColor(s.color);
	         g.fillArc(100, 50, 200, 200, start, angle);
	         currValue += s.value;
	      } 
	   }
}
