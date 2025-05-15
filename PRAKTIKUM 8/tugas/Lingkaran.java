/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

// nama file    : Lingkaran.java
// deskripsi    : program ini berisi atribut dan method class Lingkaran sebagai BangunDatar
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 8 Mei 2025

public class Lingkaran extends BangunDatar{
    private final double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
    
    @Override
    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
}
