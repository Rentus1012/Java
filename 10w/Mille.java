import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mille {
    public static void main(String[] args) {
        JFrame frame = new JFrame("?????? ???????? ???");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();

        JLabel mileLabel = new JLabel("????:");
        JTextField mileTextField = new JTextField(10);

        JLabel kilometerLabel = new JLabel("???????:");
        JTextField kilometerTextField = new JTextField(10);
        kilometerTextField.setEditable(false);

        JButton convertButton = new JButton("???");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double miles = Double.parseDouble(mileTextField.getText());
                    double kilometers = miles * 1.60934;
                    kilometerTextField.setText("");
                } catch (NumberFormatException ex) {
                    kilometerTextField.setText("??????? ???? ???");
                }
            }
        });

        panel.add(mileLabel);
        panel.add(mileTextField);
        panel.add(kilometerLabel);
        panel.add(kilometerTextField);
        panel.add(convertButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}