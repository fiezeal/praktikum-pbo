/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

// nama file    : ArrayListTest.java
// deskripsi    : program ini menggunakan objek ArrayList sebagai collection class
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 8 Mei 2025

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s+" ");
        }
    }
}
