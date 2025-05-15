/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

// nama file    : BangunDatarGeneric.java
// deskripsi    : program ini berisi konstruksi BangunDatarGeneric
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 8 Mei 2025

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }   
}