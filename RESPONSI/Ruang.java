// nama file    : Ruang.java
// deskripsi    : program ini berisi atribut dan method class abstract Ruang
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public abstract class Ruang{
    // ATRIBUT
    private String kode;
    private double panjang, lebar, tinggi;
    private int kapasitas;

    // METHOD
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas){
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    public String getKode(){
        return kode;
    }

    public double getPanjang(){ 
        return panjang; 
    }

    public double getLebar(){ 
        return lebar; 
    }

    public double getTinggi(){ 
        return tinggi; 
    }

    public int getKapasitas(){ 
        return kapasitas; 
    }

    public void setKode(String kode){
        this.kode = kode;
    }
    
    public void setPanjang(double panjang){ 
        this.panjang = panjang; 
    }

    public void setLebar(double lebar){ 
        this.lebar = lebar; 
    }

    public void setTinggi(double tinggi){ 
        this.tinggi = tinggi; 
    }

    public void setKapasitas(int kapasitas){ 
        this.kapasitas = kapasitas; 
    }
    
    public abstract double hitungBiayaKebersihan();
    
    public void printInfo(){
        System.out.println("Kode             : " + kode);
        System.out.println("Panjang          : " + panjang);
        System.out.println("Lebar            : " + lebar);
        System.out.println("Tinggi           : " + tinggi);
        System.out.println("Kapasitas        : " + kapasitas);
    }
}