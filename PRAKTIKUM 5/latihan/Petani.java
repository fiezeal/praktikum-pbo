// nama file    : Petani.java
// deskripsi    : program ini berisi atribut dan method class Petani 
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 23 Maret 2025

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asal;
    private static int counterPetani = 0;

    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String asal){
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.asal = asal;
        counterPetani++;
    }

    public String getAsal(){
        return asal;
    }

    public void setAsal(String asal){
        this.asal = asal;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal kota           : " + asal);
    }
}