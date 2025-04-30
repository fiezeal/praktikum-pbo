// nama file    : Pegawai.java
// deskripsi    : program ini berisi atribut dan method class Pegawai
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 24 April 2025

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}