package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Restaurant extends JFrame implements ActionListener {

    JCheckBox s1, s2, s3,s4, s5, s6, s7,s8, s9, s10,s11,s12,s13,s14,s15, s16, s17,s18,s19,s20 ;

    JTextField TextFields1, TextFields2, TextFields3, TextFields4, TextFields5, TextFields6, TextFields7, TextFields8, TextFields9, TextFields10, TextFields11, TextFields12, TextFields13, TextFields14, TextFields15, TextFields16, TextFields17, TextFields18, TextFields19, TextFields20 ;

    JButton back, bill;

    Restaurant(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,640);
        panel.setLayout(null);
        panel.setBackground(new Color(220, 224, 225, 255));
        add(panel);

        JLabel labelName = new JLabel("Restaurant");
        labelName.setBounds(20,0,260,60);
        labelName.setFont(new Font("Arial",Font.BOLD,16));
        labelName.setForeground(Color.BLACK);
        panel.add(labelName);

        JLabel item = new JLabel("Item");
        item.setBounds(35,60,200,14);
        item.setForeground(Color.BLACK);
        item.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(item);

        JLabel price = new JLabel("Price(in Rs)");
        price.setBounds(200,60,200,14);
        price.setForeground(Color.BLACK);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel quantity = new JLabel("Quantity");
        quantity.setBounds(410,60,200,14);
        quantity.setForeground(Color.BLACK);
        quantity.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(quantity);

        JLabel indian = new JLabel("Indian :");
        indian.setBounds(35,100,200,14);
        indian.setForeground(Color.BLACK);
        indian.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(indian);

        s1 = new JCheckBox("Samosa");
        s1.setFont(new Font("Tahoma",Font.PLAIN,12));
        s1.setForeground(Color.BLACK);
        s1.setBackground(new Color(216, 225, 227, 255));
        s1.setBounds(30,120,90,12);
        panel.add(s1);
        TextFields1= new JTextField();
        TextFields1.setBounds(400,120,90,20);
        panel.add(TextFields1);

        JLabel t1 = new JLabel("20.00");
        t1.setBounds(220,120,150,15);
        t1.setFont(new Font("Tahoma",Font.PLAIN,14));
        t1.setForeground(Color.BLACK);
        panel.add(t1);

        s2= new JCheckBox("Aaloo Tikki");
        s2.setFont(new Font("Tahoma",Font.PLAIN,12));
        s2.setForeground(Color.BLACK);
        s2.setBackground(new Color(216, 225, 227, 255));
        s2.setBounds(30,140,110,12);
        panel.add(s2);
        TextFields2= new JTextField();
        TextFields2.setBounds(400,140,90,20);
        panel.add(TextFields2);

        JLabel t2 = new JLabel("20.00");
        t2.setBounds(220,140,150,15);
        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
        t2.setForeground(Color.BLACK);
        panel.add(t2);

        s3= new JCheckBox("Chat");
        s3.setFont(new Font("Tahoma",Font.PLAIN,12));
        s3.setForeground(Color.BLACK);
        s3.setBackground(new Color(216, 225, 227, 255));
        s3.setBounds(30,160,110,12);
        panel.add(s3);
        TextFields3= new JTextField();
        TextFields3.setBounds(400,160,90,20);
        panel.add(TextFields3);

        JLabel t3 = new JLabel("50.00");
        t3.setBounds(220,160,150,15);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.BLACK);
        panel.add(t3);

        s4= new JCheckBox("Paneer Pakoda");
        s4.setFont(new Font("Tahoma",Font.PLAIN,12));
        s4.setForeground(Color.BLACK);
        s4.setBackground(new Color(216, 225, 227, 255));
        s4.setBounds(30,180,110,12);
        panel.add(s4);
        TextFields4= new JTextField();
        TextFields4.setBounds(400,180,90,20);
        panel.add(TextFields4);

        JLabel t4 = new JLabel("50.00");
        t4.setBounds(220,180,150,15);
        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
        t4.setForeground(Color.BLACK);
        panel.add(t4);

        JLabel chinese = new JLabel("Chinese :");
        chinese.setBounds(35,200,200,14);
        chinese.setForeground(Color.BLACK);
        chinese.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(chinese);

        s5= new JCheckBox("Chowmine");
        s5.setFont(new Font("Tahoma",Font.PLAIN,12));
        s5.setForeground(Color.BLACK);
        s5.setBackground(new Color(216, 225, 227, 255));
        s5.setBounds(30,220,110,12);
        panel.add(s5);
        TextFields5= new JTextField();
        TextFields5.setBounds(400,220,90,20);
        panel.add(TextFields5);

        JLabel t5 = new JLabel("70.00");
        t5.setBounds(220,220,150,15);
        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
        t5.setForeground(Color.BLACK);
        panel.add(t5);

        s6= new JCheckBox("Veg Momos");
        s6.setFont(new Font("Tahoma",Font.PLAIN,12));
        s6.setForeground(Color.BLACK);
        s6.setBackground(new Color(216, 225, 227, 255));
        s6.setBounds(30,240,110,12);
        panel.add(s6);
        TextFields6= new JTextField();
        TextFields6.setBounds(400,240,90,20);
        panel.add(TextFields6);

        JLabel t6 = new JLabel("70.00");
        t6.setBounds(220,240,150,15);
        t6.setFont(new Font("Tahoma",Font.PLAIN,14));
        t6.setForeground(Color.BLACK);
        panel.add(t6);

        s7= new JCheckBox("Paneer Chowmine");
        s7.setFont(new Font("Tahoma",Font.PLAIN,12));
        s7.setForeground(Color.BLACK);
        s7.setBackground(new Color(216, 225, 227, 255));
        s7.setBounds(30,260,110,12);
        panel.add(s7);
        TextFields7= new JTextField();
        TextFields7.setBounds(400,260,90,20);
        panel.add(TextFields7);

        JLabel t7 = new JLabel("100.00");
        t7.setBounds(220,260,150,15);
        t7.setFont(new Font("Tahoma",Font.PLAIN,14));
        t7.setForeground(Color.BLACK);
        panel.add(t7);

        s8= new JCheckBox("Thupka");
        s8.setFont(new Font("Tahoma",Font.PLAIN,12));
        s8.setForeground(Color.BLACK);
        s8.setBackground(new Color(216, 225, 227, 255));
        s8.setBounds(30,280,110,12);
        panel.add(s8);
        TextFields8= new JTextField();
        TextFields8.setBounds(400,280,90,20);
        panel.add(TextFields8);
        JLabel t8 = new JLabel("50.00");
        t8.setBounds(220,280,150,15);
        t8.setFont(new Font("Tahoma",Font.PLAIN,14));
        t8.setForeground(Color.BLACK);
        panel.add(t8);

        JLabel south = new JLabel("South Indian :");
        south.setBounds(35,300,200,14);
        south.setForeground(Color.BLACK);
        south.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(south);

        s9= new JCheckBox("Dosa");
        s9.setFont(new Font("Tahoma",Font.PLAIN,12));
        s9.setForeground(Color.BLACK);
        s9.setBackground(new Color(216, 225, 227, 255));
        s9.setBounds(30,320,110,12);
        panel.add(s9);
        TextFields9= new JTextField();
        TextFields9.setBounds(400,320,90,20);
        panel.add(TextFields9);

        JLabel t9 = new JLabel("50.00");
        t9.setBounds(220,320,150,15);
        t9.setFont(new Font("Tahoma",Font.PLAIN,14));
        t9.setForeground(Color.BLACK);
        panel.add(t9);


        s10= new JCheckBox("Idlee");
        s10.setFont(new Font("Tahoma",Font.PLAIN,12));
        s10.setForeground(Color.BLACK);
        s10.setBackground(new Color(216, 225, 227, 255));
        s10.setBounds(30,340,110,12);
        panel.add(s10);
        TextFields10= new JTextField();
        TextFields10.setBounds(400,340,90,20);
        panel.add(TextFields10);

        JLabel t10 = new JLabel("50.00");
        t10.setBounds(220,340,150,15);
        t10.setFont(new Font("Tahoma",Font.PLAIN,14));
        t10.setForeground(Color.BLACK);
        panel.add(t10);

        s11= new JCheckBox("Samber");
        s11.setFont(new Font("Tahoma",Font.PLAIN,12));
        s11.setForeground(Color.BLACK);
        s11.setBackground(new Color(216, 225, 227, 255));
        s11.setBounds(30,360,110,12);
        panel.add(s11);
        TextFields11= new JTextField();
        TextFields11.setBounds(400,360,90,20);
        panel.add(TextFields11);

        JLabel t11 = new JLabel("70.00");
        t11.setBounds(220,360,150,15);
        t11.setFont(new Font("Tahoma",Font.PLAIN,14));
        t11.setForeground(Color.BLACK);
        panel.add(t11);

        s12= new JCheckBox("Rasam");
        s12.setFont(new Font("Tahoma",Font.PLAIN,12));
        s12.setForeground(Color.BLACK);
        s12.setBackground(new Color(216, 225, 227, 255));
        s12.setBounds(30,380,110,12);
        panel.add(s12);
        TextFields12= new JTextField();
        TextFields12.setBounds(400,380,90,20);
        panel.add(TextFields12);

        JLabel t12 = new JLabel("60.00");
        t12.setBounds(220,380,150,15);
        t12.setFont(new Font("Tahoma",Font.PLAIN,14));
        t12.setForeground(Color.BLACK);
        panel.add(t12);

        JLabel DrinkS = new JLabel("Drinks &... :");
        DrinkS.setBounds(35,400,200,14);
        DrinkS.setForeground(Color.BLACK);
        DrinkS.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(DrinkS);

        s13= new JCheckBox("Soft Drink");
        s13.setFont(new Font("Tahoma",Font.PLAIN,12));
        s13.setForeground(Color.BLACK);
        s13.setBackground(new Color(216, 225, 227, 255));
        s13.setBounds(30,420,110,12);
        panel.add(s13);
        TextFields13= new JTextField();
        TextFields13.setBounds(400,420,90,20);
        panel.add(TextFields13);

        JLabel t13 = new JLabel("50.00");
        t13.setBounds(220,420,150,15);
        t13.setFont(new Font("Tahoma",Font.PLAIN,14));
        t13.setForeground(Color.BLACK);
        panel.add(t13);

        s14= new JCheckBox("Banana Shake");
        s14.setFont(new Font("Tahoma",Font.PLAIN,12));
        s14.setForeground(Color.BLACK);
        s14.setBackground(new Color(216, 225, 227, 255));
        s14.setBounds(30,440,110,12);
        panel.add(s14);
        TextFields14= new JTextField();
        TextFields14.setBounds(400,440,90,20);
        panel.add(TextFields14);

        JLabel t14 = new JLabel("40.00");
        t14.setBounds(220,440,150,15);
        t14.setFont(new Font("Tahoma",Font.PLAIN,14));
        t14.setForeground(Color.BLACK);
        panel.add(t14);

        s15= new JCheckBox("Mango Shake");
        s15.setFont(new Font("Tahoma",Font.PLAIN,12));
        s15.setForeground(Color.BLACK);
        s15.setBackground(new Color(216, 225, 227, 255));
        s15.setBounds(30,460,110,12);
        panel.add(s15);
        TextFields15= new JTextField();
        TextFields15.setBounds(400,460,90,20);
        panel.add(TextFields15);

        JLabel t15 = new JLabel("30.00");
        t15.setBounds(220,460,150,15);
        t15.setFont(new Font("Tahoma",Font.PLAIN,14));
        t15.setForeground(Color.BLACK);
        panel.add(t15);

        s16= new JCheckBox("Strawberry shake");
        s16.setFont(new Font("Tahoma",Font.PLAIN,12));
        s16.setForeground(Color.BLACK);
        s16.setBackground(new Color(216, 225, 227, 255));
        s16.setBounds(30,480,110,12);
        panel.add(s16);
        TextFields16= new JTextField();
        TextFields16.setBounds(400,480,90,20);
        panel.add(TextFields16);

        JLabel t16 = new JLabel("40.00");
        t16.setBounds(220,480,150,15);
        t16.setFont(new Font("Tahoma",Font.PLAIN,14));
        t16.setForeground(Color.BLACK);
        panel.add(t16);

        s17= new JCheckBox("Tea");
        s17.setFont(new Font("Tahoma",Font.PLAIN,12));
        s17.setForeground(Color.BLACK);
        s17.setBackground(new Color(216, 225, 227, 255));
        s17.setBounds(30,500,110,12);
        panel.add(s17);
        TextFields17= new JTextField();
        TextFields17.setBounds(400,500,90,20);
        panel.add(TextFields17);

        JLabel t17 = new JLabel("20.00");
        t17.setBounds(220,500,150,15);
        t17.setFont(new Font("Tahoma",Font.PLAIN,14));
        t17.setForeground(Color.BLACK);
        panel.add(t17);

        JLabel liquor = new JLabel("Liquor :");
        liquor.setBounds(35,520,200,14);
        liquor.setForeground(Color.BLACK);
        liquor.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(liquor);

        s18= new JCheckBox("Beer");
        s18.setFont(new Font("Tahoma",Font.PLAIN,12));
        s18.setForeground(Color.BLACK);
        s18.setBackground(new Color(216, 225, 227, 255));
        s18.setBounds(30,540,110,12);
        panel.add(s18);
        TextFields18= new JTextField();
        TextFields18.setBounds(400,540,90,20);
        panel.add(TextFields18);

        JLabel t18 = new JLabel("100.00");
        t18.setBounds(220,540,150,15);
        t18.setFont(new Font("Tahoma",Font.PLAIN,14));
        t18.setForeground(Color.BLACK);
        panel.add(t18);

        s19= new JCheckBox("Whisky");
        s19.setFont(new Font("Tahoma",Font.PLAIN,12));
        s19.setForeground(Color.BLACK);
        s19.setBackground(new Color(216, 225, 227, 255));
        s19.setBounds(30,560,110,12);
        panel.add(s19);
        TextFields19= new JTextField();
        TextFields19.setBounds(400,560,90,20);
        panel.add(TextFields19);

        JLabel t19 = new JLabel("500.00");
        t19.setBounds(220,560,150,15);
        t19.setFont(new Font("Tahoma",Font.PLAIN,14));
        t19.setForeground(Color.BLACK);
        panel.add(t19);

        s20= new JCheckBox("Rum");
        s20.setFont(new Font("Tahoma",Font.PLAIN,12));
        s20.setForeground(Color.BLACK);
        s20.setBackground(new Color(216, 225, 227, 255));
        s20.setBounds(30,580,110,12);
        panel.add(s20);
        TextFields20= new JTextField();
        TextFields20.setBounds(400,580,90,20);
        panel.add(TextFields20);

        JLabel t20 = new JLabel("300.00");
        t20.setBounds(220,580,150,15);
        t20.setFont(new Font("Tahoma",Font.PLAIN,14));
        t20.setForeground(Color.BLACK);
        panel.add(t20);


        Date date = new Date();

        JLabel labeldate = new JLabel(""+date);
        labeldate.setBounds(590,20,250,30);
        labeldate.setFont(new Font("Tahoma",Font.BOLD,18));
        labeldate.setForeground(Color.BLACK);
        panel.add(labeldate);


        bill = new JButton("Bill");
        bill.setBounds(570,370,120,30);
        bill.setForeground(Color.WHITE);
        bill.setBackground(Color.DARK_GRAY);
        bill.addActionListener(this);
        panel.add(bill);

        back = new JButton("Back");
        back.setBounds(730,370,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.DARK_GRAY);
        back.addActionListener(this);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    new Dashboard();
                    setVisible(false);

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/food2.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(400,230,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,30,320,330);
        panel.add(label);

       setUndecorated(true);
        setLayout(null);
        setBounds(30,50,900,650);
        setLocation(200,30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            setVisible(false);
            return;
        }

            if (e.getSource() == bill) {

            int total = 0;

            try {

                if (s1.isSelected()) { int qty = Integer.parseInt(TextFields1.getText()); total += qty * 20; }
                if (s2.isSelected()) { int qty = Integer.parseInt(TextFields2.getText()); total += qty * 20; }
                if (s3.isSelected()) { int qty = Integer.parseInt(TextFields3.getText()); total += qty * 50; }
                if (s4.isSelected()) { int qty = Integer.parseInt(TextFields4.getText()); total += qty * 50; }
                if (s5.isSelected()) { int qty = Integer.parseInt(TextFields5.getText()); total += qty * 70; }
                if (s6.isSelected()) { int qty = Integer.parseInt(TextFields6.getText()); total += qty * 70; }
                if (s7.isSelected()) { int qty = Integer.parseInt(TextFields7.getText()); total += qty * 100; }
                if (s8.isSelected()) { int qty = Integer.parseInt(TextFields8.getText()); total += qty * 50; }
                if (s9.isSelected()) { int qty = Integer.parseInt(TextFields9.getText()); total += qty * 50; }
                if (s10.isSelected()) { int qty = Integer.parseInt(TextFields10.getText()); total += qty * 50; }
                if (s11.isSelected()) { int qty = Integer.parseInt(TextFields11.getText()); total += qty * 70; }
                if (s12.isSelected()) { int qty = Integer.parseInt(TextFields12.getText()); total += qty * 60; }
                if (s13.isSelected()) { int qty = Integer.parseInt(TextFields13.getText()); total += qty * 50; }
                if (s14.isSelected()) { int qty = Integer.parseInt(TextFields14.getText()); total += qty * 40; }
                if (s15.isSelected()) { int qty = Integer.parseInt(TextFields15.getText()); total += qty * 30; }
                if (s16.isSelected()) { int qty = Integer.parseInt(TextFields16.getText()); total += qty * 40; }
                if (s17.isSelected()) { int qty = Integer.parseInt(TextFields17.getText()); total += qty * 20; }
                if (s18.isSelected()) { int qty = Integer.parseInt(TextFields18.getText()); total += qty * 100; }
                if (s19.isSelected()) { int qty = Integer.parseInt(TextFields19.getText()); total += qty * 500; }
                if (s20.isSelected()) { int qty = Integer.parseInt(TextFields20.getText()); total += qty * 300; }

                JOptionPane.showMessageDialog(null, "Total Bill =" +total);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid quantity", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    public static void main(String[] args) {
        new Restaurant();
    }
}
