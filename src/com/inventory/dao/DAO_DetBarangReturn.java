package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_BarangMasuk;
import com.inventory.model.Model_DetBarangMasuk;
import com.inventory.model.Model_DetBarangReturn;
import com.inventory.service.Service_DetBarangMasuk;
import com.inventory.service.Service_DetBarangReturn;

public class DAO_DetBarangReturn implements Service_DetBarangReturn{

    private Connection conn;

    public DAO_DetBarangReturn() {
        conn = Koneksi.getConnection();
    }

    @Override
    public void tambahData(Model_DetBarangReturn mod_detkeluar) {
         PreparedStatement st = null;
        String sql = "INSERT INTO detail_barang_return (no_return, kode_barang, qty) VALUES(?,?,?)";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_detkeluar.getNo_return());
            st.setString(2, mod_detkeluar.getKode_barang());
            st.setInt(3, mod_detkeluar.getQty());
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_DetBarangReturn.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_DetBarangReturn.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public List<Model_DetBarangReturn> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT a.no_return, a.kode_barang, "
                + "brg.nama_barang, brg.harga, brg.satuan, a.qty "
                + "FROM detail_barang_return a "
                + "INNER JOIN barang brg ON brg.kode_barang=a.kode_barang "
                + "WHERE a.no_return='"+id+"' ORDER BY no_return ASC";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Barang brg = new Model_Barang();
                Model_DetBarangReturn dbr = new Model_DetBarangReturn();
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang      (rs.getString ("nama_barang"));
                brg.setHarga            (rs.getLong   ("harga"));
                brg.setSatuan            (rs.getString   ("satuan"));
                dbr.setNo_return(rs.getString("no_return"));
                dbr.setKode_barang(rs.getString("kode_barang"));
                dbr.setQty(rs.getInt("qty"));
                dbr.setBarang(brg);
                
                list.add(dbr);
                
            }
          return list;
         }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DetBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_DetBarangMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public List<Model_DetBarangReturn> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validasiStok(Model_DetBarangReturn mod_detkeluar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}
