package gui.account;

import java.util.HashMap;
import java.util.StringJoiner;
import managers.EmployeeManager;
import static shared.Shared.SESSION_AID;
import validators.Validate;

public class AccountPanel extends javax.swing.JPanel {

    public AccountPanel() {
        initComponents();
        updateTextFields();
    }
    
    private void updateTextFields() {
        
        HashMap<String,String> employee = EmployeeManager.getEmployeeByAid(SESSION_AID);
        
        tfAddress.setText(employee.get("adress"));
        tfEmail.setText(employee.get("epost"));
        tfFirstName.setText(employee.get("fornamn"));
        tfLastName.setText(employee.get("efternamn"));
        tfPhone.setText(employee.get("telefon"));
    }
    
    private void saveChanges() {
        
        HashMap<String,String> employee = EmployeeManager.getEmployeeByAid(SESSION_AID);
        
        StringBuilder builder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(", ");
        
        builder.append("UPDATE anstalld SET ");
        
        if (Validate.hasChanged(employee.get("fornamn"), tfFirstName.getText())) {
            joiner.add("fornamn = '%s'".formatted(tfFirstName.getText()));
        }
        
        if (Validate.hasChanged(employee.get("efternamn"), tfLastName.getText())) {
            joiner.add("efternamn = '%s'".formatted(tfLastName.getText()));
        }
        
        if (Validate.hasChanged(employee.get("epost"), tfEmail.getText())) {
            joiner.add("epost = '%s'".formatted(tfEmail.getText()));
        }
        
        if (Validate.hasChanged(employee.get("telefon"), tfPhone.getText())) {
            joiner.add("telefon = '%s'".formatted(tfPhone.getText()));
        }
        
        if (Validate.hasChanged(employee.get("telefon"), tfAddress.getText())) {
            joiner.add("adress = '%s'".formatted(tfAddress.getText()));
        }

        builder.append(joiner.toString());
        builder.append(" WHERE anstalld.aid = %s".formatted(SESSION_AID));
        
        String query = builder.toString();
        
        if (joiner.length() > 0) {
            EmployeeManager.updateEmployee(query);
            updateTextFields();
            
        } else {
            lblMessage.setText("Inget ändrades");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        lblAddress.setText("Adress");

        lblEmail.setText("Epost");

        lblFirstName.setText("Förnamn");

        lblLastName.setText("Efternamn");

        lblPhone.setText("Telefonnummer");

        jButton1.setText("Spara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPhone)
                    .addComponent(lblLastName)
                    .addComponent(lblFirstName)
                    .addComponent(lblEmail)
                    .addComponent(lblAddress)
                    .addComponent(tfAddress)
                    .addComponent(tfEmail)
                    .addComponent(tfFirstName)
                    .addComponent(tfLastName)
                    .addComponent(tfPhone)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveChanges();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
