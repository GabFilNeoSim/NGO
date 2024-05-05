package gui;

public class ProjectPanel extends javax.swing.JPanel {
    
    public ProjectPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpProject = new javax.swing.JTabbedPane();
        pnlProjectAll = new javax.swing.JPanel();
        pnlProjectMy = new javax.swing.JPanel();
        pnlProjectBoss = new javax.swing.JPanel();

        javax.swing.GroupLayout pnlProjectAllLayout = new javax.swing.GroupLayout(pnlProjectAll);
        pnlProjectAll.setLayout(pnlProjectAllLayout);
        pnlProjectAllLayout.setHorizontalGroup(
            pnlProjectAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlProjectAllLayout.setVerticalGroup(
            pnlProjectAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Alla projekt", pnlProjectAll);

        javax.swing.GroupLayout pnlProjectMyLayout = new javax.swing.GroupLayout(pnlProjectMy);
        pnlProjectMy.setLayout(pnlProjectMyLayout);
        pnlProjectMyLayout.setHorizontalGroup(
            pnlProjectMyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlProjectMyLayout.setVerticalGroup(
            pnlProjectMyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Mina projekt", pnlProjectMy);

        javax.swing.GroupLayout pnlProjectBossLayout = new javax.swing.GroupLayout(pnlProjectBoss);
        pnlProjectBoss.setLayout(pnlProjectBossLayout);
        pnlProjectBossLayout.setHorizontalGroup(
            pnlProjectBossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlProjectBossLayout.setVerticalGroup(
            pnlProjectBossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tpProject.addTab("Projektchef", pnlProjectBoss);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlProjectAll;
    private javax.swing.JPanel pnlProjectBoss;
    private javax.swing.JPanel pnlProjectMy;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
