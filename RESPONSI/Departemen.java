// nama file    : Departemen.java
// deskripsi    : program ini berisi atribut dan method class Departemen
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

public class Departemen{
    // ATRIBUT
    private String nama;
    private String ketuaDepartemen;

    // METHOD
    public Departemen(String nama, String ketuaDepartemen){
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public String getNama(){ 
        return nama; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }

    public String getKetuaDepartemen(){ 
        return ketuaDepartemen; 
    }

    public void setKetuaDepartemen(String ketuaDepartemen){ 
        this.ketuaDepartemen = ketuaDepartemen; 
    }

    public void printInfo(){
        System.out.println("Nama Departemen  : " + nama);
        System.out.println("Ketua Departemen : " + ketuaDepartemen);
    }
}