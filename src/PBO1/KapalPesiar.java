package PBO1;
//8. inheritance
public class KapalPesiar extends Kapal1 {
    private boolean fasilitasMewah;
    // 4. constructor
    public KapalPesiar(String nama, int kecepatan, int panjang, boolean fasilitasMewah) {
        super(nama, kecepatan, panjang);
        this.fasilitasMewah = fasilitasMewah;
    }
    
    // Getter untuk atribut fasilitasMewah
    public boolean isFasilitasMewah() {
        return fasilitasMewah;
    }
    // Setter untuk atribut fasilitasMewah
    public void setFasilitasMewah(boolean fasilitasMewah) {
        this.fasilitasMewah = fasilitasMewah;
    }

    // 9. Polymorphism  // Override method toString untuk representasi String dari objek KapalPesiar
    public String toString() {
        return "KapalPesiar{" +
                "nama='" + getNama() + '\'' +
                ", kecepatan=" + getKecepatan() + " knot" +
                ", panjang=" + getPanjang() + " m" +
                ", fasilitasMewah=" + fasilitasMewah +
                '}';
    }
}
