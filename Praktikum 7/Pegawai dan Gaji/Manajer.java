/*
File    : Manajer.java
Pembuat : Puti Dhiya Salsabila Rahman/24060121140173
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}