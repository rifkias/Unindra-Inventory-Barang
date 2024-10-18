/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.service;

import java.util.List;
import com.inventory.model.Model_DetBarangReturn;

/**
 *
 * @author Uhnuy Kozuki
 */
public interface Service_DetBarangReturn {
    void tambahData (Model_DetBarangReturn mod_detkeluar);

    List<Model_DetBarangReturn> getData(String id);
    List<Model_DetBarangReturn> pencarian(String id);
    
    boolean validasiStok (Model_DetBarangReturn mod_detkeluar);
    
}
