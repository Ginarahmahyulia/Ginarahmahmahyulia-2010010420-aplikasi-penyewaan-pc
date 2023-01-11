package halaman;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Customer extends javax.swing.JInternalFrame {

    public Customer() {
        initComponents();
        tampil();
    }
    
    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabMode;
    
    public void tampil(){
        Object [] baris = {"NO", "ID Customer", "Nama", "Jenis Kelamin", "Nomor Telepom"};
        tabMode = new DefaultTableModel(null, baris);
        tblCustomer.setModel(tabMode);
        try {
            String sql = "SELECT * FROM customer";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int no = 0;
            while (rs.next()){
                no++;
                String id_customer = rs.getString("id_customer");
                String nama = rs.getString("nama");
                String jk = rs.getString("jk");
                String telp = rs.getString("telp");
                
                Object [] data = {no,id_customer,nama,jk,telp};
                tabMode.addRow(data);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void clear(){
        txtIdCustomer.setText("");
        txtNama.setText("");
        buttonGroup1.clearSelection();
        txtTelp.setText("");
        txtIdCustomer.requestFocus();
        txtIdCustomer.setEnabled(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rLaki = new javax.swing.JRadioButton();
        rPerempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("ID Customer");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        buttonGroup1.add(rLaki);
        rLaki.setText("Laki Laki");

        buttonGroup1.add(rPerempuan);
        rPerempuan.setText("Perempuan");

        jLabel4.setText("Nomor Telp");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txtNama)
                    .addComponent(txtIdCustomer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rLaki)
                    .addComponent(rPerempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIdCustomer.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Id Customer Wajib Disi");
                txtIdCustomer.requestFocus();
            } else if (txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Wajib Disi");
                txtNama.requestFocus();
            } else if (txtTelp.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nomor Telepon Wajib Disi");
                txtTelp.requestFocus();
            } else {
                int simpan;
                String jk = "";
                if (rLaki.isSelected()){
                    jk = "Laki laki";
                } else {
                    jk = "Perempuan";
                }

                String sql = "INSERT INTO customer VALUES ('"+txtIdCustomer.getText()+"', '"+txtNama.getText()+"', '"+jk+"', '"+txtTelp.getText()+"')";
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
            if (txtIdCustomer.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Id Customer Wajib Disi");
                txtIdCustomer.requestFocus();
            } else if (txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Wajib Disi");
                txtNama.requestFocus();
            } else if (txtTelp.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nomor Telepon Wajib Disi");
                txtTelp.requestFocus();
            } else {
                int ubah;
                String jk = "";
                if (rLaki.isSelected()){
                    jk = "Laki laki";
                } else {
                    jk = "Perempuan";
                }

                String sql = "UPDATE customer SET nama = '"+txtNama.getText()+"', jk = '"+jk+"', telp = '"+txtTelp.getText()+"' WHERE id_customer = '"+txtIdCustomer.getText()+"' ";
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

            String sql = "DELETE FROM customer WHERE id_customer = '"+txtIdCustomer.getText()+"' ";
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

        String path=".\\src\\report\\reportCustomer.jasper";
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

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
        try {
            int baris = tblCustomer.getSelectedRow();
            txtIdCustomer.setText(tblCustomer.getValueAt(baris, 1).toString());
            txtNama.setText(tblCustomer.getValueAt(baris, 2).toString());
            if (tblCustomer.getValueAt(baris, 3).toString().equals("Laki laki")){
                rLaki.setSelected(true);
            } else {
                rPerempuan.setSelected(true);
            }
            txtTelp.setText(tblCustomer.getValueAt(baris, 4).toString());
            
            txtIdCustomer.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }//GEN-LAST:event_tblCustomerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPerempuan;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
