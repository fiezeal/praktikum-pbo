// nama file    : Manager.java
// deskripsi    : program ini berisi atribut dan method class Pegawai
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 24 April 2025

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    
    public Manajer(String nama) {
        super(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}