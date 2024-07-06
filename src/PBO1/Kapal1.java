package PBO1;

public class Kapal1 {
    private String nama;
    private int kecepatan;
    private int panjang;

    public Kapal1(String nama, int kecepatan, int panjang) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    @Override
    public String toString() {
        return "Kapal{" +
                "nama='" + nama + '\'' +
                ", kecepatan=" + kecepatan + " knot" +
                ", panjang=" + panjang + " m" +
                '}';
    }
}
