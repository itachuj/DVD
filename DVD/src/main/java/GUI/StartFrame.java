package GUI;


import javax.swing.*;


public class StartFrame extends JFrame {
    public StartFrame() {
        super("Itachuj's DVD rental");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
