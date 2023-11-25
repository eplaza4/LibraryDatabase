package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC {
    public Object delete;

    public static void main( String[] args ) {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String username = "eplaza4";
        String password = "MySQL#01";
        String query = "SELECT * FROM book";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try (Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query)){

            while (result.next()) {
                String LMSData = "";
                for (int i = 1; i <= 6; i++) {
                    LMSData += result.getString(i) + ":";
                }
                System.out.println(LMSData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<ArrayList<Object>> getExecuteResult( String s ) {
        return null;
    }

    public void delete( String book, String number ) {
    }
}