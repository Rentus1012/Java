import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

class DoubleDice extends JPanel implements MouseListener {
    private int die1 = 4, die2 = 3;
    public DoubleDice() {
        super();
        addMouseListener(this);
        setBackground(new Color(200, 200, 255));
    }
    public void mousePressed(MouseEvent evt) {
        roll();
    }
    public void mouseReleased(MouseEvent evt) {
    }
    public void mouseClicked(MouseEvent evt) {
    }
    public void mouseEntered(MouseEvent evt) {
    }
    public void mouseExited(MouseEvent evt) {
    }
    public void roll() {
        Random random = new Random();
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        int size = 50;

        // Draw die1
        drawDie(g2d, die1, 50, 50, size);

        // Draw die2
        drawDie(g2d, die2, 150, 50, size);
    }



    
    private void drawDie(Graphics2D g2d, int value, int x, int y, int size) {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x, y, size, size);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, size, size);

        int dotSize = 10;

        switch (value) {
            case 1:
                drawDot(g2d, x + size / 2, y + size / 2, dotSize);
                System.out.println("1");
                break;
            case 2:
                drawDot(g2d, x + 20, y + 20, dotSize);
                drawDot(g2d, x + size - 30, y + size - 30, dotSize);
                System.out.println("2");
                break;
            case 3:
                drawDot(g2d, x + 20, y + 20, dotSize);
                drawDot(g2d, x + size / 2, y + size / 2, dotSize);
                drawDot(g2d, x + size +100, y + size +100, dotSize);
                System.out.println("3");
                break;
            case 4:
                drawDot(g2d, x + 20, y + 20, dotSize);
                drawDot(g2d, x + size - 30, y + 20, dotSize);
                drawDot(g2d, x + 20, y + size - 30, dotSize);
                drawDot(g2d, x + size - 30, y + size - 30, dotSize);
                System.out.println("4");
                break;
            case 5:
                drawDot(g2d, x + 20, y + 20, dotSize);
                drawDot(g2d, x + size - 30, y + 20, dotSize);
                drawDot(g2d, x + size / 2, y + size / 2, dotSize);
                drawDot(g2d, x + 20, y + size - 30, dotSize);
                drawDot(g2d, x + size - 30, y + size - 30, dotSize);
                System.out.println("5");
                break;
            case 6:
                drawDot(g2d, x + 20, y + 20, dotSize);
                drawDot(g2d, x + size - 30, y + 20, dotSize);
                drawDot(g2d, x + 20, y + size / 2, dotSize);
                drawDot(g2d, x + size - 30, y + size / 2, dotSize);
                drawDot(g2d, x + 20, y + size - 30, dotSize);
                drawDot(g2d, x + size - 30, y + size - 30, dotSize);
                System.out.println("6");
                break;
        }
    }

    private void drawDot(Graphics2D g2d, int x, int y, int size) {
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x - size / 2, y - size / 2, size, size);
    }
}

public class DoubleDiceTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Double Dice Roller");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DoubleDice doubleDice = new DoubleDice();

        frame.add(doubleDice);

        frame.setVisible(true);
    }
}