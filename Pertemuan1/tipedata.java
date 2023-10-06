/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author HP
 */
public class tipedata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipe Data String
        String nama, nim, alamat;
        
        //Tipe Data int
        int umur, semester;
        
        //Tipe Data double
        double tb, bb;
        
        //Tipe Data char
        char kelas;
        
        //Variable
        nama = "Ady Alzhava Nuary";
        nim = "2255201053";
        semester = 3;
        kelas = 'A';
        alamat = "Desa Mangunan Udanawu";
        umur = 19;
        tb = 180.5;
        bb = 58.7;
        
        System.out.println("Nama         = " + nama);
        System.out.println("NIM          = " + nim);
        System.out.println("Semester     = " + semester);
        System.out.println("Kelas        = " + kelas);
        System.out.println("Alamat       = " + alamat);
        System.out.println("Umur         = " + umur + " tahun ");
        System.out.println("Tinggi Badan = " + tb + " cm ");
        System.out.println("Berat Badan  = " + bb + " kg ");
    }
    
}