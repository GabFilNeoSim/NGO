package gui;

import helpers.TabManager;
import javax.swing.ImageIcon;
import models.Role;
import static shared.Shared.CURRENT_USER;

public class MainFrame extends javax.swing.JFrame {
    
    private TabManager tabManager;
    
    public MainFrame() {
        initComponents();
        setIconImage(new ImageIcon("src/icons/icon.png").getImage());
        tabManager = new TabManager(tpMain);
        
        switch (CURRENT_USER.getRole()) {
        
            case Role.Employee:
                tabManager.enable(0, 1, 2);
                break;
            case Role.Manager:
                tabManager.enable(0, 1, 2);
                break;
            case Role.Admin:
                tabManager.enable(0, 1, 2);
        } 
    }
    
    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpMain = new javax.swing.JTabbedPane();
        pnlStart = new gui.StartPanel();
        pnlAccount = new gui.AccountPanel();
        pnlProject = new gui.ProjectPanel();
        pnlDepartment = new gui.DepartmentPanel();
        pnlAdmin = new gui.AdminPanel();

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
        tpMain.addTab("Start", pnlStart);
        tpMain.addTab("Konto", pnlAccount);
        tpMain.addTab("Projekt", pnlProject);
        tpMain.addTab("Avdelning", pnlDepartment);
        tpMain.addTab("Admin", pnlAdmin);

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
    // ----- Ändra ej ovanstående kod -----
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.AccountPanel pnlAccount;
    private gui.AdminPanel pnlAdmin;
    private gui.DepartmentPanel pnlDepartment;
    private gui.ProjectPanel pnlProject;
    private gui.StartPanel pnlStart;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}
