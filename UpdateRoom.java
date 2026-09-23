package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateRoom extends JFrame {
    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update Status");
        label1.setBounds(100,10,300,70);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("ID :");
        label2.setBounds(100,60,48,70);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248,85,140,25);
        panel.add(c);

        try {
            conn C = new conn();
            ResultSet resultSet = C.s.executeQuery("select * from customer");
            while (resultSet.next()){
                c.add(resultSet.getString("number"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number :");
        label3.setBounds(25,129,107,14);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(248,129,140,20);
        panel.add(textField3);

        JLabel label4 = new JLabel("Availability :");
        label4.setBounds(45,174,97,14);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField textField4 = new JTextField();
        textField4.setBounds(248,169,140,20);
        panel.add(textField4);

        JLabel label5 = new JLabel("Clean Status :");
        label5.setBounds(40,218,97,14);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField textField5 = new JTextField();
        textField5.setBounds(248,215,140,20);
        panel.add(textField5);


        JButton update = new JButton("Update");
        update.setBounds(76,385,89,23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conn c = new conn();
                    String status = textField5.getText();
                    ResultSet resultSet1 = c.s.executeQuery("select * from room where roomnumber = '"+textField3.getText()+"'");                    JOptionPane.showMessageDialog(null,"Update Successfully");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(195,385,89,23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });

        JButton check = new JButton("Check");
        check.setBounds(310,385,89,23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String id = c.getSelectedItem();
                String q = "select * from Customer where number ='"+id+"'";
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.s.executeQuery(q);

                    while (resultSet.next()) {
                        textField3.setText(resultSet.getString("room"));

                    }

                    ResultSet resultSet1 = c.s.executeQuery("select * from room where roomnumber = '"+textField3.getText()+"'");

                    while (resultSet1.next()){

                        textField4.setText(resultSet1.getString("availability"));
                        textField5.setText(resultSet1.getString("cleaning_status"));

                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(850,500);
        setLocation(200,150);
        setVisible(true);

    }

    public static void main(String[] args) {

        new UpdateRoom();
    }
}
