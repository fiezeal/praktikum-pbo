// nama file    : IResize.java
// deskripsi    : program ini berisi interface IResize
// pembuat      : shopia mudjahidah
// nim          : 24060123120010
// tanggal      : 20 Maret 2025

public interface IResize{
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}