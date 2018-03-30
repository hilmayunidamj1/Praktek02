package praktek02;
public class Kerudung {
    Integer Harga;
    Integer Jumlah;

    public Kerudung() {
        Harga=50000;
        Jumlah=10;
    }
    
    void cetakInfo(){
        System.out.println("===============");
        System.out.println("Harga = "+Harga);
        System.out.println("Jumlah ="+Jumlah);
        System.out.println("===============");
    }
    
    Integer hitungTotal(){
        Integer Total;
        Total=Harga*Jumlah;
        return Total;
    }
    
    void cetakTotal(){
        System.out.println("Totalnya adalah ="+hitungTotal());
    }
}
