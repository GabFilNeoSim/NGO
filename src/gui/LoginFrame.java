package gui;

import java.util.HashMap;
import managers.EmployeeManager;
import static shared.Shared.SESSION_AID;

public class LoginFrame extends javax.swing.JFrame {
    
    public LoginFrame() {
        initComponents();
    }
    
    private void login() {
        //String email = tfEmail.getText();
        //String password = new String(pfPassword.getPassword());

        String email = "michael.j@example.com";
        String password = "password789";

        HashMap<String, String> employee = EmployeeManager.getEmployeeByEmail(email);

        if (password.equals(employee.get("losenord"))) {

            SESSION_AID = employee.get("aid");

            this.setVisible(false);
            new MainFrame().setVisible(true);

        } else {
            lblInfo.setText("Fel epost eller lösenord");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmail.setText("Email");

        lblPassword.setText("Password");

        btnLogin.setText("Logga in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin)
                    .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblEmail)
                .addGap(3, 3, 3)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
