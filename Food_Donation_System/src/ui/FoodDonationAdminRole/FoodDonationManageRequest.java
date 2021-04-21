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
import Business.Organization.PartyOrganizerOrganizatioin;
import Business.Organization.RestaurantOrganization;
import Business.Utils.TableColors;
import Business.WorkQueue.FoodReceiverWorkRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayesh Nagarkar
 */
public class FoodDonationManageRequest extends javax.swing.JPanel {

    /**
     * Creates new form FoodDonationManageRequest
     */
    JPanel rightSystemAdminPanel;
    OrganizationDirectory organizationDirectory;
    EcoSystem system;
    Network network;
    
    public FoodDonationManageRequest(JPanel rightSystemAdminPanel, OrganizationDirectory organizationDirectory,
            Network network,EcoSystem system) {
        initComponents();
        requestJTable.getTableHeader().setDefaultRenderer(new TableColors());
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        this.rightSystemAdminPanel = rightSystemAdminPanel;
        this.organizationDirectory = organizationDirectory;
        this.network = network;
        this.system = system;
        populateTable();
        populateRequestTable();
    }
    
    public void populateTable(){
        
       DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        for (Organization organization : organizationDirectory.getOrganizationList()){
            Object[] row = new Object[5];
            
            if(organization instanceof RestaurantOrganization){
                RestaurantOrganization  org = (RestaurantOrganization)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[2] = org.getNoOfServingsLeft();
                row[3] = org.getIfCertified();
                row[4] = org.getLocationPoint();
                
            }else if(organization instanceof PartyOrganizerOrganizatioin){
                PartyOrganizerOrganizatioin  org = (PartyOrganizerOrganizatioin)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[2] = org.getNoOfServingsLeft();
                row[3] = org.getIfCertified();
                row[4] = org.getLocationPoint();
                
            }else if(organization instanceof IndividualFoodDonorOrganization){
                IndividualFoodDonorOrganization  org = (IndividualFoodDonorOrganization)organization;
                
                row[0] = org;  //--jayesh   row[0] = request.getMessage(); 
                row[1] = org.getType();
                row[2] = org.getNoOfServingsLeft();
                row[3] = org.getIfCertified();
                row[4] = org.getLocationPoint();
                
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
                    for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
                        FoodReceiverWorkRequest foodReceiverReq = (FoodReceiverWorkRequest)req;
                        Object[] row = new Object[7];
            
                        

                            row[0] = foodReceiverReq; 
                            row[1] = foodReceiverReq.getRequestingOrganiztionName();
                            row[2] = foodReceiverReq.getRequestingOrganizationType();
                            row[3] = foodReceiverReq.getNo_of_servings();
                            row[4] = foodReceiverReq.getStatus();
                            row[5] = foodReceiverReq.getSender();
                            row[6] = foodReceiverReq.getReceiver();
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
        requestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
                "Reqest Id", "Receiver Oganization Name", "Receiver Organization Type", "No of Servings Requested", "Request Status", "Sender Username", "Receiver Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 990, 116));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("Request For Food Table");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 370, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergency512icon.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emergencyEmployee512xxx.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(25, 56, 82));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubmit.setText("Process");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProcessPressed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 138, 35));

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
                "Food donation Organization Name", "Organization Type", "No Of Servings Left", "Certification Status", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcessPressed
        
    }//GEN-LAST:event_btnProcessPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSubmit;
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
