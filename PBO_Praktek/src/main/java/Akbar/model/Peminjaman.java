/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Peminjaman {
    private String kodeanggota;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;

    public Peminjaman() {
        this("");
    }

    public Peminjaman(String string) {
    }
    
    public Peminjaman(String kodeanggota, String kodebuku, String tglpinjam, String tglkembali) {
        this.kodeanggota = kodeanggota;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    
    public long getSelisih() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = format.parse(tglpinjam);
        Date d2 = format.parse(tglkembali);
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000); 
        return diffDays ;
    }
    
}
