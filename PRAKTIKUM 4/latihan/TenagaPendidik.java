// nama file    : Tendik.java
// deskripsi    : program ini berisi class Dosen
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;
import java.time.Period;

public class TenagaPendidik extends Pegawai{
    private String bidang;
    private static final int BUP = 55;

    public TenagaPendidik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public String getBup(){
        LocalDate bup = getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        return Pegawai.formatTanggal(bup);
    }

    public double getTunjangan(){
        int masaKerja = Period.between(getTmt(), LocalDate.now()).getYears();
        return 0.01 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo(){
        // super.printInfo();
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(getTmt()));        
        System.out.println("Jabatan         : Tenaga Pendidik");
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + hitungMasaKerja().getYears() + " tahun " + hitungMasaKerja().getMonths() + " bulan");
        System.out.println("BUP             : " + getBup());
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}