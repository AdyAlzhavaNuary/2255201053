/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_GUI_ADY;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insert {

    Koneksi konek = new Koneksi();

    public void Insert(String tgl, String jam, String kelas, String asal, String tujuan) {

        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "insert into tbkereta values('" + tgl + "','" + jam + "','" + kelas + "','" + asal + "','" + tujuan + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
