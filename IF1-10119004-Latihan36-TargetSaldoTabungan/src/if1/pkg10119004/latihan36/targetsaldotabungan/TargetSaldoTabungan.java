/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan36.targetsaldotabungan;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan target saldo tabungan
 */
class TargetSaldoTabungan {
    private static Double jumlahBunga;
    private static int lama;
    
    private static double hitungBunga(double bunga, int saldo) {
        jumlahBunga = (bunga / 100) * saldo;
        return jumlahBunga;
    }
    public static void tampilSaldo(double bunga, int saldo, int saldoTarget) {
        lama = 1;
        while(saldo < saldoTarget) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lama+" Rp. %,d%n", saldo);
            lama++;

        }
    }
}
