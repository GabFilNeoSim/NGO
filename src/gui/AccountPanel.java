package gui;

public class AccountPanel extends javax.swing.JPanel {
    
    public AccountPanel() {
        initComponents();
    }

    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPI = new javax.swing.JLabel();
        tfFirstname = new javax.swing.JTextField();
        btnSaveFirstname = new javax.swing.JButton();
        lblFirstname = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        btnSavePhone = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        btnSaveAddress = new javax.swing.JButton();
        tfEpost = new javax.swing.JTextField();
        btnSaveEpost = new javax.swing.JButton();
        lblEpost = new javax.swing.JLabel();
        tfLastname = new javax.swing.JTextField();
        btnSaveLastname = new javax.swing.JButton();
        lblLastname = new javax.swing.JLabel();

        lblPI.setText("Personuppgifter");

        tfFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstnameActionPerformed(evt);
            }
        });

        btnSaveFirstname.setText("Spara");
        btnSaveFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFirstnameActionPerformed(evt);
            }
        });

        lblFirstname.setText("Förnamn");

        lblPhone.setText("Telefon");

        tfPhone.setText("jTextField2");
        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });

        btnSavePhone.setText("Spara");
        btnSavePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePhoneActionPerformed(evt);
            }
        });

        lblAddress.setText("Adress");

        tfAddress.setText("jTextField1");

        btnSaveAddress.setText("Spara");
        btnSaveAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddressActionPerformed(evt);
            }
        });

        tfEpost.setText("maria.g@example.com");
        tfEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEpostActionPerformed(evt);
            }
        });

        btnSaveEpost.setText("Spara");
        btnSaveEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEpostActionPerformed(evt);
            }
        });

        lblEpost.setText("Epost");

        tfLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastnameActionPerformed(evt);
            }
        });

        btnSaveLastname.setText("Spara");
        btnSaveLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLastnameActionPerformed(evt);
            }
        });

        lblLastname.setText("Efternamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPI)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstname)
                                    .addComponent(lblLastname))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblEpost)
                                    .addComponent(lblPhone))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(tfPhone)))))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSaveFirstname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveEpost, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveAddress))
                            .addComponent(btnSavePhone))))
                .addContainerGap(733, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAddress, tfEpost, tfFirstname, tfLastname, tfPhone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPI)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstname)
                            .addComponent(tfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnSaveFirstname)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLastname)
                                .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSaveLastname, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveEpost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSavePhone)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveAddress)))
                .addContainerGap(497, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfAddress, tfEpost, tfFirstname, tfLastname, tfPhone});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveFirstnameActionPerformed

    private void tfFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstnameActionPerformed

    private void btnSavePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSavePhoneActionPerformed

    private void btnSaveAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveAddressActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEpostActionPerformed

    private void btnSaveEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveEpostActionPerformed

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void btnSaveLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveLastnameActionPerformed
    // ----- Ändra ej ovanstående kod -----

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveAddress;
    private javax.swing.JButton btnSaveEpost;
    private javax.swing.JButton btnSaveFirstname;
    private javax.swing.JButton btnSaveLastname;
    private javax.swing.JButton btnSavePhone;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblPI;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfFirstname;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
