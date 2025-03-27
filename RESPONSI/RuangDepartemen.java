// nama file    : RuangDepartemen.java
// deskripsi    : program ini berisi atribut dan method class RuangDepartemen
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public class RuangDepartemen extends Ruang{
    // ATRIBUT
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private Departemen departemen;
    private double tarif;

    // METHOD 
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari, Departemen departemen, double tarif){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.departemen = departemen;
        this.tarif = tarif;
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

    public int getJumlahLemari(){ 
        return jumlahLemari; 
    }

    public void setJumlahLemari(int jumlahLemari){ 
        this.jumlahLemari = jumlahLemari; 
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
        System.out.println("Nama Departemen  : " + departemen.getNama());
        System.out.println("Ketua Departemen : " + departemen.getKetuaDepartemen());
        super.printInfo();
        System.out.println("Jumlah Meja      : " + jumlahMeja);
        System.out.println("Jumlah Kursi     : " + jumlahKursi);
        System.out.println("Jumlah Lemari    : " + jumlahLemari);
        System.out.println("Biaya Kebersihan : Rp" + hitungBiayaKebersihan());
    }
}