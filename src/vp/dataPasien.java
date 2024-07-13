/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vp;

import helper.database;
import helper.reset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author afgha
 */
public class dataPasien extends javax.swing.JFrame {
    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset rst = new reset();
    String table = "pasien";
    String[] columns = {"nik","nama","jk","alamat","no_hp","goldar","tempat","tgl_lahir","status","jpenanganan"};
    public dataPasien() {
        initComponents();
        datatable();
    }
    
     protected void datatable(){
         Object[] Baris = {"nik","nama","jk","alamat","no_hp","goldar","tempat","tgl_lahir","status","jpenanganan"};
        tabmode  = new DefaultTableModel(null, Baris);
        tPasien.setModel(tabmode);
        String sql = "select * from pasien";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("nik");
                String b= res.getString("nama");
                String d= res.getString("jk");
                String e = res.getString("alamat");
                String f = res.getString("no_hp");
                String g = res.getString("goldar");
                String h = res.getString("tempat");
                String i = res.getString("tgl_lahir");
                String j = res.getString("status");
                String k = res.getString("jpenanganan");
                String[] data = {a,b,d,e,f,g,h,i,j,k};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgPembayaran = new javax.swing.ButtonGroup();
        statusGroup = new javax.swing.ButtonGroup();
        penangananGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tNamaPasien = new javax.swing.JTextField();
        tNik = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPasien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tNoHP = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        bCetak = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tJK = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        tTglLahir = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        tK = new javax.swing.JRadioButton();
        tBK = new javax.swing.JRadioButton();
        tTempat = new javax.swing.JTextField();
        tGoldar = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbrawatinap = new javax.swing.JRadioButton();
        cbrawatjalan = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Pasien");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(601, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(308, 308, 308))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setText("Nama Pasien");

        jLabel5.setText("NIK");

        jLabel8.setText("Alamat");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        tPasien.setModel(new javax.swing.table.DefaultTableModel(
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
        tPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPasienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tPasien);

        jLabel6.setText("No HP");

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane4.setViewportView(tAlamat);

        bCetak.setText("Cetak");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });

        jLabel15.setText("Jenis Kelamin");

        tJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Pilih Jenis Kelamin==", "Laki-Laki", "Perempuan" }));

        jLabel16.setText("Tempat, Tanggal Lahir");

        jLabel17.setText("Status");

        statusGroup.add(tK);
        tK.setText("Kawin");
        tK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKActionPerformed(evt);
            }
        });

        statusGroup.add(tBK);
        tBK.setText("Belum Kawin");

        tGoldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Pilih Goldar==", "A", "AB", "B", "O", " " }));
        tGoldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGoldarActionPerformed(evt);
            }
        });

        jLabel18.setText("Goldar");

        jLabel2.setText("Jenis Penanganan");

        penangananGroup.add(cbrawatinap);
        cbrawatinap.setText("Rawat Inap");
        cbrawatinap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrawatinapActionPerformed(evt);
            }
        });

        penangananGroup.add(cbrawatjalan);
        cbrawatjalan.setText("Rawat Jalan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 1062, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tK)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tBK))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tTempat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tGoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbrawatinap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbrawatjalan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bEdit)
                                .addGap(18, 18, 18)
                                .addComponent(bHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCetak)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit)
                            .addComponent(bReset)
                            .addComponent(bHapus)
                            .addComponent(bCetak)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tGoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(tTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tK)
                                .addComponent(tBK)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbrawatinap)
                                .addComponent(cbrawatjalan)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void reset(){
        rst.resetTextFields(this.getContentPane());
        statusGroup.clearSelection();
        penangananGroup.clearSelection();
        tAlamat.setText("");
    }
    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
       String nik = tNik.getText();
       String nama_pasien = tNamaPasien.getText();
       String jk = tJK.getSelectedItem().toString();
       String alamat = tAlamat.getText();
       String no_hp  = tNoHP.getText();
       String goldar= tGoldar.getSelectedItem().toString();
       String tempat = tTempat.getText();
       String status = null;
//       java.sql.Date tgld = new java.sql.Date(tanggalDokter.getDate().getTime());
       java.sql.Date tgl_lahir = new java.sql.Date(tTglLahir.getDate().getTime());
       if(tK.isSelected()){
           status = "Kawin";
       }else if (tBK.isSelected()){
           status = "Belum Kawin";
       }
       String jpenanganan = null;
       if(cbrawatinap.isSelected()){
           jpenanganan = "Rawat Inap";
       } else if(cbrawatjalan.isSelected()){
           jpenanganan = "Rawat Jalan";
       }
       Object[] values = {nik,nama_pasien,jk,alamat,no_hp,goldar,tempat,tgl_lahir,status,jpenanganan};
       try{
           if(tJK.getSelectedIndex() == 0  || tGoldar.getSelectedIndex() == 0 ){
                JOptionPane.showMessageDialog(null, "Data masih ada yang belum dipilih.");
           }else{
               db.insertData(conn, "pasien", columns, values);
                datatable();
                reset();
           }
           
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
       String nik = tNik.getText();
       String nama_pasien = tNamaPasien.getText();
       String alamat = tAlamat.getText();
       String no_hp  = tNoHP.getText();
       String goldar= tGoldar.getSelectedItem().toString();
       String tempat = tTempat.getText();
       String jk = tJK.getSelectedItem().toString();
       
       String status = null;
       java.sql.Date tgl_lahir = new java.sql.Date(tTglLahir.getDate().getTime());
       if(tK.isSelected()){
           status = "Kawin";
       }else if (tBK.isSelected()){
           status = "Belum Kawin";
       }
       String jpenanganan = null;
       if(cbrawatinap.isSelected()){
           jpenanganan = "Rawat Inap";
       } else if(cbrawatjalan.isSelected()){
           jpenanganan = "Rawat Jalan";
       }
       String condition = "nik=" + nik;
//       System.out.println(id_pasien+nama_pasien+nik+alamat+no_hp+keluhan+pembayaran);
        Object[] values = {nik,nama_pasien,jk,alamat,no_hp,goldar,tempat,tgl_lahir,status,jpenanganan};
        //"nik","nama","jk","alamat","no_hp","goldar","tempat","tgl_lahir","status","jpenanganan"
         //
        System.out.println(condition);
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columns, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(dataPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String nik = tNik.getText();
        try {
            String condition = "nik = " + nik;
            db.deleteData(conn, "pasien", condition);
            datatable();
            reset();
            
        } catch (SQLException ex) {
            Logger.getLogger(dataPasien.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
        tAlamat.setText("");
        statusGroup.clearSelection();
        penangananGroup.clearSelection();
    }//GEN-LAST:event_bResetActionPerformed

    private void tPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPasienMouseClicked
        int selectedRowIndex =  tPasien.getSelectedRow();
        String a = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String b = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String c = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String d = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String e = tabmode.getValueAt(selectedRowIndex, 4).toString();
        String f = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String g = tabmode.getValueAt(selectedRowIndex, 6).toString();
        String h = tabmode.getValueAt(selectedRowIndex, 7).toString();
        String i = tabmode.getValueAt(selectedRowIndex, 8).toString();
        String j = tabmode.getValueAt(selectedRowIndex, 9).toString();
        
        tNik.setText(a);
        tNamaPasien.setText(b);
        tJK.setSelectedItem(c);
        tAlamat.setText(d);
        tNoHP.setText(e);
        tGoldar.setSelectedItem(f);
        tTempat.setText(g);
        tTglLahir.setDate(java.sql.Date.valueOf(h));
        if ( i.equals("Kawin")){
            tK.setSelected(true);
        }else if( i.equals("Belum Kawin")){
            tBK.setSelected(true);
        }
        if ( j.equals("Rawat Inap")){
            cbrawatinap.setSelected(true);
        }else if( j.equals("Rawat Jalan")){
            cbrawatjalan.setSelected(true);
        }
    }//GEN-LAST:event_tPasienMouseClicked

    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
        String path =".\\src\\laporan\\pasien.jasper";
        JasperReport reports; 
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("nik", tNik.getText());
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, parameters,conn);
            JasperViewer jviewer = new JasperViewer(jprint,false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(dataPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCetakActionPerformed

    private void tKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKActionPerformed

    private void tGoldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGoldarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGoldarActionPerformed

    private void cbrawatinapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrawatinapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbrawatinapActionPerformed

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
            java.util.logging.Logger.getLogger(dataPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup bgPembayaran;
    private javax.swing.JRadioButton cbrawatinap;
    private javax.swing.JRadioButton cbrawatjalan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup penangananGroup;
    private javax.swing.ButtonGroup statusGroup;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JRadioButton tBK;
    private javax.swing.JComboBox<String> tGoldar;
    private javax.swing.JComboBox<String> tJK;
    private javax.swing.JRadioButton tK;
    private javax.swing.JTextField tNamaPasien;
    private javax.swing.JTextField tNik;
    private javax.swing.JTextField tNoHP;
    private javax.swing.JTable tPasien;
    private javax.swing.JTextField tTempat;
    private com.toedter.calendar.JDateChooser tTglLahir;
    // End of variables declaration//GEN-END:variables
}
