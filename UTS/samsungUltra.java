package UTS;

public class samsungUltra extends HP{
    private int ram, rom, resolusi;
    private String chipset;
    
    public samsungUltra(String nama,String harga, int ram, int rom, String chipset, int resolusi){
        super(nama,harga);
        this.ram = ram;
        this.rom = rom;
        this.chipset = chipset;
        this.resolusi = resolusi;
    }
    public samsungUltra(int ram, int rom, String chipset, int resolusi){
        this.ram = ram;
        this.rom = rom;
        this.chipset = chipset;
        this.resolusi = resolusi;
    }
    @Override
    public void tampilHP(){
        super.tampilHP();
        System.out.println("RAM\t\t: "+ram+" GB");
        System.out.println("ROM\t\t: "+rom+" GB");
        System.out.println("Chipset\t\t: "+chipset);
        System.out.println("Resolusi\t: "+resolusi+" MP");
    }
}
