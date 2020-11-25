package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame
{
    private final JButton[] buttons; // array of buttons to hide portions
    private static final String[] names = {"Hide North", "Hide South",
            "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    class ClickHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            // check event source and lay out content pane correspondingly
            for (JButton button : buttons)
            {
                if (event.getSource() == button)
                    button.setVisible(false); // hide the button that was clicked
                else
                    button.setVisible(true); // show other buttons
            }
//        ((JButton)event.getSource()).setVisible(false);
            layout.layoutContainer(getContentPane()); // lay out content pane
        }
    }

    // set up GUI and event handling
    public BorderLayoutFrame()
    {
        super("BorderLayout Demo");



        layout = new BorderLayout(5, 5); // 5 pixel gaps
        setLayout(layout);
        buttons = new JButton[names.length];

        // create JButtons and register listeners for them
        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(new ClickHandler());
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    } // end BorderLayoutFrame constructor

    // handle button events

} // end class BorderLayoutFrame