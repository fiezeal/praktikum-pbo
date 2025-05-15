/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.latihanMedium;

public class MainSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAk47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);
        
        kontrolAk47.menembak(2);
        kontrolAk47.isiPeluru(3);
        kontrolAk47.menembak(5);
        
        System.out.println("===============================");
        
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
    }
}
