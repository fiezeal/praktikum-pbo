/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.tugas;

/**
 *
 * @author shopi
 */
public class ContohMetodeGenerik {
    public static <T extends Anabul> void simulasiPerilaku(Datum<T> datum){
        T anabul = datum.getIsi();
        System.out.println("Simulasi perilaku untuk " + anabul.getNama() + ":");
        anabul.tampilData();
        anabul.bergerak();
        anabul.bersuara();
    }
}