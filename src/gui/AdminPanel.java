package gui;

import helpers.Helper;
import helpers.SQL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.Role;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminPanel extends javax.swing.JPanel {
    
    private final InfDB db;
    private final DefaultListModel<String> listModel;
    private String selectedAid = "";
    private Role role;
    
    public AdminPanel() {
        initComponents();
        db = SQL.getInstance().getDB();
        listModel = (DefaultListModel<String>) employeeList.getModel();
        setUpList();
        
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        tfPassword.setEnabled(false);
        tfID.setEnabled(false);
        lblDate.setToolTipText("yyyy-mm-dd");
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
        lblPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblMentor = new javax.swing.JLabel();
        tfMentor = new javax.swing.JTextField();
        lblResponsiblity = new javax.swing.JLabel();
        tfResponsibility = new javax.swing.JTextField();
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

        lblDate.setText("Anställningsdatum 🛈");

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

        lblRole.setText("Roll");

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

        lblPassword.setText("Lösenord");

        lblMentor.setText("Mentor");

        lblResponsiblity.setText("Ansvarighetsområde");

        javax.swing.GroupLayout pnlAdminEmployeeLayout = new javax.swing.GroupLayout(pnlAdminEmployee);
        pnlAdminEmployee.setLayout(pnlAdminEmployeeLayout);
        pnlAdminEmployeeLayout.setHorizontalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblEmail)))
                                            .addComponent(lblAddress)))
                                    .addComponent(lblDate))
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminEmployeeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRole)
                                            .addComponent(rbManager))
                                        .addGap(18, 18, 18)
                                        .addComponent(rbAdmin)
                                        .addGap(57, 57, 57))
                                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDepartment, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDepartment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)))
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminEmployeeLayout.createSequentialGroup()
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfMentor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfResponsibility, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAdminEmployeeLayout.createSequentialGroup()
                                                .addComponent(lblResponsiblity)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(4, 4, 4))
                                    .addComponent(lblMentor)
                                    .addComponent(lblID)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315)
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(77, 77, 77))
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlAdminEmployeeLayout.setVerticalGroup(
            pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFirstName)
                                            .addComponent(lblLastName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                        .addComponent(lblResponsiblity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfResponsibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(lblPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addComponent(lblMentor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAddress)
                                    .addComponent(lblID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addComponent(lblDepartment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDate)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAdminEmployeeLayout.createSequentialGroup()
                                .addComponent(lblRole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbManager)
                                    .addComponent(rbAdmin))))
                        .addGap(39, 39, 39)
                        .addGroup(pnlAdminEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreate)
                            .addComponent(btnChange)
                            .addComponent(btnClear)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        selectedAid = employeeList.getSelectedValue().split("-")[0].trim();
        
        updateFields();
        btnChange.setEnabled(true);
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(true);
        tfPassword.setEnabled(true);
        tfID.setEnabled(true);
        
        if (rbManager.isSelected()) {
            tfMentor.setEnabled(true);
            tfResponsibility.setEnabled(true);
            
        } else if (rbAdmin.isSelected()) {
            tfMentor.setEnabled(false);
            tfResponsibility.setEnabled(false);
        }
    }//GEN-LAST:event_employeeListMouseClicked
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(selectedAid.isBlank()) {
            return;
        }
        
        int option = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill ta bort användaren?", "Bekräftelse", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            
            String query1 = "UPDATE projekt SET projekt.projektchef = NULL WHERE projekt.projektchef = %s".formatted(selectedAid);
            String query2 = "DELETE FROM ans_proj WHERE ans_proj.aid = %s".formatted(selectedAid);
            String query3 = "DELETE FROM admin WHERE admin.aid = %s".formatted(selectedAid);
            String query4 = "UPDATE handlaggare SET handlaggare.mentor = NULL WHERE handlaggare.mentor = %s".formatted(selectedAid);
            String query5 = "UPDATE avdelning SET avdelning.chef = NULL WHERE avdelning.chef = %s".formatted(selectedAid);
            String query6 = "DELETE FROM handlaggare WHERE handlaggare.aid = %s".formatted(selectedAid);
            String query7 = "DELETE FROM anstalld WHERE anstalld.aid = %s".formatted(selectedAid);
            
            try {
                db.update(query1);
                db.delete(query2);
                db.delete(query3);
                db.update(query4);
                db.update(query5);
                db.delete(query6);
                db.delete(query7);
                
                Helper.removeListEntry(employeeList, listModel);
                clear();
                
            } catch(InfException ignored) {}
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdminActionPerformed
        rbAdmin.setSelected(true);
        rbManager.setSelected(false);
        tfMentor.setEnabled(false);
        tfMentor.setText("");
        tfResponsibility.setEnabled(false);
        tfResponsibility.setText("");
    }//GEN-LAST:event_rbAdminActionPerformed

    private void rbManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManagerActionPerformed
        rbManager.setSelected(true);
        rbAdmin.setSelected(false);
        tfMentor.setEnabled(true);
        tfResponsibility.setEnabled(true);
    }//GEN-LAST:event_rbManagerActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (selectedAid.isBlank()) {
            return;
        }

        HashMap<String, String> result = SQL.getInstance().getAllEmployeeInformationByAid(selectedAid);
        Role roleResult = helpers.SQL.getInstance().getRoleByAid(selectedAid);
        
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
        dbMentor = Helper.changeToEmptyStringIfNull(result.get("mentor"));
        dbResponsibility = Helper.changeToEmptyStringIfNull(result.get("ansvarighetsomrade"));
   
        if (Helper.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfID, tfDate, tfDepartment, tfPassword)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String errorMsg = Helper.validateFieldsToInt(tfID, tfDepartment, tfMentor);
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
        aid = tfID.getText();
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
        
        if (Helper.hasChanged(dbMentor, mentor) || Helper.hasChanged(dbResponsibility, responsibility)) {
            builder.append("JOIN handlaggare ON anstalld.aid = handlaggare.aid ".formatted(aid));
        }
        
        builder.append("SET ");
        
        if (Helper.hasChanged(dbFirstName, firstName)) {
            joiner.add("fornamn = '%s'".formatted(firstName));
        }
        
        if (Helper.hasChanged(dbLastName, lastName)) {
            joiner.add("efternamn = '%s'".formatted(lastName));
        }
        
        if (Helper.hasChanged(dbEmail, email)) {
            joiner.add("epost = '%s'".formatted(email));
        }
        
        if (Helper.hasChanged(dbPhone, phone)) {
            joiner.add("telefon = '%s'".formatted(phone));
        }
        
        if (Helper.hasChanged(dbAddress, address)) {
            joiner.add("adress = '%s'".formatted(address));
        }
        
        if (Helper.hasChanged(dbAID, aid)) {
            joiner.add("aid = '%s'".formatted(aid));
        }
        
        if (Helper.hasChanged(dbDate, date)) {
            joiner.add("anstallningsdatum = '%s'".formatted(date));
        }
        
        if (Helper.hasChanged(dbDepartment, department)) {
            joiner.add("avdelning = '%s'".formatted(department));
        }
        
        if (Helper.hasChanged(dbPassword, password)) {
            joiner.add("losenord = '%s'".formatted(password));
        }
        
        // Handläggare
        if (Helper.hasChanged(dbMentor, mentor)) {
            joiner.add("mentor = %s".formatted(mentor));
        }

        if (Helper.hasChanged(dbResponsibility, responsibility)) {
            joiner.add("ansvarighetsomrade = '%s'".formatted(responsibility));
        }

        builder.append(joiner.toString());
        builder.append(" WHERE anstalld.aid = %s".formatted(aid));
        
        String removeRoleQuery = "";
        String addRoleQuery = "";
        String setNullQuery = "";
        
        if (joiner.length() <= 0 && !Helper.hasChanged(dbRole, rbRole)) {
            lblMessage.setText("Inget ändrades");
            return;
        }
        
        if (Helper.hasChanged(dbRole, rbRole)) {
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
                System.out.println(builder.toString());
                db.update(builder.toString());
                
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
                
                String newListEntry = selectedAid + " - " + firstName + " " + lastName;
                Helper.updateListEntry(employeeList, listModel, newListEntry);
                
            } catch (InfException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (Helper.checkIfAnyFieldIsEmpty(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfDate, tfDepartment)) {
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
                           """.formatted(aid, firstName, lastName, address, email, phone, date, Helper.generatePassword(11), department);
            db.insert(query);
            
            
            String roleQuery = "";
            
            switch (role) {
                
                case Role.Admin:
                    roleQuery = "INSERT INTO admin VALUES(%s, %s)".formatted(aid, 1);
                    
                case Role.Manager:     
                    roleQuery = "INSERT INTO handlaggare VALUES(%s, '%s', %s)".formatted(aid, responsibility, mentor);
            }
            
            db.insert(roleQuery);
            
            listModel.addElement(aid + " - " + firstName + " " + lastName);
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_btnCreateActionPerformed

    private void clear() {
        Helper.clearTextFields(tfFirstName, tfLastName, tfEmail, tfPhone, tfAddress, tfID, tfDate, tfDepartment, tfPassword, tfResponsibility, tfMentor);
        employeeList.clearSelection();
        selectedAid = "";
        lblMessage.setText("");
        btnChange.setEnabled(false);
        btnCreate.setEnabled(true);
        btnDelete.setEnabled(false);
        tfID.setEnabled(false);
        tfPassword.setEnabled(false);
        rbManager.setSelected(true);
        rbAdmin.setSelected(false);
        tfMentor.setEnabled(true);
    }
   
    private void updateFields() {
        HashMap<String, String> result = SQL.getInstance().getAllEmployeeInformationByAid(selectedAid);
        String query = """
                       SELECT mentor from handlaggare
                       join anstalld
                       on handlaggare.aid = anstalld.aid
                       where anstalld.aid = %s
                       """.formatted(selectedAid);
       
        tfID.setText(result.get("aid"));
        tfFirstName.setText(result.get("fornamn"));
        tfLastName.setText(result.get("efternamn"));
        tfEmail.setText(result.get("epost"));
        tfPhone.setText(result.get("telefon"));
        tfAddress.setText(result.get("adress"));
        tfDate.setText(result.get("anstallningsdatum"));
        tfDepartment.setText(result.get("avdelning"));
        tfPassword.setText(result.get("losenord"));
        
        // Mentor
        tfMentor.setText(Helper.changeToEmptyStringIfNull(result.get("mentor")));
        tfResponsibility.setText(Helper.changeToEmptyStringIfNull(result.get("ansvarighetsomrade")));
 
        // Update role field
        role = SQL.getInstance().getRoleByAid(selectedAid);
        
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
                listModel.addElement(row.get("aid") + " - " +row.get("fornamn") + " " + row.get("efternamn"));
            }
            
        } catch (InfException ignored) {}    
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
    private javax.swing.JLabel lblMentor;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblResponsiblity;
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
    private javax.swing.JTextField tfMentor;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfResponsibility;
    private javax.swing.JTabbedPane tpProject;
    // End of variables declaration//GEN-END:variables
}
