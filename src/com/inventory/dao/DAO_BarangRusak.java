/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_BarangRusak;
import com.inventory.service.Service_BarangRusak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class DAO_BarangRusak implements Service_BarangRusak{

    
    
    private Connection conn;
    
    public DAO_BarangRusak() {
        conn = Koneksi.getConnection();
    }

    
    @Override
    public void tambahData(Model_BarangRusak mod_bar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang_rusak (no_barang_rusak, kode_barang, alasan, qty) VALUES (?,?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_bar.getNo_barang_rusak());
            st.setString(2, mod_bar.getBarang().getKode_barang());
            st.setString(3, mod_bar.getAlasan());
            st.setInt   (4, mod_bar.getStok());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_BarangRusak mod_bar) {
    PreparedStatement st = null;
        String sql = "UPDATE barang_rusak SET qty=?, alasan=? WHERE no_barang_rusak='"+mod_bar.getNo_barang_rusak()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setInt   (1, mod_bar.getStok());
            st.setString(2, mod_bar.getAlasan());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }    
    }

    @Override
    public void hapusData(Model_BarangRusak mod_bar) {
    PreparedStatement st = null;
        String sql = "DELETE FROM barang_rusak WHERE no_barang_rusak=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_bar.getNo_barang_rusak());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }    
    }

    @Override
    public List<Model_BarangRusak> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT br.no_barang_rusak,b.kode_barang,b.nama_barang, br.alasan,br.qty FROM barang_rusak br LEFT JOIN barang b on br.kode_barang = b.kode_barang ";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangRusak bs = new Model_BarangRusak();
                Model_Barang mb = new Model_Barang();
                
                bs.setNo_barang_rusak(rs.getString ("no_barang_rusak"));
                bs.setAlasan      (rs.getString ("alasan"));
                bs.setStok    (rs.getInt("qty"));
                mb.setKode_barang      (rs.getString("kode_barang"));
                mb.setNama_barang      (rs.getString("nama_barang"));
                                
                bs.setBarang(mb);
                list.add(bs);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    
    }

    @Override
    public List<Model_BarangRusak> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT br.no_barang_rusak,b.kode_barang,b.nama_barang, br.alasan,br.qty FROM barang_rusak br LEFT JOIN barang b on br.kode_barang = b.kode_barang WHERE br.no_barang_rusak LIKE '%"+id+"%' OR br.kode_barang LIKE '%"+id+"%' OR br.alasan LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangRusak bs = new Model_BarangRusak();
                Model_Barang mb = new Model_Barang();
                
                bs.setNo_barang_rusak(rs.getString ("no_barang_rusak"));
                bs.setAlasan      (rs.getString ("alasan"));
                bs.setStok    (rs.getInt("qty"));
                mb.setKode_barang      (rs.getString("kode_barang"));
                mb.setNama_barang      (rs.getString("nama_barang"));
                                
                bs.setBarang(mb);
                list.add(bs);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }  
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;

        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(no_barang_rusak, 3) AS Nomor " +
                     "FROM barang_rusak " +
                     "WHERE no_barang_rusak LIKE 'BS" + no + "%' " +
                     "ORDER BY no_barang_rusak DESC " +
                     "LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "BS" + no + String.format("%03d", nomor);
            } else {
                urutan = "BS" + no + "001";
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return urutan;

    }

    @Override
    public void exportToExcel(JTable table, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
