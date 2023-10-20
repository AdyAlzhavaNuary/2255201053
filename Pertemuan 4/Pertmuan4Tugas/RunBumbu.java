/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertmuan4Tugas;

/**
 *
 * @author pc13
 */
public class RunBumbu {
    public static void main(String[] args) {
        
        Bumbu bumbu = new Bumbu();
       
        
        // menampilkan variabel
        GadoGado gadogado = new GadoGado();
        gadogado.nama = " Gado Gado ";
        gadogado.kondimen = " Jagung pipil, Sayuran rebus, Kentang, Lontong, Tahu, Tempe dan Telur";
        
        Karedok karedok = new Karedok();
        karedok.nama = " Karedok ";
        karedok.kondimen = " Mentimun, Taoge, Kol, Kacang panjang, Daun kemangi dan Terong";
        
        Ketoprak ketoprak = new Ketoprak();
        ketoprak.nama = " Ketoprak ";
        ketoprak.kondimen = " Bihun, Toge, Ketupat dan Tahu ";
        
        Rujak rujak = new Rujak();
        rujak.nama = " Rujak ";
        rujak.kondimen = " Kacang panjang, Kangkung, Toge, Timun, Lontong, Tahu dan Tempe goreng ";
        
        
        // memanggil variabel
        
        gadogado.menampilkan();
        gadogado.BahanYangSama();
        gadogado.daerah();
        
        karedok.menampilkan();
        karedok.BahanYangSama();
        karedok.daerah();
        
        ketoprak.menampilkan();
        ketoprak.BahanYangSama();
        ketoprak.daerah();
        
        rujak.menampilkan();
        rujak.BahanYangSama();
        rujak.daerah();
    }
    
}
