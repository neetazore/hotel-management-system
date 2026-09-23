package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomerInfo extends JFrame implements ActionListener {

    JComboBox comboBox;

    JTextField textFieldNumber,Textname,TextCountry,TextDeposite;

    JRadioButton r1,r2;

    Choice c1;

    JLabel date;

    JButton add,back;

    NewCustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,530);
        panel.setLayout(null);
        panel.setBackground(new Color(3, 45, 50, 235));
        add(panel);

      //  ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer1.png"));
      //  Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
     //   ImageIcon imageIcon1 = new ImageIcon(image);
     //   JLabel imglabel = new JLabel(imageIcon1);
      //  imglabel.setBounds(550,150,200,200);
      //  panel.add(imglabel);

        JLabel labelName = new JLabel("NEW CUSTOMER FROM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,14));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.WHITE);
        panel.add(labelID);

        comboBox = new JComboBox(new  String[]{"passport","Aadhar Card","Voter Id","Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setForeground(Color.BLACK);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,110,200,14);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(35,151,200,14);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelname);
        Textname = new JTextField();
        Textname.setBounds(271,151,150,20);
        panel.add(Textname);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,200,14);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3, 45, 50, 235));
        r1.setBounds(270,191,80,12);
        panel.add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3, 45, 50, 235));
        r2.setBounds(370,191,80,12);
        panel.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,221,200,14);
        labelCountry.setForeground(Color.WHITE);
        labelCountry.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelCountry);
        TextCountry = new JTextField();
        TextCountry.setBounds(271,221,150,20);
        panel.add(TextCountry);

        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,271,200,14);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelRoom);

       // ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/newcustmor.jpg"));
       // Image image = imageIcon.getImage().getScaledInstance(375,490,Image.SCALE_DEFAULT);
       /// ImageIcon imageIcon1 = new ImageIcon(image);
      ////  JLabel label = new JLabel(imageIcon1);
      //  label.setBounds(500,20,250,390);
       // panel.add(label);

        c1 = new Choice();
        try {


            conn c = new conn();
            ResultSet resultSet = c.s.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        

        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.BLACK);
        c1.setBackground(new Color(231, 234, 234, 237));
        panel.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,321,200,14);
        labelCIS.setForeground(Color.WHITE);
        labelCIS.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelCIS);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,321,200,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(date);

        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,371,200,14);
        labelDeposite.setForeground(Color.WHITE);
        labelDeposite.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labelDeposite);
        TextDeposite = new JTextField();
        TextDeposite.setBounds(271,371,150,20);
        panel.add(TextDeposite);

        add = new JButton("Add");
        add.setBounds(100,450,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(260,450,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(200,110);
        setSize(850,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            conn c = new conn();
            String radioBtn = null;
            if (r1.isSelected()){
                radioBtn = "Male";

            }else if (r2.isSelected()){
                radioBtn = "Female";
            }

            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = Textname.getText();
            String s4 = radioBtn;
            String s5 = TextCountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = TextDeposite.getText();

            try {

                String q ="insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update room set availability= 'occupied' where roomnumber = "+s6;

                c.s.executeUpdate(q);
                c.s.executeUpdate(q1);

                JOptionPane.showMessageDialog(null,"added Succesfully");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {

        new NewCustomerInfo();
    }
}
