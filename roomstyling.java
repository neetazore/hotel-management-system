package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class roomstyling extends JFrame implements ActionListener {

    JButton room1,room2,room3,room4,b7;
    String selectedRoom = "";

    roomstyling(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 880, 580);
        panel.setBackground(new Color(215, 226, 227));
        panel.setLayout(null);
        add(panel);

        room1 = new JButton("Room 1 ");
        room1.setBounds(150,210,110,33);
        room1.setBackground(Color.BLACK);
        room1.setForeground(Color.WHITE);
        room1.addActionListener(this);
        panel.add(room1);

        room2 = new JButton("Room 2 ");
        room2.setBounds(600,210,110,33);
        room2.setBackground(Color.BLACK);
        room2.setForeground(Color.WHITE);
        room2.addActionListener(this);
        panel.add(room2);

        room3 = new JButton("Room 3 ");
        room3.setBounds(150,480,110,33);
        room3.setBackground(Color.BLACK);
        room3.setForeground(Color.WHITE);
        room3.addActionListener(this);
        panel.add(room3);

        room4 = new JButton("Room 4 ");
        room4.setBounds(600,480,110,33);
        room4.setBackground(Color.BLACK);
        room4.setForeground(Color.WHITE);
        room4.addActionListener(this);
        panel.add(room4);


        JButton b1 = new JButton("Back");
        b1.setBounds(300,540,100,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });

        b7 = new JButton(" Add ");
        b7.setBounds(460,540,100,33);
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        panel.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        Date date = new Date();

        JLabel labeldate = new JLabel(""+date);
        labeldate.setBounds(15,550,200,20);
        labeldate.setFont(new Font("Tahoma",Font.BOLD,12));
        labeldate.setForeground(Color.BLACK);
        panel.add(labeldate);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/room1.jpg"));
        Image i1 = imageIcon.getImage().getScaledInstance(350,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel jLabel = new JLabel(imageIcon1);
        jLabel.setBounds(25,5,350,200);
        panel.add(jLabel);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/Room2.jpg"));
        Image image1 = imageIcon2.getImage().getScaledInstance(350,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel jLabel1 = new JLabel(imageIcon12);
        jLabel1.setBounds(480,5,350,200);
        panel.add(jLabel1);

        ImageIcon imageIcon21 = new ImageIcon(ClassLoader.getSystemResource("icon/room1.jpg"));
        Image i2 = imageIcon21.getImage().getScaledInstance(350,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(i2);
        JLabel jLabel22 = new JLabel(imageIcon4);
        jLabel22.setBounds(25,270,350,200);
        panel.add(jLabel22);

        ImageIcon imageIcon222 = new ImageIcon(ClassLoader.getSystemResource("icon/images.jpg"));
        Image i3 = imageIcon222.getImage().getScaledInstance(350,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(i3);
        JLabel jLabel12 = new JLabel(imageIcon3);
        jLabel12.setBounds(480,270,350,200);
        panel.add(jLabel12);

        setUndecorated(true);
        setLayout(null);
        setLocation(200,70);
        setSize(870,590);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == room1) { selectedRoom = "room1"; return; }
        if (e.getSource() == room2) { selectedRoom = "room2"; return; }
        if (e.getSource() == room3) { selectedRoom = "room3"; return; }
        if (e.getSource() == room4) { selectedRoom = "room4"; return; }

        if (e.getSource() == b7) {
            if (selectedRoom.equals("")) {
                JOptionPane.showMessageDialog(null, "select a room");
                return;
            }
            try {
                conn c = new conn();

                ResultSet rs = c.s.executeQuery("select count(*) as cnt from roomstyling");
                int count = 0;
                if (rs.next()) count = rs.getInt("cnt");

                if (count == 0) {

                    String q = "insert into roomstyling (" + selectedRoom + ") values (?)";
                    java.sql.PreparedStatement ps = c.c.prepareStatement(q);
                    ps.setString(1, "Added");
                    ps.executeUpdate();
                } else {

                    String q = "update roomstyling set " + selectedRoom + " = ?";
                    java.sql.PreparedStatement ps = c.c.prepareStatement(q);
                    ps.setString(1, "Added");
                    ps.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "Room Added Successfully");

            } catch (Exception E) {
                E.printStackTrace();
            }
        }
    }

        public static void main(String[] args) {
        new roomstyling();
    }
}
