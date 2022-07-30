import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Amit", "4321");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from emp");
        while(rs.next()) {
            System.out.println(rs.getInt("EMPNO")+" "+rs.getString("ENAME")+" "+rs.getString("job"));
        }
    }
}