
package PBO1;

// 1. Kelas
public class Kapal1 {
    // 3. Atribut
    // 7. enkapsulasi
    private String nama;
    private double kecepatan;
    private double panjang;

    // 4. Konstruktor
    public Kapal1(String nama, double kecepatan, double panjang) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }

    // 6. Accessor
    public String getNama() {
        return nama;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public double getPanjang() {
        return panjang;
    }

    // 5. Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKecepatan(double kecepatan) {
        if (kecepatan >= 0) { // 14. Penanganan Error
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak bisa negatif.");
        }
    }

      // Overloading setPanjang dengan tipe parameter int
    public void setPanjang(int panjang) {
        if (panjang >= 0) {
            this.panjang = panjang;
        } else {
            System.out.println("Panjang tidak bisa negatif.");
        }
    }  
    
    public void setPanjang(double panjang) {
        if (panjang >= 0) { // 14. Penanganan Error
            this.panjang = panjang;
        } else {
            System.out.println("Panjang tidak bisa negatif.");
        }
    }

    // 12. IO Sederhana
    public void cetakDetil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Panjang: " + panjang);
    }
}

