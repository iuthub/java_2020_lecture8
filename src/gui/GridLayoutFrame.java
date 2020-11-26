package gui;

// Fig. 12.43: GridLayoutFrame.java
// GridLayout containing six buttons.
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GridLayoutFrame extends JFrame
{


    private final GridLayout gridLayout2; // second gridlayout
    private final FlowLayout flowLayout;

    private final JTextField firstnameTextfield;
    private final JTextField lastnameTextfield;
    private final JTextField midnameTextfield;

    private final JLabel firstnameLabel;
    private final JLabel lastnameLabel;
    private final JLabel midnameLabel;

    private final JButton saveButton;
    private final JButton cancelButton;

    private final JPanel mainPanel;
    private final JPanel buttonsPanel;

    // no-argument constructor
    public GridLayoutFrame()
    {
        super("GridLayout Demo");
        setLayout(new BorderLayout(5,5));

        gridLayout2 = new GridLayout(3, 2); // 3 by 2; no gaps
        flowLayout= new FlowLayout();


        flowLayout.setAlignment(FlowLayout.LEFT);

        mainPanel = new JPanel();
        mainPanel.setLayout(gridLayout2);

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(flowLayout);

        firstnameLabel = new JLabel("First Name:");
        firstnameTextfield = new JTextField("", 20);

        mainPanel.add(firstnameLabel);
        mainPanel.add(firstnameTextfield);

        lastnameLabel = new JLabel("Last Name:");
        lastnameTextfield = new JTextField("", 20);
        mainPanel.add(lastnameLabel);
        mainPanel.add(lastnameTextfield);

        midnameLabel = new JLabel("Mid Name:");
        midnameTextfield = new JTextField("", 20);
        mainPanel.add(midnameLabel);
        mainPanel.add(midnameTextfield);

        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");
        buttonsPanel.add(saveButton);
        buttonsPanel.add(cancelButton);

        add(mainPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

} // end class GridLayoutFrame

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
