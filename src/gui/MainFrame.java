package gui;

import managers.EmployeeManager;
import utils.TabManager;
import models.Role;
import static shared.Shared.SESSION_AID;

public class MainFrame extends javax.swing.JFrame {

    private TabManager tabManager;
    
    public MainFrame() {
        initComponents();
        tabManager = new TabManager(tpMain);
        
        switch (EmployeeManager.getRoleByAid(SESSION_AID)) {
            
            case Role.Admin:
                tabManager.enable(0, 1, 2, 3, 4);
                break;
            case Role.Manager:
                tabManager.enable(0, 1, 2, 3);
                break;
            default:
                tabManager.enable(0);
                break; 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpMain = new javax.swing.JTabbedPane();
        pnlAccount = new gui.account.AccountPanel();
        pnlProject = new gui.project.ProjectPanel();
        pnlDepartment = new gui.department.DepartmentPanel();
        pnlGoals = new gui.goals.GoalsPanel();
        pnlAdmin = new gui.admin.AdminPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tpMain.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpMain.addTab("Konto", pnlAccount);

        javax.swing.GroupLayout pnlProjectLayout = new javax.swing.GroupLayout(pnlProject);
        pnlProject.setLayout(pnlProjectLayout);
        pnlProjectLayout.setHorizontalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnlProjectLayout.setVerticalGroup(
            pnlProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        tpMain.addTab("Projekt", pnlProject);

        javax.swing.GroupLayout pnlDepartmentLayout = new javax.swing.GroupLayout(pnlDepartment);
        pnlDepartment.setLayout(pnlDepartmentLayout);
        pnlDepartmentLayout.setHorizontalGroup(
            pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnlDepartmentLayout.setVerticalGroup(
            pnlDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        tpMain.addTab("Avdelning", pnlDepartment);

        javax.swing.GroupLayout pnlGoalsLayout = new javax.swing.GroupLayout(pnlGoals);
        pnlGoals.setLayout(pnlGoalsLayout);
        pnlGoalsLayout.setHorizontalGroup(
            pnlGoalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        pnlGoalsLayout.setVerticalGroup(
            pnlGoalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        tpMain.addTab("Hållbarhetsmål", pnlGoals);
        tpMain.addTab("Admin", pnlAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpMain)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.account.AccountPanel pnlAccount;
    private gui.admin.AdminPanel pnlAdmin;
    private gui.department.DepartmentPanel pnlDepartment;
    private gui.goals.GoalsPanel pnlGoals;
    private gui.project.ProjectPanel pnlProject;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}
