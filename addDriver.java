package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class addDriver extends JFrame implements ActionListener {

    JTextField nameText, ageText, ccText, carNText, locaText;

    JComboBox comboBox, comboBox1;


    JButton add, back;

    addDriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,4,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(label);

        JLabel name =new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(174,70,156,30);
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setBackground(new Color(16,108,155));
        panel.add(nameText);

        JLabel age =new JLabel("AGE");
        age.setBounds(64,120,102,22);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        age.setForeground(Color.WHITE);
        panel.add(age);

        ageText = new JTextField();
        ageText.setBounds(174,120,156,30);
        ageText.setForeground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setBackground(new Color(16,108,155));
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,170,102,22);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        comboBox = new JComboBox(new String[] { "Male","Female"});
        comboBox.setBounds(174,170,156,30);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setBackground(new Color(16,108,155));
        panel.add(comboBox);

        JLabel CC =new JLabel("CAR COMPANY");
        CC.setBounds(64,220,102,22);
        CC.setFont(new Font("Tahoma",Font.BOLD,14));
        CC.setForeground(Color.WHITE);
        panel.add(CC);

        ccText = new JTextField();
        ccText.setBounds(174,220,156,30);
        ccText.setForeground(Color.WHITE);
        ccText.setFont(new Font("Tahoma",Font.BOLD,14));
        ccText.setBackground(new Color(16,108,155));
        panel.add(ccText);

        JLabel carN =new JLabel("CAR NAME");
        carN.setBounds(64,270,102,22);
        carN.setFont(new Font("Tahoma",Font.BOLD,14));
        carN.setForeground(Color.WHITE);
        panel.add(carN);

        carNText = new JTextField();
        carNText.setBounds(174,270,156,30);
        carNText.setForeground(Color.WHITE);
        carNText.setFont(new Font("Tahoma",Font.BOLD,14));
        carNText.setBackground(new Color(16,108,155));
        panel.add(carNText);

        JLabel Ava =new JLabel("AVAILABLE");
        Ava.setBounds(64,320,102,22);
        Ava.setFont(new Font("Tahoma",Font.BOLD,14));
        Ava.setForeground(Color.WHITE);
        panel.add(Ava);

        comboBox1= new JComboBox(new String[] { "YES","NO"});
        comboBox1.setBounds(174,320,156,30);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setFont(new Font("Tahoma",Font.BOLD,13));
        comboBox1.setBackground(new Color(16,108,155));
        panel.add(comboBox1);

        JLabel location =new JLabel("LOCATION");
        location.setBounds(64,370,102,22);
        location.setFont(new Font("Tahoma",Font.BOLD,14));
        location.setForeground(Color.WHITE);
        panel.add(location);

        locaText = new JTextField();
        locaText.setBounds(174,370,156,30);
        locaText.setForeground(Color.WHITE);
        locaText.setFont(new Font("Tahoma",Font.BOLD,14));
        locaText.setBackground(new Color(16,108,155));
        panel.add(locaText);

        add = new JButton("ADD");
        add.setBounds(100,420,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(240,420,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        JLabel label11 = new JLabel(imageIcon1);
        label11.setBounds(400,30,500,500);
        panel.add(label11);


        setUndecorated(true);
        setLocation(80,120);
        setLayout(null);
        setSize(900,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==add){
            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = ccText.getText();
            String carname = carNText.getText();
            String available = (String) comboBox1.getSelectedItem();
            String location = locaText.getText();


            try {
                conn c = new conn();
                String q = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+available+"','"+location+"')";
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"driver Added");
                setVisible(false);


            }catch (Exception E){
                E.printStackTrace();
            }


        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addDriver();
    }
}

