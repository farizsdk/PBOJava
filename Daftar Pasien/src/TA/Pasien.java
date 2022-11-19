/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA;

/**
 *
 * @author zephyrusG14
 */
public class Pasien {

    private String nama;
    private String umur;
    private String beratBadan;
    private String keluhan;
    private String tanggal;
    private String status;
    
    public Pasien(String nama, String umur, String beratBadan, String keluhan, String tanggal, String status){
        this.setNama(nama);
        this.setUmur(umur);
        this.setBeratBadan(beratBadan);
        this.setKeluhan(keluhan);
        this.setTanggal(tanggal);
        this.setStatus(status);
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return this.umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getBeratBadan() {
        return this.beratBadan;
    }

    public void setBeratBadan(String beratBadan) {
        this.beratBadan = beratBadan;
    }
    
    public String getKeluhan() {
        return this.keluhan;
    }
    
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    public String getTanggal() {
        return this.tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String value) {
        this.status = value;
    }
}
