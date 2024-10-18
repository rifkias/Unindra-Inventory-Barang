/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventory.service;

import com.inventory.model.Model_BarangReturn;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public interface Service_BarangReturn {
    
    void tambahData     (Model_BarangReturn mod_return);
    void perbaruiStatus (String mod_return);
    void hapusData      (Model_BarangReturn mod_return);
    
    
    List<Model_BarangReturn> getData();
    List<Model_BarangReturn> pencarian(String id);
    
    
    String nomor();
    void exportToExcel(JTable table, String filePath);
}
