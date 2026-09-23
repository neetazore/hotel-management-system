package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class Dashboard extends JFrame implements ActionListener {
    JButton add, rec, rec1, logout, back;

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        JLabel mainTitle = new JLabel("HOTEL MANAGEMENT SYSTEM");
        mainTitle.setBounds(400, 70, 1900, 50);
        mainTitle.setFont(new Font("Poppins", Font.BOLD, 36));
        add(mainTitle);

        rec1 = new JButton("RESTAURANT");
        rec1.setBounds(100, 350, 250, 250);
        add(rec1);
        rec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Restaurant();
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        rec = new JButton("RECEPTION");
        rec.setBounds(520, 350, 250, 250);
        add(rec);
        rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception();
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        add = new JButton("ADMIN");
        add.setBounds(900, 350, 250, 250);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new admin();
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        back = new JButton("Back");
        back.setBounds(1150,40, 120, 40);
        back.setBackground(new Color(40, 45, 50));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);

        logout = new JButton("Logout");
        logout.setBounds(1150, 110, 120, 40);
        logout.setBackground(new Color(40, 45, 50));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.BOLD, 14));
        logout.setFocusPainted(false);
        logout.addActionListener(this);
        add(logout);


        try {
            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/hotels1.png"));
            Image i1 = imageIcon.getImage().getScaledInstance(1900, 1030, Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(i1);
            JLabel jLabel = new JLabel(imageIcon1);
            jLabel.setBounds(0, 0, 1900, 1030);
            add(jLabel);
        } catch (Exception e) {
            System.out.println("Background image not found!");
            getContentPane().setBackground(new Color(20, 25, 35));
        }

        setSize(1900, 100);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(900,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rec) {
            new Reception();
            setVisible(false);
        } else if (e.getSource() == logout) {
            System.exit(0);
        } else if (e.getSource() == back) {
            new Login();
            setVisible(false);
        } else if (e.getSource() == rec1) {
            new Restaurant();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
