package gui;

public class DepartmentPanel extends javax.swing.JPanel {
    
    public DepartmentPanel() {
        initComponents();
    }
    
    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpDepartment = new javax.swing.JTabbedPane();
        pnlDepartmentEmployee = new javax.swing.JPanel();
        pnlDepartmentPartner = new javax.swing.JPanel();
        pnlDepartmentBoss = new javax.swing.JPanel();

        javax.swing.GroupLayout pnlDepartmentEmployeeLayout = new javax.swing.GroupLayout(pnlDepartmentEmployee);
        pnlDepartmentEmployee.setLayout(pnlDepartmentEmployeeLayout);
        pnlDepartmentEmployeeLayout.setHorizontalGroup(
            pnlDepartmentEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlDepartmentEmployeeLayout.setVerticalGroup(
            pnlDepartmentEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpDepartment.addTab("Personal", pnlDepartmentEmployee);

        javax.swing.GroupLayout pnlDepartmentPartnerLayout = new javax.swing.GroupLayout(pnlDepartmentPartner);
        pnlDepartmentPartner.setLayout(pnlDepartmentPartnerLayout);
        pnlDepartmentPartnerLayout.setHorizontalGroup(
            pnlDepartmentPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlDepartmentPartnerLayout.setVerticalGroup(
            pnlDepartmentPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpDepartment.addTab("Partners", pnlDepartmentPartner);

        javax.swing.GroupLayout pnlDepartmentBossLayout = new javax.swing.GroupLayout(pnlDepartmentBoss);
        pnlDepartmentBoss.setLayout(pnlDepartmentBossLayout);
        pnlDepartmentBossLayout.setHorizontalGroup(
            pnlDepartmentBossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlDepartmentBossLayout.setVerticalGroup(
            pnlDepartmentBossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpDepartment.addTab("Projektchef", pnlDepartmentBoss);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // ----- Ändra ej ovanstående kod -----

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlDepartmentBoss;
    private javax.swing.JPanel pnlDepartmentEmployee;
    private javax.swing.JPanel pnlDepartmentPartner;
    private javax.swing.JTabbedPane tpDepartment;
    // End of variables declaration//GEN-END:variables
}
