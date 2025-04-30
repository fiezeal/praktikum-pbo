// nama file    : Kucing.java
// deskripsi    : program ini berisi atribut dan method class Kucing
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

public class Kucing extends Anabul{
    public Kucing(String nama){
        super(nama);
    }
    
    public void tampilData(){
        System.out.println("Tipe Anabul : Kucing");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara meong.");
    }
}
