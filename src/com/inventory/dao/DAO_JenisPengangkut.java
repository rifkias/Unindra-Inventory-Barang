/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.dao;
import com.inventory.config.Koneksi;
import com.inventory.model.Model_JenisBarang;
import com.inventory.model.Model_Pengangkut;
import com.inventory.service.Service_JenisPengangkut;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class DAO_JenisPengangkut implements Service_JenisPengangkut{
 private Connection conn;
    
    public DAO_JenisPengangkut() {
        conn = Koneksi.getConnection();   
    }    

    @Override
    public void tambahData(Model_Pengangkut mod_pengangkut) {
PreparedStatement st = null;
        String sql = "INSERT INTO pengangkutan(kode_pengangkut,nama_pengangkut) VALUES (?,?)";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengangkut.getKode_pengangkut());
            st.setString(2, mod_pengangkut.getNama_pengangkut());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
            }
        }
    }

    @Override
    public void perbaruiData(Model_Pengangkut mod_pengangkut) {
        PreparedStatement st = null;
        String sql = "UPDATE pengangkutan SET nama_pengangkut=? WHERE kode_pengangkut=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengangkut.getNama_pengangkut());
            st.setString(2, mod_pengangkut.getKode_pengangkut());
            
            st.executeUpdate();
            
        }catch (SQLException ex) {
            Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public void hapusData(Model_Pengangkut mod_pengangkut) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pengangkutan WHERE kode_pengangkut=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengangkut.getKode_pengangkut());
            
            
            st.executeUpdate();
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }

    @Override
    public List<Model_Pengangkut> getData() {
    PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM pengangkutan";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Pengangkut mp = new Model_Pengangkut();
                mp.setKode_pengangkut(rs.getString ("kode_pengangkut"));
                mp.setNama_pengangkut(rs.getString ("nama_pengangkut"));
                
                
                list.add(mp);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }    
    }

    @Override
    public List<Model_Pengangkut> pencarian(String id) {
       PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT * FROM pengangkutan WHERE kode_pengangkut LIKE '%"+id+"%' OR nama_pengangkut LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Pengangkut mokat = new Model_Pengangkut();
                mokat.setKode_pengangkut(rs.getString ("kode_pengangkut"));
                mokat.setNama_pengangkut(rs.getString ("nama_pengangkut"));
                                
                list.add(mokat);
            }
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if (st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        String sql = "SELECT RIGHT(kode_pengangkut,3) AS Nomor FROM pengangkutan ORDER BY Nomor DESC LIMIT 1";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = String.format("MP%03d", nomor);
            } else {
                urutan = "MP001";
            }
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if (st!=null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        return urutan;
    }

    @Override
    public void exportToExcel(JTable table, String filePath) {
        try {
            TableModel model = table.getModel();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Data");

            // Membuat header kolom
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }

            // Membuat data baris
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }

            // Menyimpan file Excel
            FileOutputStream fileOut = new FileOutputStream(new File(filePath));
            workbook.write(fileOut);
            fileOut.close();

            JOptionPane.showMessageDialog(null,"Data berhasil diekspor ke file Excel!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengekspor data ke Excel: " + e.getMessage());
        }
    }


    @Override
    public List<Model_Pengangkut> getData(int startIndex, int entriesPerPage) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM pengangkutan LIMIT ?, ?";
        List<Model_Pengangkut> list = new ArrayList<>();

        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, startIndex);
            st.setInt(2, entriesPerPage);
            rs = st.executeQuery();

            while (rs.next()) {
                Model_Pengangkut mokat = new Model_Pengangkut();
                mokat.setKode_pengangkut(rs.getString ("kode_pengangkut"));
                mokat.setNama_pengangkut(rs.getString ("nama_pengangkut"));
                list.add(mokat);
            }

            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public int getTotalHalaman() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(*) AS total FROM pengangkutan";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public boolean validasiNamaPengangkut(Model_Pengangkut mod_jenbar) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        String sql = "SELECT kode_pengangkut FROM pengangkutan WHERE kode_pengangkut!='"+mod_jenbar.getKode_pengangkut()+"' AND nama_pengangkut LIKE BINARY '"+mod_jenbar.getNama_pengangkut()+"';";
        try{
            st = conn.prepareStatement(sql);
            rs= st.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Nama PengangkutTelah Ada\nSilahkan nama jenis barang yang lain","Peringatan",JOptionPane.WARNING_MESSAGE);
            }else {
                valid=true;
            }
        }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if (st!=null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        java.util.logging.Logger.getLogger(DAO_JenisBarang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        return valid;
    }
}
