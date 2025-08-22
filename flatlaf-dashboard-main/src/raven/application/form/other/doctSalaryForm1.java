package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class doctSalaryForm1 extends javax.swing.JPanel {

    public doctSalaryForm1() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        LicenseTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Basicpay = new javax.swing.JLabel();
        basicpayTF = new javax.swing.JTextField();
        bonuses = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        allowence = new javax.swing.JLabel();
        overtimepayTF = new javax.swing.JTextField();
        insuranceTF = new javax.swing.JTextField();
        allowenceTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        medicallicense = new javax.swing.JLabel();
        doctspecialist = new javax.swing.JLabel();
        doctorspecialistTF = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        overtimepay = new javax.swing.JLabel();
        bonuseTF = new javax.swing.JTextField();
        Salarydate = new javax.swing.JLabel();
        salarydateTF = new javax.swing.JTextField();
        TotalAmount = new javax.swing.JLabel();
        totalsalaryTF = new javax.swing.JTextField();
        healthinsurance = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Doctor-Salary");

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Basicpay.setText("Basic Pay");

        basicpayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicpayTFActionPerformed(evt);
            }
        });

        bonuses.setText("Bonuses");

        allowence.setText("Allowance ");

        overtimepayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimepayTFActionPerformed(evt);
            }
        });

        insuranceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceTFActionPerformed(evt);
            }
        });

        allowenceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allowenceTFActionPerformed(evt);
            }
        });

        jLabel9.setText(" ");

        medicallicense.setText("Medical License Number");

        doctspecialist.setText("Sepcialist");

        doctorspecialistTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Practitioner", "Cardiologist", "Dermatologist", "Allergist/Immunologist", "Anesthesiologist", "Gastroenterologist,", "Hematologist", "Endocrinologist ", "Family Medicine Physician", "Infectious Disease Specialist", "Internal Medicine Physician", "Nuephrologist", "Neurologist", "Obstetrician/Gynecologist", "Oncologist", "Ophthalmologist", "Orthopedic Surgeon", "Otolaryngologist (ENT Specialist) ", "Pediatrician", "Physical Medicine ", "Rehabilitation Specialist", "Psychiatrist", "Pulmonologist", "Radiologist", "Rheumatologist", "Urologist" }));

        jButton2.setText("Print");

        overtimepay.setText("Overtime Pay");

        bonuseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonuseTFActionPerformed(evt);
            }
        });

        Salarydate.setText("Date");

        salarydateTF.setText("jTextField1");

        TotalAmount.setText("Total Consumption");

        healthinsurance.setText("Health Insurance");

        jButton4.setText("Calculate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(779, 779, 779)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(Basicpay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bonuses, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(healthinsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(27, 27, 27)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(doctspecialist, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(doctorspecialistTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(bonuseTF, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                    .addComponent(basicpayTF))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(overtimepay, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(allowence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(TotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(insuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(overtimepayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(Salarydate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(totalsalaryTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addComponent(allowenceTF, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(98, 98, 98)))))
                                .addComponent(salarydateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(medicallicense)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LicenseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctspecialist)
                    .addComponent(doctorspecialistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LicenseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicallicense, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overtimepay)
                            .addComponent(basicpayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Basicpay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salarydate)
                            .addComponent(salarydateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overtimepayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bonuses, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonuseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allowence)
                            .addComponent(allowenceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalAmount)
                            .addComponent(totalsalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthinsurance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)))
                .addComponent(jButton4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(LicenseTF.getText());
        System.out.println(basicpayTF.getText());
//
        System.out.println(bonuseTF.getText());
//
        System.out.println(insuranceTF.getText());
        System.out.println(overtimepayTF.getText());
        System.out.println(allowenceTF.getText());
//
        System.out.println(salarydateTF.getText());

        String SalaryDate = salarydateTF.getText();

        System.out.println(totalsalaryTF.getText());

        String TotalSalary = totalsalaryTF.getText();

        String docLicense = LicenseTF.getText();
        String doctorBasicpay = basicpayTF.getText();
        String doctorAllowence = allowenceTF.getText();
        String doctBonuse = bonuseTF.getText();
        String docOvertimePay = overtimepayTF.getText();

        String Insurance = insuranceTF.getText();
        String specialist = (String) doctorspecialistTF.getSelectedItem();
        System.out.println(specialist);

//        if (!isValidEmail(doctemail)) {
//            JOptionPane.showMessageDialog(this, "Enter Valid Email Id");
//        } else if (!isValidAge(doctorage)) {
//            JOptionPane.showMessageDialog(this, "Enter Valid Age");
//        } //        String staffName = staffNameTF.getText();
//        else if (!isValidName(doctorfatherName)) {
//            JOptionPane.showMessageDialog(this, "Enter correct Staff father's Name");
//        }
////        if(!isValidMobileNumber(doctmobile) {
////
////            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
////        }
        {

            String myQuery
                    //                                  1           2            3               4           5
                    = "insert into doctorsalary (DoctorLicense, BaseSalary, Annual_Allowances, Bonuses, Health_insurance,\n"
                    //                                6                  7                    8            9
                    + "                         Overtime_Pay, Total_Compensation, DateTimePaid, " + ",doctor_specialist) values("
                    + "?,?,?,?,?,?,?,?,?);";
//            //       1 2 3 4 5 6 7 8
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
                    query.setString(1, docLicense);
                    //                  query.setString(2, stdLnametextField.getText());
                    query.setString(2, doctorBasicpay);
                    //                  query.setString(3, stdFathertextField.getText());
                    query.setString(3, doctorAllowence);
                    //                  query.setString(4, emailTextField.getText());
                    query.setString(4, doctBonuse);
                    query.setString(5, Insurance);
                    //                  query.setInt(5, Integer.parseInt(Student_Mobile_Number));
                    query.setString(6, docOvertimePay);
                    //
                    query.setString(7, TotalSalary);
//
                    query.setString(8, SalaryDate);

//
                    query.setString(9, specialist);
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
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void basicpayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicpayTFActionPerformed
        // TODO add your handling code here:
        System.err.println("");
    }//GEN-LAST:event_basicpayTFActionPerformed

    private void allowenceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowenceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allowenceTFActionPerformed

    private void overtimepayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overtimepayTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overtimepayTFActionPerformed

    private void insuranceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceTFActionPerformed

    private void bonuseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonuseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonuseTFActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Basicpay;
    private javax.swing.JTextField LicenseTF;
    private javax.swing.JLabel Salarydate;
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JLabel allowence;
    private javax.swing.JTextField allowenceTF;
    private javax.swing.JTextField basicpayTF;
    private javax.swing.JTextField bonuseTF;
    private javax.swing.JLabel bonuses;
    private javax.swing.JComboBox<String> doctorspecialistTF;
    private javax.swing.JLabel doctspecialist;
    private javax.swing.JLabel healthinsurance;
    private javax.swing.JTextField insuranceTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel medicallicense;
    private javax.swing.JLabel overtimepay;
    private javax.swing.JTextField overtimepayTF;
    private javax.swing.JTextField salarydateTF;
    private javax.swing.JTextField totalsalaryTF;
    // End of variables declaration//GEN-END:variables
}
