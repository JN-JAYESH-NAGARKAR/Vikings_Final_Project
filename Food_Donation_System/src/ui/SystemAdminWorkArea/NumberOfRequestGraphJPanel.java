/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Jayesh Nagarkar
 */
public class NumberOfRequestGraphJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NumberOfRequestGraphJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart barChart;
    HashMap<String, Integer> mapBostonRequest = new HashMap<String, Integer>();
    HashMap<String, Integer> mapNewYorkRequest = new HashMap<String, Integer>();
    public NumberOfRequestGraphJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateBarGraph();
    }
    public void populateBarGraph(){
        for(Network network : system.getNetworkList()){
            
            System.out.println(network.getName() + "line number 47 in request graph");
            System.out.println(network.countNumberOfCerfiedRestaurant());
            if(network.getName().equals("boston")){
                mapBostonRequest.put("Orphan Organizations", network.countNumberOrphanOrganizationFoodRequests());
                mapBostonRequest.put("Old Age Institutions",network.countNumberOldAgeOrganizationFoodRequests());
                mapBostonRequest.put("Individual Receiver",network.countNumberOfIndividualReceiverFoodRequests());
                System.out.println("count food requests graph line 49" + network.countNumberOfIndividualReceiverFoodRequests());
            }
            if(network.getName().equals("New York")){
                mapNewYorkRequest.put("Orphan Organizations", network.countNumberOrphanOrganizationFoodRequests());
                mapNewYorkRequest.put("Old Age Institutions",network.countNumberOldAgeOrganizationFoodRequests());
                mapNewYorkRequest.put("Individual Receiver",network.countNumberOfIndividualReceiverFoodRequests());
                System.out.println("count food requests graph line 55" + network.countNumberOfIndividualReceiverFoodRequests());
            }
        }
        
        barChart = ChartFactory.createBarChart(
         "Number Of Food Requests Across Network",           
         "Food Request",            
         "Number Of Food Requests",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
        ChartPanel chartPanel = new ChartPanel( barChart );   
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
        
    }
    
    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

        for(String i : mapBostonRequest.keySet()) {
            dataset.addValue(mapBostonRequest.get(i),i, "Boston"); //restaurant,party,individual
            
        } 
        for(String i : mapNewYorkRequest.keySet()) {
            dataset.addValue(mapNewYorkRequest.get(i),i, "New York"); //restaurant,party,individual
           
        } 

        return dataset; 
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDownloadGraph = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 860, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number Of Food Request Graph");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 498, -1));

        btnDownloadGraph.setBackground(new java.awt.Color(255, 255, 255));
        btnDownloadGraph.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDownloadGraph.setForeground(new java.awt.Color(25, 56, 82));
        btnDownloadGraph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDownloadGraph.setText("Download Graph");
        btnDownloadGraph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDownloadGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDownloadGraphMousePressed(evt);
            }
        });
        add(btnDownloadGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 138, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownloadGraphMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownloadGraphMousePressed
        // TODO add your handling code here:
        try {
            int width = 640;    /* Width of the image */
            int height = 480;   /* Height of the image */
            File BarChart = new File( "BarChart.jpeg" );
            ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
            JOptionPane.showMessageDialog(null, "Graph has been donloaded in your current directory.");
        } catch (IOException ex) {
            Logger.getLogger(NetworkFoodRequestComparePieGraphJPanel.class.getName()).log(Level.SEVERE, null, ex);
        };
    }//GEN-LAST:event_btnDownloadGraphMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDownloadGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}