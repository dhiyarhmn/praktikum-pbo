/*
File    : Pegawai.java
Pembuat : Puti Dhiya Salsabila Rahman/24060121140173
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Pegawai {
    String nama;
    int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : "+nama + ", Gaji Pokok : " + gajiPokok);
    }
}