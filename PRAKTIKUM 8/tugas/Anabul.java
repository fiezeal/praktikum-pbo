/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// nama file    : Anabul.java
// deskripsi    : program ini berisi atribut dan method abstract class Anabul
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

package tugas;

public abstract class Anabul{
    private String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void bersuara();
    
    public abstract void bergerak();

    public abstract void tampilData();
}