/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.DeliveryEnterpriseAdminRole;
//import Business.Role.AdminRole;
import Business.Role.FoodDonationEnterpriseAdminRole;
import Business.Role.FoodSafetyEnterpriseAdminRole;
import Business.Role.ReceiverEnterpriseAdminRole;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        enterpriseJTable.getTableHeader().setDefaultRenderer(new TableColors());
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 523, 95));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 210, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(25, 56, 82));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 210, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 216, -1, 20));

        enterpriseJComboBox.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 210, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        nameJTextField.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(25, 56, 82));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 210, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 56, 82));
        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        passwordJPasswordField.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(25, 56, 82));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 210, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE ENTERPRISE ADMIN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 6, 680, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/administratorBig.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 161, 129));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(25, 56, 82));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSubmitMousePressed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 138, 35));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/opaquesysadmin.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(1058, 840));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 620, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void btnSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMousePressed
        // TODO add your handling code here:
         // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        if(username.isEmpty() || password.isEmpty() || name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
            if (system.checkIfUserIsUnique(username)) {
                System.out.println("ManageEnterprise line number 234");
                System.out.println(enterprise.getEnterpriseType());
                UserAccount account = null;
                if (enterprise.getEnterpriseType().getValue() == Enterprise.EnterpriseType.FoodDonation.getValue()) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FoodDonationEnterpriseAdminRole());
                    System.out.println("ManageEnterprise line number 237");
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.FoodSafety) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FoodSafetyEnterpriseAdminRole());
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Delivery) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliveryEnterpriseAdminRole());
                }else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.FoodReceiver) {
                   account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new ReceiverEnterpriseAdminRole());
                }
                
                usernameJTextField.setText("");
                passwordJPasswordField.setText("");
                nameJTextField.setText("");
                JOptionPane.showMessageDialog(null, "Account created sucessfully");
                populateTable();
            }else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSubmit;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}