/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.latihanVeryEasy;

public class MainSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 Mengisi Peluru ");
        ak47.setPeluru(5);
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 Menembak");
        ak47.menembak();
    }
}
