package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/spalsh1.gif"));
        JLabel label = new JLabel(i1);
        label.setBounds(0, 0, 480, 480);
        add(label);

        setUndecorated(true);
        setLayout(null);
        setLocation(350, 80);
        setSize(400, 480);
        setVisible(true);

        try {
            Thread.sleep(5000);
             new Login();

            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }
}


