/*
* Nama File : BujurSangkar.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 16/03/2023
* Deskripsi : Representasi dari objek Bujur Sangkar, turunan kelas poligon
* Lab		: B1
*/

package org.bangundatar; 
 
import org.poligon.Poligon; 
 
public class BujurSangkar extends Poligon{ 
	private double panjangSisi; 
  
	public BujurSangkar(double panjangSisi){ 
		this.jumlahSisi = 4; 
		this.panjangSisi = panjangSisi; 
	} 
  
	public double hitungLuas(){ 
		return panjangSisi * panjangSisi; 
	} 
  
	public double getPanjangSisi(){ 
		return this.panjangSisi; 
	} 
}