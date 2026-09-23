package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t2,t4;

    JComboBox t3,t5,t6, t7,t8;

    JButton b1,b2;

    AddRoom() {

        JPanel panel = new JPanel();
        panel.setBounds(3,5,873,540);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Add Room");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
        t2.setForeground(new Color(10,16,1));
        panel.add(t2);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 = new JComboBox(new String[] { "Available","Occuied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(new Color(10,16,1));
        panel.add(t3);

        JLabel l7 = new JLabel("Room Type");
        l7.setBounds(64,170,152,22);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        l7.setForeground(Color.WHITE);
        panel.add(l7);

        t7 = new JComboBox(new String[] { "AC","Non AC"});
        t7.setBounds(200,170,156,20);
        t7.setFont(new Font("Tahoma",Font.PLAIN,14));
        t7.setForeground(new Color(10,16,1));
        panel.add(t7);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,240,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(200,240,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
        t4.setForeground(new Color(10,16,1));
        panel.add(t4);


        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64,290,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 = new JComboBox(new String[] {"Cleand","Dirty"});
        t5.setBounds(200,290,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
        t5.setForeground(new Color(10,16,1));
        panel.add(t5);

        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64,355,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6 = new JComboBox(new String[] {"Single Bed","Double Bed"});
        t6.setBounds(200,355,156,20);
        t6.setFont(new Font("Tahoma",Font.PLAIN,14));
        t6.setForeground(new Color(10,16,1));
        panel.add(t6);

        b1 = new JButton(" Add ");
        b1.setBounds(74,480,99,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton(" Back ");
        b2.setBounds(230,480,99,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(450,60,400,400);
        panel.add(label);

        setUndecorated(true);
        setLocation(50,50);
        setLayout(null);
        setSize(880,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) {

            String room = t2.getText();
            String ava = (String) t3.getSelectedItem();
            String roomtype = (String) t7.getSelectedItem();
            String status = (String)  t5.getSelectedItem();
            String price = t4.getText();
            String type = (String) t6.getSelectedItem();

            try{
                conn c = new conn();
                String q = "insert into room values('"+room+"', '"+ava+"','"+roomtype+"', '"+status+"', '"+price+"', '"+type+"')";
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddRoom();
    }
}
