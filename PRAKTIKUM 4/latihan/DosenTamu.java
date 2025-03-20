// nama file    : DosenTamu.java
// deskripsi    : program ini berisi class DosenTamu
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNidk(){
        return nidk;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo(){
        // super.printInfo();
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(getTmt()));        
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Akhir Kontrak   : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", getTunjangan()));
    }
}