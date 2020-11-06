/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menghitung Target Saldo Tabungan
 *
 */
public class PBO10K10119901Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tbg = new Tabungan();
        
        double saldoAwal = 3500000, saldoTarget = 6000000;
        int bunga = 8;
        
        tbg.hitungSaldo(saldoAwal, saldoTarget, bunga);
    }
    
}
