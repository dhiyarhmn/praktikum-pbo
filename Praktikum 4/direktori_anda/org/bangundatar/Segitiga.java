/*
* Nama File : Segitiga.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 16/03/2023
* Deskripsi : Representasi dari objek Segitiga, turunan kelas poligon
* Lab		: B1
*/

package org.bangundatar; 
 
import org.poligon.Poligon; 

public class Segitiga extends Poligon{
	
	private double PanjangSisi;
	private double Tinggi;
	
		public Segitiga(double panjangSisi, double tinggi){
			this.jumlahSisi = 3;
			this.PanjangSisi = panjangSisi;
			this.Tinggi = tinggi;
		}
		
		public double hitungLuas(){
			return 1/2 * PanjangSisi * Tinggi;
		}
		
		public double getPanjangSisi(){
			return this.PanjangSisi;
		}
		
		public double getTinggi(){
			return this.Tinggi;
		}
}