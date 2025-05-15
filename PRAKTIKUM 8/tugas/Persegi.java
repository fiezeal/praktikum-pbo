/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

// nama file    : Persegi.java
// deskripsi    : program ini berisi atribut dan method class Persegi sebagai BangunDatar
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 11 Mei 2025

public class Persegi extends BangunDatar {
    private final double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return sisi*4;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
