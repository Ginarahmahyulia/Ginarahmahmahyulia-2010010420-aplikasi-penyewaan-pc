package halaman;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PC extends javax.swing.JInternalFrame {

    public PC() {
        initComponents();
        tampil();
    }
    
    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabMode;
    
    public void tampil(){
        Object [] baris = {"NO", "ID PC", "Brand", "Model", "Specification", "Harga"};
        tabMode = new DefaultTableModel(null, baris);
        tblPC.setModel(tabMode);
        try {
            String sql = "SELECT * FROM pc";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int no = 0;
            while (rs.next()){
                no++;
                String id_pc = rs.getString("id_pc");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String spesifikasi = rs.getString("specification");
                String harga = rs.getString("rental_price");

                Object [] data = {no,brand,model,id_pc, spesifikasi,harga};
                tabMode.addRow(data);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void clear(){
        txtIDPC.setText("");
        txtBrand.setText("");
        txtModel.setText("");
        txtSpesifikasi.setText("");
        txtHarga.setText("");
        txtIDPC.requestFocus();
        txtIDPC.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDPC = new javax.swing.JTextField();
        txtSpesifikasi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPC = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID PC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Specification");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Harga");

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Brand");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Model");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetak)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDPC)
                            .addComponent(txtSpesifikasi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHarga)
                            .addComponent(txtBrand)
                            .addComponent(txtModel))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak))
                .addContainerGap())
        );

        tblPC.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPC);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDPC.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ID PC tidak boleh kosong");
                txtIDPC.requestFocus();
            } else if (txtBrand.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Brand tidak boleh kosong");
                txtBrand.requestFocus();
            } else if (txtModel.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Model tidak boleh kosong");
                txtModel.requestFocus();
            } else if (txtSpesifikasi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Spesifikasi tidak boleh kosong");
                txtSpesifikasi.requestFocus();
            } else if (txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");
                txtHarga.requestFocus();
            } else {
                int simpan;
                String sql = "INSERT INTO pc VALUES ('"+txtIDPC.getText()+"','"+txtBrand.getText()+"','"+txtModel.getText()+"','"+txtSpesifikasi.getText()+"', '"+txtHarga.getText()+"')";
                st = conn.createStatement();
                simpan = st.executeUpdate(sql);
                if (simpan == 1){
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                    clear();
                    tampil();
                }
            }            
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDPC.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ID PC tidak boleh kosong");
                txtIDPC.requestFocus();
            } else if (txtBrand.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Brand tidak boleh kosong");
                txtBrand.requestFocus();
            } else if (txtModel.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Model tidak boleh kosong");
                txtModel.requestFocus();
            } else if (txtSpesifikasi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Spesifikasi tidak boleh kosong");
                txtSpesifikasi.requestFocus();
            } else if (txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");
                txtHarga.requestFocus();
            } else {
                int ubah;
                String sql = "UPDATE pc SET brand = '"+txtBrand.getText()+"', model = '"+txtModel.getText()+"', specification = '"+txtSpesifikasi.getText()+"', rental_price = '"+txtHarga.getText()+"' WHERE id_pc = '"+txtIDPC.getText()+"' ";
                st = conn.createStatement();
                ubah = st.executeUpdate(sql);
                if (ubah == 1){
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                    clear();
                    tampil();
                }
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            int hapus;
            String sql = "DELETE FROM pc WHERE id_pc = '"+txtIDPC.getText()+"' ";
            st = conn.createStatement();
            hapus = st.executeUpdate(sql);
            if (hapus == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                clear();
                tampil();
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        JasperReport reports;

        String path=".\\src\\report\\reportPC.jasper";
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tblPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPCMouseClicked
        // TODO add your handling code here:
        try {
            int baris = tblPC.getSelectedRow();
            txtIDPC.setText(tblPC.getValueAt(baris, 1).toString());
            txtBrand.setText(tblPC.getValueAt(baris, 2).toString());
            txtModel.setText(tblPC.getValueAt(baris, 3).toString());
            txtSpesifikasi.setText(tblPC.getValueAt(baris, 4).toString());
            txtHarga.setText(tblPC.getValueAt(baris, 5).toString());
            txtIDPC.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_tblPCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPC;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDPC;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSpesifikasi;
    // End of variables declaration//GEN-END:variables
}
