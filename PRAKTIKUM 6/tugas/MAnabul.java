// nama file    : MAnabul.java
// deskripsi    : program ini berisi main class Anabul
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

import java.util.ArrayList;

public class MAnabul{
    public static void main(String[] args){
        Anabul kucing = new Kucing(" Shaki");
        Kucing kucing1 = new Kucing(" Rahmat");
        Anabul anjing = new Anjing(" Holly");
        Anabul burung = new Burung(" Toto");

        ArrayList<Anabul> imuts = new ArrayList<>();
        imuts.add(kucing);
        imuts.add(kucing1);
        imuts.add(anjing);
        imuts.add(burung);

        for(Anabul imut : imuts){
            imut.tampilData();
            imut.bergerak();
            imut.bersuara();
            System.out.println("");
        }
    }
}
