package gui;

import java.awt.Color;
import static shared.Shared.CURRENT_USER;

public class AccountPanel extends javax.swing.JPanel {
    
    private String errorMsg;
    
    public AccountPanel() {
        initComponents();
        setUpInputs();
        errorMsg = "Du måste ändra något för att kunna spara.";
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
        lblError = new javax.swing.JLabel();

        lblPI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPI.setText("Personuppgifter");

        tfFirstname.setText("Anders");

        btnSaveFirstname.setText("Spara");
        btnSaveFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFirstnameActionPerformed(evt);
            }
        });

        lblFirstname.setText("Förnamn");

        lblPhone.setText("Telefon");

        tfPhone.setText("0760974123");

        btnSavePhone.setText("Spara");
        btnSavePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePhoneActionPerformed(evt);
            }
        });

        lblAddress.setText("Adress");

        tfAddress.setText("Adress 22, 189 22, Täby");

        btnSaveAddress.setText("Spara");
        btnSaveAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddressActionPerformed(evt);
            }
        });

        tfEpost.setText("example@example.com");

        btnSaveEpost.setText("Spara");
        btnSaveEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEpostActionPerformed(evt);
            }
        });

        lblEpost.setText("Epost");

        tfLastname.setText("Andersson");

        btnSaveLastname.setText("Spara");
        btnSaveLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLastnameActionPerformed(evt);
            }
        });

        lblLastname.setText("Efternamn");

        lblError.setForeground(new java.awt.Color(233, 144, 144));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPI)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastname)
                                    .addComponent(lblFirstname))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLastname)
                                    .addComponent(tfFirstname)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblEpost)
                                    .addComponent(lblPhone))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEpost))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSaveFirstname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveEpost, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveAddress))
                            .addComponent(btnSavePhone))))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPI)
                        .addGap(16, 16, 16)
                        .addComponent(lblFirstname))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveFirstname)
                            .addComponent(tfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfAddress, tfEpost, tfFirstname, tfLastname, tfPhone});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFirstnameActionPerformed
        // TODO add your handling code here:
        String newName = tfFirstname.getText();
        
        if (validateValues(CURRENT_USER.getFirstName(), newName)) {
            CURRENT_USER.setFirstName(newName);
        }
    }//GEN-LAST:event_btnSaveFirstnameActionPerformed

    private void btnSavePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePhoneActionPerformed
        // TODO add your handling code here:
        String newPhone = tfPhone.getText();
        
        if (validateValues(CURRENT_USER.getPhone(), newPhone)) {
            CURRENT_USER.setPhone(newPhone);
        }
    }//GEN-LAST:event_btnSavePhoneActionPerformed

    private void btnSaveAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddressActionPerformed
        // TODO add your handling code here:
        String newAddress = tfAddress.getText();
        
        if (validateValues(CURRENT_USER.getAddress(), newAddress)) {
            CURRENT_USER.setAddress(newAddress);
        }
    }//GEN-LAST:event_btnSaveAddressActionPerformed

    private void btnSaveEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEpostActionPerformed
        // TODO add your handling code here:
        String newEmail = tfEpost.getText();
        
        if (validateValues(CURRENT_USER.getEmail(), newEmail)) {
            CURRENT_USER.setEmail(newEmail);
        }
    }//GEN-LAST:event_btnSaveEpostActionPerformed

    private void btnSaveLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLastnameActionPerformed
        // TODO add your handling code here:
        String newLastName = tfLastname.getText();
        
        if (validateValues(CURRENT_USER.getLastName(), newLastName)) {
            CURRENT_USER.setLastName(newLastName);
        }
    }//GEN-LAST:event_btnSaveLastnameActionPerformed
    // ----- Ändra ej ovanstående kod -----

    private void setUpInputs() {
        tfAddress.setText(CURRENT_USER.getAddress());
        tfEpost.setText(CURRENT_USER.getEmail());
        tfFirstname.setText(CURRENT_USER.getFirstName());
        tfLastname.setText(CURRENT_USER.getLastName());
        tfPhone.setText(CURRENT_USER.getPhone());
    }
    
    private boolean validateValues(String oldValue, String newValue) {
        if (oldValue.equals(newValue)) {
            lblError.setText(errorMsg);
            lblError.setForeground(Color.yellow);
            return false;
        } else {
            lblError.setText("Lyckades ändra uppgiften till %s".formatted(newValue));
            lblError.setForeground(Color.cyan);
            return true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveAddress;
    private javax.swing.JButton btnSaveEpost;
    private javax.swing.JButton btnSaveFirstname;
    private javax.swing.JButton btnSaveLastname;
    private javax.swing.JButton btnSavePhone;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblError;
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
