/*
File    : Programmer.java  
Pembuat : Puti Dhiya Salsabila Rahman/24060121140173
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}