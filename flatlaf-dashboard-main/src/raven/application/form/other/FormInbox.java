package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static raven.application.form.other.Functions.isValidAge;
import static raven.application.form.other.Functions.isValidEmail;
import static raven.application.form.other.Functions.isValidMobileNumber;
import static raven.application.form.other.Functions.isValidName;
import raven.requiredFunctions.DatabaseConnection;
//import static raven.Functions.isValidAge;
//import static raven.application.form.other.Functions.isValidEmail;
//import static raven.application.form.other.Functions.isValidMobileNumber;
//import static raven.application.form.othe.r.Functions.isValidName;
//import raven.requiredFunctions.DatabaseConnection;
//import static raven.re
public class FormInbox extends javax.swing.JPanel {

    public FormInbox() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        patname = new javax.swing.JLabel();
        patNameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PatfatherName = new javax.swing.JLabel();
        patfatherNameTF = new javax.swing.JTextField();
        patmob = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pataddrss = new javax.swing.JLabel();
        patage = new javax.swing.JLabel();
        patemailTF = new javax.swing.JTextField();
        pataddrssTF = new javax.swing.JTextField();
        patgender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        patAgeTF = new javax.swing.JTextField();
        patemail = new javax.swing.JLabel();
        patGender = new javax.swing.JComboBox<>();
        patinsurance = new javax.swing.JLabel();
        patinsrnceTF = new javax.swing.JTextField();
        patsymtom = new javax.swing.JLabel();
        patsyomtTF = new javax.swing.JTextField();
        pateml = new javax.swing.JLabel();
        patemlcontactTF = new javax.swing.JTextField();
        patdepart = new javax.swing.JLabel();
        patdepartment = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        patmobTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("New-Patient");

        patname.setText("Patient Name");

        patNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patNameTFActionPerformed(evt);
            }
        });

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PatfatherName.setText("Patient Father/Guardian Name");

        patfatherNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patfatherNameTFMouseClicked(evt);
            }
        });
        patfatherNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patfatherNameTFActionPerformed(evt);
            }
        });

        patmob.setText("Mobile Number");

        pataddrss.setText("Address");

        patage.setText("Age");

        patemailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patemailTFActionPerformed(evt);
            }
        });

        pataddrssTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pataddrssTFActionPerformed(evt);
            }
        });

        patgender.setText("Gender");

        jLabel9.setText(" ");

        patemail.setText("Email Id");

        patGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        patGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patGenderActionPerformed(evt);
            }
        });

        patinsurance.setText("Insurance Number");

        patinsrnceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patinsrnceTFActionPerformed(evt);
            }
        });

        patsymtom.setText("Symtompms");

        pateml.setText("Emergency Number");

        patdepart.setText("Department");

        patdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Admit", "Test and Diagonsis" }));

        jButton2.setText("Print");

        patmobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patmobTFActionPerformed(evt);
            }
        });

        jLabel1.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(779, 779, 779)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patemail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(patemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(patmob, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(patmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(165, 165, 165)
                                                .addComponent(pataddrss, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(34, 34, 34)
                                        .addComponent(pataddrssTF, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patgender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(230, 230, 230)
                                        .addComponent(patsymtom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(patsyomtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patinsrnceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124)
                                        .addComponent(pateml, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patemlcontactTF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PatfatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patfatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(patdepart, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(159, 159, 159)
                                        .addComponent(patage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patNameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patage)
                        .addComponent(patAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patemail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patgender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patsymtom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patsyomtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatfatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patfatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patdepart)
                            .addComponent(patdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(patmob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pataddrss)
                                    .addComponent(pataddrssTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patinsrnceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patemlcontactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pateml))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(patNameTF.getText());
        System.out.println(patfatherNameTF.getText());
        System.out.println(patAgeTF.getText());
        System.out.println(patmobTF.getText());
//        System.out.println(patinsrnceTF.getText());
        System.out.println(patinsrnceTF.getText());
        System.out.println(patemailTF.getText());
        System.out.println(patsyomtTF.getText());
        System.out.println(pataddrssTF.getText());
//        System.out.println(patappTF.getText());
        System.out.println(patemlcontactTF.getText());

        String PatfatherName = patfatherNameTF.getText();
        String PatGender = (String) patGender.getSelectedItem();
        String pataddrss = pataddrssTF.getText();
        String patmob = patmobTF.getText();

//        String patdoctorappoint = patappTF.getText();
        String patemlcontact = patemlcontactTF.getText();
        if (!isValidMobileNumber(patmob)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
        }
        else if(!isValidMobileNumber(patemlcontact)) {
           
            JOptionPane.showMessageDialog(this, "Enter Valid  Emergency Mobile Number");
        }

        String patage = patAgeTF.getText();
        String patemail = patemailTF.getText();
        String patinsurance = patinsrnceTF.getText();
        String patsymtom = patsyomtTF.getText();
        String Patdepart = (String) patdepartment.getSelectedItem();
        System.out.println(Patdepart);
        System.out.println(PatGender);
     
       
        String PatName = patNameTF.getText();
        if (!isValidName(PatfatherName)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Patient father Name");
        }else  if (!isValidAge(patage)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
        }else    if (!isValidEmail(patemail)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Email Id");
        }
        else if (!isValidName(PatName)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Patient Name");
            
        }
        else {
            
        String myQuery
                = "insert into patient_details (Patient_name, Patient_father_name, Patient_age, Patient_mobile, Patient_address,\n"
                + "                             Patient_email, Patient_insurance, Patient_symptoms, Patient_EmergencyContact," +  "Patient_gender,Department) values("
                + "?,?,?,?,?,?,?,?,?,?,?);";
        int response
                = JOptionPane.showConfirmDialog(
                        this,
                        "Do You To Submit Details ? ",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) //                      System.out.println("Confirmed");
        {

 
                PreparedStatement query;
//                  String url = "jdbc:mysql://localhost:3306/students";
                try (Connection sqlcon = DatabaseConnection.getInstance().getConnection()) {
                    query = sqlcon.prepareStatement(myQuery);
                    //                  query.setString(1, stdFnameTF.getText());
                    query.setString(1, PatName);
                    //                  query.setString(2, stdLnametextField.getText());
                    query.setString(2, PatfatherName);
                    //                  query.setString(3, stdFathertextField.getText());
                    query.setString(3, patage);
                    //                  query.setString(4, emailTextField.getText());
                    query.setString(4, patmob);
                    query.setString(5, pataddrss);
                    //                  query.setInt(5, Integer.parseInt(Student_Mobile_Number));
                    query.setString(6, patemail);
                    query.setString(7, patinsurance);
                    query.setString(8, patsymtom);
                    query.setString(9,patemlcontact );
                    query.setString(10,PatGender );
                    query.setString(11,Patdepart );
//                    query.setString(12,PatDate );
                    // Assuming dobTextField contains a valid date string in "yyyy-MM-dd" format
//                  String dobString = dobTextField.getText();
//                    java.sql.Date sqlDate = java.sql.Date.valueOf(dob);
//                    query.setDate(9, sqlDate);
//                    query.setDate(9,
//// java.sql.Date.valueOf(dobTextField.getText()));
//                    query.setString(10, branch);
//                    query.setInt(11, batch);
//                    query.setString(12, caste);
//                    query.setString(13, gender);
//                    query.setString(14, address);
//                    query.setString(15, scholarship);
                    System.out.print(query.getResultSet());
                    System.out.print(query);
                    System.out.print(query.getMetaData());
                    query.execute();

                    query.close();
                }catch(Exception e  ){
                    System.err.println(e.getMessage());
                }}
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    

    
    
    private void patfatherNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patfatherNameTFActionPerformed
        // TODO add your handliatfatherNameTFng code here:


    }//GEN-LAST:event_patfatherNameTFActionPerformed

    private void pataddrssTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pataddrssTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pataddrssTFActionPerformed

    private void patemailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patemailTFActionPerformed

    }//GEN-LAST:event_patemailTFActionPerformed

    private void patinsrnceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patinsrnceTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_patinsrnceTFActionPerformed

    private void patGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patGenderActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_patGenderActionPerformed

    private void patmobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patmobTFActionPerformed
        // TODO dd your handling code here:

    }//GEN-LAST:event_patmobTFActionPerformed

    private void patfatherNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patfatherNameTFMouseClicked
        // // TODO add your handling code here:
    }//GEN-LAST:event_patfatherNameTFMouseClicked

    private void patNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patNameTFActionPerformed
        // TODO add your handling code here:
//        
    }//GEN-LAST:event_patNameTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatfatherName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JTextField patAgeTF;
    private javax.swing.JComboBox<String> patGender;
    private javax.swing.JTextField patNameTF;
    private javax.swing.JLabel pataddrss;
    private javax.swing.JTextField pataddrssTF;
    private javax.swing.JLabel patage;
    private javax.swing.JLabel patdepart;
    private javax.swing.JComboBox<String> patdepartment;
    private javax.swing.JLabel patemail;
    private javax.swing.JTextField patemailTF;
    private javax.swing.JLabel pateml;
    private javax.swing.JTextField patemlcontactTF;
    private javax.swing.JTextField patfatherNameTF;
    private javax.swing.JLabel patgender;
    private javax.swing.JTextField patinsrnceTF;
    private javax.swing.JLabel patinsurance;
    private javax.swing.JLabel patmob;
    private javax.swing.JTextField patmobTF;
    private javax.swing.JLabel patname;
    private javax.swing.JLabel patsymtom;
    private javax.swing.JTextField patsyomtTF;
    // End of variables declaration//GEN-END:variables
}
