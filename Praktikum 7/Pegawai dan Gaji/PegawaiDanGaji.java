/*
File    : PegawaiDanGaji.java  
Pembuat : Puti Dhiya Salsabila Rahman/24060121140173
Tanggal : 3 Mei 2023
Lab     : B1
 */

public class PegawaiDanGaji{
  public static void main(String args[]){
    Pegawai pegawai = new Programmer("Mira");
    Pegawai pegawai2 = new Manajer("Joko");
    Pegawai pegawai3 = new Manajer("Argo");

    Payroll payroll = new Payroll();
    payroll.cetakGaji(pegawai);
    payroll.cetakGaji(pegawai2);
    payroll.cetakGaji(pegawai3);
  }
}