/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodReceiverEnterpriseAdmineRole;

import Business.Enterprise.Enterprise;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.IndividualReceiverOrganization;
import Business.Organization.OldAgeOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.Organization.OrphanageOrganization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.Utils.TableColors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodReceiverManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodReceiverManageOrganizationJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private String locationPoint;
    public FoodReceiverManageOrganizationJPanel(JPanel rightSystemAdminPanel,OrganizationDirectory directory,Enterprise enterprise) {
        initComponents();
         organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
         this.userProcessContainer = rightSystemAdminPanel;
        this.directory = directory;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
        jButton1.setVisible(false);  //location feature is not added right now
    }
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        /*for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }*/
        organizationJComboBox.addItem(Organization.Type.Orphanage);
        organizationJComboBox.addItem(Organization.Type.Oldage);
        organizationJComboBox.addItem(Organization.Type.IndividualReceiver);
        
    }
    public void resetFields() {
        orgNameTextField.setText("");
        orgLocation.setText("");
    }
    private void populateTable(){
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
        {
            System.out.println(organization.getLocationPoint() + " Food LOCATION");

              if(organization instanceof RestaurantOrganization || organization instanceof PartyOrganizerOrganizatioin || 
                      organization instanceof IndividualFoodDonorOrganization ||
                      organization instanceof OrphanageOrganization || organization instanceof OldAgeOrganization || 
                      organization instanceof IndividualReceiverOrganization){
                Object[] row = new Object[3];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                row[2] = organization.getLocationPoint();
                //row[2] = org.getPosition();
                model.addRow(row);
             }
            //}
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
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orgNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        orgLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(25, 56, 82));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization Type", "Organization Name", "Organization Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 415, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 286, 227, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Organization Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        orgNameTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        orgNameTextField.setForeground(new java.awt.Color(25, 56, 82));
        orgNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orgNameTextFieldFocusLost(evt);
            }
        });
        add(orgNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 331, 230, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Location Address");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        orgLocation.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add(orgLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 374, 230, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 56, 82));
        jButton1.setLabel("Click to Select Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 374, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGE FOOD RECEIVER ORGANIZATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 34, 581, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();

        if("".equals(orgNameTextField.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        }else if("".equals(orgLocation.getText())) {
            JOptionPane.showMessageDialog(null, "Please set a location");
        }else {
            locationPoint = orgLocation.getText();
            Organization organization = directory.createOrganization(type,orgNameTextField.getText(), locationPoint);
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");

            populateTable();
            resetFields();
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void orgNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgNameTextFieldFocusLost

    }//GEN-LAST:event_orgNameTextFieldFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //        OrganizationLocationJPanel muajp = new OrganizationLocationJPanel(userProcessContainer);
        //        userProcessContainer.add("OrganizationLocationJPanel", muajp);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orgLocation;
    private javax.swing.JTextField orgNameTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
