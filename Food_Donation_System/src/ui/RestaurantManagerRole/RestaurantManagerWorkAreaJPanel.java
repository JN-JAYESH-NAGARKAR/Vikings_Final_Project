/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Menu.Item;
//import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.RestaurantManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class RestaurantManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private RestaurantManagerOrganization managerOrganization;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public RestaurantManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise ,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        valueLabel1.setText(userAccount.getUsername());
        System.out.println(enterprise.getName());
        this.managerOrganization = (RestaurantManagerOrganization)organization;
        processJButton.setVisible(false);      //--jayesh  set visibilty of not useful button to false
        populateTable();
        populateMenuTable();
        populateCombo();
    }
    public void populateCombo(){
        comboDeliveryManList.removeAllItems();
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            
        }
    }
    
    public void populateMenuTable(){
        DefaultTableModel model = (DefaultTableModel)menuJTable.getModel();
        
        model.setRowCount(0);
        
        if(true){
            for(Item item : enterprise.getMenu().getItemList()){
            Object[] row = new Object[3];
            row[0] = item;
            row[1] = item.getName();
            row[2] = item.getPrice();
            System.out.println(item.getName());
            
            model.addRow(row);
        }
        }
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : managerOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            if(request.getStatus().equals("Rejected")) continue;
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getDeliveryman();
            
            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        btnAcceptOrder = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        btnRejectOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAddItemMenu = new javax.swing.JTextField();
        btnAddItemMenu = new javax.swing.JButton();
        btnDeleteItemMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboDeliveryManList = new javax.swing.JComboBox<>();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Item", "Customer", "Restaurant Manager", "Order Status", "Delivery Personl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Menu");

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuJTable);

        btnRejectOrder.setText("Reject Order");
        btnRejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter New Item to add");

        btnAddItemMenu.setText("Add Item");
        btnAddItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemMenuActionPerformed(evt);
            }
        });

        btnDeleteItemMenu.setText("Delete Item");
        btnDeleteItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemMenuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Enter price for new item");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel1.setText("Manager Username");

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel1.setText("<value>");

        jLabel4.setText("Delivery Man");

        comboDeliveryManList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel)
                        .addGap(65, 65, 65)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(comboDeliveryManList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAcceptOrder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)
                            .addComponent(processJButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtAddItemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(btnAddItemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeleteItemMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptOrder)
                    .addComponent(processJButton)
                    .addComponent(btnRejectOrder)
                    .addComponent(jLabel4)
                    .addComponent(comboDeliveryManList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddItemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItemMenu)
                    .addComponent(btnDeleteItemMenu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Accepted");
        //--jayesh set deliveryman in request by searching useraccount based on the username
        UserAccount ua = null;
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
           ua = org.getUserAccountDirectory().searchUser((String)comboDeliveryManList.getSelectedItem());
        }
        System.out.println("RestaurantManagerWorkAreaJPanel line number 338--------------------------" + ua.getUsername());
        request.setDeliveryman(ua);
        ua.getWorkQueue().addRequest(request);
        
        
        populateTable();
        
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
      
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnDeleteItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemMenuActionPerformed
        // TODO add your handling code here:
        int selectedRow = menuJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Item item = (Item)menuJTable.getValueAt(selectedRow, 0);
        enterprise.getMenu().removeItem(item);
        populateMenuTable();
    }//GEN-LAST:event_btnDeleteItemMenuActionPerformed

    private void btnAddItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemMenuActionPerformed
        // TODO add your handling code here:
        String itemName = txtAddItemMenu.getText();
        double itemPrice = Double.parseDouble(txtPrice.getText()) ;
        enterprise.getMenu().addItem(new Item(itemName,itemPrice));
        txtAddItemMenu.setText("");
        txtPrice.setText("");
        populateMenuTable();
        
        
    }//GEN-LAST:event_btnAddItemMenuActionPerformed

    private void btnRejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Rejected");
        populateTable();
    }//GEN-LAST:event_btnRejectOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnAddItemMenu;
    private javax.swing.JButton btnDeleteItemMenu;
    private javax.swing.JButton btnRejectOrder;
    private javax.swing.JComboBox<String> comboDeliveryManList;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField txtAddItemMenu;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
