/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import com.inventory.model.Model_DetBarangReturn;

/**
 *
 * @author Uhnuy Kozuki
 */
public class TableMod_DetReturn extends AbstractTableModel{
    
    private List<Model_DetBarangReturn> list = new ArrayList<>();
    
    public void tambahData(Model_DetBarangReturn mod_detpesan){
        list.add(mod_detpesan);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, Model_DetBarangReturn mod_detpesan){
        list.add(row, mod_detpesan);
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

    public void setData(List<Model_DetBarangReturn> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_DetBarangReturn mod_detpesan){
        list.set(index, mod_detpesan);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetBarangReturn getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnNames = {"No", "No Return", "Kode Barang", "Nama Barang", "Jumlah Return"};
    
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
                case 1: return list.get(rowIndex).getKode_barang();
                case 2: return list.get(rowIndex).getBarang().getNama_barang();
                case 3: return list.get(rowIndex).getQty();

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
