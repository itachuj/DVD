import GUI.StartFrame;
import MySQL.Inout;

import java.awt.*;

public class Main {

    public static void main(String[] args){


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartFrame();
            }

        });


        /*
        Inout inout = new Inout();
        inout.saveData();


         USERS
         DATA BASE users/admins
         register and login

         OPERATIONS ON DVD OBJECTS
         DATA BASE movies
         Check if movie is in stock
         borrow a movie(max 3 at once)
         return a movie

         CALCULATING CHARGE
         punishments for delays
         movie price depends on year of production
         */

    }
}