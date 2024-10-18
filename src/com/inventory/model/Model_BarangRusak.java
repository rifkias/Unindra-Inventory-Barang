/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.model;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class Model_BarangRusak {
    private String no_barang_rusak;
    private Model_Barang barang;
    private String kode_barang;
    private String alasan;
    private Integer stok;

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }
    public String getNo_barang_rusak() {
        return no_barang_rusak;
    }

    public void setNo_barang_rusak(String no_barang_rusak) {
        this.no_barang_rusak = no_barang_rusak;
    }

    public Model_Barang getBarang() {
        return barang;
    }

    public void setBarang(Model_Barang barang) {
        this.barang = barang;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
