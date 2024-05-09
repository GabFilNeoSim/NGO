package gui.admin;

public class AdminPanel extends javax.swing.JPanel {
    
    public AdminPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpAdmin = new javax.swing.JTabbedPane();
        pnlAdminEmployee = new gui.admin.AdminEmployeePanel();
        pnlAdminCountry = new gui.admin.AdminCountryPanel();

        tpAdmin.addTab("Anställd", pnlAdminEmployee);
        tpAdmin.addTab("Länder", pnlAdminCountry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.admin.AdminCountryPanel pnlAdminCountry;
    private gui.admin.AdminEmployeePanel pnlAdminEmployee;
    private javax.swing.JTabbedPane tpAdmin;
    // End of variables declaration//GEN-END:variables
}
