package gui.admin;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import models.CountryModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.MySQL;

public class AdminCountryPanel extends javax.swing.JPanel {
    
    private DefaultListModel<CountryModel> listModel;
    private InfDB db;

    public AdminCountryPanel() {
        initComponents();
        
        // Lösning för NetBeans dåliga Swing GUI designer...
        if (MySQL.getInstance().getDB() != null) {
            db = MySQL.getInstance().getDB();
            setupList();
        }
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listCountry = new javax.swing.JList<>(new DefaultListModel());

        jScrollPane1.setViewportView(listCountry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1040, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<CountryModel> listCountry;
    // End of variables declaration//GEN-END:variables
}
