
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.dao.DAO_BarangKeluar;
import com.inventory.dao.DAO_DetBarangKeluar;
import com.inventory.dao.DAO_Laporan;
import com.inventory.dao.DAO_SemBarangKeluar;
import java.util.List;
import javax.swing.JOptionPane;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_BarangKeluar;
import com.inventory.model.Model_DetBarangKeluar;
import com.inventory.model.Model_Pengguna;
import com.inventory.model.Model_SemBarangKeluar;
import com.inventory.service.Service_BarangKeluar;
import com.inventory.service.Service_DetBarangKeluar;
import com.inventory.service.Service_Laporan;
import com.inventory.service.Service_SemBarangKeluar;
import com.inventory.tablemodel.TableMod_BarangKeluar;
import com.inventory.tablemodel.TableMod_DetBarangKeluar;
import com.inventory.tablemodel.TableMod_SemBarangKeluar;
import javax.swing.table.TableColumnModel;


public class Transaksi_BarangKeluar extends javax.swing.JPanel {

    private final Service_BarangKeluar servis_keluar = new DAO_BarangKeluar();
    private final Service_DetBarangKeluar servis_det = new DAO_DetBarangKeluar();
    private final Service_SemBarangKeluar servis_sem = new DAO_SemBarangKeluar();
        
    private TableMod_BarangKeluar tblModel_keluar = new TableMod_BarangKeluar();
    private TableMod_DetBarangKeluar tblModel_det = new TableMod_DetBarangKeluar();
    private TableMod_SemBarangKeluar tblModel_sem = new TableMod_SemBarangKeluar();
    
    private Service_Laporan servis_lap = new DAO_Laporan();
    private String selectedNo;
    
    private String id;
    
    public Transaksi_BarangKeluar(String id) {
        initComponents();
        this.id = id;
        tblData.setModel(tblModel_keluar);       
        tblDataDetail.setModel(tblModel_det);
        tblSementara.setModel(tblModel_sem);
        //setColumnWidth();
        loadData();
        loadDataSementara();
        pnDetail.setVisible(false);
        setColumnWidth();
        setLayoutForm();
    }
    
    private void setLayoutForm(){
        txtCari.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        txtKode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Barang");
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Barang");
        txtSatuan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Satuan");
        txtHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga");
        txtStok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Stok");
        txtJumlah.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jumlah");
        txtSubtotal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Subtotal");
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tblData.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(0).setMaxWidth(50);
        columnModel.getColumn(0).setMinWidth(50);
        
        TableColumnModel columnModelDetail = tblDataDetail.getColumnModel();
        columnModelDetail.getColumn(0).setPreferredWidth(50);
        columnModelDetail.getColumn(0).setMaxWidth(50);
        columnModelDetail.getColumn(0).setMinWidth(50);
        
        TableColumnModel columnModelSementara = tblSementara.getColumnModel();
        columnModelSementara.getColumn(0).setPreferredWidth(50);
        columnModelSementara.getColumn(0).setMaxWidth(50);
        columnModelSementara.getColumn(0).setMinWidth(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lb_id1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnDetail = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDataDetail = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tambahData = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtKode = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        btnBarang = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        lbSatuan = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btnTambahSementara = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSementara = new javax.swing.JTable();
        btnPerbaruiSementara = new javax.swing.JButton();
        btnHapusSementara = new javax.swing.JButton();
        btnBatalSementara = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();
        lbTotalPesan = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel9.setText("Data Barang Keluar");

        lb_id1.setForeground(new java.awt.Color(255, 255, 255));
        lb_id1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id1.setText("ID");

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_search_property_30px_1.png"))); // NOI18N

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setRowHeight(30);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblData);

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel14.setText("Detail Barang Keluar");

        tblDataDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDataDetail.setRowHeight(30);
        tblDataDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataDetailMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDataDetail);

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDetailLayout = new javax.swing.GroupLayout(pnDetail);
        pnDetail.setLayout(pnDetailLayout);
        pnDetailLayout.setHorizontalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDetailLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addComponent(jScrollPane3)
                    .addComponent(pnDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lb_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel10.setText("Tambah Barang Keluar");

        jScrollPane2.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setText("No Transaksi");

        jLabel29.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel29.setText("Tanggal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel30.setText("Kode Barang");

        btnBarang.setText("...");
        btnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel31.setText("Nama Barang");

        lbSatuan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbSatuan.setText("Satuan");

        jLabel33.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel33.setText("Harga");

        jLabel34.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel34.setText("Stok");

        jLabel35.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel35.setText("Jumlah");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel36.setText("Subtotal");

        btnTambahSementara.setText("TAMBAH");
        btnTambahSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahSementaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSatuan)
                    .addComponent(txtHarga)
                    .addComponent(txtStok)
                    .addComponent(txtJumlah)
                    .addComponent(txtSubtotal)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(lbSatuan)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(btnTambahSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSatuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambahSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSementaraMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSementara);

        btnPerbaruiSementara.setText("PERBARUI");
        btnPerbaruiSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiSementaraActionPerformed(evt);
            }
        });

        btnHapusSementara.setText("HAPUS");
        btnHapusSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSementaraActionPerformed(evt);
            }
        });

        btnBatalSementara.setText("BATAL");
        btnBatalSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalSementaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnPerbaruiSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatalSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerbaruiSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatalSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        btnTambah1.setText("TAMBAH");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnBatal1.setText("BATAL");
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        lbTotalPesan.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        lbTotalPesan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTotalPesan.setText("Total Pesan");

        jLabel38.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Total Pesan");

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTotalPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTotalPesan)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card4");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_sementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sementaraMouseClicked
        int row = tblSementara.getSelectedRow();
        
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtHarga.setEnabled(false);
        //txtStok.setEnabled(false);
        txtSubtotal.setEnabled(false);
        
        txtKode.setText(tblSementara.getModel().getValueAt(row, 1).toString());
        txtNama.setText(tblSementara.getModel().getValueAt(row, 2).toString());
        txtSatuan.setText(tblSementara.getModel().getValueAt(row, 3).toString());
        txtHarga.setText(tblSementara.getModel().getValueAt(row, 4).toString());
        txtStok.setText(tblSementara.getModel().getValueAt(row, 5).toString());
        txtJumlah.setText(tblSementara.getModel().getValueAt(row, 6).toString());
        txtSubtotal.setText(tblSementara.getModel().getValueAt(row,7).toString());
        
        txtJumlah.setEnabled(true);
        lbSatuan.setVisible(false);
        txtSatuan.setVisible(false);
        txtStok.setVisible(false);
        btnTambahSementara.setVisible(false);
        btnHapus.setVisible(true);
        
    }//GEN-LAST:event_tbl_sementaraMouseClicked

    private void buttonRounded2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRounded2ActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_buttonRounded2ActionPerformed

    private void btn_hapusSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusSementaraActionPerformed
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
            Model_SemBarangKeluar model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                servis_sem.hapusData(model);
                tblModel_sem.hapusData(index);
                loadDataSementara();
                resetForm();
                bersihBarang();
                lbSatuan.setVisible(true);
                txtSatuan.setVisible(true);
                btnTambahSementara.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
            
        }
        loadDataSementara();
        resetForm();
        bersihBarang();
        lbSatuan.setVisible(true);
        txtSatuan.setVisible(true);
        btnTambahSementara.setVisible(true);
    }//GEN-LAST:event_btn_hapusSementaraActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 1).toString();
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
        btnCetak.setVisible(true);

        pnDetail.setVisible(true);
        List<Model_DetBarangKeluar> list = servis_det.getData(id);
        tblModel_det.setData(list);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        txtNo.setEnabled(false);
        txtTanggal.setEnabled(false);
        
        txtNo.setText(servis_keluar.nomor());
        
        Model_DetBarangKeluar det_masuk = new Model_DetBarangKeluar();
        servis_det.sumTotal(det_masuk);
        lbTotalPesan.setText(det_masuk.getSubtotal_keluar().toString());
        setTanggal();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        int row = tblData.getSelectedRow();
        String no = tblData.getModel().getValueAt(row, 1).toString();
        servis_lap.transaksiBarangKeluar(no);
    }//GEN-LAST:event_btnCetakActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        pencarian();
    }//GEN-LAST:event_txtCariKeyReleased

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 1).toString();
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
        btnCetak.setVisible(true);

        pnDetail.setVisible(true);
        List<Model_DetBarangKeluar> list = servis_det.getData(id);
        tblModel_det.setData(list);
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataDetailMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampilPanel();
        pnDetail.setVisible(false);
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if(btnTambah1.getText().equals("TAMBAH"))
        {
            btnTambah1.setText("SIMPAN");
            //txtKode.setText(servis.nomor());
            
        }
        else if(btnTambah1.getText().equals("SIMPAN"))
        {
            simpanData();
            String no = txtNo.getText();
            //servis_lap.lapSuratPemesananBarang(no);
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnTambahSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahSementaraActionPerformed
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        String satuan = txtSatuan.getText();
        Long harga   = Long.parseLong(txtHarga.getText());
        int stok   = Integer.parseInt(txtStok.getText());
        int jumlah  = Integer.parseInt(txtJumlah.getText());
        Long subtotal = Long.parseLong(txtSubtotal.getText());
        String status = "Sedang di pesan";
        
        Model_Barang brg = new Model_Barang();
        Model_DetBarangKeluar det = new Model_DetBarangKeluar();
        Model_BarangKeluar keluar = new Model_BarangKeluar();
        Model_SemBarangKeluar smt = new Model_SemBarangKeluar();
        
        brg.setKode_barang(kode);
        brg.setNama_barang(nama);
        brg.setSatuan(satuan);
        brg.setHarga(harga);
        brg.setStok(stok);
        
        det.setMod_barang(brg);
        det.setJml_keluar(jumlah);
        det.setSubtotal_keluar(subtotal);
        //psn.setTotal_pesan(tobar);
        
        smt.setMod_barang(brg);
        smt.setMod_detkeluar(det);
        
        if(servis_det.validasiStok(det))
        {
            servis_sem.tambahData(smt);
            servis_det.sumTotal(det);
            lbTotalPesan.setText(det.getSubtotal_keluar().toString());

            loadDataSementara();

            if(JOptionPane.showConfirmDialog(this, "Mau Tambah Barang?",
                    "Konfirmasi",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                aktifBarang();
                bersihBarang();
                btnBarang.requestFocus();

            }else{
                aktifBarang();
                bersihBarang();
            }
        }else{
            txtJumlah.requestFocus();
        }
    }//GEN-LAST:event_btnTambahSementaraActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        boolean closable = true;
        Data_Barang model_bar = new Data_Barang(null, closable);
        model_bar.setVisible(true);

        txtKode.setText    (model_bar.model.getKode_barang());
        txtNama.setText    (model_bar.model.getNama_barang());
        txtSatuan.setText        (model_bar.model.getSatuan());
        txtHarga.setText         (model_bar.model.getHarga().toString());
        txtStok.setText          (model_bar.model.getStok().toString());

        txtJumlah.requestFocus();
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtHarga.setEnabled(false);
        txtStok.setEnabled(false);
        txtSubtotal.setEnabled(false);
    }//GEN-LAST:event_btnBarangActionPerformed

    private void tblSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSementaraMouseClicked
        int row = tblSementara.getSelectedRow();
        
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtHarga.setEnabled(false);
        txtStok.setEnabled(false);
        txtJumlah.setEnabled(true);
        txtSubtotal.setEnabled(false);
        
        txtKode.setText(tblSementara.getModel().getValueAt(row, 1).toString());
        txtNama.setText(tblSementara.getModel().getValueAt(row, 2).toString());
        txtSatuan.setText(tblSementara.getModel().getValueAt(row, 3).toString());
        txtHarga.setText(tblSementara.getModel().getValueAt(row, 4).toString());
        txtStok.setText(tblSementara.getModel().getValueAt(row, 5).toString());
        txtJumlah.setText(tblSementara.getModel().getValueAt(row, 6).toString());
        txtSubtotal.setText(tblSementara.getModel().getValueAt(row, 7).toString());
        
        txtJumlah.requestFocus();
        btnTambahSementara.setVisible(false);
        btnHapusSementara.setVisible(true);
    }//GEN-LAST:event_tblSementaraMouseClicked

    private void btnPerbaruiSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiSementaraActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_btnPerbaruiSementaraActionPerformed

    private void btnHapusSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSementaraActionPerformed
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
            Model_SemBarangKeluar model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                servis_sem.hapusData(model);
                tblModel_sem.hapusData(index);
                loadDataSementara();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
            
        }
        loadDataSementara();
        bersihBarang();
        aktifBarang();
        btnTambahSementara.setVisible(true);
    }//GEN-LAST:event_btnHapusSementaraActionPerformed

    private void btnBatalSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalSementaraActionPerformed
        bersihBarang();
    }//GEN-LAST:event_btnBatalSementaraActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        Long harga, subtotal;
        int jumlah;
        
        harga   = Long.parseLong(txtHarga.getText());
        String inputJumlah = txtJumlah.getText();
        if (inputJumlah.isEmpty()) {
            jumlah = 0;
        } else {
            jumlah = Integer.parseInt(inputJumlah);
        }
        
        
        subtotal = harga * jumlah;
        txtSubtotal.setText(Long.toString(subtotal));
       
        btnTambahSementara.requestFocus();
        txtSubtotal.setEnabled(false);
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // TODO add your handling code here:
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
        // TODO add your handling code here:
        this.getSubTotal();
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void getSubTotal(){
        Long harga, subtotal;
        int jumlah;
        
        harga   = Long.parseLong(txtHarga.getText());
        String inputJumlah = txtJumlah.getText();
        System.out.println(inputJumlah);
        if (inputJumlah.isEmpty()) {
            jumlah = 0;
        } else {
            jumlah = Integer.parseInt(inputJumlah);
        }
        subtotal = harga * jumlah;
        txtSubtotal.setText(Long.toString(subtotal));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarang;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnBatalSementara;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapusSementara;
    private javax.swing.JButton btnPerbaruiSementara;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambahSementara;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbSatuan;
    private javax.swing.JLabel lbTotalPesan;
    private javax.swing.JLabel lb_id1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblSementara;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
    
    private void loadData() {
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        btnCetak.setVisible(false);
        List<Model_BarangKeluar> list = servis_keluar.getData();
        tblModel_keluar.setData(list);
    }

    private void loadDataSementara() {
        List<Model_SemBarangKeluar> list = servis_sem.getData();
        tblModel_sem.setData(list);
    }
    
    private void hapusData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_BarangKeluar brg = tblModel_keluar.getData(tblData.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                servis_keluar.hapusData(brg);
                tblModel_keluar.hapusData(index);
                loadData();
                resetForm();
                pnDetail.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        
        }
    }

    private void resetForm() {
        txtNo.setText("");
        txtTanggal.setText("");
    }
    
    private void aktifBarang() {
        txtKode.setEnabled(true);
        txtNama.setEnabled(true);
        txtSatuan.setEnabled(true);
        txtHarga.setEnabled(true);
        txtStok.setEnabled(true);
        txtJumlah.setEnabled(true);
        txtSubtotal.setEnabled(true);
    }
    
    private void bersihBarang() {
        txtKode.setText("");
        txtNama.setText("");
        txtSatuan.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtJumlah.setText("");
        txtSubtotal.setText("");
    }
    
    private void setTanggal() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        txtTanggal.setText(kal.format(sekarang));
    }

    

    private void tampilPanel() {
        mainPanel.removeAll();
        mainPanel.add(new Transaksi_BarangKeluar(id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void simpanData() {
        
            String no       = txtNo.getText();
            String tgl      = txtTanggal.getText();
            String kode     = txtKode.getText();
            String nama     = txtNama.getText();
            Long total      = Long.parseLong(lbTotalPesan.getText());
            
            Model_Pengguna pgn =  new Model_Pengguna();
            Model_Barang brg = new Model_Barang();
            Model_BarangKeluar keluar = new Model_BarangKeluar();
            Model_DetBarangKeluar det = new Model_DetBarangKeluar();

            //Simpan Tabel Barang Keluar
            keluar.setNo_keluar(no);
            keluar.setTgl_keluar(tgl);
            keluar.setTotal_keluar(total);
            pgn.setId_pengguna(id);
            keluar.setMod_pengguna(pgn);
            
            //Simpan Tabel Detail Barang Keluar
            det.setMod_keluar(keluar);
            det.setMod_barang(brg);

            servis_keluar.tambahData(keluar);
            servis_det.tambahData(det);
            servis_det.hapusSementara(det);
            tblModel_keluar.tambahData(keluar);
            tampilPanel();
            loadData();
            resetForm();
            
        
    }

    private void perbaruiDataSementara() {
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
            Model_SemBarangKeluar model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
             
            
                String kode = txtKode.getText();
                String nama = txtNama.getText();
                String satuan = txtSatuan.getText();
                Long harga   = Long.parseLong(txtHarga.getText());
                int stok   = Integer.parseInt(txtStok.getText());
                int jumlah  = Integer.parseInt(txtJumlah.getText());
                Long subtotal = Long.parseLong(txtSubtotal.getText());
                
                Model_Barang brg = new Model_Barang();
                Model_DetBarangKeluar det = new Model_DetBarangKeluar();
                Model_SemBarangKeluar sem = new Model_SemBarangKeluar();

                brg.setKode_barang(kode);
                brg.setNama_barang(nama);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);
                det.setJml_keluar(jumlah);
                det.setSubtotal_keluar(subtotal);

                sem.setMod_barang(brg);
                sem.setMod_detkeluar(det);

                servis_sem.perbaruiData(sem);
                tblModel_sem.perbaruiData(index, sem);
                servis_det.sumTotal(det);
                lbTotalPesan.setText(det.getSubtotal_keluar().toString());
                loadDataSementara();
                bersihBarang();
                aktifBarang();
                btnTambahSementara.setVisible(true);
                
        }
    }


    private void pencarian() {
        List<Model_BarangKeluar> list = servis_keluar.pencarian(txtCari.getText());
        tblModel_keluar.setData(list);
    }
    
}
