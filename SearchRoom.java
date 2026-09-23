package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SearchRoom extends JFrame implements ActionListener {

    JCheckBox checkBox;

    Choice choice;

    JTable table;

    JButton add, back;

    SearchRoom(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,710,540);
        panel.setLayout(null);
        add(panel);

        JLabel searchFotRoom = new JLabel("Search For Room");
        searchFotRoom.setBounds(270,11,186,31);
        searchFotRoom.setForeground(Color.WHITE);
        searchFotRoom.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(searchFotRoom);

        JLabel rbt = new JLabel("Room Bed Type");
        rbt.setBounds(30,70,120,20);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);

        JLabel rn = new JLabel("Room Number");
        rn.setBounds(10,162,150,20);
        rn.setForeground(Color.WHITE);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rn);

        JLabel available = new JLabel("Availability");
        available.setBounds(140,162,150,20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        JLabel roomtype = new JLabel("Room Type");
        roomtype.setBounds(260,162,150,20);
        roomtype.setForeground(Color.WHITE);
        roomtype.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(roomtype);

        JLabel ss = new JLabel("Clean Status");
        ss.setBounds(370,162,150,20);
        ss.setForeground(Color.WHITE);
        ss.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(ss);

        JLabel price = new JLabel("Price");
        price.setBounds(510,162,150,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel BT = new JLabel("Bed Type");
        BT.setBounds(610,162,150,20);
        BT.setForeground(Color.WHITE);
        BT.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(BT);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,208,26);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(153,70,120,20);
        panel.add(choice);

        table = new JTable();
        table.setBounds(5,187,700,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {

            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet =c.s.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception e){
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200,400,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(80,70);
        setSize(720,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== add){
            String Q = "select * from room where bed_type = '"+choice.getSelectedItem()+"'";
            String Q1 = "select * from room where availability = 'Available' bed_type ='"+choice.getSelectedItem()+"'";

            try {
                conn c = new conn();
                ResultSet resultSet = c.s.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if (checkBox.isSelected()){
                    ResultSet resultSet1 = c.s.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new SearchRoom();
    }
}

