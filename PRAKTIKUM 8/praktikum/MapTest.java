/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

// nama file    : MapTest.java
// deskripsi    : program ini menggunakan generic untuk pasangan kunci-nilai
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 8 Mei 2025

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
    }
}
