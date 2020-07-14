package GUI;

import MySQL.Inout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDialog extends JDialog {
    private JTextField tfNickname;
    private JPasswordField pfPassword;

    private JLabel lbNickname;
    private JLabel lbPassword;

    private  JButton btnLogin;
    private  JButton btnCancel;

    public LoginDialog(){super();}

    public LoginDialog(Frame parent){
        super(parent, "login", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;


        lbNickname = new JLabel("Nickname: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        panel.add(lbNickname, constraints);

        tfNickname = new JTextField(25);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(tfNickname, constraints);

        lbPassword = new JLabel("Password: ");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        panel.add(lbPassword, constraints);

        pfPassword = new JPasswordField(25);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(pfPassword, constraints);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inout inout = new Inout();

                inout.setNickname(tfNickname.getText());
                inout.setPassword(String.valueOf(pfPassword.getPassword()));
                inout.loginQuerry();
                dispose();
            }
        });

        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel btnPanel = new JPanel();
        btnPanel.add(btnLogin);
        btnPanel.add(btnCancel);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(btnPanel, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }
}
