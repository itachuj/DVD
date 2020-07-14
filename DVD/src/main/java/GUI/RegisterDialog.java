package GUI;

import MySQL.Inout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterDialog extends JDialog{

    private JTextField tfName;
    private JTextField tfSurname;
    private JTextField tfNickname;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JPasswordField pfPassword;


    private JLabel lbName;
    private JLabel lbSurname;
    private JLabel lbNickname;
    private JLabel lbEmail;
    private JLabel lbPhone;
    private JLabel lbPassword;

    private JButton btnRegister;
    private JButton btnCancel;

    public RegisterDialog() {
    super();
    }

    public RegisterDialog(Frame parent){
        super(parent, "register",true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        lbName = new JLabel("Name: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbName, cs);

        tfName = new JTextField(25);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfName, cs);

        //
        lbSurname = new JLabel("Surname: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbSurname, cs);

        tfSurname = new JTextField(25);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(tfSurname, cs);

        //

        lbNickname = new JLabel("Nickname: ");
        cs.gridx = 0;
        cs.gridy = 2;
        cs.gridwidth = 1;
        panel.add(lbNickname, cs);

        tfNickname = new JTextField(25);
        cs.gridx = 1;
        cs.gridy = 2;
        cs.gridwidth = 2;
        panel.add(tfNickname, cs);

        //

        lbEmail = new JLabel("Email: ");
        cs.gridx = 0;
        cs.gridy = 3;
        cs.gridwidth = 1;
        panel.add(lbEmail, cs);

        tfEmail = new JTextField(30);
        cs.gridx = 1;
        cs.gridy = 3;
        cs.gridwidth = 2;
        panel.add(tfEmail, cs);

        //

        lbPhone = new JLabel("Phone: ");
        cs.gridx = 0;
        cs.gridy = 4;
        cs.gridwidth = 1;
        panel.add(lbPhone, cs);

        tfPhone = new JTextField(15);
        cs.gridx = 1;
        cs.gridy = 4;
        cs.gridwidth = 2;
        panel.add(tfPhone, cs);

        //

        lbPassword = new JLabel("Password: ");
        cs.gridx = 0;
        cs.gridy = 5;
        cs.gridwidth = 1;
        panel.add(lbPassword, cs);

        pfPassword = new JPasswordField(25);
        cs.gridx = 1;
        cs.gridy = 5;
        cs.gridwidth = 2;
        panel.add(pfPassword, cs);

        //Adding listeners to buttons

        btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Inout inout = new Inout();

                inout.setName(tfName.getText());
                inout.setSurname(tfSurname.getText());
                inout.setNickname(tfNickname.getText());
                inout.setEmail(tfEmail.getText());
                inout.setPhone(tfPhone.getText());
                inout.setPassword(String.valueOf(pfPassword.getPassword()));
                inout.register();
                dispose();
            }
        });

        btnCancel = new JButton("Cancer");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel bp = new JPanel();
        bp.add(btnRegister);
        bp.add(btnCancel);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }


    /*
    class goBack implements  ActionListener{
        private RegisterDialog registerDialog;
        public goBack(RegisterDialog registerDialog){
            this.registerDialog = registerDialog;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            registerDialog.dispose();
        }
    }

     */



    public String getNameInput(){
               return  tfName.getText();
    }

    public String getSurnameInput(){
        return tfSurname.getText();
    }

    public String getNicknameInput(){
        return  tfNickname.getText();
    }

    public String getEmailInput(){
        return tfEmail.getText();
    }

    public String getPhoneInput(){
        return  tfPhone.getText();
    }

    public String getPasswordInput(){
        return new String(pfPassword.getPassword());
    }
}
