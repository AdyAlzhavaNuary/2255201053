/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Insert {

    Koneksi konek = new Koneksi();
   

    public void Insert(String hari, String matkul, String jam, String ruang, String dosen) {

        try {
            konek.Koneksi();
            Statement statement = konek.con.createStatement();
         
              String sql = "insert into jadwal values('" + hari + "','" + matkul + "','" + jam + "','" + ruang + "','"+ dosen +"')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}