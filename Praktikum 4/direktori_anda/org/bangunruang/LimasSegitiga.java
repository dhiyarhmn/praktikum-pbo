/*
* Nama File : LimasSegitiga.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 16/03/2023
* Deskripsi : Representasi dari objek Limas Segitiga, turunan kelas poligon
* Lab		: B1
*/

package org.bangunruang;

import org.bangundatar.Segitiga;

public class LimasSegitiga{
	private Segitiga permukaan;
	
	public LimasSegitiga(Segitiga permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		double tinggi = permukaan.getTinggi();
		return 0.5 * panjangSisi * tinggi * 4;
	}
	
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		double tinggi = permukaan.getTinggi();
		return 0.5 * panjangSisi * tinggi;
	}
}