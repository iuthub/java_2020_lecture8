package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton helloButton;
    private JLabel greetingLabel;



    private class HelloButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            greetingLabel.setText("Hello, " + textField1.getText());
        }
    }

    public InputForm() {
        add(mainPanel);


        HelloButtonHandler handler = new HelloButtonHandler();
        helloButton.addActionListener(handler);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
