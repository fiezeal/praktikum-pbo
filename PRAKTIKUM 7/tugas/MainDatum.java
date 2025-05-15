/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.tugas;

/**
 *
 * @author shopi
 */
public class MainDatum {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Shaki"));
        Datum<Kucing> datumKucing1 = new Datum<>(new Kucing("Rahmat"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Holly"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Toto"));
        
        ContohMetodeGenerik.simulasiPerilaku(datumKucing);
        System.out.println("");
        ContohMetodeGenerik.simulasiPerilaku(datumKucing1);
        System.out.println("");
        ContohMetodeGenerik.simulasiPerilaku(datumAnjing);
        System.out.println("");
        ContohMetodeGenerik.simulasiPerilaku(datumBurung);
        
    }
}
