package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){

        super("Hotel Managment System");

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,270,870);
        panel1.setBackground(new Color(5, 1, 6, 64));
        add(panel1);

        try {
            ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/Neeta@.gif"));
            Image image1 = imageIcon2.getImage().getScaledInstance(210,210,Image.SCALE_DEFAULT);
            ImageIcon imageIcon12 = new ImageIcon(image1);
            JLabel label2 = new JLabel(imageIcon12);
            label2.setBounds(40,360,210,210);
            add(label2);
        } catch (Exception e) {
            System.out.println("Reception image not found!");
        }


        JButton btnNCE = new JButton("New Customer Form");
        btnNCE.setBounds(30,30,200,20);
        btnNCE.setForeground(Color.white);
        btnNCE.setForeground(Color.black);
        panel1.add(btnNCE);
        btnNCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomerInfo();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,60,200,20);
        btnRoom.setForeground(Color.white);
        btnRoom.setForeground(Color.black);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnDepartment = new JButton("Deparment");
        btnDepartment.setBounds(30,90,200,20);
        btnDepartment.setForeground(Color.white);
        btnDepartment.setForeground(Color.black);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,120,200,20);
        btnAEI.setForeground(Color.white);
        btnAEI.setForeground(Color.black);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,150,200,20);
        btnCI.setForeground(Color.white);
        btnCI.setForeground(Color.black);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });


        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,180,200,20);
        btnMI.setForeground(Color.white);
        btnMI.setForeground(Color.black);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,210,200,20);
        btnCO.setForeground(Color.white);
        btnCO.setForeground(Color.black);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });


        JButton btnUCID = new JButton("Update check-in Details");
        btnUCID.setBounds(30,240,200,20);
        btnUCID.setForeground(Color.white);
        btnUCID.setForeground(Color.black);
        panel1.add(btnUCID);
        btnUCID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });
        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,270,200,20);
        btnURS.setForeground(Color.white);
        btnURS.setForeground(Color.black);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnPUS = new JButton("Pick up Service");
        btnPUS.setBounds(30,300,200,20);
        btnPUS.setForeground(Color.white);
        btnPUS.setForeground(Color.black);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();

                }catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });
        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,330,200,20);
        btnSR.setForeground(Color.white);
        btnSR.setForeground(Color.black);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchRoom();
                }catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnrs = new JButton("Room Style");
        btnrs.setBounds(30,360,200,20);
        btnrs.setForeground(Color.white);
        btnrs.setForeground(Color.black);
        panel1.add(btnrs);
        btnrs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new roomstyling();
                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });

        JButton btnLO = new JButton("Log out");
        btnLO.setBounds(30,410,90,20);
        btnLO.setForeground(Color.white);
        btnLO.setForeground(Color.black);
        panel1.add(btnLO);
        btnLO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);

                }catch (Exception E) {
                    E.printStackTrace();
                }

            }
        });


        JButton btnBc = new JButton("Back");
        btnBc.setBounds(130,410,90,20);
        btnBc.setForeground(Color.white);
        btnBc.setForeground(Color.black);
        panel1.add(btnBc);
        btnBc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Dashboard();
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Reception1.jpg"));
        Image i1 = imageIcon.getImage().getScaledInstance(1238,820,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel jLabel = new JLabel(imageIcon1);
        jLabel.setBounds(280,5,1238,820);
        add(jLabel);

        setUndecorated(true);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Reception();
    }
}
