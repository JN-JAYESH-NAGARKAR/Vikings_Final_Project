/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodDeliveryEnterpriseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.FoodDonationAdminRole.FoodDonationManageEmployeeJPanel;
import ui.FoodDonationAdminRole.FoodDonationManageOrganizationJPanel;
import ui.FoodDonationAdminRole.FoodDonationManageUserAccountJPanel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodDeliveryEnterpriseAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FoodDeliveryEnterpriseAdminWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecosystem;
    public FoodDeliveryEnterpriseAdminWorkArea(JPanel userProcessContainer,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = business;
        System.out.println("fooddeliveryenterworkarea line number 31" + ecosystem);
        //manageOrganization();
    }
 private void manageOrganization(){
        FoodDeliveryManageOrganizationJPanel manageOrganizationJPanel = new FoodDeliveryManageOrganizationJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory(),enterprise);        
        rightSystemAdminPanel.add("manageOrganizationJPanel",manageOrganizationJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
 private void manageEmployee(){

        FoodDeliveryManageEmployeeJPanel manageEmployeeJPanel = new FoodDeliveryManageEmployeeJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory());
        rightSystemAdminPanel.add("manageEmployeeJPanel",manageEmployeeJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
 private void manageUser(){

        FoodDeliveryManageUserAccountJPanel muajp = new FoodDeliveryManageUserAccountJPanel(rightSystemAdminPanel, enterprise, ecosystem);
        rightSystemAdminPanel.add("manageUserAccountJPanel",muajp);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageOrganizationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JLabel();
        manageEmployee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageEmployeeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        manageUserAccount = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        manageUserAccountLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 153, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationPanel.setBackground(new java.awt.Color(255, 51, 51));
        manageOrganizationPanel.setToolTipText("");
        manageOrganizationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationPanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/department.png"))); // NOI18N
        jLabel2.setToolTipText("");

        manageOrganization.setBackground(new java.awt.Color(51, 255, 204));
        manageOrganization.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrganization.setText("Manage Organization");
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrganizationPanelLayout = new javax.swing.GroupLayout(manageOrganizationPanel);
        manageOrganizationPanel.setLayout(manageOrganizationPanelLayout);
        manageOrganizationPanelLayout.setHorizontalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageOrganizationPanelLayout.setVerticalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageOrganizationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageEmployee.setBackground(new java.awt.Color(255, 51, 51));
        manageEmployee.setToolTipText("");
        manageEmployee.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employeesmallicon24x.png"))); // NOI18N

        manageEmployeeLabel.setBackground(new java.awt.Color(255, 51, 51));
        manageEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Employee");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEmployeeLayout = new javax.swing.GroupLayout(manageEmployee);
        manageEmployee.setLayout(manageEmployeeLayout);
        manageEmployeeLayout.setHorizontalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEmployeeLayout.setVerticalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(manageEmployeeLayout.createSequentialGroup()
                        .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.add(manageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Manage Food Delivery Enterprise");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(51, 255, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 10));

        jSeparator1.setBackground(new java.awt.Color(51, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        manageUserAccount.setBackground(new java.awt.Color(255, 51, 51));
        manageUserAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccountMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginUser24x.png"))); // NOI18N

        manageUserAccountLabel.setBackground(new java.awt.Color(255, 51, 51));
        manageUserAccountLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageUserAccountLabel.setText("Manage User Account");
        manageUserAccountLabel.setPreferredSize(new java.awt.Dimension(115, 16));
        manageUserAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccountLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageUserAccountLayout = new javax.swing.GroupLayout(manageUserAccount);
        manageUserAccount.setLayout(manageUserAccountLayout);
        manageUserAccountLayout.setHorizontalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageUserAccountLayout.setVerticalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 40));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 153));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
       manageOrganization();
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrganizationPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationPanelMousePressed
        // TODO add your handling code here:
       manageOrganization();
    }//GEN-LAST:event_manageOrganizationPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
        manageEmployee();
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeMousePressed
        // TODO add your handling code here:
       manageEmployee();
    }//GEN-LAST:event_manageEmployeeMousePressed

    private void manageUserAccountLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccountLabelMousePressed
        // TODO add your handling code here:4
       manageUser();
    }//GEN-LAST:event_manageUserAccountLabelMousePressed

    private void manageUserAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccountMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageUserAccountMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageEmployee;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JPanel manageOrganizationPanel;
    private javax.swing.JPanel manageUserAccount;
    private javax.swing.JLabel manageUserAccountLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
