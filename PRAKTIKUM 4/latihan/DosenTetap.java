// nama file    : DosenTetap.java
// deskripsi    : program ini berisi class DosenTetap
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen{
    private String nidn;
    private static final int BUP = 65;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn(){ 
        return nidn; 
    }

    public String getBup(){
        LocalDate bup = getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        return bup.format(formatter);
    }

    public double getTunjangan(){
        int masaKerja = Period.between(getTmt(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(getTmt()));        
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + hitungMasaKerja().getYears() + " tahun " + hitungMasaKerja().getMonths() + " bulan");
        System.out.println("BUP             : " + getBup());
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}