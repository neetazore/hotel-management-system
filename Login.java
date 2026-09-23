package Hotel.Managment.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;

    Login() {
        JLabel label1 = new JLabel("Username");
        label1.setBounds(20,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(20,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(130,20,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(130,70,150,30);
        passwordField1.setForeground(Color.white);
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);


        try {
            ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/loginlogo.png"));
            Image image1 = imageIcon2.getImage().getScaledInstance(260,260,Image.SCALE_DEFAULT);
            ImageIcon imageIcon12 = new ImageIcon(image1);
            JLabel label = new JLabel(imageIcon12);
            label.setBounds(340,5,260,260);
            add(label);
        } catch (Exception e) {
            System.out.println("Driver image not found!");
        }
        b1 = new JButton("Login");
        b1.setBounds(20,160,120,30);
        b1.setFont(new Font("Serif",Font.PLAIN,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Cancel");
        b2.setBounds(160,160,120,30);
        b2.setFont(new Font("Serif",Font.PLAIN,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(5,47,50, 89));
        setLayout(null);
        setLocation(400, 270);
        setSize(620, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.s.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new Dashboard();
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                    setVisible(false);
                }

            }catch (Exception E) {
                E.printStackTrace();

            }
        }else{
            System.exit(102);

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

