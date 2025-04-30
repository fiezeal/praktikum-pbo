// nama file    : Burung.java
// deskripsi    : program ini berisi atribut dan method class Burung
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

public class Burung extends Anabul{
    public Burung(String nama){
        super(nama);
    }

    public void tampilData(){
        System.out.println("Tipe Anabul : Burung");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara cuit.");
    }
}
