// nama file    : MPegawai.java
// deskripsi    : program ini berisi class MPegawai
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 13 Maret 2025

import java.time.LocalDate;

public class MPegawai{
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "198203092006041002", "Adi Wibowo", LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 10000000.00, 
            "Fakultas Sains dan Matematika", "0009038204"
        );
        dosenTetap.printInfo();
        
        System.out.println("\n-----------------------------------------------\n");

        DosenTamu dosenTamu = new DosenTamu(
            "199612272024061001", "Henri Tantyoko", LocalDate.of(1994, 2, 9), 
            LocalDate.of(2024, 7, 18), 7000000.00, 
            "Fakultas Teknik", "0030068504", LocalDate.of(2025, 6, 1)
        );
        dosenTamu.printInfo();

        System.out.println("\n-----------------------------------------------\n");

        TenagaPendidik tendik = new TenagaPendidik(
            "H.7.198611152023101001", "Beny Nugroho", LocalDate.of(1991, 6, 12), 
            LocalDate.of(2010, 9, 1), 5000000.00, "Akademik"
        );
        tendik.printInfo();
    }
}
