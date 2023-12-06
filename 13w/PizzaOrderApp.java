import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrderApp extends JFrame {

    private JLabel priceLabel;

    public PizzaOrderApp() {
        setTitle("자바 피자 주문");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // WelcomePanel
        JPanel welcomePanel = new JPanel();
        welcomePanel.add(new JLabel("자바 피자에 오신 것을 환영합니다."));

        // TypePanel
        JPanel typePanel = new JPanel(new GridLayout(3, 1));
        typePanel.setBorder(BorderFactory.createTitledBorder("피자 타입"));

        JRadioButton comboButton = new JRadioButton("콤보");
        JRadioButton potatoButton = new JRadioButton("포테이토");
        JRadioButton bulgogiButton = new JRadioButton("불고기");

        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(comboButton);
        typeGroup.add(potatoButton);
        typeGroup.add(bulgogiButton);

        typePanel.add(comboButton);
        typePanel.add(potatoButton);
        typePanel.add(bulgogiButton);

        // ToppingPanel
        JPanel toppingPanel = new JPanel(new GridLayout(4, 1));
        toppingPanel.setBorder(BorderFactory.createTitledBorder("추가 토핑"));

        JCheckBox pepperButton = new JCheckBox("피망");
        JCheckBox cheeseButton = new JCheckBox("치즈");
        JCheckBox pepperoniButton = new JCheckBox("페퍼로니");
        JCheckBox baconButton = new JCheckBox("베이컨");

        toppingPanel.add(pepperButton);
        toppingPanel.add(cheeseButton);
        toppingPanel.add(pepperoniButton);
        toppingPanel.add(baconButton);

        // SizePanel
        JPanel sizePanel = new JPanel(new GridLayout(3, 1));
        sizePanel.setBorder(BorderFactory.createTitledBorder("크기"));

        JRadioButton smallButton = new JRadioButton("Small");
        JRadioButton mediumButton = new JRadioButton("Medium");
        JRadioButton largeButton = new JRadioButton("Large");

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);

        sizePanel.add(smallButton);
        sizePanel.add(mediumButton);
        sizePanel.add(largeButton);

        // Order Button
        JButton orderButton = new JButton("주문");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int price = calculatePrice(comboButton.isSelected(), potatoButton.isSelected(), bulgogiButton.isSelected(),
                        pepperButton.isSelected(), cheeseButton.isSelected(), pepperoniButton.isSelected(), baconButton.isSelected(),
                        smallButton.isSelected(), mediumButton.isSelected(), largeButton.isSelected());
                priceLabel.setText("가격: " + price + "원");
            }
        });

        // Cancel Button
        JButton cancelButton = new JButton("취소");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearSelections();
            }
        });

        // Price Label
        priceLabel = new JLabel("가격: 0원");

        // Layout
        setLayout(new BorderLayout());
        add(welcomePanel, BorderLayout.NORTH);
        add(typePanel, BorderLayout.WEST);
        add(toppingPanel, BorderLayout.CENTER);
        add(sizePanel, BorderLayout.EAST);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(cancelButton);
        buttonPanel.add(orderButton);
        add(buttonPanel, BorderLayout.SOUTH);
        add(priceLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private int calculatePrice(boolean combo, boolean potato, boolean bulgogi,
                               boolean pepper, boolean cheese, boolean pepperoni, boolean bacon,
                               boolean small, boolean medium, boolean large) {
        int basePrice = 10000; // 기본 피자 가격

        if (combo || potato || bulgogi) {
            basePrice += 10000; // 피자 타입에 따른 추가 가격
        }

        int toppingPrice = 0;
        if (pepper) toppingPrice += 5000;
        if (cheese) toppingPrice += 5000;
        if (pepperoni) toppingPrice += 5000;
        if (bacon) toppingPrice += 5000;

        int sizePrice = 0;
        if (medium) sizePrice += 2000;
        else if (large) sizePrice += 4000;

        return basePrice + toppingPrice + sizePrice;
    }

    private void clearSelections() {
        priceLabel.setText("가격: 0원");

        // Clear selections for radio buttons and checkboxes
        Container contentPane = getContentPane();
        for (Component component : contentPane.getComponents()) {
            if (component instanceof JPanel) {
                clearComponent((JPanel) component);
            }
        }
    }

    private void clearComponent(JPanel panel) {
        for (Component component : panel.getComponents()) {
            if (component instanceof JRadioButton) {
                ((JRadioButton) component).setSelected(false);
            } else if (component instanceof JCheckBox) {
                ((JCheckBox) component).setSelected(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PizzaOrderApp();
            }
        });
    }
}
