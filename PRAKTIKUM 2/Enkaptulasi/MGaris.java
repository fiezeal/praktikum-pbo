/* Nama File : MGaris.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Shopia Mudjahidah
 * Tanggal   : 20 Februari 2025 
 */

public class MGaris {
    public static void main(String[] args){
        Titik T1 = new Titik(10, -3); // membuat objek titik T1 (10, -3)
        Titik T2 = new Titik(6, 2); // membuat objek titik T1 (6, 2)
        
        System.out.println("---------------- Garis G1 -----------------");
        Garis G1 = new Garis(T1, T2); // membuat objek garis G1 dengan titik T1 dan T2
        G1.printGaris(); // menampilkan garis G1 berdasarkan titik awal dan titik akhir
        System.out.println("Garis G1    = ((" + G1.getTitikAwal().getAbsis() + ", " + G1.getTitikAwal().getOrdinat() + "), (" + G1.getTitikAkhir().getAbsis() + ", " + G1.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Panjang Garis = " + G1.getPanjang()); // menampilkan panjang garis G1
        System.out.println("Gradien Garis = " + G1.getGradien()); // menampilkan gradien daris G1
        Titik Tengah = G1.getTitikTengah(); // menampilkan titik tengah garis G1
        System.out.println("Titik Tengah Garis = (" + Tengah.getAbsis() + ", " + Tengah.getOrdinat() + ")");
        System.out.println("\nPersamaan Garis G1 = \n     " + G1.getPersamaan()); // persamaan dari garis G1

        System.out.println("\n---------------- Garis G2 -----------------");
        Garis G2 = new Garis(new Titik(1, 1), new Titik(8, 8)); // membuat objek garis G2
        G2.printGaris(); // menampilkan garis G2 berdasarkan titik awal dan titik akhir
        System.out.println("Garis G2    = ((" + G2.getTitikAwal().getAbsis() + ", " + G2.getTitikAwal().getOrdinat() + "), (" + G2.getTitikAkhir().getAbsis() + ", " + G2.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Panjang Garis = " + G2.getPanjang()); // menampilkan panjang garis G2
        System.out.println("Gradien Garis = " + G2.getGradien()); // menampilkan gradien daris G2
        Titik Tengah1 = G2.getTitikTengah(); // menampilkan titik tengah garis G2
        System.out.println("Titik Tengah Garis = (" + Tengah1.getAbsis() + ", " + Tengah1.getOrdinat() + ")");
        System.out.println("Persamaan Garis G2 = \n     " + G2.getPersamaan()); // persamaan dari garis G2

        System.out.println("\nApakah G1 sejajar dengan G2? " + G1.isSejajar(G2)); // membandingkan apakah garis G1 sejajar dengan garis G2
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2)); // membandingkan apakah garis G1 tegak lurus dengan garis G2

        System.out.println("\n---------------- Garis G3 -----------------");
        Garis G3 = new Garis(new Titik(9, 1), new Titik(7, -5)); // membuat objek garis G3
        G3.printGaris(); // menampilkan garis G2 berdasarkan titik awal dan titik akhir
        System.out.println("Garis G3    = ((" + G3.getTitikAwal().getAbsis() + ", " + G3.getTitikAwal().getOrdinat() + "), (" + G3.getTitikAkhir().getAbsis() + ", " + G3.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Panjang Garis = " + G3.getPanjang()); // menampilkan panjang garis G3
        System.out.println("Gradien Garis = " + G3.getGradien()); // menampilkan gradien daris G3
        Titik Tengah2 = G3.getTitikTengah(); // menampilkan titik tengah garis G3
        System.out.println("Titik Tengah Garis = (" + Tengah2.getAbsis() + ", " + Tengah2.getOrdinat() + ")");
        System.out.println("Persamaan Garis G3 = \n     " + G3.getPersamaan()); // persamaan dari garis G3

        // Mengubah nilai titik awal dan titik akhir pada garis G3
        System.out.println("\nMeng-set nilai pada garis G3");
        G3.setTitikAwal(new Titik(0, -11));
        G3.setTitikAkhir(new Titik(5, -7));
        G3.printGaris();
        System.out.println("Garis G3    = ((" + G3.getTitikAwal().getAbsis() + ", " + G3.getTitikAwal().getOrdinat() + "), (" + G3.getTitikAkhir().getAbsis() + ", " + G3.getTitikAkhir().getOrdinat() + "))");
        
        System.out.println("\nApakah G1 sejajar dengan G3? " + G1.isSejajar(G3)); // membandingkan apakah garis G1 sejajar dengan garis G3
        System.out.println("Apakah G1 tegak lurus dengan G3? " + G1.isTegakLurus(G3)); // membandingkan apakah garis G1 tegak lurus dengan garis G3


        System.out.println("\nJumlah Garis = " + Garis.getCounterGaris());

    }
}
