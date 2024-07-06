package PBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    //13. array
    private static Kapal1[] daftarKapal = new Kapal1[3];
    private static int kapalCount = 0;
    // 12. I/O Sederhana
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 11. perulangan
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Kapal");
            System.out.println("2. Tampilkan Hasil Kapal");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            // 10. seleksi
            int pilihan = getInputInt();
            switch (pilihan) {
                case 1:
                    tambahKapal();
                    break;
                case 2:
                    tampilkanKapal();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tambahKapal() {
        if (kapalCount >= daftarKapal.length) {
            System.out.println("Daftar kapal penuh. Tidak dapat menambahkan kapal lagi.");
            return;
        }

        System.out.print("Masukkan jenis kapal (1. Kapal, 2. Kapal Pesiar): ");
        int jenis = getInputInt();
        
        

        System.out.print("Masukkan nama kapal: ");
        String nama = scanner.next();

        System.out.print("Masukkan kecepatan kapal (dalam knot): ");
        int kecepatan = getInputInt();

        System.out.print("Masukkan panjang kapal (dalam meter): ");
        int panjang = getInputInt();

       Kapal1 kapal;
    if (jenis == 1) {
        // 2. object
        kapal = new Kapal1(nama, kecepatan, panjang);
    } else if (jenis == 2) {
        boolean fasilitasMewah;
        while (true) {
            System.out.print("Apakah kapal pesiar memiliki fasilitas mewah? (true/false): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("true")) {
                fasilitasMewah = true;
                break;
            } else if (input.equalsIgnoreCase("false")) {
                fasilitasMewah = false;
                break;
            } else {
                System.out.println("Masukkan harus true atau false.");
            }
        }
        kapal = new KapalPesiar(nama, kecepatan, panjang, fasilitasMewah);
    } else {
        System.out.println("Jenis kapal tidak valid.");
        return;
    }

    daftarKapal[kapalCount] = kapal;
    kapalCount++;
    if (kapalCount == daftarKapal.length) {
        System.out.println("Daftar kapal penuh. Tidak dapat menambahkan kapal lagi.");
    } else {
        System.out.println("Kapal berhasil ditambahkan.");
    }
}

    private static void tampilkanKapal() {
        if (kapalCount == 0) {
            System.out.println("Belum ada kapal yang ditambahkan.");
        } else {
            for (int i = 0; i < kapalCount; i++) {
                System.out.println(daftarKapal[i]);
            }
        }
    }
    // 14. error handling
    private static int getInputInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }
}
