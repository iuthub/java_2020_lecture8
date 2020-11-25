package gui;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame
{
    private final JList<String> colorJList; // list to display colors
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW};

    // ListFrame constructor add JScrollPane containing JList to JFrame
    public ListFrame()
    {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // list of colorNames
        colorJList.setVisibleRowCount(5); // display five rows at once

        // do not allow multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane containing JList to frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                new ListSelectionListener() // anonymous inner class
                {
                    // handle list selection events
                    @Override
                    public void valueChanged(ListSelectionEvent event)
                    {
                        getContentPane().setBackground(
                                colors[colorJList.getSelectedIndex()]);
                    }
                }
        );
    }
} // end class ListFrame