/*  nama  : shopia mudjahidah
nim       : 24060123120010
tgl       : 27 feb 2025
nama file : Kendaraan.java
deskripsi : berisi atribut dan method dalam class Kendaraan
*/

public class Kendaraan{
    // ATRIBUT
    private String noPlat;
    private String jenis;

    // METHOD
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
} // end class Kendaraan