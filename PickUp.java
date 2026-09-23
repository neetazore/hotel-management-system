package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame {
    PickUp(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90,11,160,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(pus);

        JLabel TOC = new JLabel("Type of Car");
        TOC.setBounds(32,97,89,17);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try {
            conn C = new conn();
            ResultSet resultSet = C.s.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(5,230,790,250);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try {
            conn C = new conn();
            String q = "select * from driver";
            ResultSet resultSet = C.s.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(25,190,150,20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(150,190,150,20);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(250,190,150,20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel company = new JLabel("CompanyN");
        company.setBounds(350,190,150,20);
        company.setForeground(Color.WHITE);
        company.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(company);

        JLabel carname = new JLabel("CarName");
        carname.setBounds(470,190,150,20);
        carname.setForeground(Color.WHITE);
        carname.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(carname);

        JLabel available = new JLabel("Available");
        available.setBounds(580,190,150,20);
        available.setForeground(Color.WHITE);
        company.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        JLabel location = new JLabel("Location");
        location.setBounds(690,190,150,20);
        location.setForeground(Color.WHITE);
        location.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(location);

        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
                try {

                    conn c = new conn();
                    ResultSet resultSet = c.s.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton back = new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(800,600);
        setLocation(300,50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PickUp();
    }
}
