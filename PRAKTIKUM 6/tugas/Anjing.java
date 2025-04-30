// nama file    : Anjing.java
// deskripsi    : program ini berisi atribut dan method class Anjing
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

public class Anjing extends Anabul{
    public Anjing(String nama){
        super(nama);
    }

    public void tampilData(){
        System.out.println("Tipe Anabul : Anjing");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara guk-guk.");
    }
}
