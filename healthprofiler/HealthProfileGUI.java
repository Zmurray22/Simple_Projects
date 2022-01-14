/*
Program Name: HealthProfiler 
Programmer's Name: Zach Murray 
Program Description: User data class for health report 
 */
package com.healthprofiler;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Zach
 */
public class HealthProfileGUI extends javax.swing.JFrame{
    
    /**
     * Creates new form HealthProfileGUI
     */
    public HealthProfileGUI() {
   
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightFtLabel = new javax.swing.JLabel();
        heightInlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nameField = new javax.swing.JFormattedTextField();
        ageField = new javax.swing.JFormattedTextField();
        weightField = new javax.swing.JFormattedTextField();
        heightFeetField = new javax.swing.JFormattedTextField();
        heightInchField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bmiField = new javax.swing.JFormattedTextField();
        mhrField = new javax.swing.JFormattedTextField();
        categoryField = new javax.swing.JFormattedTextField();
        clearBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nameLabel.setText("Name");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ageLabel.setText("Age");

        weightLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        weightLabel.setText("Weight");

        heightFtLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        heightFtLabel.setText("Height (ft)");

        heightInlabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        heightInlabel.setText("Height (in)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heightFtLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heightInlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(heightFtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightInlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameField.setBackground(new java.awt.Color(204, 204, 204));
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setToolTipText("Full Name");
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameField.setName("nameField"); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        ageField.setBackground(new java.awt.Color(204, 204, 204));
        ageField.setForeground(new java.awt.Color(51, 51, 51));
        ageField.setToolTipText("Years");
        ageField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        weightField.setBackground(new java.awt.Color(204, 204, 204));
        weightField.setForeground(new java.awt.Color(51, 51, 51));
        weightField.setToolTipText("In pounds");
        weightField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        weightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFieldActionPerformed(evt);
            }
        });

        heightFeetField.setBackground(new java.awt.Color(204, 204, 204));
        heightFeetField.setForeground(new java.awt.Color(51, 51, 51));
        heightFeetField.setToolTipText("Feet Only");
        heightFeetField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        heightFeetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFeetFieldActionPerformed(evt);
            }
        });

        heightInchField.setBackground(new java.awt.Color(204, 204, 204));
        heightInchField.setForeground(new java.awt.Color(51, 51, 51));
        heightInchField.setToolTipText("Inches Only");
        heightInchField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        heightInchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightInchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(weightField)
                    .addComponent(heightFeetField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heightInchField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightFeetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightInchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Max Heart Rate");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("BMI");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Category");

        bmiField.setEditable(false);
        bmiField.setBackground(new java.awt.Color(255, 204, 0));
        bmiField.setForeground(new java.awt.Color(51, 51, 51));
        bmiField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bmiField.setToolTipText("Full Name");
        bmiField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bmiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiFieldActionPerformed(evt);
            }
        });

        mhrField.setEditable(false);
        mhrField.setBackground(new java.awt.Color(255, 204, 0));
        mhrField.setForeground(new java.awt.Color(51, 51, 51));
        mhrField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mhrField.setToolTipText("Full Name");
        mhrField.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        mhrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhrFieldActionPerformed(evt);
            }
        });

        categoryField.setEditable(false);
        categoryField.setBackground(new java.awt.Color(255, 204, 0));
        categoryField.setForeground(new java.awt.Color(51, 51, 51));
        categoryField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryField.setToolTipText("Full Name");
        categoryField.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bmiField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mhrField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mhrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        clearBtn.setText("Clear");
        clearBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 0), null, null));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display");
        displayBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 0), null, null));
        displayBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void weightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFieldActionPerformed

    private void heightFeetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFeetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFeetFieldActionPerformed

    private void heightInchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightInchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightInchFieldActionPerformed

    private void bmiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmiFieldActionPerformed

    private void mhrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mhrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mhrFieldActionPerformed

    private void categoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFieldActionPerformed
    
    //Button to reset all textFields and errors to default state
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        //Remove text from all fields by iterating through all of the entry fields
        JFormattedTextField[] fields = {nameField, ageField, heightFeetField, heightInchField, weightField, bmiField, categoryField, mhrField};
        for (JFormattedTextField field : fields) {
            field.setText("");
        }
        //Reset errors
        JLabel[] labels = {nameLabel, ageLabel, weightLabel, heightFtLabel, heightInlabel};
        for (JLabel label : labels){
            label.setForeground(Color.black);
        }
    }//GEN-LAST:event_clearBtnActionPerformed

    //Receives form entry strings and creates HealthProfile object to generate BMI, MHR, and Category
    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        //Set variables to receive fields
        String name = "", category = "";
        int age = 0, feet = 0, inches = 0, maxHR = 0;
        double weight = 0.0, bmi = 0.0;
        boolean error = false;
        
        //Get text from fields and check for errors
        //Changes label to red if error
        //Checks all entries before throwing exception to ensure that
        //Corrected errors are return to black
        try{
            name = nameField.getText();            
            //Check for non-name characters with regex pattern matcher
            //Set and Compile the ReGex
            String regex = "^[a-zA-Z \\-\\.\\']*$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(name);
            if(name == null || !m.matches()){
                nameLabel.setForeground(Color.red);
                error = true;
            }else
                nameLabel.setForeground(Color.black);
            
            //Age check
            try{
                age = Integer.parseInt(ageField.getText());
                ageLabel.setForeground(Color.black);
            }catch(NumberFormatException ex){
                ageLabel.setForeground(Color.red);
                error = true;
            }
            
            //Height feet check
            try{
                feet = Integer.parseInt(heightFeetField.getText());
                heightFtLabel.setForeground(Color.black);
            }catch(NumberFormatException ex){
                heightFtLabel.setForeground(Color.red);
                error = true;
            }
            
            //Height inches check
            try{
                inches = Integer.parseInt(heightInchField.getText());
                heightInlabel.setForeground(Color.black);
            }catch(NumberFormatException ex){
                heightInlabel.setForeground(Color.red);
                error = true;
            }
            
            //Weight check
            try{
                weight = Double.parseDouble(weightField.getText());
                weightLabel.setForeground(Color.black);
            }catch(NumberFormatException ex){
                weightLabel.setForeground(Color.red);
                error = true;
            }
            
            //Check if error was found and show error log
            if(error)
                throw new Exception();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please ensure that all fields are completed correctly",
               "Input Error", JOptionPane.ERROR_MESSAGE);
       
            return;
        }
        
        //Create HealthProfile Class object
        HealthProfile user = new HealthProfile(name, age, weight, feet, inches);
        //Send data to class object
        user.setName(name);
        user.setAge(age);
        user.setHeight(feet, inches);
        user.setWeight(weight);
        //Get Info for BMI, Category, and MHR
        bmi = user.getBMI();
        maxHR = user.getMHR();
        category = user.getCategory();
        //Display BMI, Category, and MHR
        bmiField.setText(String.format("%.1f", bmi));
        mhrField.setText(String.valueOf(maxHR));
        categoryField.setText(category);
    }//GEN-LAST:event_displayBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JFormattedTextField bmiField;
    private javax.swing.JFormattedTextField categoryField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JFormattedTextField heightFeetField;
    private javax.swing.JLabel heightFtLabel;
    private javax.swing.JFormattedTextField heightInchField;
    private javax.swing.JLabel heightInlabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField mhrField;
    private javax.swing.JFormattedTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JFormattedTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}