/*
* Nama File : MTitik.java 
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 22/02/2023
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
* Lab	    : B1
*/

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();

		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);

		System.out.println("Jumlah objek titik : "+ t1.getCounterTitik());

		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");		
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");		
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");	

		OperasiTitik op = new OperasiTitik();
		op.refleksiSumbuX(t1);
		System.out.println("t1.x setelah refleksi X = " + t1.getAbsis());
		System.out.println("t1.y setelah refleksi X = " + t1.getOrdinat());	
	}

}
