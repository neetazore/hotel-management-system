package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nameText, ageText, salaryText, phoneText, aadharText, emailText;

    JRadioButton radioButtonM, radioButtonF;

    JComboBox comboBox;

    JButton add, back;

    AddEmployee() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,570);
        panel.setLayout(null);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("Serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(16,108,115));
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif",Font.BOLD,17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);

        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(16,108,115));
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,140,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,140,70,27);
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,140,100,27);
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,190,150,27);
        job.setFont(new Font("serif",Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk","Housekeeping","Kitchen Staff","room Service","Manager","Accountant","Chef"});
        comboBox.setBackground(new Color(16,108,115));
        comboBox.setBounds(200,190,150,30);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,240,150,27);
        salary.setFont(new Font("Serif",Font.BOLD,17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);

        salaryText = new JTextField();
        salaryText.setBounds(200,240,150,27);
        salaryText.setBackground(new Color(16,108,115));
        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);


        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,290,150,27);
        phone.setFont(new Font("Serif",Font.BOLD,17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);

        phoneText = new JTextField();
        phoneText.setBounds(200,290,150,27);
        phoneText.setBackground(new Color(16,108,115));
        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,340,150,27);
        aadhar.setFont(new Font("Serif",Font.BOLD,17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);

        aadharText = new JTextField();
        aadharText.setBounds(200,340,150,27);
        aadharText.setBackground(new Color(16,108,115));
        aadharText.setFont(new Font("Tahoma",Font.BOLD,14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,390,150,27);
        email.setFont(new Font("Serif",Font.BOLD,17));
        email.setForeground(Color.WHITE);
        panel.add(email);

        emailText = new JTextField();
        emailText.setBounds(200,390,150,27);
        emailText.setBackground(new Color(16,108,115));
        emailText.setFont(new Font("Tahoma",Font.BOLD,14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(560,24,445,35);
        AED.setFont(new Font("Serif",Font.BOLD,20));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(100,460,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(240,460,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/addemp1.png"));
        Image i11 = imageIcon2.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon2);
        label.setBounds(400,100,500,400);
        panel.add(label);

        setUndecorated(true);
        setLocation(70,80);
        setLayout(null);
        setSize(900,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== add){


            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadhar = aadharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()) {
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = "Female";
            }

            try{
                conn c = new conn();
                String q = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Employee Added");
                setVisible(false);


            }catch (Exception E){
                E.printStackTrace();
            }


        }else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddEmployee();
    }
}

