package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton loginButton;
    private JButton registerButton;

    public ButtonPanel(){
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

        setLayout(new GridLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(loginButton);
        add(registerButton);
    }


    static final JFrame frame = new JFrame("Register");

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == loginButton){
            LoginDialog  loginDialog = new LoginDialog(frame);
            loginDialog.setVisible(true);

        }

        else if(source == registerButton){
            RegisterDialog registerDialog = new RegisterDialog(frame);
            registerDialog.setVisible(true);

        }

    }
}
