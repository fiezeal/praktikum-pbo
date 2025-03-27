// nama file    : RuangDosen.java
// deskripsi    : program ini berisi atribut dan method class RuangDosen
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public class RuangDosen extends Ruang{
    // ATRIBUT
    private String namaDosen;
    private int jumlahMeja;
    private int jumlahKursi;
    private Departemen departemen;
    private double tarif;

    // METHOD
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahMeja, int jumlahKursi, Departemen departemen, double tarif){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.departemen = departemen;
        this.tarif = tarif;
    }

    public String getNamaDosen(){ 
        return namaDosen; 
    }

    public void setNamaDosen(String namaDosen){ 
        this.namaDosen = namaDosen; 
    }

    public int getJumlahMeja(){ 
        return jumlahMeja; 
    }

    public void setJumlahMeja(int jumlahMeja){ 
        this.jumlahMeja = jumlahMeja; 
    }

    public int getJumlahKursi(){ 
        return jumlahKursi; 
    }

    public void setJumlahKursi(int jumlahKursi){ 
        this.jumlahKursi = jumlahKursi; 
    }

    public Departemen getDepartemen(){ 
        return departemen; 
    }

    public void setDepartemen(Departemen departemen){ 
        this.departemen = departemen; 
    }

    public double getTarif(){
        return this.tarif;
    }

    public void setTarif(double tarif){
        this.tarif = tarif;
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }

    @Override
    public void printInfo(){
        System.out.println("Nama Dosen       : " + this.namaDosen);
        System.out.println("Departemen       : " + departemen.getNama());
        super.printInfo();
        System.out.println("Jumlah Meja      : " + jumlahMeja);
        System.out.println("Jumlah Kursi     : " + jumlahKursi);
        System.out.println("Biaya Kebersihan : Rp. " + hitungBiayaKebersihan());
    }
}