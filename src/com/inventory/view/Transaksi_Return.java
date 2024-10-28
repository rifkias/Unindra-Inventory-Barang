
package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.inventory.dao.DAO_BarangReturn;
import com.inventory.dao.DAO_DetBarangReturn;
import com.inventory.dao.DAO_DetPemesanan;
import com.inventory.dao.DAO_Laporan;
import com.inventory.dao.DAO_Pemesanan;
import com.inventory.dao.DAO_SemPemesanan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.model.Model_Barang;
import com.inventory.model.Model_BarangReturn;
import com.inventory.model.Model_DetBarangReturn;
import com.inventory.model.Model_DetPemesanan;
import com.inventory.model.Model_Distributor;
import com.inventory.model.Model_Pemesanan;
import com.inventory.model.Model_Pengangkut;
import com.inventory.model.Model_Pengguna;
import com.inventory.model.Model_SemPemesanan;
import com.inventory.model.Model_TempDetReturn;
import com.inventory.service.Service_DetPemesanan;
import com.inventory.service.Service_Laporan;
import com.inventory.service.Service_Pemesanan;
import com.inventory.service.Service_SemPemesanan;
import com.inventory.tablemodel.TableMod_DetPemesanan;
import com.inventory.tablemodel.TableMod_Pemesanan;
import com.inventory.tablemodel.TableMod_SemPemesanan;
import com.inventory.service.Service_BarangReturn;
import com.inventory.service.Service_DetBarangReturn;
import com.inventory.tablemodel.TableMod_BarangReturn;
import com.inventory.tablemodel.TableMod_DetReturn;
import com.inventory.tablemodel.TableMod_SemBarangReturn;
import java.util.ArrayList;


public class Transaksi_Return extends javax.swing.JPanel {

//    private Service_Pemesanan servis_psn = new DAO_Pemesanan();
//    private Service_DetPemesanan servis_det = new DAO_DetPemesanan();
//    private Service_SemPemesanan servis_sem = new DAO_SemPemesanan();
    private List<Model_TempDetReturn> listSementara = new ArrayList<>();
    private Service_BarangReturn service_br = new DAO_BarangReturn();
    private Service_DetBarangReturn service_dbr = new DAO_DetBarangReturn();
    
//    private TableMod_Pemesanan tblModel_psn = new TableMod_Pemesanan();
//    private TableMod_DetPemesanan tblModel_det = new TableMod_DetPemesanan();
//    private TableMod_SemPemesanan tblModel_sem = new TableMod_SemPemesanan();
    private TableMod_BarangReturn tblModel_rt = new TableMod_BarangReturn();
    private TableMod_SemBarangReturn tblModel_sem = new TableMod_SemBarangReturn();
    private TableMod_DetReturn tblModel_detRt = new TableMod_DetReturn();
    
    private Service_Laporan servis_lap = new DAO_Laporan();
    private String selectedNo;
    private String id;
    private String type;
    public Transaksi_Return(String id) {
        initComponents();
        this.id = id;
        tblData.setModel(tblModel_rt);    
        tblDataDetail.setModel(tblModel_detRt);
        loadData();
        loadDataSementara();
        pnDetail.setVisible(false);
        setColumnWidth();
        setLayoutForm();
        tblSementara.setModel(tblModel_sem);
    }
    
    private void setLayoutForm(){
        txtCari.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
        txtNo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "No Transaksi");
        txtTanggal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tanggal");
        txtId.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Barang Masuk");
        txtIdKeluar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Barang Keluar");
        txtKode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Kode Barang");
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Barang");
        txtSatuan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Satuan");
        txtHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga");
        txtStok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Stok");
        txtJumlah.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jumlah");
        txtAlasan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Alasan Return");
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
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        pnDetail = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
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
        btnTambahSementara = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtIdKeluar = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDistributor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSementara = new javax.swing.JTable();
        btnPerbarui = new javax.swing.JButton();
        btnHapusSementara = new javax.swing.JButton();
        btnBatal2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlasan = new javax.swing.JTextArea();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel9.setText("Data Barang Return");

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/img/icons8_search_property_30px_1.png"))); // NOI18N

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
        jScrollPane4.setViewportView(tblData);

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel17.setText("Detail Return Barang");

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
        jScrollPane5.setViewportView(tblDataDetail);

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
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnDetailLayout.setVerticalGroup(
            pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane4)
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
                .addGap(26, 26, 26)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel10.setText("Tambah Barang Return");

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
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                        .addComponent(btnBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addComponent(txtSatuan)
                    .addComponent(txtHarga)
                    .addComponent(txtStok)
                    .addComponent(txtJumlah)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(lbSatuan)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambahSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel22.setText("No Barang Keluar");

        btnKeluar.setText("...");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtIdKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(174, 174, 174))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel21.setText("No Barang Masuk");

        btnDistributor.setText("...");
        btnDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistributorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(174, 174, 174))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        jScrollPane6.setViewportView(tblSementara);

        btnPerbarui.setText("PERBARUI");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });

        btnHapusSementara.setText("HAPUS");
        btnHapusSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSementaraActionPerformed(evt);
            }
        });

        btnBatal2.setText("BATAL");
        btnBatal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapusSementara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel24.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel24.setText("Alasan");

        txtAlasan.setColumns(20);
        txtAlasan.setRows(5);
        jScrollPane1.setViewportView(txtAlasan);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
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

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(tambahDataLayout.createSequentialGroup()
                                .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card4");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
        btnCetak.setVisible(true);
        
        pnDetail.setVisible(true);
//        List<Model_DetPemesanan> list = servis_det.getData(id);
//        tblModel_det.setData(list);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void tbl_sementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sementaraMouseClicked
        int row = tblSementara.getSelectedRow();
        
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtHarga.setEnabled(false);
        
        txtKode.setText(tblSementara.getModel().getValueAt(row, 1).toString());
        txtNama.setText(tblSementara.getModel().getValueAt(row, 2).toString());
        txtHarga.setText(tblSementara.getModel().getValueAt(row, 3).toString());
        txtJumlah.setText(tblSementara.getModel().getValueAt(row, 4).toString());
        
        txtJumlah.setEnabled(true);
        lbSatuan.setVisible(false);
        txtSatuan.setVisible(false);
        btnTambahSementara.setVisible(false);
        btnHapus.setVisible(true);
        
    }//GEN-LAST:event_tbl_sementaraMouseClicked

    private void buttonRounded2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRounded2ActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_buttonRounded2ActionPerformed

    private void btn_hapusSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusSementaraActionPerformed
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
//            Model_SemPemesanan model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
//            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
//                servis_sem.hapusData(model);
//                tblModel_sem.hapusData(index);
//                loadDataSementara();
//                resetForm();
//                bersihBarang();
//                lbSatuan.setVisible(true);
//                txtSatuan.setVisible(true);
//                btnTambahSementara.setVisible(true);
//            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
            
        }
        loadDataSementara();
        resetForm();
        bersihBarang();
        
        Model_DetPemesanan det_psn = new Model_DetPemesanan();
//        servis_det.sumTotal(det_psn);
        
        lbSatuan.setVisible(true);
        txtSatuan.setVisible(true);
        btnTambahSementara.setVisible(true);
    }//GEN-LAST:event_btn_hapusSementaraActionPerformed

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
        
        txtNo.setText(service_br.nomor());
        
        setTanggal();
        
//        tblModel_sem.setModel(listSementara);

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
        servis_lap.lapReturnCetak(no);
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
        List<Model_DetBarangReturn> list = service_dbr.getData(id);
        tblModel_detRt.setData(list);
    }//GEN-LAST:event_tblDataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampilPanel();
        pnDetail.setVisible(false);
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        if(txtId.getText().equals("") && txtIdKeluar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih dahulu Data Barang Masuk / Keluar yang akan di return");
        }else{
            boolean closable = true;
            if(type.equals("MASUK")){
                Data_BarangMasukDetail model_bar = new Data_BarangMasukDetail(null, closable,txtId.getText());
                model_bar.setVisible(true);
                txtKode.setText    (model_bar.dbm.getMod_barang().getKode_barang());
                txtNama.setText    (model_bar.dbm.getMod_barang().getNama_barang());
                txtSatuan.setText        (model_bar.dbm.getMod_barang().getSatuan());
                txtHarga.setText         (model_bar.dbm.getMod_barang().getHarga().toString());
                txtStok.setText          (model_bar.dbm.getMod_barang().getStok().toString());

                txtKode.setEnabled(false);
                txtNama.setEnabled(false);
                txtSatuan.setEnabled(false);
                txtHarga.setEnabled(false);
                txtStok.setEnabled(false);
                txtJumlah.requestFocus();
            }else{
                Data_BarangKeluarDetail model_bar = new Data_BarangKeluarDetail(null, closable,txtIdKeluar.getText());
                model_bar.setVisible(true);
                
                txtKode.setText    (model_bar.dbm.getMod_barang().getKode_barang());
                txtNama.setText    (model_bar.dbm.getMod_barang().getNama_barang());
                txtSatuan.setText        (model_bar.dbm.getMod_barang().getSatuan());
                txtHarga.setText         (model_bar.dbm.getMod_barang().getHarga().toString());
                txtStok.setText          (model_bar.dbm.getMod_barang().getStok().toString());

                txtKode.setEnabled(false);
                txtNama.setEnabled(false);
                txtSatuan.setEnabled(false);
                txtHarga.setEnabled(false);
                txtStok.setEnabled(false);
                txtJumlah.requestFocus();
            }
//            txtJumlah.requestFocus();
//            txtKode.setEnabled(false);
//            txtNama.setEnabled(false);
//            txtSatuan.setEnabled(false);
//            txtHarga.setEnabled(false);
//            txtStok.setEnabled(false);
//            txtSubtotal.setEnabled(false);
        }
    }//GEN-LAST:event_btnBarangActionPerformed

    private void btnTambahSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahSementaraActionPerformed
//        Validate 
        if(validateInput()){
            String kode = txtKode.getText();
            String nama = txtNama.getText();
            String satuan = txtSatuan.getText();
            Long harga   = Long.parseLong(txtHarga.getText());
            int stok   = Integer.parseInt(txtStok.getText());
            int jumlah  = Integer.parseInt(txtJumlah.getText());
            
            Model_TempDetReturn mtd = new Model_TempDetReturn();
            Model_Barang brg = new Model_Barang();
            brg.setKode_barang(kode);
            brg.setNama_barang(nama);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);
            
            mtd.setNo_return(txtNo.getText());
            mtd.setKode_barang(kode);
            mtd.setQty(jumlah);
            mtd.setBarang(brg);
             if(JOptionPane.showConfirmDialog(this, "Mau Tambah Barang?", "Konfirmasi",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                listSementara.add(mtd);
                refreshTableSem();
                aktifBarang();
                bersihBarang();
             }
        }
    }//GEN-LAST:event_btnTambahSementaraActionPerformed

    private boolean validateInput(){
        boolean check = true;
        if(txtKode.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Kode Barang tidak boleh kosong");
            check = false;
        }
        
        if(txtJumlah.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah tidak boleh kosong");
            check = false;
        }else{
            if(Integer.valueOf(txtJumlah.getText()) > Integer.valueOf(txtStok.getText())){
                JOptionPane.showMessageDialog(null, "Jumlah tidak boleh lebih dari stok");
            check = false;
            }
        }
        
        
        return check;
    }
    private void btnDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistributorActionPerformed
        boolean closable = true;
        Data_BarangMasuk model_bm = new Data_BarangMasuk(null, closable);
        model_bm.setVisible(true);

        txtId.setText     (model_bm.psn.getNo_masuk());
        txtIdKeluar.setEnabled(false);
        txtId.setEnabled(false);
        txtIdKeluar.setText("");
        btnBarang.setEnabled(true);
        type = "MASUK";
        listSementara = new ArrayList<>();
        
        refreshTableSem();
        
    }//GEN-LAST:event_btnDistributorActionPerformed

    private void tblSementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSementaraMouseClicked
        int row = tblSementara.getSelectedRow();

        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtHarga.setEnabled(false);
        txtStok.setEnabled(false);

        txtKode.setText(tblSementara.getModel().getValueAt(row, 1).toString());
        txtNama.setText(tblSementara.getModel().getValueAt(row, 2).toString());
        txtSatuan.setText(tblSementara.getModel().getValueAt(row, 3).toString());
        txtHarga.setText(tblSementara.getModel().getValueAt(row, 4).toString());
        txtStok.setText(tblSementara.getModel().getValueAt(row, 5).toString());
        txtJumlah.setText(tblSementara.getModel().getValueAt(row, 6).toString());

        txtJumlah.setEnabled(true);
        btnTambahSementara.setVisible(false);
        btnHapus.setVisible(true);
    }//GEN-LAST:event_tblSementaraMouseClicked

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnHapusSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSementaraActionPerformed
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
            Model_TempDetReturn model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
//                servis_sem.hapusData(model);s
                listSementara.remove(index);
                refreshTableSem();
//                loadDataSementara();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        }
        bersihBarang();
    }//GEN-LAST:event_btnHapusSementaraActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if(btnTambah1.getText().equals("TAMBAH"))
        {
            btnTambah1.setText("SIMPAN");
        }
        else if(btnTambah1.getText().equals("SIMPAN"))
        {
            simpanData();
            String no = txtNo.getText();
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        listSementara = new ArrayList<>();
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void btnBatal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal2ActionPerformed
        bersihBarang();
        btnTambahSementara.setVisible(true);
    }//GEN-LAST:event_btnBatal2ActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
        // TODO add your handling code here:
//        this.getSubTotal();
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        boolean closable = true;
        Data_BarangKeluar model_bm = new Data_BarangKeluar(null, closable);
        model_bm.setVisible(true);

        txtIdKeluar.setText     (model_bm.psn.getNo_keluar());
        txtIdKeluar.setEnabled(false);
        txtId.setText("");
        txtId.setEnabled(false);
        btnBarang.setEnabled(true);
        type = "KELUAR";
        listSementara = new ArrayList<>();
        
        refreshTableSem();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void getSubTotal(){
        
    }
    
    private void refreshTableSem(){
        tblModel_sem.setData(listSementara);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarang;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnBatal2;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnDistributor;
    private javax.swing.JButton btnDistributor2;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapusSementara;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambahSementara;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbSatuan;
    private javax.swing.JLabel lb_id1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnDetail;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataDetail;
    private javax.swing.JTable tblSementara;
    private javax.swing.JTextArea txtAlasan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtIdKeluar;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        btnCetak.setVisible(false);
        List<Model_BarangReturn> list = service_br.getData();
        tblModel_rt.setData(list);
//        tblModel_psn.setData(list);
    }

    private void loadDataSementara() {
//        List<Model_SemPemesanan> list = servis_sem.getData();
//        tblModel_sem.setData(list);
    }
    
    private void hapusData() {
        int index = tblData.getSelectedRow();
        if (index!=-1) {
            Model_BarangReturn rt = tblModel_rt.getData(tblData.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
                service_br.hapusData(rt);
                tblModel_rt.hapusData(index);
                loadData();
                resetForm();
//                pnDetail.setVisiblse(false);
pnDetail.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        
        }
    }

    private void resetForm() {
        txtNo.setText("");
        txtTanggal.setText("");
        txtId.setText("");
        txtKode.setText("");
        txtNama.setText("");
        txtSatuan.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtJumlah.setText("");
        btnBarang.setEnabled(false);
    }
    
    private void aktifBarang() {
        txtKode.setEnabled(true);
        txtNama.setEnabled(true);
        txtSatuan.setEnabled(true);
        txtHarga.setEnabled(true);
        txtStok.setEnabled(true);
        txtJumlah.setEnabled(true);
    }
    
    private void bersihBarang() {
        txtKode.setText("");
        txtNama.setText("");
        txtSatuan.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtJumlah.setText("");
    }
    
    private void setTanggal() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        txtTanggal.setText(kal.format(sekarang));
    }

    

    private void tampilPanel() {
        mainPanel.removeAll();
        mainPanel.add(new Transaksi_Return(id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void simpanData() {
        System.out.println(listSementara.size());
        if(!listSementara.isEmpty()){
            String no_return   = txtNo.getText();
            String tgl_return   = txtTanggal.getText();
            String no_referensi   = "";
            if(type.equals("MASUK")){
                no_referensi = txtId.getText();
            }else{
                no_referensi = txtIdKeluar.getText();
            }
            String alasan = txtAlasan.getText();
            
            Model_BarangReturn mbr = new Model_BarangReturn();
            mbr.setNo_return(no_return);
            mbr.setTgl_return(tgl_return);
            mbr.setNo_referensi(no_referensi);
            mbr.setType(type);
            mbr.setAlasan(alasan);
//            mbr.setNo_barang_masuk(no_barang_masuk);
            
            service_br.tambahData(mbr);
            for(int i=0;i<listSementara.size();i++){
                Model_TempDetReturn detReturnTemp = listSementara.get(i);
                Model_DetBarangReturn mod_dbr = new Model_DetBarangReturn();
                mod_dbr.setNo_return(no_return);
                mod_dbr.setKode_barang(detReturnTemp.getKode_barang());
                mod_dbr.setQty(detReturnTemp.getQty());
                service_dbr.tambahData(mod_dbr);
            }
            tblModel_rt.tambahData(mbr);
            tampilPanel();
            loadData();
            resetForm();
        }else{            
            JOptionPane.showMessageDialog(null, "Detail Return Kosong");
        }
        
    }

    private void perbaruiDataSementara() {
        int index = tblSementara.getSelectedRow();
        if (index!=-1) {
            Model_TempDetReturn model = tblModel_sem.getData(tblSementara.convertRowIndexToModel(index));
            if(validateInput()){
                String kode = txtKode.getText();
                String nama = txtNama.getText();
                String satuan = txtSatuan.getText();
                Long harga   = Long.parseLong(txtHarga.getText());
                int stok   = Integer.parseInt(txtStok.getText());
                int jumlah  = Integer.parseInt(txtJumlah.getText());

                Model_TempDetReturn mtd = new Model_TempDetReturn();
                Model_Barang brg = new Model_Barang();
                brg.setKode_barang(kode);
                brg.setNama_barang(nama);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);
                mtd.setNo_return(txtNo.getText());
                mtd.setKode_barang(kode);
                mtd.setQty(jumlah);
                mtd.setBarang(brg);
                
                listSementara.set(index,mtd);
                refreshTableSem();
                aktifBarang();
                bersihBarang();
                btnTambahSementara.setVisible(true);
            }
        }
    }


    private void pencarian() {
//        List<Model_Pemesanan> list = servis_psn.pencarian(txtCari.getText());
//        tblModel_psn.setData(list);
    }
    
}
