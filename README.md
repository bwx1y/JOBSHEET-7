# JOBSHEET 7

## 2.1.3 Pertanyaan

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
   Percobaan 1!

- Inisialisasi (Initialization)

```
int i = 1;
```
- Kondisi (Condition)

```
i <= 10
```
- Increment/Update

```
i++
```

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
   terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

- double tertinggi = 0, terendah = 100;

tertinggi = 0 digunakan untuk mulai dengan nilai yang sangat kecil (0) agar nilai mahasiswa pertama pun pasti lebih besar atau sama, sehingga bisa diperbarui dengan nilai yang sebenarnya.

terendah = 100 digunakan untuk mulai dengan nilai yang sangat besar (100) agar nilai mahasiswa pertama pun pasti lebih kecil atau sama, sehingga bisa diperbarui dengan nilai yang sebenarnya.

- double tertinggi = 100, terendah = 0;

Jika semua nilai mahasiswa kurang dari 100, maka nilai tertinggi tidak akan pernah diperbarui, sehingga hasil tertinggi tetap 100 padahal tidak ada mahasiswa yang nilainya 100.

Jika semua nilai mahasiswa lebih dari 0, maka nilai terendah tidak akan pernah diperbarui, sehingga hasil terendah tetap 0 padahal tidak ada mahasiswa yang nilainya 0.

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!

Mengecek apakah nilai mahasiswa yang baru diinput lebih besar dari nilai tertinggi saat ini dan Mengecek apakah nilai mahasiswa yang baru diinput lebih kecil dari nilai terendah saat ini.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
   mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
   Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
   dan terendah!

saya menambahkan
```
int lulus = 0, tidak_lulus = 0;

if (nilai>=60) lulus++;
else tidak_lulus++;

System.out.println("Jumlah Mahasiswa lulus: " + lulus);
System.out.println("Jumlah Mahasiswa tidak lulus: " + tidak_lulus);
```

## 2.2.3 Pertanyaan

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:

- nilai < 0 || nilai > 100

di gunakan untuk melakukan validasi hanya nilai antara 0 - 100 saja yang bisa di masukkan

- continue

di gunakan untuk melakukan pelanjutan perulangan / melakukan skip

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?

Setiap kali perulangan selesai memproses satu mahasiswa, baru kita ingin menambah jumlah hitungan mahasiswa. increment dilakukan setelah 1 data selesai diproses, bukan sebelum. ketika i di ubah ke atas Akan terjadi pergeseran nomor mahasiswa, atau bahkan satu mahasiswa tidak diproses.

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?

maka akan di jalan sebanyak 19 kali mulai dari 0 - 18

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

saya menambahkan 
```
System.out.println("Bagus, pertahankan nilainya");
```

## 2.3.3 Pertanyaan

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?

Perulangan dilakukan sebanyak 1 kali.

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!

Kondisi berhenti ditentukan oleh dan inputan yang di inputkan 'batal':
```
if (namaPelanggan.equalsIgnoreCase("batal")) {
    System.out.println("Transaksi dibatalkan.");
    break;
}
```

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?

Nilai true membuat perulangan berjalan terus menerus (infinite loop) sampai ada perintah break di dalam blok yang menghentikannya.

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

Karena perulangan dikontrol oleh kondisi while(true) dan dihentikan secara manual oleh perintah break, bukan oleh variabel penghitung atau kondisi yang berubah.

## 3. Tugas

1. Seorang pengelola bioskop ingin membuat program untuk menghitung total penjualan tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program harus menghitung total tiket yang terjual dan total harga penjualan tiket selama satu hari dengan ketentuan sebagai berikut:

   • Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon 10%.

   • Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon 15%

   • Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input tersebut dan meminta input ulang.

```java
import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi = 12_000, hargaTeh = 7_000, hargaRoti = 20_000, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi* hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp "+ totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
```

2. Sebuah tempat parkir ingin membuat program untuk menghitung total pembayaran parkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam untuk mobil dan Rp 2.000 per jam untuk motor. Namun, jika durasi parkir lebih dari 5 jam, diberikan tarif tetap sebesar Rp 12.500 untuk semua kendaraan. Program akan terus meminta masukan selama input bukan 0. Implementasikan flowchart tersebut ke dalam bentuk kode program Java!

```java
import java.util.Scanner;

public class TempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("Masukan jenis kendaraan : \n1. Mobil \n2. Motor \n0. Keluar");
            System.out.print("Pilihan: ");

            int jenis = sc.nextInt();
            if (jenis == 0) break;

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukan Durasi: ");
                int durasi = sc.nextInt();

                if (durasi > 5) total += 12_500;
                else if (jenis == 1) total += durasi * 3_000;
                else total += durasi * 2_000;
            }
        }

        System.out.printf("Total pembayaran : Rp.%,d %n", total);
        System.out.println("Terimakasih telah menggunakan aplikasi ini");
    }
}
```