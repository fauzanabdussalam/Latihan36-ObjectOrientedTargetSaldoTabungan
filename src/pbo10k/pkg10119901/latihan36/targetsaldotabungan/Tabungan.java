/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan36.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author User
 */
public class Tabungan 
{
    public static void hitungSaldo(double saldoAwal, double saldoTarget, int bunga)
    {
        int i = 1;
        String saldoString;
        
        DecimalFormat kursIndonesia     = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp   = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        while (saldoAwal < saldoTarget) 
        {
            saldoAwal   = saldoAwal + (saldoAwal * bunga / 100);
            saldoString = String.format("%s", kursIndonesia.format(saldoAwal));
            saldoString = saldoString.substring(0, saldoString.length() - 3);

            System.out.println("Saldo di bulan ke-" + i + " " + saldoString);

            i++;
        }
    }
}
