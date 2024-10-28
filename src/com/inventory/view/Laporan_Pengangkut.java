package com.inventory.view;

import com.inventory.dao.DAO_Laporan;
import com.inventory.service.Service_Laporan;
import java.text.SimpleDateFormat;

public class Laporan_Pengangkut extends javax.swing.JPanel {

    private final Service_Laporan servis_lap = new DAO_Laporan();
    
    public Laporan_Pengangkut() {
        initComponents();
        pn_main.setVisible(true);
        pn_dataPengangkut.setVisible(false);
        pn_detailPengangkut.setVisible(false);
        pn_perPeriode.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_pilihLaporan = new javax.swing.JPanel();
        cbxLaporan = new javax.swing.JComboBox<>();
        pn_main = new javax.swing.JPanel();
        pn_dataPengangkut = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        pn_detailPengangkut = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCetak1 = new javax.swing.JButton();
        pn_perPeriode = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        t_dateFrom = new javax.swing.JTextField();
        btn_dari = new javax.swing.JButton();
        t_dateAfter = new javax.swing.JTextField();
        btn_sampai = new javax.swing.JButton();
        btnCetakPerPeriode = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        pn_tampilLaporan = new javax.swing.JPanel();

        dateChooser1.setTextRefernce(t_dateFrom);

        dateChooser2.setTextRefernce(t_dateAfter);

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel1.setText("Laporan Pengangkut");

        pn_pilihLaporan.setBackground(new java.awt.Color(255, 255, 255));
        pn_pilihLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxLaporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxLaporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jenis Laporan --", "Laporan Data Pengangkut", "Laporan Detail Pengangkut", "Laporan Pengangkut PerPeriode" }));
        cbxLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLaporanActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(cbxLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        pn_pilihLaporan.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 180));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Laporan Data Pengangkut");

        btnCetak.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dataPengangkutLayout = new javax.swing.GroupLayout(pn_dataPengangkut);
        pn_dataPengangkut.setLayout(pn_dataPengangkutLayout);
        pn_dataPengangkutLayout.setHorizontalGroup(
            pn_dataPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataPengangkutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dataPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(pn_dataPengangkutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_dataPengangkutLayout.setVerticalGroup(
            pn_dataPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataPengangkutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_pilihLaporan.add(pn_dataPengangkut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 160));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Laporan Detail Pengangkut");

        btnCetak1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetak1.setText("CETAK");
        btnCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_detailPengangkutLayout = new javax.swing.GroupLayout(pn_detailPengangkut);
        pn_detailPengangkut.setLayout(pn_detailPengangkutLayout);
        pn_detailPengangkutLayout.setHorizontalGroup(
            pn_detailPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_detailPengangkutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_detailPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_detailPengangkutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_detailPengangkutLayout.setVerticalGroup(
            pn_detailPengangkutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_detailPengangkutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_pilihLaporan.add(pn_detailPengangkut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 160));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pilih Periode Tanggal");

        btn_dari.setText("...");
        btn_dari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dariActionPerformed(evt);
            }
        });

        btn_sampai.setText("...");
        btn_sampai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sampaiActionPerformed(evt);
            }
        });

        btnCetakPerPeriode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetakPerPeriode.setText("CETAK");
        btnCetakPerPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPerPeriodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perPeriodeLayout = new javax.swing.GroupLayout(pn_perPeriode);
        pn_perPeriode.setLayout(pn_perPeriodeLayout);
        pn_perPeriodeLayout.setHorizontalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_dateFrom)
                            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                                .addComponent(t_dateAfter)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_dari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_sampai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCetakPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_perPeriodeLayout.setVerticalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_dateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btn_dari, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_dateAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCetakPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_pilihLaporan.add(pn_perPeriode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 274, 180));

        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        pn_pilihLaporan.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        javax.swing.GroupLayout pn_tampilLaporanLayout = new javax.swing.GroupLayout(pn_tampilLaporan);
        pn_tampilLaporan.setLayout(pn_tampilLaporanLayout);
        pn_tampilLaporanLayout.setHorizontalGroup(
            pn_tampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        pn_tampilLaporanLayout.setVerticalGroup(
            pn_tampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(pn_pilihLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pn_tampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_tampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_pilihLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLaporanActionPerformed
        if(cbxLaporan.getSelectedItem()=="-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_dataPengangkut.setVisible(false);
            pn_detailPengangkut.setVisible(false);
            pn_perPeriode.setVisible(false);
        }else if(cbxLaporan.getSelectedItem()=="Laporan Data Pengangkut"){
            pn_main.setVisible(false);
            pn_dataPengangkut.setVisible(true);
            pn_detailPengangkut.setVisible(false);
            pn_perPeriode.setVisible(false);
        }else if(cbxLaporan.getSelectedItem()=="Laporan Detail Pengangkut"){
            pn_main.setVisible(false);
            pn_dataPengangkut.setVisible(false);
            pn_detailPengangkut.setVisible(true);
            pn_perPeriode.setVisible(false);
        }else if(cbxLaporan.getSelectedItem()=="Laporan Pengangkut PerPeriode"){
            pn_main.setVisible(false);
            pn_dataPengangkut.setVisible(false);
            pn_detailPengangkut.setVisible(false);
            pn_perPeriode.setVisible(true);
        }
    }//GEN-LAST:event_cbxLaporanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new Laporan_Pengangkut());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        pn_tampilLaporan.removeAll();
        servis_lap.lapPengangkut(pn_tampilLaporan);
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetak1ActionPerformed
        pn_tampilLaporan.removeAll();
        servis_lap.lapPengangkutDetail(pn_tampilLaporan);
    }//GEN-LAST:event_btnCetak1ActionPerformed

    private void btn_dariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dariActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btn_dariActionPerformed

    private void btn_sampaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sampaiActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_btn_sampaiActionPerformed

    private void btnCetakPerPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPerPeriodeActionPerformed
        pn_tampilLaporan.removeAll();

        String tgl1 = t_dateFrom.getText();
        String tgl2 = t_dateAfter.getText();

        servis_lap.lapPengangkutPeriode(pn_tampilLaporan,tgl1,tgl2);
    }//GEN-LAST:event_btnCetakPerPeriodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetak1;
    private javax.swing.JButton btnCetakPerPeriode;
    private javax.swing.JButton btn_dari;
    private javax.swing.JButton btn_sampai;
    private javax.swing.JComboBox<String> cbxLaporan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_dataPengangkut;
    private javax.swing.JPanel pn_detailPengangkut;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_perPeriode;
    private javax.swing.JPanel pn_pilihLaporan;
    private javax.swing.JPanel pn_tampilLaporan;
    private javax.swing.JTextField t_dateAfter;
    private javax.swing.JTextField t_dateFrom;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables

    
    
}
