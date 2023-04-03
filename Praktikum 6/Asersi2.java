/*
* Nama File : Asersi2.java
* Nama      : Puti Dhiya Salsabila Rahman
* NIM       : 24060121140173
* Tanggal   : 29/03/2023
* Deskripsi : Program untuk demo asersi, yang akan menolak input 
                jari-jari lingkaran yang bernilai nol
* Lab		: B1
*/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

// Pertanyaan modul: Ada yang kurang tepat pada program Asersi2 di atas?
// Terdapat kesalahan pada sintaks "jariJari > 0". Seharusnya sintaks yang benar adalah "jariJari != 0" 
// karena dengan menggunakan sintaks "jariJari > 0", nilai negatif pada jari-jari tidak akan dapat dijalankan. 
// Oleh karena itu, tanda yang paling tepat untuk memeriksa nilai jari-jari adalah "jariJari != 0", 
// agar nilai jari-jari yang bukan nol, termasuk nilai negatif, dapat dijalankan.