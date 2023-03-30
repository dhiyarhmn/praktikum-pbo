/*
* Nama File : BangunDatar.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 27/03/2023
* Lab		: B1
*/

package org.bangundatar.BangungDatar;

public abstract class BangunDatar{
	
	protected double luas;
	
	public abstract double hitungLuas (double sisi);
	
	public void setLuas (double a) {
		luas = a;
	}

	public double getLuas (){
		return luas;
	}
}