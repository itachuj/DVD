package MySQL;

import API.MySQL;
import GUI.LoggedWindow.LoggedWindow;
import GUI.RegisterDialog;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.mysql.cj.protocol.Resultset;



public class Inout extends RegisterDialog implements MySQL {

    private String name;
    private String surname;
    private String nickname;
    private String email;
    private String phone;
    private String Password;

    public void setName(String test1) {
        this.name = test1;
    }

    public void setSurname(String test2) {
        this.surname = test2;
    }

    public void setNickname(String test3) {
        this.nickname = test3;
    }

    public void setEmail(String test4) {
        this.email = test4;
    }

    public void setPhone(String test5) {
        this.phone = test5;
    }

    public void setPassword(String test6) { this.Password = test6; }

    PreparedStatement preparedStmt;
    ResultSet rs;

    @Override
    public void loginQuerry() {
        try {
            //Connection to data base
            // MySQL INSERT statement
            String query = "SELECT * FROM `users` WHERE `nickname` =? AND `user_password` =?";
            preparedStmt = MyConnection.getConnection().prepareStatement(query);

            preparedStmt.setString(1, nickname);
            preparedStmt.setString(2, Password);

            rs =  preparedStmt.executeQuery();

            /// problem with token
            if(rs.next()){
                System.out.println("Chuj");
                LoggedWindow lw = new LoggedWindow(); //null
                lw.setVisible(true);
                /*
                Frame parent = new Frame();
                parent.setVisible(true);
                parent.pack();
                parent.setLocationRelativeTo(null);
                parent.setExtendedState(JFrame.MAXIMIZED_BOTH);
                //Transfer this to another Class and create instance here

                 */
            }

        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e);
            e.printStackTrace();
        }
        
    }


    @Override
    public void register() {
        try {
            // MySQL INSERT statement
            String query = "insert into users (first_name, second_name, nickname, user_password, email, phone, is_admin, borrowed_movies)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)";
            // create the mysql insert preparedstatement
            preparedStmt = MyConnection.getConnection().prepareStatement(query);


            preparedStmt.setString(1, nickname);
            preparedStmt.setString(2, Password);
            preparedStmt.setString(3, name);
            preparedStmt.setString(4, surname);
            preparedStmt.setString(5, email);
            preparedStmt.setString(6, phone);
            preparedStmt.setBoolean(7,false);
            preparedStmt.setInt(8, 0);

            //execute the preparedstatement
            preparedStmt.execute();

            MyConnection.getConnection().close();
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}

