/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// nama file    : Kucing.java
// deskripsi    : program ini berisi atribut dan method class Kucing
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 26 April 2025

package praktikum.tugas;

public class Kucing extends Anabul{
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void tampilData(){
        System.out.println("Tipe Anabul: Kucing");
    }

    @Override
    public void bergerak(){
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara meong.");
    }
}