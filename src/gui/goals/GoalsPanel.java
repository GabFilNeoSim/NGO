package gui.goals;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import managers.GoalManager;
import models.GoalsModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.MySQL;

public class GoalsPanel extends javax.swing.JPanel {

    private DefaultListModel<GoalsModel> listModel;
    private InfDB db;
    private GoalsModel selectedGoal;
    
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
    
    private void updateFields() {
        HashMap<String, String> result = GoalManager.getGoalsInformation(selectedGoal.getHid());
       
        tfGoalsNumber.setText(result.get("malnummer"));
        tfPrioGoal.setText(result.get("prioritet"));
        taDescription.setText(result.get("beskrivning"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spGoals = new javax.swing.JScrollPane();
        listGoals = new javax.swing.JList<>(new DefaultListModel());
        lblDescription = new javax.swing.JLabel();
        lblGoalsNumber = new javax.swing.JLabel();
        tfGoalsNumber = new javax.swing.JTextField();
        lblPrioGoal = new javax.swing.JLabel();
        tfPrioGoal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        lblTitleGoals = new javax.swing.JLabel();

        listGoals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listGoalsMouseClicked(evt);
            }
        });
        spGoals.setViewportView(listGoals);

        lblDescription.setText("Beskrivning");

        lblGoalsNumber.setText("Målnummer");

        lblPrioGoal.setText("Prioritet");

        taDescription.setColumns(20);
        taDescription.setLineWrap(true);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        lblTitleGoals.setText("Hållbarhetsmål");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGoals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleGoals))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGoalsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGoalsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrioGoal)
                            .addComponent(tfPrioGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(483, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(lblTitleGoals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGoalsNumber)
                            .addComponent(lblPrioGoal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGoalsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrioGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(495, Short.MAX_VALUE))
                    .addComponent(spGoals)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listGoalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listGoalsMouseClicked
        selectedGoal = listGoals.getSelectedValue();
        updateFields();
    }//GEN-LAST:event_listGoalsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblGoalsNumber;
    private javax.swing.JLabel lblPrioGoal;
    private javax.swing.JLabel lblTitleGoals;
    private javax.swing.JList<GoalsModel> listGoals;
    private javax.swing.JScrollPane spGoals;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfGoalsNumber;
    private javax.swing.JTextField tfPrioGoal;
    // End of variables declaration//GEN-END:variables

}
