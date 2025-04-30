// nama file    : Programmer.java
// deskripsi    : program ini berisi atribut dan method class Programmer
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 24 April 2025

public class Programmer extends Pegawai{
    private int bonus = 450000;
    
    public Programmer(String nama){
        super(nama);
    }
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}