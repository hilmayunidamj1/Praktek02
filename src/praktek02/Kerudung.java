package praktek02;
public class Kerudung {
    Integer Harga;
    Integer Jumlah;
    
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
}
