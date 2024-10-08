/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.inventory.service;
import com.inventory.model.Model_Pengangkut;
import java.util.List;
import javax.swing.JTable;
/**
 *
 * @author rifki-alfariz-shidiq
 */
public interface Service_JenisPengangkut {
    void tambahData     (Model_Pengangkut mod_pengangkut);
    void perbaruiData   (Model_Pengangkut mod_pengangkut);
    void hapusData      (Model_Pengangkut mod_pengangkut);
    
    List<Model_Pengangkut> getData();
    List<Model_Pengangkut> pencarian(String id);
    
    String nomor();
    void exportToExcel(JTable table, String filePath);
    boolean validasiNamaPengangkut(Model_Pengangkut mod_jenbar);
    
    List<Model_Pengangkut> getData(int startIndex, int entriesPerPage);
    int getTotalHalaman();
}
