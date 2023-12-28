/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class Hapus {
    Koneksi konek = new Koneksi();
   

    public void Hapus(String hari) {

        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from jadwal where hari ='" + hari + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
