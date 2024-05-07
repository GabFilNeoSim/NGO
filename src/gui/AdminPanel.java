package gui;

import helpers.Helper;
import helpers.SQL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.Role;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminPanel extends javax.swing.JPanel {
    
    private final InfDB db;
    DefaultListModel<String> list;
    private String selectedAID = "";
    
    public AdminPanel() {
        initComponents();
        db = SQL.getInstance().getDB();
        list = (DefaultListModel<String>) employeeList.getModel();
        setUpList();
        
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        tfID.setEnabled(false);
        
        
        //lblDate.setToolTipText("TESTAR");
        tfDate.setToolTipText("TESTAR");
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
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        rbManager = new javax.swing.JRadioButton();
        rbAdmin = new javax.swing.JRadioButton();
        lblMessage = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        pnlAdminProject = new javax.swing.JPanel();
        pnlAdminDepartment = new javax.swing.JPanel();
        pnlAdminGoals = new javax.swing.JPanel();
        pnlAdminPartner = new javax.swing.JPanel();
        pnlAdminCountry = new javax.swing.JPanel();

        employeeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        btnChange.setText("Ändra");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setText("Ta bort");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblRole.setText("Role");

        rbManager.setText("Manager");
        rbManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManagerActionPerformed(evt);
            }
        });

        rbAdmin.setText("Admin");
        rbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdminActionPerformed(evt);
            }
        });

        btnClear.setText("Töm fält");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCreate.setText("Skapa ny");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminEmployeeLayout = new javax.swing.GroupLayout(pnlAdminEmployee);
        pnlAdminEmployee.setLayout(pnlAdminEmployeeLayout);
        pnlAdminEmployeeLayout.setHorizontalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addComponent(btnClear)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)))
                                .addGap(32, 32, 32)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRole)
                                    .addComponent(rbManager)
                                    .addComponent(rbAdmin)))
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE))))
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        pnlAdminEmployeeLayout.setVerticalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblRole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbManager))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAdmin)
                        .addGap(3, 3, 3)
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
                            .addComponent(btnDelete)
                            .addComponent(btnClear)
                            .addComponent(btnCreate)
                            .addComponent(btnChange))
                        .addGap(50, 50, 50)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        selectedAID = employeeList.getSelectedValue().split("-")[0].trim();
        updateFields();
        btnChange.setEnabled(true);
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(true);
        tfID.setEnabled(true);
    }//GEN-LAST:event_employeeListMouseClicked
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(selectedAID.isBlank()) {
            return;
        }
        
        int option = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill ta bort användaren?", "Bekräftelse", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            String aid = employeeList.getSelectedValue().split("-")[0].trim();

            String query1 = "UPDATE projekt SET projekt.projektchef = NULL WHERE projekt.projektchef = %s".formatted(aid);
            String query2 = "DELETE FROM ans_proj WHERE ans_proj.aid = %s".formatted(aid);
            String query3 = "DELETE FROM admin WHERE admin.aid = %s".formatted(aid);
            String query4 = "UPDATE handlaggare SET handlaggare.mentor = NULL WHERE handlaggare.mentor = %s".formatted(aid);
            String query5 = "UPDATE avdelning SET avdelning.chef = NULL WHERE avdelning.chef = %s".formatted(aid);
            String query6 = "DELETE FROM handlaggare WHERE handlaggare.aid = %s".formatted(aid);
            String query7 = "DELETE FROM anstalld WHERE anstalld.aid = %s".formatted(aid);
            
            try {
                db.update(query1);
                db.delete(query2);
                db.delete(query3);
                db.update(query4);
                db.update(query5);
                db.delete(query6);
                db.delete(query7);
                
                DefaultListModel model = (DefaultListModel) employeeList.getModel();
                int selectedIndex = employeeList.getSelectedIndex();
                if (selectedIndex != -1) {
                    model.remove(selectedIndex);
                }
                clear();
                
            } catch(InfException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdminActionPerformed
        rbManager.setSelected(false);
    }//GEN-LAST:event_rbAdminActionPerformed

    private void rbManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManagerActionPerformed
        rbManager.setSelected(true);
    }//GEN-LAST:event_rbManagerActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        
        // Get original information from the database

        if (selectedAID.isBlank()) {
            return;
        }

        HashMap<String, String> result = SQL.getInstance().getEmployeeByAid(selectedAID);
        
        String dbFirstName, dbLastName, dbEmail, dbPhone, dbAddress, dbAID, dbDate, dbDepartment;
        
        dbFirstName = result.get("fornamn");
        dbLastName = result.get("efternamn");
        dbEmail = result.get("epost");
        dbPhone = result.get("telefon");
        dbAddress = result.get("adress");
        dbAID = result.get("aid");
        dbDate = result.get("anstallningsdatum");
        dbDepartment = result.get("avdelning");
        
        // Get information from editor
        
        if (Helper.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfID, tfDate, tfDepartment)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String firstName, lastName, email, phone, address, aid, date, department;
        
        firstName = tfFirstName.getText();
        lastName = tfLastName.getText();
        email = tfEmail.getText();
        phone = tfPhone.getText();
        address = tfAddress.getText();
        aid = tfID.getText();
        date = tfDate.getText();
        department = tfDepartment.getText();
        
        
        
        // Compare for changes
        
        StringBuilder builder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(", ");
        
        builder.append("UPDATE anstalld ");

        if (Helper.hasChanged(dbFirstName, firstName)) {
            joiner.add("SET fornamn = '%s'".formatted(firstName));
        }
        
        if (Helper.hasChanged(dbLastName, lastName)) {
            joiner.add("SET efternamn = '%s'".formatted(lastName));
        }
        
        if (Helper.hasChanged(dbEmail, email)) {
            joiner.add("SET epost = '%s'".formatted(email));
        }
        
        if (Helper.hasChanged(dbPhone, phone)) {
            joiner.add("SET telefon = '%s'".formatted(phone));
        }
        
        if (Helper.hasChanged(dbAddress, address)) {
            joiner.add("SET adress = '%s'".formatted(address));
        }
        
        if (Helper.hasChanged(dbAID, aid)) {
            joiner.add("SET aid = '%s'".formatted(aid));
        }
        
        if (Helper.hasChanged(dbDate, date)) {
            joiner.add("SET anstallningsdatum = '%s'".formatted(date));
        }
        
        if (Helper.hasChanged(dbDepartment, department)) {
            joiner.add("SET avdelning = '%s'".formatted(department));
        }
        
        builder.append(joiner.toString());
        builder.append(" WHERE aid = %s".formatted(aid));
        
        if (joiner.length() <= 0) {
            lblMessage.setText("Inget ändrades");
            return;
        }
        
        try {
            db.update(builder.toString());
            lblMessage.setText("Ändringar sparades");
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (Helper.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfID, tfDate, tfDepartment)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String firstName, lastName, email, phone, address, aid, date, department;
        
        firstName = tfFirstName.getText();
        lastName = tfLastName.getText();
        email = tfEmail.getText();
        phone = tfPhone.getText();
        address = tfAddress.getText();
        date = tfDate.getText();
        department = tfDepartment.getText();
        
        try {
            aid = db.getAutoIncrement("anstalld", "aid");
            
            String query = """
                           INSERT INTO anstalld 
                           VALUES(%s, '%s', '%s', '%s', '%s', '%s', '%s', %s)
                           
                           """.formatted(aid, firstName, lastName, address, email, phone, Helper.generatePassword(11), department);
            db.insert(query);
            
            list.addElement(aid + " - " + firstName + " " + lastName);
            
        } catch (InfException ignored) {}   
    }//GEN-LAST:event_btnCreateActionPerformed

    private void clear() {
        Helper.clearTextFields(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfID, tfDate, tfDepartment);
        employeeList.clearSelection();
        selectedAID = "";
        btnChange.setEnabled(false);
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(false);
        tfID.setEnabled(false);
    }
   
    private void updateFields() {
        
        HashMap<String, String> result = SQL.getInstance().getEmployeeByAid(selectedAID);
           
        tfFirstName.setText(result.get("fornamn"));
        tfLastName.setText(result.get("efternamn"));
        tfEmail.setText(result.get("epost"));
        tfPhone.setText(result.get("telefon"));
        tfAddress.setText(result.get("adress"));
        tfID.setText(result.get("aid"));
        tfDate.setText(result.get("anstallningsdatum"));
        tfDepartment.setText(result.get("avdelning"));

        switch (fetchRole(selectedAID)) {
            case Role.Manager:
                rbManager.setSelected(true);
                rbAdmin.setSelected(false);
                break;
            case Role.Admin:
                rbManager.setSelected(false);
                rbAdmin.setSelected(true);
                break;
        }
    }
    
    private void setUpList() {
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
                list.addElement(row.get("aid") + " - " +row.get("fornamn") + " " + row.get("efternamn"));
            }
            
        } catch (InfException ignored) {}    
    }
    
    private Role fetchRole(String aid) {
        try {
            // Kolla admin
            String adminQuery = "SELECT aid FROM admin WHERE aid = '%s'".formatted(aid);
            if (db.fetchSingle(adminQuery) != null) {
                return Role.Admin;
            }
            
            // Kolla handläggare
            String managerQuery = "SELECT aid FROM handlaggare WHERE aid = '%s'".formatted(aid);
            if (db.fetchSingle(managerQuery) != null) {
                return Role.Manager;
            }

        } catch (InfException ignored) {}
        
        return Role.Employee;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JList<String> employeeList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JPanel pnlAdminCountry;
    private javax.swing.JPanel pnlAdminDepartment;
    private javax.swing.JPanel pnlAdminEmployee;
    private javax.swing.JPanel pnlAdminGoals;
    private javax.swing.JPanel pnlAdminPartner;
    private javax.swing.JPanel pnlAdminProject;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbManager;
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
