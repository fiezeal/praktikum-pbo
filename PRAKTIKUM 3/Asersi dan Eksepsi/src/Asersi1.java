/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 06 mar 2025
nama file : Asersi1.java
deskripsi : berisi atribut dan method dalam class Asersi1
*/

public class Asersi1{
    public static void main(String[] args){
        int x = 1;
        if(x >= 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

// asersi ga bisa dijalanin langsung, harus lewat terminal untuk compile
// 