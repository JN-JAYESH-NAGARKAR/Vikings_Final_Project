/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodInspectorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodDonation;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.IndividualReceiverOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodInspectorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodInspectorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;Network network;
    EcoSystem business;
    
    public FoodInspectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        populateTable();
        
    }

    public void populateTable(){
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodDonation){
                for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof RestaurantOrganization){
                        RestaurantOrganization restorg = (RestaurantOrganization)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationPoint();
                        row[3] = restorg.getIfCertified();
                        row[4] = restorg.getOfficerName();
                        model.addRow(row);
                    }else if(org instanceof PartyOrganizerOrganizatioin){
                        PartyOrganizerOrganizatioin restorg = (PartyOrganizerOrganizatioin)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationPoint();
                        row[3] = restorg.getIfCertified();
                        row[4] = restorg.getOfficerName();
                        model.addRow(row);
                    }else if(org instanceof IndividualFoodDonorOrganization){
                        IndividualFoodDonorOrganization restorg = (IndividualFoodDonorOrganization)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationPoint();
                        row[3] = restorg.getIfCertified();
                        row[4] = restorg.getOfficerName();
                        model.addRow(row);
                    }
                    
                }
            }
            
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        btnCertify = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAssignTome = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(25, 56, 82));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Organization name", "Organization type", "Address", "Cerified", "Inspecteer User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 165, 1050, 116));

        btnCertify.setBackground(new java.awt.Color(255, 255, 255));
        btnCertify.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCertify.setForeground(new java.awt.Color(25, 56, 82));
        btnCertify.setText("Certify");
        btnCertify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertifyActionPerformed(evt);
            }
        });
        add(btnCertify, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("MANAGE FOOD INSPECTOR WORK AREA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergency512icon.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 22, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergencyEmployee512xxx.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        btnAssignTome.setBackground(new java.awt.Color(255, 255, 255));
        btnAssignTome.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssignTome.setForeground(new java.awt.Color(25, 56, 82));
        btnAssignTome.setText("Assign to me");
        btnAssignTome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTomeActionPerformed(evt);
            }
        });
        add(btnAssignTome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCertifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertifyActionPerformed
        
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select row!");
            return;
        }
        Organization org = (Organization)organizationJTable.getValueAt(selectedRow, 0);
        if(org instanceof RestaurantOrganization ){
            RestaurantOrganization restorg = (RestaurantOrganization)org;
            if(restorg.getOfficerName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setIfCertified("Certified");
        }else if(org instanceof PartyOrganizerOrganizatioin){
            PartyOrganizerOrganizatioin restorg = (PartyOrganizerOrganizatioin)org;
            if(restorg.getOfficerName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setIfCertified("Certified");
        }else if(org instanceof IndividualFoodDonorOrganization){
            IndividualFoodDonorOrganization restorg = (IndividualFoodDonorOrganization)org;
            if(restorg.getOfficerName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setIfCertified("Certified");
        }
     
        populateTable();
    }//GEN-LAST:event_btnCertifyActionPerformed

    private void btnAssignTomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTomeActionPerformed
        int selectedRow = organizationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select row!");
            return;
        }
        Organization org = (Organization)organizationJTable.getValueAt(selectedRow, 0);
        if(org instanceof RestaurantOrganization ){
            RestaurantOrganization restorg = (RestaurantOrganization)org;
            restorg.setOfficerName(account.getUsername());
        }else if(org instanceof PartyOrganizerOrganizatioin){
            PartyOrganizerOrganizatioin restorg = (PartyOrganizerOrganizatioin)org;
            restorg.setOfficerName(account.getUsername());
        }else if(org instanceof IndividualFoodDonorOrganization){
            IndividualFoodDonorOrganization restorg = (IndividualFoodDonorOrganization)org;
            restorg.setOfficerName(account.getUsername());
        }
     
        populateTable();
    }//GEN-LAST:event_btnAssignTomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTome;
    private javax.swing.JButton btnCertify;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
