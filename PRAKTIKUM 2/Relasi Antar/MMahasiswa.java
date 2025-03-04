/*  nama : shopia mudjahidah
nim  : 24060123120010
tgl  : 27 feb 2025
nama file : MMahasiswa.java
deskripsi : berisi atribut dan method dalam class Mahasiswa
*/

public class MMahasiswa{
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PAIK6401", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("PAIK6403", "Manajemen Basis Data", 3);
        MataKuliah GKV = new MataKuliah("PAIK6404", "Grafika dan Komputasi Visual", 3);
        MataKuliah RPL = new MataKuliah("PAIK6405", "Rekayasa Perangkat Lunak", 3);
        MataKuliah ASA = new MataKuliah("PAIK6601", "Algoritma dan Strategi Algoritma", 3);

        Mahasiswa M1 = new Mahasiswa("24060123120452", "Revagatha Aisyah", "Psikologi");
        Mahasiswa M2 = new Mahasiswa("24060122120400", "David Ramiza", "Informatika");

        Dosen D3 = new Dosen("198001141999031001", "Diandra Anjani", "Informatika");
        Dosen D4 = new Dosen("196611091994031004", "Axel Valentino", "Psikologi");
        // Dosen D5 = new Dosen("197301021998031003", "Ridwan Rifa Namida", "Manajemen");

        Kendaraan K3 = new Kendaraan("G 6207 LN", "Motor");
        Kendaraan K4 = new Kendaraan("A 1626 FF", "Mobil");

        // Mahasiswa W1
        System.out.println("-------- Mahasiswa W1 --------");
        M1.setDosenWali(D4);
        M1.setKendaraan(K3);

        M1.addMatKul(ASA);
        M1.addMatKul(GKV);
        M1.addMatKul(PBO);
        M1.addMatKul(RPL);

        // Menampilkan detail Mahasiswa M1
        M1.printDetailMhs();

        System.out.println("\nJumlah Mata Kuliah     : " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah : " + M1.getJumlahSKS());
        System.out.println("Wali Dosen             : " + M1.getDosenWali().getNama());
        System.out.println("NIP Dosen              : " + M1.getDosenWali().getNip());

        System.out.println("\nKendaraan Mahasiswa    : " + M1.getKendaraan().getJenis());
        System.out.println("Nomor Plat Kendaraan   : " + M1.getKendaraan().getNoPlat());
        
        // Mahasiswa W2
        System.out.println("\n\n-------- Mahasiswa W2 --------");
        M2.setDosenWali(D3);
        M2.setKendaraan(K4);

        M2.addMatKul(ASA);
        M2.addMatKul(GKV);
        M2.addMatKul(MBD);

        // menampilkan Mahassiswa M2
        M2.printMhs();

        // Menampilkan detail Mahasiswa M2
        System.out.println("\n-------- Detail Mahasiswa M2 --------");
        M2.printDetailMhs();

        System.out.println("\nJumlah Mata Kuliah     : " + M2.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah : " + M2.getJumlahSKS());
        System.out.println("Wali Dosen             : " + M2.getDosenWali().getNama());
        System.out.println("NIP Dosen              : " + M2.getDosenWali().getNip());

        System.out.println("\nKendaraan Mahasiswa    : " + M2.getKendaraan().getJenis());
        System.out.println("Nomor Plat Kendaraan   : " + M2.getKendaraan().getNoPlat());
    }
}
