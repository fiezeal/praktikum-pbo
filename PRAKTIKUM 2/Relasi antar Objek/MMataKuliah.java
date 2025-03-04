/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MMataKuliah.java
deskripsi : berisi atribut dan method dalam class MataKuliah
*/

public class MMataKuliah{
    public static void main(String[] args){
        // membuat objek MataKuliah MK1, MK2, dan MK3
        MataKuliah StrukDis = new MataKuliah("PAIK6105", "Struktur Diskrit", 4);
        MataKuliah MEP = new MataKuliah("PAIK6603", "Masyarakat dan Etika Profesi", 3);
        MataKuliah BasDat = new MataKuliah("PAIK6303", "Basis Data", 4);

        // get
        // MataKuliah Strukdis
        System.out.println("Id Mata Kuliah   : " + StrukDis.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + StrukDis.getNama());
        System.out.println("Sks              : " + StrukDis.getSks());

        // MataKuliah MEP
        System.out.println("\nId Mata Kuliah   : " + MEP.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + MEP.getNama());
        System.out.println("Sks              : " + MEP.getSks());

        // MataKuliah BasDat
        System.out.println("\nId Mata Kuliah   : " + BasDat.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + BasDat.getNama());
        System.out.println("Sks              : " + BasDat.getSks());

        // set MataKuliah MEP
        MEP.setIdMatKul("PAIK6402");

        // MataKuliah MEP setelah di-set
        System.out.println("\nId Mata Kuliah   : " + MEP.getIdMatKul());
        System.out.println("Nama Mata Kuliah : " + MEP.getNama());
        System.out.println("Sks              : " + MEP.getSks());

        
    }
}
