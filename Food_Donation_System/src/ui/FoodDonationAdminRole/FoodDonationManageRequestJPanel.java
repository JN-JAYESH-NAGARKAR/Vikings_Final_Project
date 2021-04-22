/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodDonationAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodReceiver;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.OrphanageOrganization;
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import Business.WorkQueue.OrphanWorkRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.RestaurantRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodDonationManageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodDonationManageRequest
     */
    JPanel rightSystemAdminPanel;
    OrganizationDirectory organizationDirectory;
    EcoSystem system;
    Network network;
    
    public FoodDonationManageRequestJPanel(JPanel rightSystemAdminPanel, OrganizationDirectory organizationDirectory,
        
        Network network,EcoSystem system) {
        initComponents();
        requestJTable.getTableHeader().setDefaultRenderer(new TableColors());
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        this.rightSystemAdminPanel = rightSystemAdminPanel;
        this.organizationDirectory = organizationDirectory;
        this.network = network;
        this.system = system;
        populateFoodDonationOrganizationTable();
        populateRequestTable();
    }
    
    public void populateFoodDonationOrganizationTable(){
        
       DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        for (Organization organization : organizationDirectory.getOrganizationList()){
            Object[] row = new Object[6];
            
            if(organization instanceof RestaurantOrganization){
                RestaurantOrganization  org = (RestaurantOrganization)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[2] = org.getUserAccountDirectory().getUserAccountList().get(0);
                row[3] = org.calculateNumberOfServings();
                row[4] = org.getIfCertified();
                row[5] = org.getLocationPoint();
                
            }else if(organization instanceof PartyOrganizerOrganizatioin){
                PartyOrganizerOrganizatioin  org = (PartyOrganizerOrganizatioin)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[3] = org.calculateNumberOfServings();
                row[4] = org.getIfCertified();
                row[5] = org.getLocationPoint();
                
            }else if(organization instanceof IndividualFoodDonorOrganization){
                IndividualFoodDonorOrganization  org = (IndividualFoodDonorOrganization)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[3] = org.calculateNumberOfServings();
                row[4] = org.getIfCertified();
                row[5] = org.getLocationPoint();
                
            }
            
            
            model.addRow(row);
            
            
                    
        }
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        model.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
           if(enterprise instanceof FoodReceiver){
               for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof OrphanageOrganization){
                        for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
                            OrphanWorkRequest foodReceiverReq = (OrphanWorkRequest)req;
                            Object[] row = new Object[7];
                            row[0] = foodReceiverReq; 
                            row[1] = foodReceiverReq.getRequestingOrganization();
                            row[2] = foodReceiverReq.getRequestingOrganizationType();
                            row[3] = foodReceiverReq.getRequestingOrganizationUser();
                            row[4] = foodReceiverReq.getNo_of_servings();
                            row[5] = foodReceiverReq.getStatus();
                            row[6] = foodReceiverReq.getLocation();
                            
                            model.addRow(row);
                        }
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
        requestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReject = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        requestJTable.setForeground(new java.awt.Color(25, 56, 82));
        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Reqest Id", "Requesting Oganization Name", "Requesting Organization Type", "Requesting Username", "No of Servings Requested", "Request Status", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(requestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 990, 116));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("Food Request Dashboard");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergency512icon.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergencyEmployee512xxx.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(25, 56, 82));
        btnReject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReject.setText("Reject Request");
        btnReject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRejectPressed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 138, 35));

        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(25, 56, 82));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Food Donation Organization Name", "Organization Type", "Organization Admin Username", "No of Servings Left", "Certification Status", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane2.setViewportView(organizationJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1000, 116));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("MANAGE FOOD DONATION ENTERPRISE MANAGE REGISTRATION");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("Food Donation Organizations ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, -1));

        btnProcess.setBackground(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(25, 56, 82));
        btnProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProcess.setText("Process Request");
        btnProcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProcess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProcessPressed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 138, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectPressed
        int selectedRow = requestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, "Please Select a request row from request table!");
            return;
        }
        
        OrphanWorkRequest request = (OrphanWorkRequest)requestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Rejected");
         populateRequestTable();
    }//GEN-LAST:event_btnRejectPressed

    private void btnProcessPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcessPressed
        // TODO add your handling code here:
        int selectedRowtable1 = requestJTable.getSelectedRow();
        int selectedRowTable2 = organizationJTable.getSelectedRow();
        
        if (selectedRowtable1 < 0 || selectedRowTable2 < 0){
            
            JOptionPane.showMessageDialog(null, "Please Select a request row from both tables!");
            return;
        }
        
        OrphanWorkRequest orphanRequest = (OrphanWorkRequest)requestJTable.getValueAt(selectedRowtable1, 0);
        if(orphanRequest.getStatus() == "Rejected") {
            JOptionPane.showMessageDialog(null, "Request is Rejected!Can not be Processed");
        }
        orphanRequest.setStatus("Processed");
        Organization org = (Organization)organizationJTable.getValueAt(selectedRowTable2, 0);
        orphanRequest.setDonorOrganization(org);
        orphanRequest.setDonorOrganizationUser(org.getUserAccountDirectory().getUserAccountList().get(0));   //complet this populate account in table1 instead of string
       
        //create restaurantrequest and put it in restaurant organization workrequest
        if(org.getType().getValue() == Organization.Type.Restaurant.getValue()){
            RestaurantRequest restReq = new RestaurantRequest();
            restReq.setRequestingOrganiztionName(org);
            restReq.setRequestingOrganizationType(org.getType());
            restReq.setNoOfServings(orphanRequest.getNo_of_servings());
            restReq.setAddress(orphanRequest.getLocation());
            restReq.setEmailId(orphanRequest.getEmailId());
            restReq.setStatus(orphanRequest.getStatus());
        }
        
        populateRequestTable();
        populateFoodDonationOrganizationTable();
        
    }//GEN-LAST:event_btnProcessPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnProcess;
    private javax.swing.JLabel btnReject;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables
}
