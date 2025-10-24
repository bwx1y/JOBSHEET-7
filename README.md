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