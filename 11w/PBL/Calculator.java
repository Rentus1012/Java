import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String inputValue = "";
    private double tempValue = 0;
    private char operator = ' ';

    public Calculator() {
        // 윈도우 설정
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 텍스트 필드 설정
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // 버튼 패널 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // 프레임 설정
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "C":
                clear();
                break;
            case "=":
                calculate();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                setOperator(actionCommand.charAt(0));
                break;
            default:
                appendDigit(actionCommand);
        }
    }

    private void clear() {
        inputValue = "";
        tempValue = 0;
        operator = ' ';
        textField.setText("");
    }

    private void calculate() {
        if (!inputValue.isEmpty() && operator != ' ') {
            double currentInput = Double.parseDouble(inputValue);
            switch (operator) {
                case '+':
                    tempValue += currentInput;
                    break;
                case '-':
                    tempValue -= currentInput;
                    break;
                case '*':
                    tempValue *= currentInput;
                    break;
                case '/':
                    if (currentInput != 0) {
                        tempValue /= currentInput;
                    } else {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                        clear();
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(tempValue));
            inputValue = "";
            operator = ' ';
        }
    }

    private void setOperator(char op) {
        calculate();
        operator = op;
        if (!inputValue.isEmpty()) {
            tempValue = Double.parseDouble(inputValue);
            inputValue = "";
        }
    }

    private void appendDigit(String digit) {
        inputValue += digit;
        textField.setText(inputValue);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}