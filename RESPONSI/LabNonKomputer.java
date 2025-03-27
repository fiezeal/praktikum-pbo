// nama file    : LabNonKomputer.java
// deskripsi    : program ini berisi atribut dan method class LabNonKomputer
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 27 Maret 2025

import java.util.ArrayList;
import java.util.List;

public class LabNonKomputer extends Laboratorium{
    // ATRIBUT
    private List<String> matkulDihandle;

    // METHOD
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, double tarif, List<String> matkulDihandle){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa, tarif);
        this.matkulDihandle = new ArrayList<>(matkulDihandle);
    }

    public void tambahMatkulDihandle(String mataKuliah){
        if (!matkulDihandle.contains(mataKuliah)) {
            matkulDihandle.add(mataKuliah);
        }
    }

    public void hapusMatkulDihandle(String mataKuliah){
        matkulDihandle.remove(mataKuliah);
    }

    public List<String> getDaftarMatkulDihandle(){
        return new ArrayList<>(matkulDihandle);
    }

    public boolean cekMatkulDihandle(String mataKuliah){
        return matkulDihandle.contains(mataKuliah);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jenis Lab        : Laboratorium Non-Komputer");
        System.out.print("Mata Kuliah yang Dihandle: ");
        if(!matkulDihandle.isEmpty()){
            for (String matkul : matkulDihandle){
                System.out.print(matkul + " ");
            }
            System.out.println();
        } 
        else{
            System.out.println("Tidak ada mata kuliah yang ditangani");
        }
    }
}