package UTS;
import java.util.Scanner;

public class runHP {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("Pilih HP Sesuai Dengan Kebutuhan");
        System.out.println("================================");
        System.out.println("1. Gaming");
        System.out.println("2. Fotografi");
        System.out.println("================================");
        System.out.print("Masukkan angka : ");
        int pilih = masuk.nextInt();
        System.out.print("\n");
        
        asusRoG rog = new asusRoG("Asus ROG","30.000.000",16,512,"Qualcomm Snapdragon 8 Gen 2");
        NubiaRedMagic nrm = new NubiaRedMagic("Nubia Red Magic","16.700.000",12,256,"Qualcomm Snapdragon Gen 2 Leading Version");
        IPhone ip = new IPhone("IPhone Pro Max","24.999.999",12,256,"A17 Pro",48);
        samsungUltra su = new samsungUltra("Samsung Galaxy Ultra","21.999.000",12,512,"Qualcomm Snapdragon 8 Gen 2",200);
        
        if(pilih==1){
            System.out.println("     Rekomendasi HP Gaming");
            System.out.println("================================");
            System.out.println("1. Asus ROG");
            System.out.println("2. Nubia Red Magic");
            System.out.println("================================");
            System.out.print("         Masukkan angka\n  untuk melihat spesifikasi : ");
            
            int pilih2 = masuk.nextInt();
            System.out.print("\n");
            
            switch(pilih2){
                case 1 -> {
                    System.out.println("Spesifikasi \n");
                    rog.tampilHP();
                }
                case 2 -> {
                    System.out.println("Spesifikasi \n");
                    nrm.tampilHP();
                }
            }
        }
            
        else if(pilih==2){
            System.out.println("    Rekomendasi HP Fotografi");
            System.out.println("================================");
            System.out.println("1. IPhone Pro Max");
            System.out.println("2. Samsung Galaxy Ultra");
            System.out.println("================================");
            System.out.print("         Masukkan angka\n  untuk melihat spesifikasi : ");
            
            int pilih3 = masuk.nextInt();
            System.out.print("\n");
            
            switch(pilih3){
                case 1 -> {
                    System.out.println("Spesifikasi \n");
                    ip.tampilHP();
                }
                case 2 -> {
                    System.out.println("Spesifikasi \n");
                    su.tampilHP();
                }
            }    
          
        }
        }
}
