/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventory.service;

import com.inventory.model.Model_BarangRusak;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public interface Service_BarangRusak {
    
    void tambahData (Model_BarangRusak mod_bar);
    void perbaruiData (Model_BarangRusak mod_bar);
    void hapusData (Model_BarangRusak mod_bar);
    
    List<Model_BarangRusak> getData();
    List<Model_BarangRusak> pencarian(String id);
    
    String nomor();
    void exportToExcel(JTable table, String filePath);
}
