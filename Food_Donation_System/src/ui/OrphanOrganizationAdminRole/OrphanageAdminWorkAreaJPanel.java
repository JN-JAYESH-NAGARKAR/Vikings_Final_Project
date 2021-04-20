/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.OrphanOrganizationAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import javax.swing.JPanel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class OrphanageAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrphanageAdminWorkAreaJPanel
     */
    public OrphanageAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        
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
        addJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orgNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        orgLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        orgLocation1 = new javax.swing.JTextField();

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
                "Order ID", "Order request Time", "Order Delivery Time", "Status", "New servings"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 111, 581, 157));

        addJButton.setBackground(new java.awt.Color(255, 255, 255));
        addJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(25, 56, 82));
        addJButton.setText("Submit");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Email ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        orgNameTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        orgNameTextField.setForeground(new java.awt.Color(25, 56, 82));
        orgNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orgNameTextFieldFocusLost(evt);
            }
        });
        add(orgNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 230, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Contact Number");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        orgLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgLocationActionPerformed(evt);
            }
        });
        add(orgLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 230, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGE INDIVIDUAL RECEIVER ORGANIZATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 34, 581, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergency512x.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 520, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergencyIconBlue128x.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("No Of Servings");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        orgLocation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgLocation1ActionPerformed(evt);
            }
        });
        add(orgLocation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

//        Type type = (Type) organizationJComboBox.getSelectedItem();
//
//        if("".equals(orgNameTextField.getText())) {
//            JOptionPane.showMessageDialog(null, "Enter organization name!");
//        }else if("".equals(orgLocation.getText())) {
//            JOptionPane.showMessageDialog(null, "Please set a location");
//        }else {
//            locationPoint = orgLocation.getText();
//            Organization organization = directory.createOrganization(type,orgNameTextField.getText(), locationPoint);
//            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
//
//            populateTable();
//            resetFields();
//        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void orgNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgNameTextFieldFocusLost

    }//GEN-LAST:event_orgNameTextFieldFocusLost

    private void orgLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgLocationActionPerformed

    private void orgLocation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgLocation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgLocation1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orgLocation;
    private javax.swing.JTextField orgLocation1;
    private javax.swing.JTextField orgNameTextField;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
