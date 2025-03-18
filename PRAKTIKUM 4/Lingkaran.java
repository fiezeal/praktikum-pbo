// nama file    : Lingkaran.java
// deskripsi    : program ini berisi class Lingkaran yang merupakan subclass dari superclass BangunDatar
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

public class Lingkaran extends BangunDatar{
    // ATRIBUT
    private double jari;

    // METHOD
    public Lingkaran(){
        
    }

    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari; 
    }

    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}