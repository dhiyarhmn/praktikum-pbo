/*
* Nama File : MPoligon.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 16/03/2023
* Deskripsi : Driver class untuk Limas Segitiga
* Lab		: B1
*/

package org.main;

import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(6,10);
		LimasSegitiga limassegitiga = new LimasSegitiga(segitiga);
		System.out.println("Luas Alas Limas Segitiga adalah : "+limassegitiga.hitungLuasAlas());
		System.out.println("Volume Limas Segitiga adalah : "+limassegitiga.hitungVolume());
	}
}