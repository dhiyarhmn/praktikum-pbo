* Nama File : MBujurSangkar.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
* Lab		: B1
*/

import java.util.Scanner;

class MBujurSangkar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
				" satuan adalah "+bs.hitungLuas(sisi));
	}
}
