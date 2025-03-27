// nama file    : MRuang.java
// deskripsi    : program ini berisi main class Ruang
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

import java.util.ArrayList;
import java.util.List;

public class MRuang{
    public static void main(String[] args){
        // Membuat objek Departemen
        Departemen informatika = new Departemen("Informatika", "Khadijah S.Kom., M.Cs.");
        // Departemen fisika = new Departemen("Fisika", "Dr. Sri Widayati");

        // Membuat Ruang Departemen
        RuangDepartemen ruangInformatika = new RuangDepartemen(
            "DEPT-001", 10.5, 8.0, 4.0, 50, 
            10, 25, 5, informatika, 3000
        );

        // Membuat Ruang Dosen
        RuangDosen ruangDosenKhadijah = new RuangDosen(
            "DSN-001", 6.0, 4.0, 3.0, 2, 
            "Dr. Budi Santoso", 1, 2, informatika, 2500
        );

        // Membuat Ruang Kelas
        RuangKelas ruangKelas1 = new RuangKelas(
            "KELAS-001", 8.0, 6.0, 3.5, 40, 
            40, 2
        );

        // Membuat Laboratorium Komputer
        LabKomputer labKomputer = new LabKomputer(
            "LAB-001", 12.0, 9.0, 4.0, 30, 
            "Lab Komputer Utama", 5000.0, 2000.0, 30
        );

        // Membuat Laboratorium Non-Komputer
        List<String> matkulBiologi = new ArrayList<>();
        matkulBiologi.add("Biologi Umum");
        matkulBiologi.add("Mikrobiologi");
        LabNonKomputer labBiologi = new LabNonKomputer(
            "LAB-002", 10.0, 8.0, 4.0, 25, 
            "Lab Biologi", 4500.0, 1800.0, matkulBiologi
        );

        // Menampilkan informasi ruangan
        System.out.println("=== Informasi Ruang Departemen ===");
        ruangInformatika.printInfo();
        
        System.out.println("\n=== Informasi Ruang Dosen ===");
        ruangDosenKhadijah.printInfo();
        
        System.out.println("\n=== Informasi Ruang Kelas ===");
        ruangKelas1.printInfo();
        
        System.out.println("\n=== Informasi Laboratorium Komputer ===");
        labKomputer.printInfo();
        
        System.out.println("\n=== Informasi Laboratorium Non-Komputer ===");
        labBiologi.printInfo();

        // Manipulasi data pada Lab Non-Komputer
        System.out.println("\n=== Mata Kuliah Lab Non-Komputer ===");
        labBiologi.tambahMatkulDihandle("Genetika");
        System.out.println("Daftar Mata Kuliah setelah ditambah:");
        for (String matkul : labBiologi.getDaftarMatkulDihandle()) {
            System.out.println(matkul);
        }

        labBiologi.hapusMatkulDihandle("Biologi Umum");
        System.out.println("\nDaftar Mata Kuliah setelah dihapus:");
        for (String matkul : labBiologi.getDaftarMatkulDihandle()) {
            System.out.println(matkul);
        }

        // Perhitungan biaya kebersihan
        System.out.println("\n=== Perhitungan Biaya Kebersihan ===");
        System.out.println("Ruang Departemen  : Rp " + ruangInformatika.hitungBiayaKebersihan());
        System.out.println("Ruang Kelas       : Rp " + ruangKelas1.hitungBiayaKebersihan());
        System.out.println("Lab Komputer      : Rp " + labKomputer.hitungBiayaKebersihan());
    }
}