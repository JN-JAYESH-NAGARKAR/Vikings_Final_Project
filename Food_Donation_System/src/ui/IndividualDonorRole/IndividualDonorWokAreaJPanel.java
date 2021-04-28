/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.IndividualDonorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Menu.Item;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import Business.WorkQueue.IndividualWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class IndividualDonorWokAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndividualDonorWokAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
    String imagePath;
    
    public IndividualDonorWokAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
       
       individualDonorAdminMenuJTable.getTableHeader().setDefaultRenderer(new TableColors());
       this.userProcessContainer = userProcessContainer;
       this.account = account;
       this.organization = organization;
       this.enterprise = enterprise;
       this.network = network;
       this.business = business;
       lblIndividualDonorStatus.setText(((IndividualFoodDonorOrganization)organization).getIfCertified());
       
       
       populateMenuTable();
    }
    public void populateMenuTable(){
        IndividualFoodDonorOrganization org = (IndividualFoodDonorOrganization)organization;
        DefaultTableModel model = (DefaultTableModel)individualDonorAdminMenuJTable.getModel();
        model.setRowCount(0);
        for(Item item : org.getMenu().getItemList()){
            Object[] row = new Object[3];
            row[0] = item;
            row[1] = item.getDescription();
            row[2] = item.getNumberOfServings();
            model.addRow(row);
            
        }
    }
    public void resetTextField(){
        
        txtFoodDishName.setText("");
        //txtNoOfServings.setText("");
        
        
        ImageIcon icon = new ImageIcon("");
        Image image = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_SMOOTH );  //Image.SCALE_SMOOTH
        icon = new ImageIcon( image );
        lblImage.setIcon(icon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIndividualDonorStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFoodDishName = new javax.swing.JLabel();
        lblImageUploadBtn = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtFoodDishName = new javax.swing.JTextField();
        btnProcess1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        individualDonorAdminMenuJTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIndividualDonorStatus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblIndividualDonorStatus.setForeground(new java.awt.Color(25, 56, 82));
        lblIndividualDonorStatus.setText("approved/not approved");
        add(lblIndividualDonorStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 220, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("Menu Table");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("Food Safety Certify:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 190, -1));

        lblFoodDishName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblFoodDishName.setForeground(new java.awt.Color(25, 56, 82));
        lblFoodDishName.setText("Food DIsh Name");
        lblFoodDishName.setToolTipText("");
        add(lblFoodDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, -1));

        lblImageUploadBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblImageUploadBtn.setForeground(new java.awt.Color(25, 56, 82));
        lblImageUploadBtn.setText("Upload Image");
        lblImageUploadBtn.setToolTipText("");
        lblImageUploadBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblImageUploadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImageUploadBtnMousePressed(evt);
            }
        });
        add(lblImageUploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 110, -1));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 270, 180));

        txtFoodDishName.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtFoodDishName.setForeground(new java.awt.Color(25, 56, 82));
        txtFoodDishName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodDishNameActionPerformed(evt);
            }
        });
        add(txtFoodDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 30));

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
        add(btnProcess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, 138, 35));

        individualDonorAdminMenuJTable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        individualDonorAdminMenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Id", "Item Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(individualDonorAdminMenuJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 480, 180));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(25, 56, 82));
        jLabel10.setText("Individual Donor Work Area");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFoodDishNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodDishNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodDishNameActionPerformed

    private void btnAddItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddItemMousePressed
        // TODO add your handling code here:
        IndividualFoodDonorOrganization org = (IndividualFoodDonorOrganization)organization;
        //org.getMenu().getItemList().clear();
        if(org.getIfCertified().equals("not certified")){
              JOptionPane.showMessageDialog(null, "You are not yet certified by Food Inspector!");
              resetTextField();
              return;
          }
           if(txtFoodDishName.getText().equals("")){
               JOptionPane.showMessageDialog(null, "fill all the test fields");
               return;
           }
    
          
          
          Item item = new Item();
          item.setDescription(txtFoodDishName.getText());
          //item.setNumberOfServings(Integer.parseInt(txtNoOfServings.getText()));
          item.setImagePath(imagePath);
          item.setPostdate(new Date());
          item.setItemStatus("Available");
          item.setLocationOfIndividual(organization.getLocationPoint());
          org.getMenu().addItem(item);  //added menu
          
         
          
          JOptionPane.showMessageDialog(null, "Item added in your menu succefully!");
          populateMenuTable();
          resetTextField();
          
          
          

    }//GEN-LAST:event_btnAddItemMousePressed

    private void lblImageUploadBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageUploadBtnMousePressed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
         imagePath = filename;
        //Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_SMOOTH );  //Image.SCALE_SMOOTH
        icon = new ImageIcon( image );
        lblImage.setIcon(icon);
        
    }//GEN-LAST:event_lblImageUploadBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnProcess1;
    private javax.swing.JTable individualDonorAdminMenuJTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFoodDishName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImageUploadBtn;
    private javax.swing.JLabel lblIndividualDonorStatus;
    private javax.swing.JTextField txtFoodDishName;
    // End of variables declaration//GEN-END:variables
}
