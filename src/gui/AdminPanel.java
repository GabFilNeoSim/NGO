package gui;

public class AdminPanel extends javax.swing.JPanel {
    
    public AdminPanel() {
        initComponents();
    }

    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpProject = new javax.swing.JTabbedPane();
        pnlAdminEmployee = new javax.swing.JPanel();
        pnlAdminProject = new javax.swing.JPanel();
        pnlAdminDepartment = new javax.swing.JPanel();
        pnlAdminGoals = new javax.swing.JPanel();
        pnlAdminPartner = new javax.swing.JPanel();
        pnlAdminCountry = new javax.swing.JPanel();

        javax.swing.GroupLayout pnlAdminEmployeeLayout = new javax.swing.GroupLayout(pnlAdminEmployee);
        pnlAdminEmployee.setLayout(pnlAdminEmployeeLayout);
        pnlAdminEmployeeLayout.setHorizontalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminEmployeeLayout.setVerticalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Anställda", pnlAdminEmployee);

        javax.swing.GroupLayout pnlAdminProjectLayout = new javax.swing.GroupLayout(pnlAdminProject);
        pnlAdminProject.setLayout(pnlAdminProjectLayout);
        pnlAdminProjectLayout.setHorizontalGroup(
            pnlAdminProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminProjectLayout.setVerticalGroup(
            pnlAdminProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Projekt", pnlAdminProject);

        javax.swing.GroupLayout pnlAdminDepartmentLayout = new javax.swing.GroupLayout(pnlAdminDepartment);
        pnlAdminDepartment.setLayout(pnlAdminDepartmentLayout);
        pnlAdminDepartmentLayout.setHorizontalGroup(
            pnlAdminDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminDepartmentLayout.setVerticalGroup(
            pnlAdminDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Avdelning", pnlAdminDepartment);

        javax.swing.GroupLayout pnlAdminGoalsLayout = new javax.swing.GroupLayout(pnlAdminGoals);
        pnlAdminGoals.setLayout(pnlAdminGoalsLayout);
        pnlAdminGoalsLayout.setHorizontalGroup(
            pnlAdminGoalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminGoalsLayout.setVerticalGroup(
            pnlAdminGoalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Hållbarhetsmål", pnlAdminGoals);

        javax.swing.GroupLayout pnlAdminPartnerLayout = new javax.swing.GroupLayout(pnlAdminPartner);
        pnlAdminPartner.setLayout(pnlAdminPartnerLayout);
        pnlAdminPartnerLayout.setHorizontalGroup(
            pnlAdminPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminPartnerLayout.setVerticalGroup(
            pnlAdminPartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Land", pnlAdminPartner);

        javax.swing.GroupLayout pnlAdminCountryLayout = new javax.swing.GroupLayout(pnlAdminCountry);
        pnlAdminCountry.setLayout(pnlAdminCountryLayout);
        pnlAdminCountryLayout.setHorizontalGroup(
            pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAdminCountryLayout.setVerticalGroup(
            pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Partner", pnlAdminCountry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpProject, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpProject, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // ----- Ändra ej ovanstående kod -----

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlAdminCountry;
    private javax.swing.JPanel pnlAdminDepartment;
    private javax.swing.JPanel pnlAdminEmployee;
    private javax.swing.JPanel pnlAdminGoals;
    private javax.swing.JPanel pnlAdminPartner;
    private javax.swing.JPanel pnlAdminProject;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
