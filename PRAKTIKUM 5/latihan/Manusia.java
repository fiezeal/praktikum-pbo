// nama file    : Manusia.java
// deskripsi    : program ini berisi atribut dan method class Manusia 
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 23 Maret 2025

import java.time.LocalDate;

public abstract class Manusia{
    private String nama;
    private LocalDate tanggalMulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterManusia = 0;

    public Manusia(){
        counterManusia++;
    }

    public Manusia(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tanggalMulaiKerja = tanggalMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterManusia++;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTgl(){
        return tanggalMulaiKerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterManusia;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl(LocalDate tanggalMulaiKerja){
        this.tanggalMulaiKerja = tanggalMulaiKerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tanggalMulaiKerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + pendapatan);
    }

    public static void printCounterMns(){
        System.out.println("Jumlah Objek Manusia: " + counterManusia);
    }

    public abstract int hitungMasaKerja();
}
