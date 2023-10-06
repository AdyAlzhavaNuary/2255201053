/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc13
 */
public class RunbangunDatar {
    public static void main(String[] args) {
        //Prosedur
        masterBangunDatar P = new masterBangunDatar();
        P.hitungLuasSegitiga(9, 7);
        
        //Fungsi
        System.out.println("Luas Segitiga dengan Fungsi = "+P.hitungLuasSegitigaF(6, 8));
        
        //Prosedur Static
        masterBangunDatar.hitungLuasSegitigaMS(10, 8);
        
        //Fungsi Static
        System.out.println("Luas Segitiga Static = "+masterBangunDatar.hitungLuasSegitigaFMS(13, 6));
    }
}
