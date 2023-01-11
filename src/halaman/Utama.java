package halaman;

import javax.swing.JOptionPane;

public class Utama extends javax.swing.JFrame {

    public Utama() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenuItem();
        menuPC = new javax.swing.JMenuItem();
        menuRental = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuProfile = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        menuCustomer.setText("Data Customer");
        menuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(menuCustomer);

        menuPC.setText("Data PC");
        menuPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPCActionPerformed(evt);
            }
        });
        jMenu1.add(menuPC);

        menuRental.setText("Rental PC");
        menuRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRentalActionPerformed(evt);
            }
        });
        jMenu1.add(menuRental);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Profile");

        menuProfile.setText("Profile");
        menuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProfileActionPerformed(evt);
            }
        });
        jMenu2.add(menuProfile);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Keluar");

        menuKeluar.setText("Keluar");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });
        jMenu3.add(menuKeluar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustomerActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer();
        panel.add(customer);
        customer.setVisible(true);
    }//GEN-LAST:event_menuCustomerActionPerformed

    private void menuPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPCActionPerformed
        // TODO add your handling code here:
        PC pc = new PC();
        panel.add(pc);
        pc.setVisible(true);
    }//GEN-LAST:event_menuPCActionPerformed

    private void menuRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRentalActionPerformed
        // TODO add your handling code here:
        Rental rental = new Rental();
        panel.add(rental);
        rental.setVisible(true);
    }//GEN-LAST:event_menuRentalActionPerformed

    private void menuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfileActionPerformed
        // TODO add your handling code here:
        Profile profile = new Profile();
        panel.add(profile);
        profile.setVisible(true);
    }//GEN-LAST:event_menuProfileActionPerformed

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar?", "Keluar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Keluar Aplikasi..");
            System.exit(0);
        }
    }//GEN-LAST:event_menuKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCustomer;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenuItem menuPC;
    private javax.swing.JMenuItem menuProfile;
    private javax.swing.JMenuItem menuRental;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
