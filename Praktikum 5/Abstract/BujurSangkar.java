/*
* Nama File : BujurSangkar.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi : kelas yang membuat implementasi metode abstrak pada bangun datar
* Lab	    : B1
*/

public class BujurSangkar extends BangunDatar {
	public double hitungLuas(double sisi) {
		luas = sisi * sisi;
		return luas;
	}
}

//Apabila BujurSangkar tidak membuat implementasi metode abstrak pada kelas BangunDatar, maka kelas BujurSangkar harus dijadikan kelas abstrak juga
//Jika tidak dijadikan kelas abstrak maka akan terjadi kesalahan kompilasi dan error 
