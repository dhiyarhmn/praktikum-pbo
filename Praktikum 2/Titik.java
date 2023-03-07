/*
* Nama File : MTitik.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 22/02/2023
* Deskripsi : Kelas yang berisi Titik
* Lab	    : B1
*/

class Titik {
	private Double absis;
	private Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;
	}

	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o){
		ordinat = o;
	}

	public Double getAbsis(){
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik (){
		return counterTitik;
	}
}
