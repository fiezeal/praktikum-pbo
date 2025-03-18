// nama file    : Persegi.java
// deskripsi    : program ini berisi class Persegi yang merupakan subclass dari superclass BangunDatar
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

public class Persegi extends BangunDatar{
    // ATRIBUT
    private double sisi;

    // METHOD
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        // super(4, warna, border);
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi; 
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        super.printCounterBangunDatar();
        // System.out.println("Warna Bangun Datar : " + getWarna());
        // System.out.println("Border Bangun Datar : " + getBorder());
        // System.out.println("Jumlah Sisi Bangun Datar : " + getJmlSisi());
        System.out.println("Sisi " + sisi);
    }
}