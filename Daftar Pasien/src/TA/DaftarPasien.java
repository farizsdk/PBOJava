/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zephyrusG14
 */
public class DaftarPasien extends javax.swing.JFrame {

    /**
     * Creates new form DaftarPasien
     */
    public DaftarPasien() {
        initComponents();
        tampilData();
    }
    public void tampilData(){
        DefaultTableModel dTable = (DefaultTableModel) tabelPasien.getModel();
        dTable.setRowCount(0);
            for (Pasien attPasien : Data.dataPasien) {
                String data[] = new String[6];
                data[0] = attPasien.getNama();
                data[1] = attPasien.getUmur();
                data[2] = attPasien.getBeratBadan();
                data[3] = attPasien.getKeluhan();
                data[4] = attPasien.getTanggal();
                data[5] = attPasien.getStatus();
                dTable.addRow(data);
            }
            setButton(true);
    }
    public void reset(){
        isiNama.setText("");
        isiUmur.setText("");
        isiBB.setText("");
        isiKeluhan.setText("");
        isiTanggal.setText("");
        
        
    }
    public void tambahData(){
        String nama = isiNama.getText();
        String umur = isiUmur.getText();
        String BB = isiBB.getText();
        String keluhan = isiKeluhan.getText();
        String tanggal = isiTanggal.getText();
        String value=dropDown.getSelectedItem().toString();
        String status = (value);
        if((!nama.equals(""))&&(!umur.equals(""))&&(!BB.equals(""))&&(!keluhan.equals(""))&&(!tanggal.equals(""))&&(!status.equals(""))){   
            Data.dataPasien.addLast(new Pasien(nama, umur, BB, keluhan, tanggal, status));
        }
    }
    
    public void edit(){
        int index = tabelPasien.getSelectedRow();
        isiNama.setText(Data.dataPasien.get(index).getNama());
        isiUmur.setText(Data.dataPasien.get(index).getUmur());
        isiBB.setText(Data.dataPasien.get(index).getBeratBadan());
        isiKeluhan.setText(Data.dataPasien.get(index).getKeluhan());
        isiTanggal.setText(Data.dataPasien.get(index).getTanggal());
        
        setButton(false);
    }
    
    public void updateData(){
        int index = tabelPasien.getSelectedRow();
        Data.dataPasien.get(index).setNama(isiNama.getText());
        Data.dataPasien.get(index).setUmur(isiUmur.getText());
        Data.dataPasien.get(index).setBeratBadan(isiBB.getText());
        Data.dataPasien.get(index).setKeluhan(isiKeluhan.getText());
        Data.dataPasien.get(index).setTanggal(isiTanggal.getText());
        Data.dataPasien.get(index).setStatus(dropDown.getSelectedItem().toString());
        tampilData();
        
    }
    
    /**
     *
     */
    public void hapusData(){
       int getSelectedRow = tabelPasien.getSelectedRow();
       Data.dataPasien.remove(getSelectedRow);
    }
    
    
    public void setButton(boolean baru){
        if(baru){
            Tambah.setEnabled(true);
            Update.setEnabled(false);
            
            
        }else{
            Tambah.setEnabled(false);
            Update.setEnabled(true);
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tambah = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isiNama = new javax.swing.JTextField();
        isiUmur = new javax.swing.JTextField();
        isiBB = new javax.swing.JTextField();
        isiKeluhan = new javax.swing.JTextField();
        isiTanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPasien = new javax.swing.JTable();
        dropDown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        Tambah.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("DAFTAR PASIEN RUMAH SAKIT");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel2.setText("Nama Pasien   ");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel3.setText("Umur Pasien");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel4.setText("Berat Badan Pasien");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel5.setText("Tanggal");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel6.setText("Keluhan Pasien");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel7.setText("Status");

        isiNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiNamaActionPerformed(evt);
            }
        });

        isiUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiUmurActionPerformed(evt);
            }
        });

        isiBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiBBActionPerformed(evt);
            }
        });

        isiKeluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiKeluhanActionPerformed(evt);
            }
        });

        isiTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiTanggalActionPerformed(evt);
            }
        });

        tabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Umur", "Berat Badan", "Keluhan", "Tanggal", "Status"
            }
        ));
        tabelPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPasien);

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mengantri", "Selesai", "Tindakan", "Check Lab" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isiNama)
                                .addGap(337, 337, 337))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dropDown, 0, 155, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(isiTanggal))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(isiKeluhan))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(isiUmur))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tambah))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(isiBB, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tambah)
                    .addComponent(Update))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isiNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiNamaActionPerformed
        
    }//GEN-LAST:event_isiNamaActionPerformed

    private void isiUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiUmurActionPerformed

    private void isiBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiBBActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        tambahData();
        tampilData();
        reset();
    }//GEN-LAST:event_TambahActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        updateData();
        reset();
    }//GEN-LAST:event_UpdateActionPerformed

    private void tabelPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPasienMouseClicked
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_tabelPasienMouseClicked

    private void isiKeluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiKeluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiKeluhanActionPerformed

    private void isiTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiTanggalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DaftarPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JTextField isiBB;
    private javax.swing.JTextField isiKeluhan;
    private javax.swing.JTextField isiNama;
    private javax.swing.JTextField isiTanggal;
    private javax.swing.JTextField isiUmur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPasien;
    // End of variables declaration//GEN-END:variables

    
}