/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Menu.Item;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import Business.WorkQueue.OrphanWorkRequest;
import Business.WorkQueue.RestaurantRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.FoodDonationAdminRole.FoodDonationManageEmployeeJPanel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class RestaurantAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    RestaurantOrganization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
    String txtImagePath;
    
    public RestaurantAdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Network network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (RestaurantOrganization)organization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        //deleteMenu();
        
        RestaurantAdminDashboardJTable.getTableHeader().setDefaultRenderer(new TableColors());
        restaurantAdminMenuJTable.getTableHeader().setDefaultRenderer(new TableColors());
        populateStatus(organization);
        populateMenuTable();
        populateRestaurantAdminRequestDashboard();
    }
    public void deleteMenu(){
        
            organization.getMenu().removeallItem();
        
    }
    
    public void populateRestaurantAdminRequestDashboard(){
        DefaultTableModel model = (DefaultTableModel) RestaurantAdminDashboardJTable.getModel();
        model.setRowCount(0);

        for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
            System.out.println(req + "restaurant work area line number 70");
            
            RestaurantRequest restReq = (RestaurantRequest)req;
            System.out.println(restReq.getRequestingOrganiztionName() + "restReq.getRequestingOrganiztionName();");
            Object[] row = new Object[7];
            row[0] = restReq;
            row[1] = restReq.getRequestingOrganiztionName();
            row[2] = restReq.getRequestingOrganizationType();
            row[3] = restReq.getNoOfServings();
            row[4] = restReq.getRequestingOrganiztionName().getLocationPoint();
            row[5] = restReq.getEmailId();
            row[6] = restReq.getStatus();
            model.addRow(row);
        }
     
    }
    public void populateMenuTable(){
        
        DefaultTableModel model = (DefaultTableModel) restaurantAdminMenuJTable.getModel();
        model.setRowCount(0);
        for(Item item : organization.getMenu().getItemList()){
            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getNumberOfServings();
            model.addRow(row);
        }
    }
    public void populateStatus(Organization organization){
        if(organization instanceof RestaurantOrganization){
            RestaurantOrganization org = (RestaurantOrganization)organization;
            lblRestaurantStatus.setText(org.getIfCertified());
        
        }
    }
    public void resetFields(){
        txtFoodDescription.setText("");
        txtNoOfServing.setText("");
        lblImage.setText("");
        
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
        RestaurantAdminDashboardJTable = new javax.swing.JTable();
        lblRestaurantStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFoodDishName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFoodDishName = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        restaurantAdminMenuJTable = new javax.swing.JTable();
        btnUploadImage = new javax.swing.JLabel();
        txtNoOfServing = new javax.swing.JTextField();
        txtFoodDescription = new javax.swing.JTextField();
        btnProcess1 = new javax.swing.JLabel();
        btnDeleteItem = new javax.swing.JLabel();
        btnBuildOrder = new javax.swing.JLabel();
        lblQuantity1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestaurantAdminDashboardJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        RestaurantAdminDashboardJTable.setForeground(new java.awt.Color(25, 56, 82));
        RestaurantAdminDashboardJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Requesting Organization", "Requesting Organization Username", "No Of Serves", "Address", "Email ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RestaurantAdminDashboardJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(RestaurantAdminDashboardJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 880, 116));

        lblRestaurantStatus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblRestaurantStatus.setForeground(new java.awt.Color(25, 56, 82));
        lblRestaurantStatus.setText("approved/not approved");
        add(lblRestaurantStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergency512icon.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 22, -1, -1));

        txtFoodDishName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergencyEmployee512xxx.png"))); // NOI18N
        add(txtFoodDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("Restaurant Admin Work Area");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("Food Safety Certify:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 190, -1));

        lblFoodDishName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblFoodDishName.setForeground(new java.awt.Color(25, 56, 82));
        lblFoodDishName.setText("Food DIsh Description");
        lblFoodDishName.setToolTipText("");
        add(lblFoodDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, -1));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 330, 180));

        restaurantAdminMenuJTable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        restaurantAdminMenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food Description", "No Of Serves"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(restaurantAdminMenuJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 180));

        btnUploadImage.setBackground(new java.awt.Color(255, 255, 255));
        btnUploadImage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(25, 56, 82));
        btnUploadImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUploadImage.setText("Upload Food Image");
        btnUploadImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUploadImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUploadImageMousePressed(evt);
            }
        });
        add(btnUploadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 138, 20));

        txtNoOfServing.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtNoOfServing.setForeground(new java.awt.Color(25, 56, 82));
        txtNoOfServing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfServingActionPerformed(evt);
            }
        });
        add(txtNoOfServing, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 240, 30));

        txtFoodDescription.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtFoodDescription.setForeground(new java.awt.Color(25, 56, 82));
        txtFoodDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodDescriptionActionPerformed(evt);
            }
        });
        add(txtFoodDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 240, 30));

        btnProcess1.setBackground(new java.awt.Color(255, 255, 255));
        btnProcess1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProcess1.setForeground(new java.awt.Color(25, 56, 82));
        btnProcess1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProcess1.setText("Add New Item");
        btnProcess1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProcess1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddItemMousePressed(evt);
            }
        });
        add(btnProcess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 720, 138, 35));

        btnDeleteItem.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteItem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDeleteItem.setForeground(new java.awt.Color(25, 56, 82));
        btnDeleteItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteItem.setText("Delete Item");
        btnDeleteItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeleteItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteItemMousePressed(evt);
            }
        });
        add(btnDeleteItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 138, 35));

        btnBuildOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnBuildOrder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuildOrder.setForeground(new java.awt.Color(25, 56, 82));
        btnBuildOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuildOrder.setText("Build Order");
        btnBuildOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuildOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuildMousePressed(evt);
            }
        });
        add(btnBuildOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 720, 138, 35));

        lblQuantity1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblQuantity1.setForeground(new java.awt.Color(25, 56, 82));
        lblQuantity1.setText("No Of Servings");
        lblQuantity1.setToolTipText("");
        add(lblQuantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoOfServingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfServingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfServingActionPerformed

    private void txtFoodDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodDescriptionActionPerformed

    private void btnAddItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddItemMousePressed
        // TODO add your handling code here:
        Item item = new Item();
        item.setDescription(txtFoodDescription.getText());
        item.setNumberOfServings(Integer.parseInt(txtNoOfServing.getText()));
        item.setImagePath(txtImagePath);
        organization.getMenu().addItem(item);
        resetFields();
        populateMenuTable();
        
        JOptionPane.showMessageDialog(null, "added new item in the menu successfully!");
        
        ImageIcon icon = new ImageIcon("");
        Image image = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        lblImage.setIcon(icon);
        
    }//GEN-LAST:event_btnAddItemMousePressed

    private void btnDeleteItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteItemMousePressed
        // TODO add your handling code here:
        int selectedRow = restaurantAdminMenuJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a request row from Menu table!");
            return;
        }
        organization.getMenu().removeItem((Item)restaurantAdminMenuJTable.getValueAt(selectedRow, 0));
        populateMenuTable();
    }//GEN-LAST:event_btnDeleteItemMousePressed

    private void btnBuildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuildMousePressed
        // TODO add your handling code here:
        
        int selectedAdminRequestTableRow = RestaurantAdminDashboardJTable.getSelectedRow();            //bottom table
        
        
        if (selectedAdminRequestTableRow < 0){
            
            JOptionPane.showMessageDialog(null, "Please Select a request row from Request tables!");
            return;
        }
        
        RestaurantRequest requestReq = (RestaurantRequest)RestaurantAdminDashboardJTable.getValueAt(selectedAdminRequestTableRow, 0);
        
        
        
        
        RestaurantProcessOrderJPaneln restaurantProcessOrderJPanel = new RestaurantProcessOrderJPaneln(userProcessContainer,account,organization,network,requestReq);
        userProcessContainer.add("restaurantProcessOrder",restaurantProcessOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuildMousePressed

    private void btnUploadImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUploadImageMousePressed
        // TODO add your handling code here:
                       
         // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        txtImagePath = filename;
        //Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_SMOOTH );  //Image.SCALE_SMOOTH
        icon = new ImageIcon( image );
        lblImage.setIcon(icon);
        
    
    }//GEN-LAST:event_btnUploadImageMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RestaurantAdminDashboardJTable;
    private javax.swing.JLabel btnBuildOrder;
    private javax.swing.JLabel btnDeleteItem;
    private javax.swing.JLabel btnProcess1;
    private javax.swing.JLabel btnUploadImage;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFoodDishName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblQuantity1;
    private javax.swing.JLabel lblRestaurantStatus;
    private javax.swing.JTable restaurantAdminMenuJTable;
    private javax.swing.JTextField txtFoodDescription;
    private javax.swing.JLabel txtFoodDishName;
    private javax.swing.JTextField txtNoOfServing;
    // End of variables declaration//GEN-END:variables
}
