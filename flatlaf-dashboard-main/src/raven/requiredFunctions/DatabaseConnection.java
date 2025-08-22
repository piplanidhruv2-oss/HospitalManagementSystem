package raven.requiredFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class DatabaseConnection {

    private static DatabaseConnection instance;
    static {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB driver Missing");
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    private Connection connection;

    private DatabaseConnection() {

    }

    public void connectToDatabase() throws SQLException {
        String port = "3306";
        String server = "localhost";
//        String database = "students";
//        String userName = "root";
        String password = "1379";
        String userName = "root"; 
//        String password = "Anurag.4dec";
     String database = "hospitalmanagement";
        connection = DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        try {
            connectToDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
