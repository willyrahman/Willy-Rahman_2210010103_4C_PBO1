# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kapal menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, kecepatan dan panjang serta fasilitasMewah, dan memberikan output berupa informasi detail dari kapal tersebut seperti  nama, kecepatan, panjang, dan fasilitasMewah.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kapal1`, `KapalPesiar`, dan `main` adalah contoh dari class.

```bash
public class Kapal1 {
    ...
}

public class KapalPesiar extends Kapal1 {
    ...
}

public class main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kapal = new Kapal1(nama, kecepatan, panjang);
kapal = new KapalPesiar(nama, kecepatan, panjang, fasilitasMewah);` adalah contoh pembuatan object.

```bash
kapal = new Kapal1(nama, kecepatan, panjang);
kapal = new KapalPesiar(nama, kecepatan, panjang, fasilitasMewah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` ,`kecepatan`, `panjang` dan `fasilitasMewah`  adalah contoh atribut.

```bash
    String nama;
    int kecepatan;
    int panjang;
    boolean fasilitasMewah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kapal1` dan `KapalPesiar`.

```bash
   public Kapal1(String nama, int kecepatan, int panjang) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }

    public KapalPesiar(String nama, int kecepatan, int panjang, boolean fasilitasMewah) {
        super(nama, kecepatan, panjang);
        this.fasilitasMewah = fasilitasMewah;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setKecepatan`, `setPanjang` adalah contoh method mutator.

```bash
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setFasilitasMewah(boolean fasilitasMewah) {
        this.fasilitasMewah = fasilitasMewah;
    }
    
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKecepatan`, `getPanjang`, `isFasilitasMewah`, `getProdi` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public int getPanjang() {
        return panjang;
    }

    public boolean isFasilitasMewah() {
        return fasilitasMewah;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut`nama` , `kecepatan`, `panjang`, `fasilitasMewah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    private int kecepatan;
    private int panjang;
    private boolean fasilitasMewah;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class KapalPesiar extends Kapal1 {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `public String toString()` di `Mahasiswa` merupakan overloading method `toString` dan `toString` di `KapalPesiar` merupakan override dari method `toString` di `Kapal1`.

```bash
 public String toString() {
        return "KapalPesiar{" +
                "nama='" + getNama() + '\'' +
                ", kecepatan=" + getKecepatan() + " knot" +
                ", panjang=" + getPanjang() + " m" +
                ", fasilitasMewah=" + fasilitasMewah +
                '}';
    }

@Override
public String toString() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` untuk membuat pilihan dan seleksi `if` untuk membuat pembatasan pada tambah kapal yang sesuai dengan array, seleksi `if else-if switch if else-if else else ` disini untuk menampilkan menu dan meminta input pengguna.

```bash
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

    //return getNpm().substring(2, 4).equals("10") ? "Teknologi Informasi" : "Fakultas lain";
}

if (kapalCount >= daftarKapal.length) {
            System.out.println("Daftar kapal penuh. Tidak dapat menambahkan kapal lagi.");
            return;
        }

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
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` menampilkan menu ,meminta input dan menampilkan Apakah kapal pesiar memiliki fasilitas mewah .

```bash
while (true) {
    ...
}

while (true) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
private static Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama kapal: ");
String nama = scanner.next();
System.out.print("Apakah kapal pesiar memiliki fasilitas mewah? (true/false): ");
String input = scanner.next();
try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }

System.out.print("Masukkan nama kapal: ");
System.out.print("Apakah kapal pesiar memiliki fasilitas mewah? (true/false): ");
System.out.println("Input harus berupa angka.");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Kapal1[] daftarKapal = new Kapal1[3];` adalah contoh penggunaan array.

```bash
private static Kapal1[] daftarKapal = new Kapal1[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` dan `if else` langsung pada pembuatan object untuk menangani error.

```bash
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

try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Willy Rahman
NPM: 2110010103
