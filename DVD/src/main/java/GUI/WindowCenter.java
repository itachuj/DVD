package GUI;

import javax.swing.*;
import java.awt.*;

public class WindowCenter {
    public static void centreWindow(JFrame frame){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)((dimension.getWidth() - frame.getWidth())/2);
        int height = (int)((dimension.getHeight() - frame.getHeight())/2);
        frame.setLocation(width, height);
    }
}
