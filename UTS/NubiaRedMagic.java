package UTS;

public class NubiaRedMagic extends HP{
    private int ram, rom;
    private String chipset;
    
    public NubiaRedMagic(String nama,String harga, int ram, int rom, String chipset){
        super(nama,harga);
        this.ram = ram;
        this.rom = rom;
        this.chipset = chipset;
    }
    public NubiaRedMagic(int ram, int rom, String chipset){
        this.ram = ram;
        this.rom = rom;
        this.chipset = chipset;
    }
    @Override
    public void tampilHP(){
        super.tampilHP();
        System.out.println("RAM\t\t: "+ram+" GB");
        System.out.println("ROM\t\t: "+rom+" GB");
        System.out.println("Chipset\t\t: "+chipset);
    }
}
