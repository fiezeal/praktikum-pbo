// nama file    : RuangKelas.java
// deskripsi    : program ini berisi atribut dan method class RuangKelas
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public class RuangKelas extends Ruang{
    // ATRIBUT
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private static final double tarifKebersihan = 2500;

    // METHOD
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    public int getJumlahKursiTersedia(){ 
        return jumlahKursiTersedia; 
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia){ 
        this.jumlahKursiTersedia = jumlahKursiTersedia; 
    }

    public int getJumlahKursiRusak(){ 
        return jumlahKursiRusak; 
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak){ 
        this.jumlahKursiRusak = jumlahKursiRusak; 
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarifKebersihan;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Kursi Tersedia   : " + jumlahKursiTersedia);
        System.out.println("Kursi Rusak      : " + jumlahKursiRusak);
        System.out.println("Biaya Pembersihan: Rp" + hitungBiayaKebersihan());
    }
}