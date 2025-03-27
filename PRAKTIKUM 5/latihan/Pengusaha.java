// nama file    : Pengusaha.java
// deskripsi    : program ini berisi atribut dan method class Pengusaha 
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 23 Maret 2025

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tangalMulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, tangalMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
    
    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 1;
    }
    
    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp);
    }
}
