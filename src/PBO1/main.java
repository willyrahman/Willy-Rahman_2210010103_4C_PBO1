
package PBO1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         // 12. I/O Sederhana
        Scanner scanner = new Scanner(System.in);

        // 2. Objek Kapal dan KapalPesiar
        Kapal1 kapal1 = null;
        Kapal1 kapal2 = null;
        Kapal1 kapal3 = null;
        // 14. error handling
        try {
            // Membuat objek Kapal pertama
            System.out.println("Masukkan detil untuk Kapal 1: ");
            System.out.print("Nama: ");
            String nama1 = scanner.nextLine();
            System.out.print("Kecepatan: ");
            double kecepatan1 = scanner.nextDouble();
            System.out.print("Panjang: ");
            double panjang1 = scanner.nextDouble();
            scanner.nextLine(); // Konsumsi newline
            kapal1 = new Kapal1(nama1, kecepatan1, panjang1);

            // Membuat objek Kapal kedua
            System.out.println("Masukkan detil untuk Kapal 2: ");
            System.out.print("Nama: ");
            String nama2 = scanner.nextLine();
            System.out.print("Kecepatan: ");
            double kecepatan2 = scanner.nextDouble();
            System.out.print("Panjang: ");
            double panjang2 = scanner.nextDouble();
            System.out.print("Apakah ingin menambah Kapal ? (true/false): ");
            boolean isKapal2 = scanner.nextBoolean();
            scanner.nextLine(); // Konsumsi newline
            
            // 10. seleksi
            if (isKapal2) {
                System.out.print("Kapasitas Penumpang: ");
                int kapasitasPenumpang2 = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline
                kapal2 = new KapalPesiar(nama2, kecepatan2, panjang2, kapasitasPenumpang2);
            } else {
                kapal2 = new Kapal1(nama2, kecepatan2, panjang2);
            }

            // Membuat objek Kapal ketiga
            System.out.println("Masukkan detil untuk Kapal 3: ");
            System.out.print("Nama: ");
            String nama3 = scanner.nextLine();
            System.out.print("Kecepatan: ");
            double kecepatan3 = scanner.nextDouble();
            System.out.print("Panjang: ");
            double panjang3 = scanner.nextDouble();
            System.out.print("Apakah akan tambah Kapal ? (true/false): ");
            boolean isKapal3 = scanner.nextBoolean();
            scanner.nextLine(); // Konsumsi newline
            // 10. seleksi
            if (isKapal3) {
                System.out.print("Kapasitas Penumpang: ");
                int kapasitasPenumpang3 = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline
                kapal3 = new KapalPesiar(nama3, kecepatan3, panjang3, kapasitasPenumpang3);
            } else {
                kapal3 = new Kapal1(nama3, kecepatan3, panjang3);
            }
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: Input tidak valid. Silakan masukkan data yang benar.");
            scanner.nextLine(); // Kosongkan input buffer
        } catch (NullPointerException e) {
            System.out.println("Kesalahan: Objek tidak terinisialisasi dengan benar.");
        } catch (Exception e) {
            System.out.println("Kesalahan yang tidak terduga terjadi: " + e.getMessage());
        }

        // 13. Array
        Kapal1[] armada = {kapal1, kapal2, kapal3};

        // Menggunakan objek untuk menampilkan detil armada
        System.out.println("\nDetil Armada:");
        // 11. perulangan
        for (Kapal1 kapal : armada) {
            if (kapal != null) {
                kapal.cetakDetil();
                System.out.println(); // Baris kosong untuk pemisah
            } else {
                System.out.println("Detil kapal tidak tersedia.");
            }
        }

        scanner.close();
    }
   
}
