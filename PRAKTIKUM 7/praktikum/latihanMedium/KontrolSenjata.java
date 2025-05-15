/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.latihanMedium;

public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
        senjata.setPeluru(jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        
        if (senjata.getPeluru() < jumlah) {
            int tersedia = senjata.getPeluru();
            // Tembak sejumlah peluru yang tersedia
            for (int i = 0; i < tersedia; i++) {
                System.out.println("TAR");
            }
            System.out.println("Gagal tembak, Peluru Habis");
            System.out.println("Gagal tembak, Peluru Habis");
            senjata.setPeluru(0);
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
            return;
        }
        
        // Jika peluru cukup, tembak sebanyak jumlah yang diminta
        for (int i = 0; i < jumlah; i++) {
            System.out.println(senjata.getBunyi());
        }
        senjata.setPeluru(senjata.getPeluru() - jumlah);
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb! ";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
}
