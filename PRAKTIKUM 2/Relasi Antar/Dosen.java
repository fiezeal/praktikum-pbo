/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MDosen.java
deskripsi : berisi atribut dan method dalam class Dosen
*/

public class Dosen{
    // ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    // METHOD
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
} // end class Dosen