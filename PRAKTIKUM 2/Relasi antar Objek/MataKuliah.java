/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MataKuliah.java
deskripsi : berisi atribut dan method dalam class MataKuliah
*/

public class MataKuliah{
    // ATRIBUT
    private String idMatKul;
    private String nama;
    private int sks;

    // METHOD
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
} // end class MataKuliah