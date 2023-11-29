import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator1 extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = { 
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"
    };
    private double num1, num2;
    private String op="";

    public Calculator() {
        tField = new JTextField(35);
        panel = new JPanel();
        tField.setText("");

        panel.setLayout(new GridLayout(4, 4, 3, 3));
        buttons = new JButton[16];

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "C":
                tField.setText("");
                num1 = 0;
                num2 = 0;
                op = "";
                break;
            case "/":
            case "*":
            case "-":
            case "+":
                handleOperator(actionCommand);
                break;
            case "=":
                handleEquals();
                break;
            default:
                handleDigit(actionCommand);
        }
    }

    private void handleOperator(String operator) {
        if (op.equals("=")) {
            tField.setText("");
            op = "";
        }
        num1 = Double.parseDouble(tField.getText());
        op = operator;
        tField.setText("");
    }

    private void handleDigit(String digit) {
        if (op.equals("=")) {
            tField.setText("");
            op = "";
        }
        tField.setText(tField.getText() + digit);
    }

    private void handleEquals() {
        num2 = Double.parseDouble(tField.getText());
        tField.setText(calc());
        op = "=";
    }

    private String calc() {
        double result;
        System.out.println(num1 + op + num2);
        switch (op) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            default:
                result = 0;
        }
        return Double.toString(result);
    }

    public static void main(String args[]) {
        Calculator s = new Calculator();
    }
}