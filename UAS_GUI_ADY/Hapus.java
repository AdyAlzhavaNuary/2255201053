/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_GUI_ADY;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class Hapus {
     Koneksi konek = new Koneksi();
   

    public void Hapus(String jam) {

        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from tbkereta where jam ='" + jam + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
