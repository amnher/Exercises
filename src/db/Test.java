package db;
import java.sql.*;
public class Test {
    public static void main(String[] args) {
        getConnection();
    }
    private static Connection getConnection()
    {
        Connection con = null;
        try
        {
            String url = "jdbc:mysql://localhost/Movies";
            String user = "jr";
            String pw = "00000000";
            con = DriverManager.getConnection(url, user, pw);
            System.out.println("Success");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }
}
