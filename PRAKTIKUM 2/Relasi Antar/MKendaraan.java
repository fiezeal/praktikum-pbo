/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MKendaraan.java
deskripsi : berisi atribut dan method dalam class Kendaraan
*/

public class MKendaraan{
    public static void main(String[] args){
        // membuat objek Kendaraan K1, K2
        Kendaraan K1 = new Kendaraan("K 8780 YQ", "Mobil");
        Kendaraan K2 = new Kendaraan("H 2156 YL", "Motor");

        // get
        System.out.println("Plat Nomor      : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K1.getJenis());

        System.out.println("\nPlat Nomor      : " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K2.getJenis());

        // set K1
        K1.setNoPlat("K 3990 TC");

        // Kendaraan K1 setelah di-set
        System.out.println("\nPlat Nomor      : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K1.getJenis());
    }
}
