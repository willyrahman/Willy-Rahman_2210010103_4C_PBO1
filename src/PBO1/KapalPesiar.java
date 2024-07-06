package PBO1;

public class KapalPesiar extends Kapal1 {
    private boolean fasilitasMewah;

    public KapalPesiar(String nama, int kecepatan, int panjang, boolean fasilitasMewah) {
        super(nama, kecepatan, panjang);
        this.fasilitasMewah = fasilitasMewah;
    }

    public boolean isFasilitasMewah() {
        return fasilitasMewah;
    }

    public void setFasilitasMewah(boolean fasilitasMewah) {
        this.fasilitasMewah = fasilitasMewah;
    }

    @Override
    public String toString() {
        return "KapalPesiar{" +
                "nama='" + getNama() + '\'' +
                ", kecepatan=" + getKecepatan() + " knot" +
                ", panjang=" + getPanjang() + " m" +
                ", fasilitasMewah=" + fasilitasMewah +
                '}';
    }
}
