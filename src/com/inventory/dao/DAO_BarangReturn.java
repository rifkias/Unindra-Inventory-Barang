/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.Model_BarangReturn;
import com.inventory.service.Service_BarangReturn;
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
import javax.swing.JTable;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class DAO_BarangReturn implements Service_BarangReturn{

    private Connection conn;
    
    public DAO_BarangReturn() {
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void tambahData(Model_BarangReturn mod_return) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang_return (no_return, tgl_return, no_barang_masuk) VALUES (?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_return.getNo_return());
            st.setString(2, mod_return.getTgl_return());
            st.setString(3, mod_return.getNo_barang_masuk());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiStatus(String mod_return) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData(Model_BarangReturn mod_return) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang_return WHERE no_return=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_return.getNo_return());
            st.executeUpdate();
            
//            String sql2 = "DELETE FROM detail_barang_return WHERE no_return=?";
//            try{
//                st = conn.prepareStatement(sql);
//                st.setString(1, mod_return.getNo_return());
//                st.executeUpdate();
//            }catch (SQLException ex) {
//                java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
//            }finally{
//                if (st!=null) {
//                    try {
//                        st.close();
//                    } catch (SQLException ex) {
//                        java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                }
//            }
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_BarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_BarangReturn> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM barang_return";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_BarangReturn mbr = new Model_BarangReturn();
                
                mbr.setNo_return(rs.getString ("no_return"));
                mbr.setNo_barang_masuk(rs.getString ("no_barang_masuk"));
                mbr.setTgl_return(rs.getString("tgl_return"));
                                
                list.add(mbr);
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
    public List<Model_BarangReturn> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;

        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMMdd");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(no_return, 3) AS Nomor " +
                     "FROM barang_return " +
                     "WHERE no_return LIKE 'BRT" + no + "%' " +
                     "ORDER BY no_return DESC " +
                     "LIMIT 1";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "BRT" + no + String.format("%03d", nomor);
            } else {
                urutan = "BRT" + no + "001";
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE, null, ex);
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
