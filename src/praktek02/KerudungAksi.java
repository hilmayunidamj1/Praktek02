package praktek02;

public class KerudungAksi {
    public static void main(String[] args) {
        Kerudung rl = new Kerudung();
        rl.Harga = 50000;
        rl.Jumlah = 10;
       
        rl.cetakInfo();
        System.out.println("Total Kerudung = "+rl.hitungTotal());
        rl.cetakTotal();
        
        Kerudung r2 = new Kerudung();
        r2.cetakInfo();
        
        Kerudung r3 = new Kerudung(10,10);
        r3.cetakInfo();
    }
    
}
