package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {

    CheckOut(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,700,390);
        panel.setBackground(new Color(115, 128, 128));
        panel.setLayout(null);
        add(panel);


        JLabel label = new JLabel("Check-out");
        label.setBounds(100,20,150,30);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel userId = new JLabel("Customer Id");
        userId.setBounds(30,80,150,30);
        userId.setFont(new Font("Tahoma",Font.BOLD,14));
        userId.setForeground(Color.WHITE);
        panel.add(userId);

        Choice Customer = new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);

        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30,130,150,20);
        roomNum.setFont(new Font("Tahoma",Font.BOLD,14));
        roomNum.setForeground(Color.WHITE);
        panel.add(roomNum);

        JLabel labelRoomNumber = new JLabel();
        labelRoomNumber.setBounds(200,130,100,30);
        labelRoomNumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelRoomNumber.setForeground(Color.WHITE);
        panel.add(labelRoomNumber);

        JLabel chekintime = new JLabel("Check-In Time");
        chekintime.setBounds(30,180,150,20);
        chekintime.setFont(new Font("Tahoma",Font.BOLD,14));
        chekintime.setForeground(Color.WHITE);
        panel.add(chekintime);

        JLabel labelchekintime = new JLabel();
        labelchekintime.setBounds(200,180,100,30);
        labelchekintime.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelchekintime.setForeground(Color.WHITE);
        panel.add(labelchekintime);

        JLabel chekouttime = new JLabel("Check-out-time");
        chekouttime.setBounds(30,230,150,20);
        chekouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        chekouttime.setForeground(Color.WHITE);
        panel.add(chekouttime);

        Date date = new Date();

        JLabel labelchekouttime = new JLabel(""+date);
        labelchekouttime.setBounds(200,230,200,30);
        labelchekouttime.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelchekouttime.setForeground(Color.WHITE);
        panel.add(labelchekouttime);

        try {
            conn c = new conn();
            ResultSet resultSet = c.s.executeQuery("select * from customer");
            while (resultSet.next()){
                Customer.add(resultSet.getString("number"));

            }


        }catch (Exception E){
            E.printStackTrace();
        }

        JButton checkout = new JButton("Check-Out");
        checkout.setBounds(30,300,120,30);
        checkout.setForeground(Color.WHITE);
        checkout.setBackground(Color.BLACK);
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conn cv = new conn();
                    cv.s.executeUpdate("delete from customer where number = '"+Customer.getSelectedItem()+"'");
                    cv.s.executeUpdate("update room set availability = 'Available' where roomnumber = '"+labelRoomNumber.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try {
                    ResultSet resultSet = c.s.executeQuery("select * from customer where number = '"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelRoomNumber.setText(resultSet.getString("room"));
                        labelchekintime.setText(resultSet.getString("chekintime"));

                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(710,400);
        setLocation(200,100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CheckOut();
    }
}
