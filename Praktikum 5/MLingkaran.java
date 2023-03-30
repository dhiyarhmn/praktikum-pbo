/*
* Nama File : MLingkaran.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
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
