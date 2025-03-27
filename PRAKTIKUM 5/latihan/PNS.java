// nama file    : PNS.java
// deskripsi    : program ini berisi atribut dan method class PNS 
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 23 Maret 2025

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    // ATRIBUT
    private String nip;
    private static int counterPNS = 0;

    // METHOD
    public PNS(){
        counterPNS++;
    }

    public PNS(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                 : " + nip);
    }
}
