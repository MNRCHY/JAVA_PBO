
package cobacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectDB {
    public static Connection mysqlconnect;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/cobacrud"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconnect=DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Gagal Koneksi");
             //System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconnect;
    }
    /*
    public static void main(String []args) throws SQLException{
       Connection C = (Connection)ConnectDB.configDB();

    }
    */
}
