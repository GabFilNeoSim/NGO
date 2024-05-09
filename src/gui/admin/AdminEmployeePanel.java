package gui.admin;

import java.util.ArrayList;
import java.util.HashMap;
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

        bgRole = new javax.swing.ButtonGroup();
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

        bgRole.add(rbManager);
        rbManager.setSelected(true);
        rbManager.setText("Manager");
        rbManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManagerActionPerformed(evt);
            }
        });

        bgRole.add(rbAdmin);
        rbAdmin.setText("Admin");
        rbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdminActionPerformed(evt);
            }
        });

        tfAddress.setText("Adress");

        tfFirstName.setText("Förnamn");

        tfDate.setText("Datum");

        tfEmail.setText("Epost");

        tfDepartment.setText("Avdelning");

        tfAid.setText("AnställningsId");

        tfMentor.setText("Mentor");

        tfLastName.setText("Efternamn");

        tfPhone.setText("Telefon");

        tfResponsibility.setText("Ansvarsområde");

        tfPassword.setText("Lösenord");

        lblDate.setText("Datum");

        lblEmail.setText("Epost");

        lblAddress.setText("Adress");

        lblPassword.setText("Lösenord");

        lblLastName.setText("Efternamn");

        lblFirstName.setText("Förnamn");

        lblMentor.setText("Mentor");

        lblDepartment.setText("Avdelning");

        lblPhone.setText("Telefon");

        lblAid.setText("AnställningsId");

        lblResponsibility.setText("Ansvarsområde");

        tfLevel.setText("Behörighetsnivå");

        lblLevel.setText("Behörighetsnivå");

        lblMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAid, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFirstName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblLastName))))
                            .addComponent(tfAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPassword)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMentor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResponsibility)
                                    .addComponent(tfResponsibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLevel)
                                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate)
                                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDepartment)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(lblMessage)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddress)
                                    .addComponent(lblDate)
                                    .addComponent(lblDepartment))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbManager)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addComponent(lblLastName))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAdmin)
                            .addComponent(tfAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAid))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhone)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword))))
                        .addGap(100, 100, 100)
                        .addComponent(lblMessage)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMentor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfResponsibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblResponsibility))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLevel)))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
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
        // TODO add your handling code here:
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
        //tfAid.setEnabled(true);
        
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
    private javax.swing.ButtonGroup bgRole;
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
