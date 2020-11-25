package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleForm extends JFrame {
    private JPanel rootPane;
    private JButton btnMsg;
    private JTextArea txtMsg;

    public SampleForm() {
       try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                   add(rootPane);

                   setTitle("Sample Form");
                   btnMsg.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           JOptionPane.showMessageDialog(rootPane,
                                   "Hello World",
                                   "Sample Form Message",
                                   JOptionPane.PLAIN_MESSAGE);
                       }
                   });
               }
           });
       } catch(Exception ex) {
           System.out.println(ex.getMessage());
       }
    }
}
