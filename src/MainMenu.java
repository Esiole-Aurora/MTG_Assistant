import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu {
    private JFrame mainFrame;
    private JLabel titleLabel;
    private JPanel mainPanel;

    public MainMenu() {
        setupGUI(200, 200);
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
    }

    private void setupGUI(int width, int height) {
        mainFrame = new JFrame("MTG Assist");
        mainFrame.setSize(width, height);
        mainFrame.setLocation(10, 10);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        setupButtons();
    }

    private void setupButtons() {
        JButton selectColourFixer = new JButton("Colour Fixing");

        selectColourFixer.setActionCommand("ColourFixer");
        selectColourFixer.addActionListener(new ButtonClickListener());

        mainPanel.add(selectColourFixer);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("ColourFixer")) {
                ColourFixer colourFixer = new ColourFixer();
                mainFrame.setVisible(false);
            }
        }
    }
}