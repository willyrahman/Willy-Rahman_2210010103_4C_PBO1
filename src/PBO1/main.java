package PBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    private static Kapal1[] daftarKapal = new Kapal1[3];
    private static int kapalCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Kapal");
            System.out.println("2. Tampilkan Hasil Kapal");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

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
            kapal = new Kapal1(nama, kecepatan, panjang);
        } else if (jenis == 2) {
            System.out.print("Apakah kapal pesiar memiliki fasilitas mewah? (true/false): ");
            boolean fasilitasMewah = scanner.nextBoolean();
            kapal = new KapalPesiar(nama, kecepatan, panjang, fasilitasMewah);
        } else {
            System.out.println("Jenis kapal tidak valid.");
            return;
        }

        daftarKapal[kapalCount] = kapal;
        kapalCount++;
        System.out.println("Kapal berhasil ditambahkan.");
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
