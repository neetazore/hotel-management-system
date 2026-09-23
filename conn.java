package Hotel.Managment.System;

import java.sql.*;
import java.sql.PreparedStatement;

public class conn {
    Connection c;
    Statement s;


    public conn() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hotelMS","root","NeetaZ@11");
            s = c.createStatement();
        } catch (Exception e) {


            e.printStackTrace();
        }
    }
}
