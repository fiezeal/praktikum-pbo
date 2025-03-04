/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MDosen.java
deskripsi : berisi atribut dan method dalam class Dosen
*/

public class MDosen{
    public static void main(String[] args){
        // membuat objek Dosen D1, D2, dan D3
        Dosen D1 = new Dosen("197605092002121001", "Fikri Puspita Aksin", "Psikologi");
        Dosen D2 = new Dosen("196907061993031001", "Rahmat Anantha", "Akuntansi");

        // get
        // Dosen D1
        System.out.println("Nip   : " + D1.getNip());
        System.out.println("Nama  : " + D1.getNama());
        System.out.println("Prodi : " + D1.getProdi());

        // Dosen D2
        System.out.println("\nNip   : " + D2.getNip());
        System.out.println("Nama  : " + D2.getNama());
        System.out.println("Prodi : " + D2.getProdi());

        
        // set Dosen D1
        D1.setNip("197301021998031003");
        D1.setNama("Kamal Kai");
        D1.setProdi("Manajemen");

        // Dosen D1 setelah di-set
        System.out.println("\nNip   : " + D1.getNip());
        System.out.println("Nama  : " + D1.getNama());
        System.out.println("Prodi : " + D1.getProdi());
    }
}
