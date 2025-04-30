// nama file    : Anabul.java
// deskripsi    : program ini berisi atribut dan method class Anabul
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

public abstract class Anabul{
    private String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void bersuara();
    
    public abstract void bergerak();

    public abstract void tampilData();
}
