/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Shopia Mudjahidah
 * Tanggal   : 20 Februari 2025 
 */

public class Garis{
    // ATRIBUT
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // METHOD
    // konstruktor
    // membuat garis
    public Garis(){
        titikAwal = new Titik(0.0, 0.0);
        titikAkhir = new Titik(1.0, 1.0);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // selektor
    // mengembalikan nilai titik awal
    public Titik getTitikAwal(){
        return titikAwal;
    }

    // mengembalikan nilai titik akhir 
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    // mutator
    // mengeset titik awal
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    // mengeset titik akhir
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    // menghitung panjang garis dari dua buah titik
    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // menghitung gradien dari sebuah garis
    public double getGradien(){
        double gradienX = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double gradienY = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return gradienX / gradienY;
    }

    // menghitung titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        double TitikTengahAbsis = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double TitikTengahOrdinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(TitikTengahAbsis, TitikTengahOrdinat);
    }

    // mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean isSejajar(Garis A){
        return this.getGradien() == A.getGradien();
    }

    // mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean isTegakLurus(Garis A){
        return this.getGradien() * A.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir garis
    public void printGaris(){
        System.out.println("Titik Awal  = (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir = (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaan(){
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
