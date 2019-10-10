/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan26.waktusaatini;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Locale;
/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : PBO2
 * Nim      : 10118078
 * Deskripsi Program : Waktu Saat Ini
 */
public class PBO2_10118078_Latihan26_WaktuSaatIni {
    public static void main(String[] args) {
        Date date = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMM Y H:m:s", new Locale ("id"));
        
        String hasil = dateFormat.format(date);
        System.out.println("Hari ini adalah hari : " + hasil);
    }
}
