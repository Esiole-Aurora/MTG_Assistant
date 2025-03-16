import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class ColourFixer {
    JFrame colourFixerFrame;
    JPanel colourFixerPanel;
    private void setupGUI(int width, int height) {
        colourFixerFrame = new JFrame("Colour Fixing Assist");
        colourFixerFrame.setSize(width, height);
        colourFixerFrame.setLocation(10, 10);
        colourFixerFrame.setLayout(new GridLayout(3, 1));

        colourFixerFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        colourFixerPanel = new JPanel();
        colourFixerPanel.setLayout(new FlowLayout());

        colourFixerFrame.add(colourFixerPanel);
        colourFixerFrame.setVisible(true);
    }

    public ColourFixer() {
        setupGUI(800, 600);
        String[] colourPie = {"W", "U", "B", "R", "G"};
        for (int i = 0; i < colourPie.length; i++) {

            JTextField colourField = new JTextField();
        }
    }
}
