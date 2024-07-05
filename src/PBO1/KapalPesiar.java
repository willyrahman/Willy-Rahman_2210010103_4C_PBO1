
package PBO1;

// 1. Kelas
public class KapalPesiar extends Kapal1{
       // 3. Atribut tambahan
    private int kapasitasPenumpang;

    // 4. Konstruktor
    public KapalPesiar(String nama, double kecepatan, double panjang, int kapasitasPenumpang) {
        super(nama, kecepatan, panjang);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // 6. Accessor
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // 5. Mutator
    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        if (kapasitasPenumpang >= 0) { // 14. Penanganan Error
            this.kapasitasPenumpang = kapasitasPenumpang;
        } else {
            System.out.println("Kapasitas penumpang tidak bisa negatif.");
        }
    }

    // 9. Polimorfisme
    @Override
    public void cetakDetil() {
        super.cetakDetil();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}
