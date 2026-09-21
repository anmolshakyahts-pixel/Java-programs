package JDBC;
import java.sql.*;
import java.util.Scanner;

public class jdbc {

    public static void main(String[] args) throws SQLException {
        Statement s;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/college", "root", "Anmol");
            s = con.createStatement();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Scanner r = new Scanner(System.in);
        System.out.println("Enter id name and rollno");
        int a =r.nextInt();
        String b = r.next();
        int d = r.nextInt();
        s.execute("insert into STUDENT values ("+a+",'"+b+"',"+d+")");
    }
    }

