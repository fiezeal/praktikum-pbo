public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

// PERTANYAAN:
// 1. Ketika eksepsi terjadi, apakah pada System.out.println(angka + 
//    "bukan angka sial"); pada AngkaSial.java di atas dieksekusi?
// 2. Apakah pada catch(AngkaSialException ase){ pada AngkaSial.java 
//    di atas dieksekusi?

// JAWABAN:
// 1. Tidak, saat angka 13 dimasukkan, program langsung mengalami 
//    error (exception) dan melompat ke bagian catch. Akibatnya,
//    perintah System.out.println(angka + " bukan angka sial"); 
//    tidak akan dieksekusi, karena program berhenti sebelum 
//    mencapai perintah tersebut.
// 2. Ya, ketika angka 13 dimasukkan, program akan melempar 
//    exception AngkaSialException. Karena program sudah menangani 
//    exception dengan try-catch, maka kode dalam blok catch akan 
//    dieksekusi. Program akan menampilkan pesan kesalahan "Jangan 
//    memasukkan angka 13 karena angka sial!!!", diikuti peringatan 
//    "Hati-hati memasukkan angka!!!".
