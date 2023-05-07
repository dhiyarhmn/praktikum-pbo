/*
Pembuat : Puti Dhiya Salsabila Rahman
NIM     : 24060121140173
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga) {
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}