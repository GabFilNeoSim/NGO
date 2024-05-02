package gui;

import javax.swing.ImageIcon;
import oru.inf.InfDB;

public class MainFrame extends javax.swing.JFrame {

    private final InfDB db;
    
    public MainFrame(InfDB db) {
        this.db = db;
        
        initComponents();
        setIconImage(new ImageIcon("src/icons/icon.png").getImage());
        
        disableAllTabs();
        
        String roll = "employee";
        
        switch (roll) {
        
            case "employee":
                enableTabs(0, 1, 2, 3);
                break;
            case "manager":
                enableTabs(0, 1, 2, 3);
                break;
            case "admin":
                enableTabs(0, 1, 2, 3, 4);
        }
    }
    
    private void disableAllTabs() {
        for (int tab = 0; tab < tpMain.getTabCount(); tab++) {
            tpMain.setEnabledAt(tab, false);
        }
    }
    
    private void enableTabs(int ...tabs) {
        for (int tab : tabs) {
            tpMain.setEnabledAt(tab, true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpMain = new javax.swing.JTabbedPane();
        pnlStart = new javax.swing.JPanel();
        pnlAccount = new javax.swing.JPanel();
        tpProject = new javax.swing.JTabbedPane();
        pnlProjectAll = new javax.swing.JPanel();
        pnlProjectMy = new javax.swing.JPanel();
        pnlProjectBoss = new javax.swing.JPanel();
        tpDepartment = new javax.swing.JTabbedPane();
        pnlDepartmentEmployee = new javax.swing.JPanel();
        pnlDepartmentPartner = new javax.swing.JPanel();
        pnlDepartmentBoss = new javax.swing.JPanel();
        tpAdmin = new javax.swing.JTabbedPane();
        pnlAdminEmployee = new javax.swing.JPanel();
        pnlAdminProject = new javax.swing.JPanel();
        pnlAdminDepartment = new javax.swing.JPanel();
        pnlAdminGoals = new javax.swing.JPanel();
        pnlAdminCountry = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        pnlAdminPartner = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        tpMain.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tpMain.setMaximumSize(new java.awt.Dimension(1280, 720));
        tpMain.setMinimumSize(new java.awt.Dimension(1280, 720));
        tpMain.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout pnlStartLayout = new javax.swing.GroupLayout(pnlStart);
        pnlStart.setLayout(pnlStartLayout);
        pnlStartLayout.setHorizontalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlStartLayout.setVerticalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        tpMain.addTab(" Start", new javax.swing.ImageIcon(getClass().getResource("/icons/start.png")), pnlStart, ""); // NOI18N
        pnlStart.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        tpMain.addTab("Konto", pnlAccount);

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

        tpMain.addTab("Projekt", tpProject);

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

        tpMain.addTab("Avdelning", tpDepartment);

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

        tpAdmin.addTab("Anställda", pnlAdminEmployee);

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

        tpAdmin.addTab("Projekt", pnlAdminProject);

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

        tpAdmin.addTab("Avdelning", pnlAdminDepartment);

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

        tpAdmin.addTab("Hållbarhetsmål", pnlAdminGoals);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAdminCountryLayout = new javax.swing.GroupLayout(pnlAdminCountry);
        pnlAdminCountry.setLayout(pnlAdminCountryLayout);
        pnlAdminCountryLayout.setHorizontalGroup(
            pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
            .addGroup(pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAdminCountryLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlAdminCountryLayout.setVerticalGroup(
            pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(pnlAdminCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAdminCountryLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tpAdmin.addTab("Land", pnlAdminCountry);

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

        tpAdmin.addTab("Partner", pnlAdminPartner);

        tpMain.addTab("Admin", tpAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel pnlAccount;
    private javax.swing.JPanel pnlAdminCountry;
    private javax.swing.JPanel pnlAdminDepartment;
    private javax.swing.JPanel pnlAdminEmployee;
    private javax.swing.JPanel pnlAdminGoals;
    private javax.swing.JPanel pnlAdminPartner;
    private javax.swing.JPanel pnlAdminProject;
    private javax.swing.JPanel pnlDepartmentBoss;
    private javax.swing.JPanel pnlDepartmentEmployee;
    private javax.swing.JPanel pnlDepartmentPartner;
    private javax.swing.JPanel pnlProjectAll;
    private javax.swing.JPanel pnlProjectBoss;
    private javax.swing.JPanel pnlProjectMy;
    private javax.swing.JPanel pnlStart;
    private javax.swing.JTabbedPane tpAdmin;
    private javax.swing.JTabbedPane tpDepartment;
    private javax.swing.JTabbedPane tpMain;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
