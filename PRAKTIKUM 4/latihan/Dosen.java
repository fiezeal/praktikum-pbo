// nama file    : Dosen.java
// deskripsi    : program ini berisi class Dosen
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;

public class Dosen extends Pegawai{
    private String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){ 
        return fakultas; 
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}