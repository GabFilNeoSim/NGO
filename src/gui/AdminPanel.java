package gui;

import helpers.SQL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminPanel extends javax.swing.JPanel {
    
    private final InfDB db;
    
    public AdminPanel() {
        initComponents();
        db = SQL.getInstance().getDB();
        kines2();
    }

    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpProject = new javax.swing.JTabbedPane();
        pnlAdminEmployee = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        tfAddNewEmployee = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>(new DefaultListModel<>());
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlAdminProject = new javax.swing.JPanel();
        pnlAdminDepartment = new javax.swing.JPanel();
        pnlAdminGoals = new javax.swing.JPanel();
        pnlAdminPartner = new javax.swing.JPanel();
        pnlAdminCountry = new javax.swing.JPanel();

        btnSave.setText("Spara");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Lägg till ny anställd");

        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "aid", "Namn", "Epost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout pnlAdminEmployeeLayout = new javax.swing.GroupLayout(pnlAdminEmployee);
        pnlAdminEmployee.setLayout(pnlAdminEmployeeLayout);
        pnlAdminEmployeeLayout.setHorizontalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfAddNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 376, Short.MAX_VALUE))
        );
        pnlAdminEmployeeLayout.setVerticalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfAddNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(107, 107, 107))
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
    
    private void kines() {
        DefaultListModel<String> list = (DefaultListModel<String>) jList1.getModel();
        
        String query = """
                       SELECT anstalld.fornamn, anstalld.efternamn FROM anstalld
                       JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       UNION
                       SELECT anstalld.fornamn, anstalld.efternamn FROM anstalld
                       JOIN admin ON anstalld.aid = admin.aid;
                       """;
        
        try {
            ArrayList<HashMap<String,String>> rows = db.fetchRows(query);
            
            for (HashMap<String,String> row : rows) {
                String fullName = row.get("fornamn") + " " + row.get("efternamn");
                list.addElement(fullName);
            }
            
        } catch (InfException ignored) {}
        
        
    }
    
    public void kines2() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        
        String query = """
                       SELECT anstalld.aid, CONCAT(anstalld.fornamn, " " , anstalld.efternamn) AS name FROM anstalld
                       JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       UNION
                       SELECT anstalld.aid, CONCAT(anstalld.fornamn, " ", anstalld.efternamn) AS name FROM anstalld
                       JOIN admin ON anstalld.aid = admin.aid;
                       """;
        
        try {
            ArrayList<HashMap<String, String>> rows = db.fetchRows(query);
           
            for (HashMap<String, String> row : rows) {
                //row.keySet();
                ArrayList rowData = new ArrayList();
                for (String value : row.values()) {
                    rowData.add(value);
                }
                tableModel.addRow(rowData.toArray());
            }
        }  catch (InfException e) {
            System.out.println(e);
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultListModel<String> list = (DefaultListModel<String>) jList1.getModel();
        list.addElement(tfAddNewEmployee.getText());
 
                                              
    
       
    }//GEN-LAST:event_btnSaveActionPerformed
    // ----- Ändra ej ovanstående kod -----

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlAdminCountry;
    private javax.swing.JPanel pnlAdminDepartment;
    private javax.swing.JPanel pnlAdminEmployee;
    private javax.swing.JPanel pnlAdminGoals;
    private javax.swing.JPanel pnlAdminPartner;
    private javax.swing.JPanel pnlAdminProject;
    private javax.swing.JTextField tfAddNewEmployee;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
