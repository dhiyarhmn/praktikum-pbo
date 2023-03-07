/*
* Nama File : OperasiTitik.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 01/03/2023
* Deskripsi : 
* Lab		: B1
*/

class OperasiTitik {
	public void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiSumbuY (Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}