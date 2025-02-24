/* Nama File : MGaris.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Shopia Mudjahidah
 * Tanggal   : 20 Februari 2025 
 */

public class MGaris {
    public static void main(String[] args){
        Titik T1 = new Titik(2, 3); // membuat objek titik T1 (2,2)
        Titik T2 = new Titik(5, 7); // membuat objek titik T1 (2,1)
        
        Garis G1 = new Garis(T1, T2); // membuat objek garis G1 dengan titik T1 dan T2
        G1.printGaris();
        
        System.out.println("Panjang Garis = " + G1.getPanjang());
        System.out.println("Gradien Garis = " + G1.getGradien());
        Titik Tengah = G1.getTitikTengah();
        System.out.println("Titik Tengah Garis = (" + Tengah.getAbsis() + ", " + Tengah.getOrdinat() + ")");

        Garis G2 = new Garis(new Titik(1, 1), new Titik(4, 5));
        System.out.println("\nGaris kedua dibuat = ");
        G2.printGaris();

        System.out.println("Apakah G1 sejajar dengan G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));
        System.out.println("\nPersamaan G1 = \n" + G1.getPersamaan());
        System.out.println("Persamaan G2 = \n" + G2.getPersamaan());
        System.out.println("\nJumlah Garis = " + Garis.getCounterGaris());

    }
}
