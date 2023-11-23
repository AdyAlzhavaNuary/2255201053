/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class HP {
    private String nama;
    private String harga;
    
    public HP(String nama, String harga){
        this.nama = nama;
        this.harga = harga;
    }
    public HP(){
        
    }
    public void tampilHP(){
        System.out.println("Nama HP\t\t: "+nama);
        System.out.println("Harga\t\t: Rp"+harga+",-");
    }
}
