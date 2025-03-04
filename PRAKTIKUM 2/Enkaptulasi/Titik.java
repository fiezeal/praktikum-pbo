/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Shopia Mudjahidah
 * Tanggal   : 20 Februari 2025 
 */

public class Titik {
    /* ATRIBUT */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* METHOD */
    // konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    // }

    // konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // mencetak jumlah titik yang dibuat
    public void printCounterTitik(){
        System.out.println(this.counterTitik);
        // System.out.println(Titik.counterTitik);
    }

    // mengembalikan nilai kuadran titik
    public double getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        return 0;
    }

    // mengembalikan nilai jarak titik dari titik pusat
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // merefleksikan titik terhadap absis sumbu x
    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // merefleksikan titik terhadap sumbu y
    public void refleksiY(){
        absis = absis * (-1);
    }

    // mengembalikan titik yang telah direfleksikan terhadap sumbu x
    public Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdinat() * (-1));
    }

    // mengembalikan titik yang telah direfleksikan terhadap sumbu y
    public Titik getRefleksiY(){
        return new Titik(getAbsis() * (-1), getOrdinat());
    }
} // end class Titik
