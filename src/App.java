import gui.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {

//        String firstName = JOptionPane.showInputDialog("Enter your first name?");
//        String lastName  = JOptionPane.showInputDialog("Enter your last name");
//
//        JOptionPane.showMessageDialog(null,
//                "Hello, " + firstName + " " + lastName,
//                "Hello, World",
//                JOptionPane.INFORMATION_MESSAGE);


//JFrame mainWindow = new BorderLayoutFrame();
//mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//mainWindow.setSize(260, 180);
//mainWindow.setVisible(true);

//JFrame mainWindow = new InputForm();
//mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//mainWindow.setSize(260, 180);
//mainWindow.setVisible(true);

// OR this way

//        JFrame mainWindow = new JFrame("Main App");
//        mainWindow.setContentPane(new InputForm().getMainPanel());
//        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainWindow.setSize(300,200);
//        mainWindow.pack();
//        mainWindow.setVisible(true);

//        JFrame mainWindow = new MenuFrame();
//        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainWindow.setSize(180, 180);
//        mainWindow.setVisible(true);

        JFrame mainWindow = new DesktopFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setSize(600, 400);
        mainWindow.setVisible(true);
//



    }

}
