/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc13
 */
public class masterBangunDatar {
    //Prosedur
    void hitungLuasSegitiga (int tinggi, int alas){
        double luas = 0.5 *tinggi * alas;
        System.out.println("tinggi = "+ tinggi);
        System.out.println("alas = "+ alas);
        System.out.println("Luas Segitiga = "+ luas);
    }
    
    //Fungsi
    double hitungLuasSegitigaF (int tinggi, int alas){
        double luas = 0.5 *tinggi * alas;
        System.out.println("tinggi = "+ tinggi);
        System.out.println("alas = "+ alas);
        return luas;
    }
    
    //Prosedur Static
    static void hitungLuasSegitigaMS (int tinggi, int alas){
        double luas = 0.5 *tinggi * alas;
        System.out.println("tinggi = "+ tinggi);
        System.out.println("alas = "+ alas);
        System.out.println("Luas Segitiga = "+ luas);
    }
    
    //Fungsi Static
    static double hitungLuasSegitigaFMS (int tinggi, int alas){
        double luas = 0.5 *tinggi * alas;
        System.out.println("tinggi = "+ tinggi);
        System.out.println("alas = "+ alas);
        return luas;
    }
}
