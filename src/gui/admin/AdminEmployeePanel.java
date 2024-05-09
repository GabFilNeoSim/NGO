package gui.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import managers.EmployeeManager;
import models.EmployeeModel;
import models.Role;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.ComponentManager;
import utils.MySQL;
import utils.Utils;
import validators.Validate;

public class AdminEmployeePanel extends javax.swing.JPanel {

    private DefaultListModel<EmployeeModel> listModel;
    private EmployeeModel selectedEmployee;
    private InfDB db;
    private Role role;
    
    public AdminEmployeePanel() {
        initComponents();
        
        // Lösning för NetBeans dåliga Swing GUI designer...
        if (MySQL.getInstance().getDB() != null) {
            db = MySQL.getInstance().getDB();
            setupList();
            
            btnChange.setEnabled(false);
            btnDelete.setEnabled(false);
            tfPassword.setEnabled(false);
            tfAid.setEnabled(false);
            lblDate.setToolTipText("yyyy-mm-dd");
        }
    }
    
    private void clear() {
        ComponentManager.clearTextFields(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfAid, tfDate, tfDepartment, tfPassword, tfResponsibility, tfMentor);
        listEmployee.clearSelection();
        selectedEmployee = null;
        lblMessage.setText("");
        btnChange.setEnabled(false);
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(false);
        tfAid.setEnabled(false);
        tfPassword.setEnabled(false);
        rbManager.setSelected(true);
        rbAdmin.setSelected(false);
        tfMentor.setEnabled(true);
    }
    
    private void setupList() {
        listModel = (DefaultListModel<EmployeeModel>) listEmployee.getModel();
        
        String query = """
                       SELECT anstalld.aid, anstalld.fornamn, anstalld.efternamn FROM anstalld
                       LEFT JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       LEFT JOIN admin ON anstalld.aid = admin.aid;
                       """;

        try {
            ArrayList<HashMap<String,String>> employees = db.fetchRows(query);
            
            for (HashMap<String,String> employee : employees) {
                listModel.addElement(new EmployeeModel(
                        employee.get("aid"),
                        employee.get("fornamn"),
                        employee.get("efternamn")
                ));
            }
            
        } catch (InfException ignored) {}    
    }
    
    private void updateFields() {
        HashMap<String, String> result = EmployeeManager.getAllEmployeeInformationByAid(selectedEmployee.getAid());
       
        tfAid.setText(result.get("aid"));
        tfFirstName.setText(result.get("fornamn"));
        tfLastName.setText(result.get("efternamn"));
        tfEmail.setText(result.get("epost"));
        tfPhone.setText(result.get("telefon"));
        tfAddress.setText(result.get("adress"));
        tfDate.setText(result.get("anstallningsdatum"));
        tfDepartment.setText(result.get("avdelning"));
        tfPassword.setText(result.get("losenord"));
        
        // Mentor
        tfMentor.setText(Utils.changeToEmptyStringIfNull(result.get("mentor")));
        tfResponsibility.setText(Utils.changeToEmptyStringIfNull(result.get("ansvarighetsomrade")));
 
        // Update role field
        role = EmployeeManager.getRoleByAid(selectedEmployee.getAid());
        
        switch (role) {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChange = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        spEmployee = new javax.swing.JScrollPane();
        listEmployee = new javax.swing.JList<>(new DefaultListModel());
        rbManager = new javax.swing.JRadioButton();
        rbAdmin = new javax.swing.JRadioButton();
        tfAddress = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDepartment = new javax.swing.JTextField();
        tfAid = new javax.swing.JTextField();
        tfMentor = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfResponsibility = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblMentor = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAid = new javax.swing.JLabel();
        lblResponsibility = new javax.swing.JLabel();
        tfLevel = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        btnChange.setText("Ändra");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnCreate.setText("Skapa ny");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear.setText("Töm fält");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setText("Ta bort");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        listEmployee.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEmployeeMouseClicked(evt);
            }
        });
        spEmployee.setViewportView(listEmployee);

        rbManager.setSelected(true);
        rbManager.setText("Handläggare");
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

        lblDate.setText("Anställningsdatum");

        lblEmail.setText("Epost");

        lblAddress.setText("Adress");

        lblPassword.setText("Lösenord");

        lblLastName.setText("Efternamn");

        lblFirstName.setText("Förnamn");

        lblMentor.setText("Mentor");

        lblDepartment.setText("Avdelning");

        lblPhone.setText("Telefonnummer");

        lblAid.setText("AnställningsId");

        lblResponsibility.setText("Ansvarsområde");

        lblLevel.setText("Behörighetsnivå");

        lblRole.setText("Roll");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(spEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfLastName)
                                                .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfPhone)
                                                .addComponent(lblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(lblDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfDepartment))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbManager)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfAddress)
                                                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tfDate)
                                                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tfEmail)
                                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfResponsibility)
                                        .addComponent(lblResponsibility, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(lblMentor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfMentor)
                                        .addComponent(lblAid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfAid)
                                        .addComponent(tfPassword)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLevel)
                            .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(spEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLastName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResponsibility)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfResponsibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMentor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAid)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbManager)
                            .addComponent(rbAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnChange)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(28, 28, 28)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (Validate.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfDate, tfDepartment)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String firstName, lastName, email, phone, address, aid, date, department, mentor, responsibility;
        
        if (rbAdmin.isSelected()) {
            role = Role.Admin;
        } else{
            role = Role.Manager;
        }
        
        firstName = tfFirstName.getText();
        lastName = tfLastName.getText();
        email = tfEmail.getText();
        phone = tfPhone.getText();
        address = tfAddress.getText();
        date = tfDate.getText();
        department = tfDepartment.getText();
        
        // Mentor
        mentor = tfMentor.getText();
        responsibility = tfResponsibility.getText();
        
        
        try {
            aid = db.getAutoIncrement("anstalld", "aid");
            
            String query = """
                           INSERT INTO anstalld 
                           VALUES(%s, '%s', '%s', '%s', '%s', '%s', '%s', '%s', %s)
                           """.formatted(aid, firstName, lastName, address, email, phone, date, Utils.generatePassword(11), department);
            db.insert(query);
            
            String roleQuery = "";
            
            switch (role) {
                
                case Role.Admin:
                    roleQuery = "INSERT INTO admin VALUES(%s, %s)".formatted(aid, 1);
                    
                case Role.Manager:     
                    roleQuery = "INSERT INTO handlaggare VALUES(%s, '%s', %s)".formatted(aid, responsibility, mentor);
            }
            
            db.insert(roleQuery);
            
            listModel.addElement(selectedEmployee);
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (selectedEmployee == null) {
            return;
        }

        HashMap<String, String> result = EmployeeManager.getAllEmployeeInformationByAid(selectedEmployee.getAid());
        Role roleResult = EmployeeManager.getRoleByAid(selectedEmployee.getAid());
        
        String dbFirstName, dbLastName, dbEmail, dbPhone, dbAddress, dbAID, dbDate, dbDepartment, dbPassword, dbMentor, dbResponsibility, dbRole;
        dbAID = result.get("aid");
        dbFirstName = result.get("fornamn");
        dbLastName = result.get("efternamn");
        dbEmail = result.get("epost");
        dbPhone = result.get("telefon");
        dbAddress = result.get("adress");
        dbDate = result.get("anstallningsdatum");
        dbDepartment = result.get("avdelning");
        dbPassword = result.get("losenord");
        dbRole = roleResult.toString();
        
        // Handläggare
        dbMentor = Utils.changeToEmptyStringIfNull(result.get("mentor"));
        dbResponsibility = Utils.changeToEmptyStringIfNull(result.get("ansvarighetsomrade"));
   
        if (Validate.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfAid, tfDate, tfDepartment, tfPassword)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String errorMsg = Validate.validateFieldsToInt(tfAid, tfDepartment, tfMentor);
        if (!errorMsg.isBlank()) {
            lblMessage.setText(errorMsg);
            return;
        }
        
        String firstName, lastName, email, phone, address, aid, date, department, password, mentor, responsibility, rbRole;
        firstName = tfFirstName.getText();
        lastName = tfLastName.getText();
        email = tfEmail.getText();
        phone = tfPhone.getText();
        address = tfAddress.getText();
        aid = tfAid.getText();
        date = tfDate.getText();
        department = tfDepartment.getText();
        password = tfPassword.getText();
        rbRole = "";
         
        if (rbManager.isSelected()) {
            rbRole = Role.Manager.toString();
        } else if (rbAdmin.isSelected()) {
            rbRole = Role.Admin.toString();
        }
        
        // Handläggare
        mentor = tfMentor.getText();
        responsibility = tfResponsibility.getText();
        
        StringBuilder builder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(", ");
        
        builder.append("UPDATE anstalld ");
        
        if (Validate.hasChanged(dbMentor, mentor) || Validate.hasChanged(dbResponsibility, responsibility)) {
            builder.append("JOIN handlaggare ON anstalld.aid = handlaggare.aid ".formatted(aid));
        }
        
        builder.append("SET ");
        
        if (Validate.hasChanged(dbFirstName, firstName)) {
            joiner.add("fornamn = '%s'".formatted(firstName));
        }
        
        if (Validate.hasChanged(dbLastName, lastName)) {
            joiner.add("efternamn = '%s'".formatted(lastName));
        }
        
        if (Validate.hasChanged(dbEmail, email)) {
            joiner.add("epost = '%s'".formatted(email));
        }
        
        if (Validate.hasChanged(dbPhone, phone)) {
            joiner.add("telefon = '%s'".formatted(phone));
        }
        
        if (Validate.hasChanged(dbAddress, address)) {
            joiner.add("adress = '%s'".formatted(address));
        }
        
        if (Validate.hasChanged(dbAID, aid)) {
            joiner.add("aid = '%s'".formatted(aid));
        }
        
        if (Validate.hasChanged(dbDate, date)) {
            joiner.add("anstallningsdatum = '%s'".formatted(date));
        }
        
        if (Validate.hasChanged(dbDepartment, department)) {
            joiner.add("avdelning = '%s'".formatted(department));
        }
        
        if (Validate.hasChanged(dbPassword, password)) {
            joiner.add("losenord = '%s'".formatted(password));
        }
        
        // Handläggare
        if (Validate.hasChanged(dbMentor, mentor)) {
            if (mentor.isBlank()) {
                mentor = "null";
            }
            joiner.add("mentor = %s".formatted(mentor));
        }

        if (Validate.hasChanged(dbResponsibility, responsibility)) {
            joiner.add("ansvarighetsomrade = '%s'".formatted(responsibility));
        }

        builder.append(joiner.toString());
        builder.append(" WHERE anstalld.aid = %s".formatted(aid));
        
        String removeRoleQuery = "";
        String addRoleQuery = "";
        String setNullQuery = "";
        
        if (joiner.length() <= 0 && !Validate.hasChanged(dbRole, rbRole)) {
            lblMessage.setText("Inget ändrades");
            return;
        }
        
        if (Validate.hasChanged(dbRole, rbRole)) {
            switch (rbRole) {
                case "Manager":
                    if (mentor.isBlank()) {
                        mentor = "null";
                    }
                    removeRoleQuery = "DELETE FROM admin WHERE aid = %s".formatted(aid);
                    addRoleQuery = "INSERT INTO handlaggare values (%s, '%s', %s)".formatted(aid, responsibility, mentor);

                    System.out.println(addRoleQuery);

                    break;
                case "Admin":
                    setNullQuery = "UPDATE handlaggare set mentor = null where mentor = %s".formatted(aid);
                    removeRoleQuery = "DELETE FROM handlaggare WHERE aid = %s".formatted(aid);
                    addRoleQuery = "INSERT INTO admin values (%s, %s)".formatted(aid, 1);
                    break;
            }
        }

        int option = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra användaren?", "Bekräftelse", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            try {
                if (joiner.length() > 0) {
                    db.update(builder.toString());
                }
                if (!setNullQuery.isBlank()) {
                    db.update(setNullQuery);
                }
                if (!removeRoleQuery.isBlank()) {
                    db.delete(removeRoleQuery);
                }
                if (!addRoleQuery.isBlank()) {
                    db.insert(addRoleQuery);
                }
                
                lblMessage.setText("Ändringar sparades");
                
                ComponentManager.updateListEntry(
                        listEmployee,
                        listModel,
                        new EmployeeModel(aid, firstName, lastName)
                );
                
            } catch (InfException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(selectedEmployee == null) {
            return;
        }
        
        int option = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill ta bort användaren?", "Bekräftelse", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            
            String query1 = "UPDATE projekt SET projekt.projektchef = NULL WHERE projekt.projektchef = %s".formatted(selectedEmployee.getAid());
            String query2 = "DELETE FROM ans_proj WHERE ans_proj.aid = %s".formatted(selectedEmployee.getAid());
            String query3 = "DELETE FROM admin WHERE admin.aid = %s".formatted(selectedEmployee.getAid());
            String query4 = "UPDATE handlaggare SET handlaggare.mentor = NULL WHERE handlaggare.mentor = %s".formatted(selectedEmployee.getAid());
            String query5 = "UPDATE avdelning SET avdelning.chef = NULL WHERE avdelning.chef = %s".formatted(selectedEmployee.getAid());
            String query6 = "DELETE FROM handlaggare WHERE handlaggare.aid = %s".formatted(selectedEmployee.getAid());
            String query7 = "DELETE FROM anstalld WHERE anstalld.aid = %s".formatted(selectedEmployee.getAid());
            
            try {
                db.update(query1);
                db.delete(query2);
                db.delete(query3);
                db.update(query4);
                db.update(query5);
                db.delete(query6);
                db.delete(query7);
                
                ComponentManager.removeListEntry(listEmployee, listModel);
                clear();
                
            } catch(InfException ignored) {}
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void listEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmployeeMouseClicked
        selectedEmployee = listEmployee.getSelectedValue();
        
        updateFields();
        btnChange.setEnabled(true);
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(true);
        tfPassword.setEnabled(true);
        tfAid.setEnabled(true);
        
        if (rbManager.isSelected()) {
            tfMentor.setEnabled(true);
            tfResponsibility.setEnabled(true);
            
        } else if (rbAdmin.isSelected()) {
            tfMentor.setEnabled(false);
            tfResponsibility.setEnabled(false);
        }
    }//GEN-LAST:event_listEmployeeMouseClicked

    private void rbManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManagerActionPerformed
        rbManager.setSelected(true);
        rbAdmin.setSelected(false);
        tfMentor.setEnabled(true);
        tfResponsibility.setEnabled(true);
    }//GEN-LAST:event_rbManagerActionPerformed

    private void rbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdminActionPerformed
        rbAdmin.setSelected(true);
        rbManager.setSelected(false);
        tfMentor.setEnabled(false);
        tfMentor.setText("");
        tfResponsibility.setEnabled(false);
        tfResponsibility.setText("");
    }//GEN-LAST:event_rbAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAid;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMentor;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblResponsibility;
    private javax.swing.JLabel lblRole;
    private javax.swing.JList<EmployeeModel> listEmployee;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbManager;
    private javax.swing.JScrollPane spEmployee;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAid;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDepartment;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfMentor;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfResponsibility;
    // End of variables declaration//GEN-END:variables
}
