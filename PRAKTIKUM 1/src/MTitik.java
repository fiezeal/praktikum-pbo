/* Nama File : MTitik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Shopia Mudjahidah
 * Tanggal   : 20 Februari 2025 
 */

public class MTitik {
    public static void main(String[] args){
        // Titik T1 = new Titik(); // membuat objek titik T1 (0,0)
        // Titik T2 = T1;
        // Titik T3 = new Titik(); // membuat objek titik T3 (0,0)
        // Titik T4 = new Titik(3,5); // membuat objek titik T4 (3,5)

        Titik T1 = new Titik(); // membuat objek titik T1 (0,0)
        
        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        
        T1.geser(3,4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        
        // Mengubah nilai T1 dan melihat efeknya pada T2
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Titik T3 = new Titik(); // membuat objek titik T3 (0,0)
        Titik T4 = new Titik(3,5); // membuat objek titik T4 (3,5)
        Titik T5 = new Titik(-4, 5); // membuat objek titik T4 (-4,5)
        Titik T6 = T2.getRefleksiY();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T4.getCounterTitik());

        System.out.println("Nilai Kuadran T4 = " + "" + T4.getKuadran());
        System.out.println("T6 berada di kuadran = " + T5.getKuadran());
        System.out.println("Jarak ke Titik Pusat = " + T5.getJarakPusat());
        T6.printTitik();


    }
}
