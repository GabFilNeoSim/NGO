package gui;

import helpers.SQL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminPanel extends javax.swing.JPanel {
    
    private final InfDB db;
    
    public AdminPanel() {
        initComponents();
        db = SQL.getInstance().getDB();
        setUpList();
    }

    // ----- Ändra ej nedanstående kod -----
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpProject = new javax.swing.JTabbedPane();
        pnlAdminEmployee = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>(new DefaultListModel());
        lblFirstName = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        lblDepartment = new javax.swing.JLabel();
        tfDepartment = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlAdminProject = new javax.swing.JPanel();
        pnlAdminDepartment = new javax.swing.JPanel();
        pnlAdminGoals = new javax.swing.JPanel();
        pnlAdminPartner = new javax.swing.JPanel();
        pnlAdminCountry = new javax.swing.JPanel();

        employeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeList);

        lblFirstName.setText("Förnamn");

        lblLastName.setText("Efternamn");

        lblEmail.setText("Epost");

        lblPhone.setText("Telefonnummer");

        lblAddress.setText("Adress");

        lblID.setText("AnställningsID");

        lblDate.setText("Anställningsdatum");

        lblDepartment.setText("Avdelning");

        btnSave.setText("Spara");

        btnDelete.setText("Ta bort");

        javax.swing.GroupLayout pnlAdminEmployeeLayout = new javax.swing.GroupLayout(pnlAdminEmployee);
        pnlAdminEmployee.setLayout(pnlAdminEmployeeLayout);
        pnlAdminEmployeeLayout.setHorizontalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(lblEmail)))
                                    .addComponent(lblAddress)))
                            .addComponent(lblDate))
                        .addGap(44, 44, 44)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblID)
                            .addComponent(lblPhone)
                            .addComponent(lblLastName)
                            .addComponent(tfLastName)
                            .addComponent(tfPhone)
                            .addComponent(tfID)
                            .addComponent(lblDepartment)
                            .addComponent(tfDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        pnlAdminEmployeeLayout.setVerticalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(lblDepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
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
    
    private void employeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeListMouseClicked

        String aid = employeeList.getSelectedValue().split("-")[0].trim();
        setUpFields(aid);
    }//GEN-LAST:event_employeeListMouseClicked
    
    private void setUpFields(String aid) {
        String query = "SELECT * from anstalld where aid = %s".formatted(aid);
        try {
            HashMap<String, String> row = db.fetchRow(query);
            
            tfFirstName.setText(row.get("fornamn"));
            tfLastName.setText(row.get("efternamn"));
            tfEmail.setText(row.get("epost"));
            tfPhone.setText(row.get("telefon"));
            tfAddress.setText(row.get("adress"));
            tfID.setText(row.get("aid"));
            tfDate.setText(row.get("anstallningsdatum"));
            tfDepartment.setText(row.get("avdelning"));
        } catch (InfException ignored) {}
    }
    private void setUpList() {
        DefaultListModel<String> list = (DefaultListModel<String>) employeeList.getModel();
        
        String query = """
                       SELECT anstalld.aid, anstalld.fornamn, anstalld.efternamn FROM anstalld
                       JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       UNION
                       SELECT anstalld.aid, anstalld.fornamn, anstalld.efternamn FROM anstalld
                       JOIN admin ON anstalld.aid = admin.aid;
                       """;
        
        try {
            ArrayList<HashMap<String,String>> rows = db.fetchRows(query);
            
            for (HashMap<String,String> row : rows) {
                String fullName = row.get("aid") + " - " +row.get("fornamn") + " " + row.get("efternamn");
                list.addElement(fullName);
            }
            
        } catch (InfException ignored) {}    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JList<String> employeeList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel pnlAdminCountry;
    private javax.swing.JPanel pnlAdminDepartment;
    private javax.swing.JPanel pnlAdminEmployee;
    private javax.swing.JPanel pnlAdminGoals;
    private javax.swing.JPanel pnlAdminPartner;
    private javax.swing.JPanel pnlAdminProject;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDepartment;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
