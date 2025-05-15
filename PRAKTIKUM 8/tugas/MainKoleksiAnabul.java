/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author shopi
 */
public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();

        koleksiAnabul.add(new Kucing("Shaki"));
        koleksiAnabul.add(new Anjing("Holly"));
        koleksiAnabul.add(new Burung("Toto"));
        koleksiAnabul.add(new Anjing("Gureum"));
        koleksiAnabul.add(new Kucing("Rahmat"));
        koleksiAnabul.add(new Kucing("Axel"));
        koleksiAnabul.add(new Burung("Seagull"));
        koleksiAnabul.add(new Kucing("Suro"));
        koleksiAnabul.add(new Burung("Krisna"));
        koleksiAnabul.add(new Anjing("Yeontan"));

        koleksiAnabul.showAll();
    } 
}
