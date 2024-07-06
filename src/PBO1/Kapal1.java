package PBO1;
// 1. class
public class Kapal1 {
    // 3. atribut
    // 7. Encapsulation 
    private String nama;
    private int kecepatan;
    private int panjang;
     // 4. constructor   
    public Kapal1(String nama, int kecepatan, int panjang) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }
    // 6. accessor
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    // 5. mutator
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // 9.Polymorphism @Override
    public String toString() {
        return "Kapal{" +
                "nama='" + nama + '\'' +
                ", kecepatan=" + kecepatan + " knot" +
                ", panjang=" + panjang + " m" +
                '}';
    }
}
