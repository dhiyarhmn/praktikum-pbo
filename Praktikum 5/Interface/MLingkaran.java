/*
* Nama File : MLingkaran.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi : Implementasi cara menghitung luas lingkaran
* Lab		: B1
*/

import java.util.Scanner;

public class MLingkaran {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan panjang jari - jari lingkaran : ");
		double jari = scan.nextDouble();
		Lingkaran lr = new Lingkaran(jari);
		System.out.println("Luas lingkaran dengan jejari "+ jari + "satuan adalah : "+lr.hitungLuas());
	}
}
