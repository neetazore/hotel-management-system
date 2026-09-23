package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Room extends JFrame{


    JTable table;


    Room() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 755, 400);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        //ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        //Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        // ImageIcon imageIcon1 = new ImageIcon(image);
        //JLabel label = new JLabel(imageIcon1);
        //label.setBounds(600, 200, 200, 200);
        //  panel.add(label);

        table = new JTable();
        table.setBounds(40, 50, 700, 300);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            conn c = new conn();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.s.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }



        JLabel room = new JLabel("Room No.");
        room.setBounds(50,15,80,19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);


        JLabel availability = new JLabel("Availability");
        availability.setBounds(170,15,80,19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availability);

        JLabel RoomType = new JLabel("Roomtype");
        RoomType.setBounds(300,15,80,19);
        RoomType.setForeground(Color.WHITE);
        RoomType.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(RoomType);

        JLabel Clean = new JLabel("Clean Status");
        Clean.setBounds(400,15,150,19);
        Clean.setForeground(Color.WHITE);
        Clean.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Clean);

        JLabel Price = new JLabel("Price");
        Price.setBounds(540,15,80,19);
        Price.setForeground(Color.WHITE);
        Price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Price);

        JLabel Bed = new JLabel("Bed Type");
        Bed.setBounds(640,15,80,19);
        Bed.setForeground(Color.WHITE);
        Bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Bed);

        JButton b1 = new JButton("Back");
        b1.setBounds(300,350,89,23);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });

        setUndecorated(true);
        setLayout(null);
        setLocation(200, 70);
        setSize(765, 410);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Room();
    }
}
