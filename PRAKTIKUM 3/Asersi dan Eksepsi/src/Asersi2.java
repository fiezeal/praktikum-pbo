

import java.util.Scanner;

class Lingkaran{
    // ATRIBUT
    private double jariJari;

    // METHODE
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2{
    public static void main(String[] args){
        // double jariJari = 0;
        // assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
        // Lingkaran l = new Lingkaran(jariJari);
        // double kelilingLingkaran = l.hitungKeliling();
        // System.out.println("Keliling Lingkaran = " + kelilingLingkaran);

        Scanner scan = new Scanner(System.in);
        System.out.println("bang jari-jarinya brapa??? ");
        double jariJari = scan.nextDouble();
        scan.close();

        assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}


// PETANYAAN
// Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

// JAWABAN
// Program Asersi2 punya kelemahan karena menggunakan assert untuk 
// mengecek input. Masalahnya, assert hanya bekerja jika program 
// dijalankan dengan opsi khusus -ea. Kalau tidak, program tetap 
// bisa menerima jari-jari nol atau negatif tanpa ada peringatan.

// Selain itu, program langsung membuat objek Lingkaran tanpa 
// memastikan dulu apakah jari-jari valid. Seharusnya, sebelum 
// membuat objek, program harus mengecek input agar tidak ada nilai 
// yang salah.