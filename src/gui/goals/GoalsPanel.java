package gui.goals;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import models.GoalsModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.MySQL;

public class GoalsPanel extends javax.swing.JPanel {

    private DefaultListModel<GoalsModel> listModel;
    private InfDB db;
    
    public GoalsPanel() {
        initComponents();
        
        // Lösning för NetBeans dåliga Swing GUI designer...
        if (MySQL.getInstance().getDB() != null) {
            db = MySQL.getInstance().getDB();
            setupGoalsList();
        }
    }

    private void setupGoalsList() {
        listModel = (DefaultListModel<GoalsModel>) listGoals.getModel();
        
        String query = "SELECT hallbarhetsmal.hid, hallbarhetsmal.namn FROM hallbarhetsmal";

        try {
            ArrayList<HashMap<String,String>> goals = db.fetchRows(query);
            
            for (HashMap<String,String> goal : goals) {
                listModel.addElement(new GoalsModel(
                        goal.get("hid"),
                        goal.get("namn")
                ));
            }
            
        } catch (InfException ignored) {}    
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spGoals = new javax.swing.JScrollPane();
        listGoals = new javax.swing.JList<>(new DefaultListModel());

        spGoals.setViewportView(listGoals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spGoals, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spGoals, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<GoalsModel> listGoals;
    private javax.swing.JScrollPane spGoals;
    // End of variables declaration//GEN-END:variables
}
