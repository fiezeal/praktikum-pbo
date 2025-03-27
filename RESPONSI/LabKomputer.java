// nama file    : LabKomputer.java
// deskripsi    : program ini berisi atribut dan method class LabKomputer
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

class LabKomputer extends Laboratorium{
    // ATRIBUT
    private int jumlahKomputer;

    // METHOD
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, double tarif, int jumlahKomputer){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa, tarif);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    public int getJumlahKomputer(){ 
        return jumlahKomputer; 
    }

    public void setJumlahKomputer(int jumlahKomputer){ 
        this.jumlahKomputer = jumlahKomputer; 
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis Lab        : Laboratorium Komputer");
        System.out.println("Jumlah Komputer  : " + jumlahKomputer);
    }
}