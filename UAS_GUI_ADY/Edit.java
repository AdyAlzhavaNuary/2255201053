/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_GUI_ADY;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Edit {
    Koneksi konek = new Koneksi();
     
     public void Edit(String tgl, String jam, String kelas, String asal, String tujuan) {
        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();

            String sql_jam = "UPDATE tbkereta SET jam = '" + jam + "' WHERE tgl = '" + tgl + "'";
            String sql_kelas = "UPDATE tbkereta SET kelas = '" + kelas + "' WHERE tgl = '" + tgl + "'";
            String sql_asal = "UPDATE tbkereta SET asal = '" + asal + "' WHERE tgl = '" + tgl + "'";
            String sql_tujuan = "UPDATE tbkereta SET tujuan = '" + tujuan + "' WHERE tgl = '" + tgl + "'";

            statement.executeUpdate(sql_jam);
            statement.executeUpdate(sql_kelas);
            statement.executeUpdate(sql_asal);
            statement.executeUpdate(sql_tujuan);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
