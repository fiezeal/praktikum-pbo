/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shopi
 */

import java.util.HashMap;
import java.util.Map;

public class MahasiswaLambda {
    public static void main(String[] args) {
        Map<String, String> dataMahasiswa = new HashMap<>();
        Map<String, String> dataMahasiswa2 = new HashMap<>();
        
        // menambahkan data mahasiswa
        dataMahasiswa.put("M010001", "Iris Fatima");
        dataMahasiswa.put("M010002", "Choi Soobin");
        dataMahasiswa.put("M010003", "Lady Gaga");
        dataMahasiswa.put("M010004", "Charli XCX");
        dataMahasiswa.put("M010005", "Erina Maulida");
        
        // menambahkan data mahasiswa2
        dataMahasiswa2.put("M020001", "Shakira Rayhan");
        dataMahasiswa2.put("M020002", "Bella Noir");
        dataMahasiswa2.put("M020003", "Maida Zabrina");
        dataMahasiswa2.put("M020004", "Adrien Freez");
        dataMahasiswa2.put("M020005", "Ilham Virani");
        
        // dengan lambda 
        dataMahasiswa.forEach((nim, nama) -> System.out.println(nim + "\t| " + nama));
        
        System.out.println("");
        
        // dengan lambda dengan blok statement
        dataMahasiswa2.forEach((nim, nama) -> {
            System.out.println(nim + "\t| " + nama);
        });
    }
}
