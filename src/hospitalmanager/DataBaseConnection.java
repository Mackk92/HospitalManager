package hospitalmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.applet.Main;

public class DataBaseConnection {

    static ResultSet rs;
    Statement st;
    static String s;

    public void Connection() throws ClassNotFoundException {
        try {
             
            
            
            int port = bazalog.port;
            String server = bazalog.server;
            String database = bazalog.database;
            String login = bazalog.login;
            String haslo = bazalog.pass;
            System.out.println(login);
            System.out.println(haslo);
            System.out.println("# - Driver Loadeding");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("# - Driver Loaded");

            String jdbcUrl = "jdbc:sqlserver://" + server + ":" + port + ";user=" + login + ";password=" + haslo + ";databaseName=" + database + "";
 System.out.println(jdbcUrl);
            Connection con = DriverManager.getConnection(jdbcUrl);

            st = con.createStatement();
            //JTable table1 = new JTable(buildTableModel(rs));
            rs = st.executeQuery(s);

        } catch (SQLException ex) {
           

        }
    }

    public ResultSet GetRS() {
        return rs;

    }

    public String GetStringRS() throws SQLException {
        return rs.getString(1);

    }

    public void setSql(String s) {
        this.s = s;
    }

}
