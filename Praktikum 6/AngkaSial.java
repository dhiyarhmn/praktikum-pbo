/*
* Nama File : AngkaSial.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 29/03/2023
* Deskripsi : Program penggunaan exception buatan sendiri
                Pengenalan klausa 'throw' dan 'throws'
* Lab		: B1
*/

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Pertanyaan modul: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Baris ke-12 dan 21 tidak dapat dieksekusi sebab terdapat kebutuhan untuk membuat class exception 
// AngkaSial terlebih dahulu, yang nantinya akan menjadi turunan dari class exception. Dengan demikian, 
// langkah awal yang perlu dilakukan adalah membuat class AngkaSial exception sebelum dapat menjalankan baris tersebut.