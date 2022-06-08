import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

    public static void connect() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://", "root", "");
            ResultSet rsCliente = connection.createStatement().executeQuery("SELECT * FROM CEC_CLIENTE");
            while (rsCliente.next()){
                System.out.println("None: " + rsCliente.getString("nm_cliente"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
