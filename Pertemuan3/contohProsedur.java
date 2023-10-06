/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc13
 */
public class contohProsedur {
    int tinggi = 7, alas = 5;
    
    void hitungLuasSegitiga(){
        double luas = (tinggi * alas)*0.5;
        System.out.println("alas = "+ alas);
        System.out.println("tinggi = "+ tinggi);
        System.out.println("Luas Segitiga = "+ luas);
    }
    
    public static void main(String[] args) {
        contohProsedur P = new contohProsedur();
        P.hitungLuasSegitiga();
    }
}
