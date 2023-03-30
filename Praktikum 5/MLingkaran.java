/*
* Nama File : MLingkaran.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi : Implementasi dari interface ini harus memiliki cara untuk menghitung luas
* Lab		: B1
*/

import java.util.Scanner;
import org.bangundatar.Lingkaran;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jejer lingkaran: ");
        double jejari = input.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejer " + jejari + " adalah " + lingkaran.hitungLuas());

        input.close();
    }
}