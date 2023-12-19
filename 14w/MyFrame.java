
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Dimension d = getSize();
        int gWidth = d.width / 6;
        int gHeight = d.height;

        int x = 5;
        int y = 5;
        int width = gWidth - 10;
        int height = gHeight - 10;

        g2d.setStroke(new BasicStroke(10));//이걸 통해서 굵기를 올리거나 내릴수 있음.

        g2d.setColor(Color.BLACK);//색깔은 검은색으로

        // RoundRectangle2D
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y, width, height, 20, 20);
        g2d.draw(roundRect);
        x += gWidth;

        // Arc2D.OPEN
        Arc2D openArc = new Arc2D.Double(x, y, width, height, 90, 90, Arc2D.OPEN);
        g2d.draw(openArc);
        x += gWidth;

        // Arc2D.PIE
        Arc2D pieArc = new Arc2D.Double(x, y, width, height, 45, 90, Arc2D.PIE);
        g2d.draw(pieArc);
        x += gWidth;

        // Rectangle2D
        Rectangle2D rect = new Rectangle2D.Double(x, y, width, height);
        g2d.draw(rect);
        x += gWidth;

        // Arc2D.CHORD
        Arc2D chordArc = new Arc2D.Double(x, y, width, height, 0, 180, Arc2D.CHORD);
        g2d.draw(chordArc);
        x += gWidth;

        // Ellipse2D
        Ellipse2D ellipse = new Ellipse2D.Double(x, y, width, height);
        g2d.draw(ellipse);
    }
}

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("MyFrame");
        setSize(900, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel p = new MyPanel();
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
