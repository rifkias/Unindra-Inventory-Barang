/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.tablemodel;

import com.inventory.model.Model_Pengangkut;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class TableMod_Pengangkut extends AbstractTableModel{

    
    Icon iconSukses = new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_checked_50px.png"));
    Icon iconDelete = new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_cancel_50px.png"));
    private final List<Model_Pengangkut> list = new ArrayList<>();
    
    private final String[] columnNames = {"No", "Kode Pengangkut", "Nama Pengangkut"};
    
    public void tambahData(Model_Pengangkut mod_jenbar){
        list.add(mod_jenbar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        //JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan", "Tambah Data", 0, iconSukses);
    }
    
    public void perbaruiData(int row, Model_Pengangkut mod_jenbar){
        list.add(row, mod_jenbar);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        //JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus", "Hapus Data", 0, iconDelete);
    }
    
     public void clear(){
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_Pengangkut> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
     public void setData(int index, Model_Pengangkut mod_jenbar){
        list.set(index, mod_jenbar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Pengangkut getData(int index){
        return list.get(index);
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

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
                    case 0: return list.get(rowIndex).getKode_pengangkut();
                    case 1: return list.get(rowIndex).getNama_pengangkut();
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
