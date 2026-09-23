package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {

    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,880,520);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,50,900,380);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try {

            conn c = new conn();
            String q = "select * from Customer";
            ResultSet resultSet = c.s.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }


        JButton back = new JButton("Back");
        back.setBounds(350,450,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });

        JLabel id = new JLabel("ID");
        id.setBounds(31,15,100,14);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(150,15,100,14);
        number.setForeground(Color.WHITE);
        number.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(260,15,46,14);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360,15,100,14);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480,15,100,14);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(580,15,100,14);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);

        JLabel time = new JLabel("CI Time");
        time.setBounds(700,15,100,14);
        time.setForeground(Color.WHITE);
        time.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(time);

        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(820,15,100,14);
        deposit.setForeground(Color.WHITE);
        deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(deposit);


        setUndecorated(true);
        setLayout(null);
        setSize(890,530);
        setLocation(300,70);
        setVisible(true);

    }

    public static void main(String[] args) {

        new CustomerInfo();
    }
}
