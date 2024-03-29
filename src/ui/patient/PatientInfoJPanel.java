/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.patient;

import model.Person;
import model.PersonDir;
import model.System;
import util.Validation;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.MainJFrame;

/**
 *
 * @author mingcheng
 */
public class PatientInfoJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private System sys;
    Person np;
    PersonDir personDir;
    Validation validate = new Validation();

    /**
     * Creates new form PatientInfoJPanel
     */
    public PatientInfoJPanel(JPanel workArea,System sys) {
        this.sys = sys;
        this.personDir = sys.getPersonDir();
        initComponents();
        this.workArea = workArea;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        patientAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientCity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        patientCommunity = new javax.swing.JTextField();
        btnNext1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        patientAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("Enter your name: ");

        patientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter your age: ");

        patientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAgeActionPerformed(evt);
            }
        });

        jLabel9.setText("Enter your city: ");

        patientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCityActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter your house address: ");

        patientCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCommunityActionPerformed(evt);
            }
        });

        btnNext1.setText("Next >>");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter your community: ");

        patientAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAddressActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Welcome! Please input your personal Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(patientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(patientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(patientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(patientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext1)
                    .addComponent(btnSave))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameActionPerformed

    private void patientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientAgeActionPerformed

    private void patientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientCityActionPerformed

    private void patientCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientCommunityActionPerformed

    private void patientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validate.StringIsEmpty(patientName.getText())){
                     JOptionPane.showMessageDialog(this,"Name can not be null");
               }
               else if(!validate.stringAreAllLetter(patientName.getText())){
                   JOptionPane.showMessageDialog(this,"name can not contain number");
               }
          
              
              //age
              else  if(validate.StringIsEmpty(patientAge.getText())){
                     JOptionPane.showMessageDialog(this,"age can not be null");
               }          
              else if (!validate.stringAreAllNumber(patientAge.getText())){
                   JOptionPane.showMessageDialog(this,"age should be all number");
              }              
              //age
              
             

             //city
             else  if(validate.StringIsEmpty( patientCity.getText())){
                     JOptionPane.showMessageDialog(this,"city can not be null");
               }          
              
             //city 
                
             //Community
             else  if(validate.StringIsEmpty( patientCommunity.getText())){
                     JOptionPane.showMessageDialog(this,"Community can not be null");
               }          
              
             
             else if(validate.StringIsEmpty(patientAddress.getText())){
                     JOptionPane.showMessageDialog(this,"house can not be null");
               }          
              
             
              
             
              else{
                        String name = patientName.getText();
                        int age  = Integer.parseInt(patientAge.getText());
                        String city = patientCity.getText();
                        String community = patientCommunity.getText();
                        String house = patientAddress.getText();

                        this.np = personDir.addNewPerson();
                        
                        np.setName(name);
                        np.setAge(age);
                        np.setCity(city);
                        np.setCommunity(community);
                        np.setHouse(house);
                        
                        
                        JOptionPane.showMessageDialog(this,"Your Info is saved");
        
              }
       
        
       
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
        SearchDocJPanel sdp = new SearchDocJPanel(sys,np);
        workArea.add("SearchDocor",sdp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
        

         
        
    }//GEN-LAST:event_btnNext1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField patientAddress;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientCity;
    private javax.swing.JTextField patientCommunity;
    private javax.swing.JTextField patientName;
    // End of variables declaration//GEN-END:variables
}
