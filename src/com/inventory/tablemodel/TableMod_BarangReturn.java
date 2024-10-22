/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.tablemodel;

import com.inventory.model.Model_BarangReturn;
import com.inventory.model.Model_BarangRusak;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class TableMod_BarangReturn extends AbstractTableModel{
private List<Model_BarangReturn> list = new ArrayList<>();
    
    public void tambahData(Model_BarangReturn mod_bar){
        list.add(mod_bar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_BarangReturn mod_bar){
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

    public void setData(List<Model_BarangReturn> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_BarangReturn mod_bar){
        list.set(index, mod_bar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_BarangReturn getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No","Kode Barang Return","Tipe", "Kode Referensi","Tanggal Return","Alasan"};
    
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
                    case 0: return list.get(rowIndex).getNo_return();
                    case 1: return list.get(rowIndex).getType();
                    case 2: return list.get(rowIndex).getNo_referensi();
                    case 3: return list.get(rowIndex).getTgl_return();
                    case 4: return list.get(rowIndex).getAlasan();

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
