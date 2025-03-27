// nama file    : Laboratorium.java
// deskripsi    : program ini berisi atribut dan method class Laboratorium
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public class Laboratorium extends Ruang{
    // ATRIBUT
    private String namaLaboratorium;
    private double hargaSewa;
    private double tarif;

    // METHOD
    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, double tarif){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
        this.tarif = tarif;
    }

    public String getNamaLaboratorium(){ 
        return namaLaboratorium; 
    }

    public void setNamaLaboratorium(String namaLaboratorium){ 
        this.namaLaboratorium = namaLaboratorium; 
    }

    public double getHargaSewa(){ 
        return hargaSewa; 
    }

    public void setHargaSewa(double hargaSewa){ 
        this.hargaSewa = hargaSewa; 
    }

    public double getTarif(){
        return this.tarif;
    }

    public void setTarif(double tarif){
        this.tarif = tarif;
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }

    @Override
    public void printInfo(){
        System.out.println("Nama Laboratorium: " + namaLaboratorium);
        super.printInfo();
        System.out.println("Harga Sewa       : " + hargaSewa);
        System.out.println("Biaya Kebersihan : Rp. " + hitungBiayaKebersihan());
    }
}