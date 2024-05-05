package gui;

import helpers.TabManager;
import javax.swing.ImageIcon;
import oru.inf.InfDB;

public class MainFrame extends javax.swing.JFrame {

    private final InfDB db;
    private TabManager tabManager;
    
    public MainFrame(InfDB db) {
        this.db = db;
        initComponents();
        setIconImage(new ImageIcon("src/icons/icon.png").getImage());
        tabManager = new TabManager(tpMain);
        
        String roll = "employee";
        
        switch (roll) {
        
            case "employee":
                tabManager.enable(0, 1, 2, 3);
                break;
            case "manager":
                tabManager.enable(0, 1, 2, 3);
                break;
            case "admin":
                tabManager.enable(0, 1, 2, 3, 4);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpMain = new javax.swing.JTabbedPane();
        pnlStart = new javax.swing.JPanel();
        pnlAccount = new javax.swing.JPanel();
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlAccount;
    private gui.AdminPanel pnlAdmin;
    private gui.DepartmentPanel pnlDepartment;
    private gui.ProjectPanel pnlProject;
    private javax.swing.JPanel pnlStart;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}
