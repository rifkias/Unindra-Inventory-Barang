/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.tablemodel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_BarangRusak;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_BarangRusak extends AbstractTableModel {
    
    private List<Model_BarangRusak> list = new ArrayList<>();
    
    public void tambahData(Model_BarangRusak mod_bar){
        list.add(mod_bar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_BarangRusak mod_bar){
        list.add(row, mod_bar);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_BarangRusak> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_BarangRusak mod_bar){
        list.set(index, mod_bar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_BarangRusak getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "Kode Barang Rusak","Kode Barang","Nama Barang", "Alasan", "Qty"};
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (columnIndex == 0) {
                return "    " + (rowIndex + 1);
            } else {
                switch (columnIndex - 1) {
                    case 0: return list.get(rowIndex).getNo_barang_rusak();
                    case 1: return list.get(rowIndex).getBarang().getKode_barang();
                    case 2: return list.get(rowIndex).getBarang().getNama_barang();
                    case 3: return list.get(rowIndex).getAlasan();
                    case 4: return list.get(rowIndex).getStok();

                    default: return null;
                }
            }
        }
    
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "   " + columnNames[column];
        } else {
            return columnNames[column];
        }
    }
}