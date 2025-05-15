/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

// nama file    : BangunDatarGenericTest.java
// deskripsi    : program ini berisi main class untuk BangunDatarGeneric
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 8 Mei 2025

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe Generic : " + bdg.get().getClass().getName());
        
    }
}
