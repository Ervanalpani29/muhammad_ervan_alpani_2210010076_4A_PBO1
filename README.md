# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KARYAWAN`, `KARYAWANBERSATU`, dan `INFORMASIKARYAWAN` adalah contoh dari class.

```bash
public class KARYAWAN {
    ...
}

public class KARYAWANBERSATU extends Mahasiswa {
    ...
}

public class KARYAWANBERSATU {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kry[i] = new INFORMASIKARYAWAN(nama, npm);` adalah contoh pembuatan object.

```bash
kry[i] = new INFORMASIKARYAWAN (nama, npm);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nomer` adalah contoh atribut.

```bash
String nama;
String nomer;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KARYAWAN` dan `INFORMASIKARYAWAN`.

```bash
public Mahasiswa(String nama, String nomer) {
    this.nama = nama;
    this.npm = nomer;
}

public INFORMASIKARYAWAN(String nama, String nomer) {
    super(nama, nomer);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNomer` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNomer(String nomer) {
    this.nomer = nomer;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNomer`, `getTahunMasuk`, dan`getRuangan`, adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNomer() {
    return nomer;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nomer` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nomer;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class INFORMASIKARYAWAN extends KARYAWAN {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String ruangan) {
    return displayInfo() + "\nruangan: " + ruangan;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
public String getBagian() {
    if(getBagian().substring(2, 4).equals("3")){
        return "service";
    } else {
        return "Bagian lain";
    }

    //return getBagian().substring(2, 4).equals("3") ? "Service" : "bagian lain";
}


```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < karyawan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Karyawan ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Karyawan:");
System.out.println(karyawan.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `INFORMASIKARYAWAN[] mahasiswas = new INFORMASIKARYAWAN[2];` adalah contoh penggunaan array.

```bash
INFORMASIKARYAWAN[] mahasiswas = new INFOMASIKARYAWAN[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
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
| 14  | Error Handling |         |
|     | **TOTAL**      |         |

## Pembuat

Nama: Muhammad Ervan Alpani
NPM: 2210010076
