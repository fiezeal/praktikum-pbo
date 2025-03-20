// nama file    : Pegawai.java
// deskripsi    : program ini berisi class Pegawai yang merupakan superclass dari class Dosen dan TenagaPendidik
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai{
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt(){
        return tmt;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public static String formatTanggal(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }
    
    public Period hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    public void printInfo(){
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}