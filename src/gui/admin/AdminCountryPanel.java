package gui.admin;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.CountryModel;
import models.KeyValue;
import oru.inf.InfDB;
import oru.inf.InfException;
import static shared.Shared.SESSION_AID;
import utils.MySQL;
import utils.ComponentManager;
import utils.QueryBuilder;
import validators.Validate;

public class AdminCountryPanel extends javax.swing.JPanel {
    
    private DefaultListModel<CountryModel> listModel;
    private InfDB db;
    private CountryModel selectedCountry;

    public AdminCountryPanel() {
        initComponents();
        
        // Lösning för NetBeans dåliga Swing GUI designer...
        if (MySQL.getInstance().getDB() != null) {
            db = MySQL.getInstance().getDB();
            setupList();
        }
        
        btnSave.setEnabled(false);
    }
    
    private void setupList() {
        listModel = (DefaultListModel<CountryModel>) listCountry.getModel();

        String query = "SELECT lid, namn FROM land;";

        try {
            ArrayList<HashMap<String,String>> countries = db.fetchRows(query);

            for (HashMap<String,String> country : countries) {
                String lid = country.get("lid");
                String namn = country.get("namn");
                listModel.addElement(new CountryModel(lid, namn));
            }

        } catch (InfException e) {
            e.printStackTrace();
        }    
    }
    
    private void updateFields() {
        String query = "SELECT * FROM land where lid = %s".formatted(selectedCountry.getLid());
        
        try {
            HashMap<String,String> result = db.fetchRow(query);
            
            tfName.setText(result.get("namn"));
            tfLanguage.setText(result.get("sprak"));
            tfCurrency.setText(result.get("valuta"));
            tfTimezone.setText(result.get("tidszon"));
            tfPolitics.setText(result.get("politisk_struktur"));
            tfEconomy.setText(result.get("ekonomi"));
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void clear() {
        ComponentManager.clearTextFields(tfName, tfLanguage, tfCurrency, tfTimezone, tfPolitics, tfEconomy);
        listCountry.clearSelection();
        selectedCountry = null;
        btnSave.setEnabled(false);
        btnCreate.setEnabled(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listCountry = new javax.swing.JList<>(new DefaultListModel());
        lblName = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        lblTimezone = new javax.swing.JLabel();
        lblPolitics = new javax.swing.JLabel();
        lblEconomy = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfLanguage = new javax.swing.JTextField();
        tfCurrency = new javax.swing.JTextField();
        tfTimezone = new javax.swing.JTextField();
        tfPolitics = new javax.swing.JTextField();
        tfEconomy = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        listCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listCountry);

        lblName.setText("Namn");

        lblLanguage.setText("Språk");

        lblCurrency.setText("Valuta");

        lblTimezone.setText("Tidszon");

        lblPolitics.setText("Politisk struktur");

        lblEconomy.setText("Ekonomi");

        btnSave.setText("Spara");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("Ta bort");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClear.setText("Töm");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCreate.setText("Skapa");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName)
                            .addComponent(lblCurrency)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPolitics, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                .addComponent(tfCurrency, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblPolitics)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreate)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEconomy)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnClear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRemove))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfEconomy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLanguage, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLanguage, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTimezone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTimezone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblLanguage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrency)
                    .addComponent(lblTimezone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTimezone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolitics)
                    .addComponent(lblEconomy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPolitics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEconomy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnRemove)
                    .addComponent(btnClear)
                    .addComponent(btnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCountryMouseClicked
        selectedCountry = listCountry.getSelectedValue();
        btnSave.setEnabled(true);
        btnCreate.setEnabled(false);
        updateFields();
    }//GEN-LAST:event_listCountryMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            
            String setNullQuery = "UPDATE stad SET land = null where land = %s".formatted(selectedCountry.getLid());
            String setNullQuery2 = "UPDATE projekt SET land = null where land = %s".formatted(selectedCountry.getLid());
            String deleteQuery = "DELETE FROM land WHERE lid = %s".formatted(selectedCountry.getLid());
            db.update(setNullQuery);
            db.update(setNullQuery2);
            db.delete(deleteQuery);
            ComponentManager.removeListEntry(listCountry, listModel);
            listCountry.clearSelection();
            selectedCountry = null;
            clear();
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (Validate.checkIfAnyFieldIsEmpty(tfName, tfLanguage, tfCurrency, tfEconomy, tfPolitics, tfTimezone)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (Validate.checkIfAnyFieldIsEmpty(tfName, tfLanguage, tfCurrency, tfEconomy, tfPolitics, tfTimezone)) {
            lblMessage.setText("Inget fält får vara tomt");
            return;
        } else {
            lblMessage.setText("");
        }
        
        String selectQuery = "SELECT * FROM land where lid = %s".formatted(selectedCountry.getLid());
        try {
            HashMap<String,String> dbEntry = db.fetchRow(selectQuery);
            HashMap<String,String> newEntry = new HashMap<>();
            
             newEntry = QueryBuilder.updateMap(newEntry, 
                new KeyValue("namn", tfName), 
                new KeyValue("sprak", tfLanguage),
                new KeyValue("valuta", tfCurrency),
                new KeyValue("tidszon", tfTimezone),
                new KeyValue("politisk_struktur", tfPolitics),
                new KeyValue("ekonomi", tfEconomy));
             
            String updateQuery = QueryBuilder.updateQuery(dbEntry, newEntry, "land", "lid = %s".formatted(selectedCountry.getLid()));
             
            if (updateQuery.isBlank()) {
                lblMessage.setText("Inga ändringar har gjorts");
                return;
            }
            
            if (JOptionPane.showConfirmDialog(null, "Är du säker på att du vill göra dessa ändringar?", "Bekräftelse", JOptionPane.YES_NO_OPTION) != 0){   
                lblMessage.setText("Inga ändringar har gjorts");
                return;
            }
            
            db.update(updateQuery);
            ComponentManager.updateListEntry(listCountry, listModel, new CountryModel(selectedCountry.getLid(), tfName.getText()));
            lblMessage.setText("Ändringar har sparats");
             
        } catch(InfException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblEconomy;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPolitics;
    private javax.swing.JLabel lblTimezone;
    private javax.swing.JList<CountryModel> listCountry;
    private javax.swing.JTextField tfCurrency;
    private javax.swing.JTextField tfEconomy;
    private javax.swing.JTextField tfLanguage;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPolitics;
    private javax.swing.JTextField tfTimezone;
    // End of variables declaration//GEN-END:variables
}
