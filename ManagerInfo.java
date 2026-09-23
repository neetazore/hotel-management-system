package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ManagerInfo extends JFrame {
    ManagerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,450);
        panel.setBackground(new Color(3, 45, 50, 235));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(2,40,890,350);
        table.setBackground(new Color(3, 45, 50, 235));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            conn c = new conn();
            String q = "select * from Employee where job = 'Manager'";
            ResultSet resultSet = c.s.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel name = new JLabel("Name");
        name.setBounds(48,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

        JLabel Age = new JLabel("Age");
        Age.setBounds(170,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(260,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(380,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(480,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(600,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(710,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gmail);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(810,11,70,19);
        aadhar.setForeground(Color.WHITE);
        aadhar.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(aadhar);


        JButton back = new JButton("BACK");
        back.setBounds(350,410,120,30);
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
        setLocation(210,50);
        setSize(885,460);
        setVisible(true);

    }


    public static void main(String[] args) {

        new ManagerInfo();
    }
}
