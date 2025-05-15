/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author shopi
 */
public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> karakterKoleksi = new Koleksi<>();
        
        System.out.println("Menambahkan Koleksi: ");
        karakterKoleksi.add('A');
        karakterKoleksi.add('B');
        karakterKoleksi.add('C');
        karakterKoleksi.add('D');
        karakterKoleksi.add('E');
        
        karakterKoleksi.showAll();
        System.out.println("");

        System.out.println("Ukuran koleksi : " + karakterKoleksi.getSize());
        System.out.println("");

        System.out.println("Menghapus Elemen Terakhir: ");
        System.out.println("Elemen yang Dihapus: " + karakterKoleksi.delete());
        System.out.println("");
        System.out.println("Setelah Penghapusan:");
        karakterKoleksi.showAll();

        System.out.println("\nUkuran Koleksi: " + karakterKoleksi.getSize());
    }    
}
