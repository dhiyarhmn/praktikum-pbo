/*
* Nama File : BangunDatar.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
* Lab		: B1
*/

public abstract class BangunDatar {
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double l){
		luas = l;
	}

	public double getLuas() {
		return luas;
	}
}
