package halaman;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class Rental extends javax.swing.JInternalFrame {

    public Rental() {
        initComponents();
        tampil();
        customer();
        PC();
    }
    
    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabMode;
    
    public void tampil(){
        Object [] baris = {"NO", "ID Rental" , "ID Customer", "Nama Customer", "ID PC", "Brand", "Model", "Spesifikasi","Tanggal Rental","Tanggal Kembali","Total Harga"};
        tabMode = new DefaultTableModel(null, baris);
        tblRental.setModel(tabMode);
        try {
            String sql = "SELECT rental.id_rental, customer.id_customer, customer.nama, pc.id_pc, pc.brand, pc.model, pc.specification, rental.tanggal_rental, rental.tanggal_kembali, rental.harga FROM rental,customer,pc WHERE rental.id_customer = customer.id_customer AND rental.id_pc = pc.id_pc";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int no = 0;
            while (rs.next()){
                no++;
                String id_rental = rs.getString("id_rental");
                String id_customer = rs.getString("id_customer");
                String nama = rs.getString("nama");
                String id_pc = rs.getString("id_pc");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String specification = rs.getString("specification");
                String tgl_rental = rs.getString("tanggal_rental");
                String tgl_kembali = rs.getString("tanggal_kembali");
                String harga = rs.getString("harga");

                Object [] data = {no,id_rental, id_customer,nama, id_pc,brand,model,specification, tgl_rental, tgl_kembali, harga};
                tabMode.addRow(data);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void customer(){
        try {
            String sql = "SELECT * FROM customer";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                cmbCustomer.addItem(rs.getString("id_customer").toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void PC(){
        try {
            String sql = "SELECT * FROM pc";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                cmbIDPC.addItem(rs.getString("id_pc").toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void clear(){
        
        txtIDRental.setText("");
        txtIDRental.setEnabled(true);
        
        cmbCustomer.setSelectedItem(null);
        txtNama.setText("");
        
        cmbIDPC.setSelectedItem(null);
        txtBrand.setText("");
        txtModel.setText("");
        txtSpesifikasi.setText("");
        txtHarga.setText("");
        
        cmbTahunRental.setSelectedItem(null);
        cmbTanggalRental.setSelectedItem(null);
        cmbBulanRental.setSelectedItem(null);
        
        cmbTahunKembali.setSelectedItem(null);
        cmbTanggalKembali.setSelectedItem(null);
        cmbBulanKembali.setSelectedItem(null);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDRental = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCustomer = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbIDPC = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbTanggalRental = new javax.swing.JComboBox<>();
        cmbBulanRental = new javax.swing.JComboBox<>();
        cmbTahunRental = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbTanggalKembali = new javax.swing.JComboBox<>();
        cmbBulanKembali = new javax.swing.JComboBox<>();
        cmbTahunKembali = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSpesifikasi = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRental = new javax.swing.JTable();

        jLabel1.setText("ID Rental");

        jLabel2.setText("ID Customer");

        cmbCustomer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbCustomerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setText("NAMA");

        txtNama.setEditable(false);

        jLabel4.setText("ID PC");

        cmbIDPC.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbIDPCPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setText("Tanggal Rental");

        cmbTanggalRental.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbBulanRental.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cmbTahunRental.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));

        jLabel6.setText("Tanggal Kembali");

        cmbTanggalKembali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbBulanKembali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cmbTahunKembali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));

        jLabel7.setText("Brand");

        txtBrand.setEditable(false);

        jLabel8.setText("Model");

        txtModel.setEditable(false);

        jLabel9.setText("Harga");

        txtHarga.setEditable(false);

        jLabel10.setText("Specification");

        txtSpesifikasi.setEditable(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSpesifikasi)
                    .addComponent(txtHarga)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbTanggalRental, 0, 55, Short.MAX_VALUE)
                            .addComponent(cmbTanggalKembali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBulanRental, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBulanKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTahunRental, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTahunKembali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtModel)
                    .addComponent(txtBrand)
                    .addComponent(txtIDRental)
                    .addComponent(cmbCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNama)
                    .addComponent(cmbIDPC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbIDPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTanggalRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulanRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTahunRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulanKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTahunKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblRental.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRentalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRental);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbCustomerPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM customer WHERE id_customer = '"+cmbCustomer.getSelectedItem()+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()){
                txtNama.setText(rs.getString("nama"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_cmbCustomerPopupMenuWillBecomeInvisible

    private void cmbIDPCPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbIDPCPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM pc WHERE id_pc = '"+cmbIDPC.getSelectedItem()+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()){
                txtBrand.setText(rs.getString("brand"));
                txtModel.setText(rs.getString("model"));
                txtSpesifikasi.setText(rs.getString("specification"));
                txtHarga.setText(rs.getString("rental_price"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_cmbIDPCPopupMenuWillBecomeInvisible

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDRental.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Id Rental Wajib Disi");
                txtIDRental.requestFocus();
            } else if (cmbCustomer.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Customer Wajib Dipilih");
            } else if (txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Customer Wajib Disi");
                txtNama.requestFocus();
            } else if (cmbIDPC.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Customer Wajib Dipilih");
            }else if (txtBrand.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Brand Wajib Disi");
                txtBrand.requestFocus();
            } else if (txtModel.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Model Wajib Disi");
                txtModel.requestFocus();
            } else if (txtSpesifikasi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Spesifikasi Wajib Disi");
                txtSpesifikasi.requestFocus();
            } else if (txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harga Wajib Disi");
                txtHarga.requestFocus();
            } else {
                int simpan;
            
                String id_customer = cmbCustomer.getSelectedItem().toString();
                String id_pc = cmbIDPC.getSelectedItem().toString();

                String tgl_rental = cmbTanggalRental.getSelectedItem().toString();
                String bln_rental = cmbBulanRental.getSelectedItem().toString();
                String thn_rental = cmbTahunRental.getSelectedItem().toString();
                String rental = thn_rental+"-"+bln_rental+"-"+tgl_rental;

                String tgl_kembali = cmbTanggalKembali.getSelectedItem().toString();
                String bln_kembali = cmbBulanKembali.getSelectedItem().toString();
                String thn_kembali = cmbTahunKembali.getSelectedItem().toString();
                String kembali = thn_kembali+"-"+bln_kembali+"-"+tgl_kembali;

                String sql = "INSERT INTO rental VALUES ('"+txtIDRental.getText()+"', '"+id_customer+"', '"+id_pc+"', '"+rental+"', '"+kembali+"', '"+txtHarga.getText()+"')";
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

    private void tblRentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRentalMouseClicked
        // TODO add your handling code here:
        try {
            int baris = tblRental.getSelectedRow();
            txtIDRental.setText(tblRental.getValueAt(baris, 1).toString());
            
            cmbCustomer.setSelectedItem(tblRental.getValueAt(baris, 2).toString());
            txtNama.setText(tblRental.getValueAt(baris, 3).toString());
            
            cmbIDPC.setSelectedItem(tblRental.getValueAt(baris, 4).toString());
            txtBrand.setText(tblRental.getValueAt(baris, 5).toString());
            txtModel.setText(tblRental.getValueAt(baris, 6).toString());
            txtSpesifikasi.setText(tblRental.getValueAt(baris, 7).toString());
            
            cmbTanggalRental.setSelectedItem(tblRental.getValueAt(baris, 8).toString().substring(8, 10));
            cmbBulanRental.setSelectedItem(tblRental.getValueAt(baris, 8).toString().substring(5, 7));
            cmbTahunRental.setSelectedItem(tblRental.getValueAt(baris, 8).toString().substring(0, 4));
            
            cmbTanggalKembali.setSelectedItem(tblRental.getValueAt(baris, 9).toString().substring(8, 10));
            cmbBulanKembali.setSelectedItem(tblRental.getValueAt(baris, 9).toString().substring(5, 7));
            cmbTahunKembali.setSelectedItem(tblRental.getValueAt(baris, 9).toString().substring(0, 4));
            
            txtHarga.setText(tblRental.getValueAt(baris, 10).toString());
            
            txtIDRental.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_tblRentalMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDRental.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Id Rental Wajib Disi");
                txtIDRental.requestFocus();
            } else if (cmbCustomer.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Customer Wajib Dipilih");
            } else if (txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Customer Wajib Disi");
                txtNama.requestFocus();
            } else if (cmbIDPC.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "Customer Wajib Dipilih");
            }else if (txtBrand.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Brand Wajib Disi");
                txtBrand.requestFocus();
            } else if (txtModel.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Model Wajib Disi");
                txtModel.requestFocus();
            } else if (txtSpesifikasi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Spesifikasi Wajib Disi");
                txtSpesifikasi.requestFocus();
            } else if (txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harga Wajib Disi");
                txtHarga.requestFocus();
            } else {
                int ubah;
            
                String id_customer = cmbCustomer.getSelectedItem().toString();
                String id_pc = cmbIDPC.getSelectedItem().toString();

                String tgl_rental = cmbTanggalRental.getSelectedItem().toString();
                String bln_rental = cmbBulanRental.getSelectedItem().toString();
                String thn_rental = cmbTahunRental.getSelectedItem().toString();
                String rental = thn_rental+"-"+bln_rental+"-"+tgl_rental;

                String tgl_kembali = cmbTanggalKembali.getSelectedItem().toString();
                String bln_kembali = cmbBulanKembali.getSelectedItem().toString();
                String thn_kembali = cmbTahunKembali.getSelectedItem().toString();
                String kembali = thn_kembali+"-"+bln_kembali+"-"+tgl_kembali;

                String sql = "UPDATE rental SET id_customer = '"+id_customer+"', id_pc = '"+id_pc+"', tanggal_rental = '"+rental+"', tanggal_kembali = '"+kembali+"', harga = '"+txtHarga.getText()+"' WHERE id_rental = '"+txtIDRental.getText()+"'";
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
            
            String sql = "DELETE FROM rental WHERE id_rental = '"+txtIDRental.getText()+"'";
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbBulanKembali;
    private javax.swing.JComboBox<String> cmbBulanRental;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JComboBox<String> cmbIDPC;
    private javax.swing.JComboBox<String> cmbTahunKembali;
    private javax.swing.JComboBox<String> cmbTahunRental;
    private javax.swing.JComboBox<String> cmbTanggalKembali;
    private javax.swing.JComboBox<String> cmbTanggalRental;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRental;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDRental;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSpesifikasi;
    // End of variables declaration//GEN-END:variables
}
