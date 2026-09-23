package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_Employee, add_Room, add_Drivers, logout, back;


    admin(){
        super("HOTEL MANAGMENT SYSTEM");

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(410,100,200,30);
        add_Employee.setBackground(Color.white);
        add_Employee.setForeground(Color.black);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(410,280,200,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.black);
        add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers = new JButton("ADD DRIVERS");
        add_Drivers.setBounds(410,430,200,30);
        add_Drivers.setBackground(Color.WHITE);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        logout = new JButton("Logout");
        logout.setBounds(10,580,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("Back");
        back.setBounds(130,580,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employeelogo.png"));
        Image l11 = l1.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(140,5,180,180);
        add(label);

        ImageIcon l2 = new ImageIcon(ClassLoader.getSystemResource("icon/driverlogo.png"));
        Image l22 = l2.getImage().getScaledInstance(160,160,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(l22);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(140,190,160,160);
        add(label1);

        ImageIcon l3 = new ImageIcon(ClassLoader.getSystemResource("icon/roomlogo.png"));
        Image l33 = l3.getImage().getScaledInstance(160,160,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(l33);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(140,380,160,160);
        add(label3);


        try {
            ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver@.png"));
            Image image1 = imageIcon2.getImage().getScaledInstance(210,210,Image.SCALE_DEFAULT);
            ImageIcon imageIcon12 = new ImageIcon(image1);
            JLabel label2 = new JLabel(imageIcon12);
            label2.setBounds(40,360,210,210);
            add(label2);
        } catch (Exception e) {
            System.out.println("Driver image not found!");
        }

        setUndecorated(true);
        getContentPane().setBackground(new Color(3, 45, 48, 235));
        setLayout(null);
        setSize(860,640);
        setLocation(100,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==add_Employee){
            new AddEmployee();

        }else if (e.getSource()==add_Room) {
            new AddRoom();

        }else if (e.getSource()==add_Drivers) {
            new addDriver();

        }else if (e.getSource()==logout) {
            System.exit(102);

        }else if (e.getSource()==back){
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new admin();
    }
}

