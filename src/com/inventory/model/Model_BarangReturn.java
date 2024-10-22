/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.model;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class Model_BarangReturn {

    private String no_return;
    private String no_referensi;
    private String tgl_return;
    private String type;
    private String alasan;
    
    public String getNo_return() {
        return no_return;
    }

    public void setNo_return(String no_return) {
        this.no_return = no_return;
    }

   

    public String getTgl_return() {
        return tgl_return;
    }

    public void setTgl_return(String tgl_return) {
        this.tgl_return = tgl_return;
    }

    public String getNo_referensi() {
        return no_referensi;
    }

    public void setNo_referensi(String no_referensi) {
        this.no_referensi = no_referensi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    
}
