/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

public class Koneksi {
    Connection con=null;
    String statuskoneksi=null;
    
    public void Koneksi()
    {
        
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/dbjadwalkuliah";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
           statuskoneksi="Tersambung";
        }

        catch(Exception e)
        {
        //JOptionPane.showMessageDialog(null, e);
            statuskoneksi="Gagal";
        //System.exit(0);
        }
}
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.Koneksi();
    }
}
