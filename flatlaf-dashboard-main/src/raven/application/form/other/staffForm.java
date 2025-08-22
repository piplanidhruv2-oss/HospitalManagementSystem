package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static raven.application.form.other.Functions.generateRandomFirstName;
import static raven.application.form.other.Functions.generateRandomString;
import static raven.application.form.other.Functions.isValidAadharNumber;
import static raven.application.form.other.Functions.isValidAge;
import static raven.application.form.other.Functions.isValidEmail;
import static raven.application.form.other.Functions.isValidMobileNumber;
import static raven.application.form.other.Functions.isValidName;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class staffForm extends javax.swing.JPanel {

    public staffForm() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        staffname = new javax.swing.JLabel();
        staffNameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        stafffathername = new javax.swing.JLabel();
        stafffatherNameTF = new javax.swing.JTextField();
        staffmobile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staffaddress = new javax.swing.JLabel();
        staffAge = new javax.swing.JLabel();
        staffaddhaarTF = new javax.swing.JTextField();
        staffemailTF = new javax.swing.JTextField();
        staffaddressTF = new javax.swing.JTextField();
        staffgender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staffAgeTF = new javax.swing.JTextField();
        staffemail = new javax.swing.JLabel();
        staffgendercombox = new javax.swing.JComboBox<>();
        staffexpir = new javax.swing.JLabel();
        staffexprTF = new javax.swing.JTextField();
        staffcertificate = new javax.swing.JLabel();
        staffemlcontactTF = new javax.swing.JTextField();
        staffemlcontact = new javax.swing.JLabel();
        staffcertificateTF = new javax.swing.JTextField();
        staffdepart = new javax.swing.JLabel();
        staffDepartmentTF = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        staffAadhaar = new javax.swing.JLabel();
        staffmobTF = new javax.swing.JTextField();
        staffjoin = new javax.swing.JLabel();
        staffjoinTF = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("New-Staff");

        staffname.setText("Staff Name");

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stafffathername.setText("Father/Guardian Name");

        stafffatherNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafffatherNameTFActionPerformed(evt);
            }
        });

        staffmobile.setText("Mobile Number");

        staffaddress.setText("Address");

        staffAge.setText("Age");

        staffaddhaarTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffaddhaarTFActionPerformed(evt);
            }
        });

        staffemailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffemailTFActionPerformed(evt);
            }
        });

        staffaddressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffaddressTFActionPerformed(evt);
            }
        });

        staffgender.setText("Gender");

        jLabel9.setText(" ");

        staffemail.setText("Email Id");

        staffgendercombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        staffgendercombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffgendercomboxActionPerformed(evt);
            }
        });

        staffexpir.setText("Expirence ");

        staffexprTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffexprTFActionPerformed(evt);
            }
        });

        staffcertificate.setText("Certificate Number");

        staffemlcontact.setText("Emergency Number");

        staffdepart.setText("Department");

        staffDepartmentTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nurse", "WARD BOY/GIRL", "Staff Superior", " " }));

        jButton2.setText("Print");

        staffAadhaar.setText("Addhaar Number");

        staffmobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffmobTFActionPerformed(evt);
            }
        });

        staffjoin.setText("Joining Date");

        staffjoinTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffjoinTFActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Staff-ID");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(staffgender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(staffemail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(590, 590, 590)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(staffexpir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stafffathername, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(staffmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stafffatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(staffmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(staffemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(staffgendercombox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(staffexprTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(staffdepart, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(staffAge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(staffAadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(staffaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(staffcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(staffemlcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(staffDepartmentTF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(staffaddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(staffaddhaarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(staffAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86)
                                                                .addComponent(staffjoin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(staffjoinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(staffcertificateTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                .addComponent(staffemlcontactTF, javax.swing.GroupLayout.Alignment.LEADING))))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(staffname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(staffNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(182, 182, 182)
                                    .addComponent(jButton3)
                                    .addGap(71, 71, 71)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffAge)
                            .addComponent(staffjoin)
                            .addComponent(staffjoinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(staffDepartmentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stafffathername, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stafffatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(staffdepart))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffAadhaar)
                                    .addComponent(staffaddhaarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staffmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(staffemailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staffemail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffgender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staffgendercombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffaddress)
                                    .addComponent(staffaddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(staffcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staffcertificateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(staffexpir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(staffexprTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(staffemlcontactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(staffemlcontact))))))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(staffNameTF.getText());
        System.out.println(stafffatherNameTF.getText());
        System.out.println(staffAgeTF.getText());
        System.out.println(staffmobTF.getText());
        System.out.println(staffexprTF.getText());
        System.out.println(staffemailTF.getText());
        System.out.println(staffaddhaarTF.getText());
        System.out.println(staffaddressTF.getText());
        System.out.println(staffcertificateTF.getText());
        System.out.println(staffemlcontactTF.getText());

//        String staffAadhaar= staffaddhaarTF.getText()
        String staffName = staffNameTF.getText();
        String stafffatherName = stafffatherNameTF.getText();
        String staffGender = (String) staffgendercombox.getSelectedItem();
        String staffaddress = staffaddressTF.getText();
        String staffmob = staffmobTF.getText();
        String staffemlcont = staffemlcontactTF.getText();

        String staffage = staffAgeTF.getText();
        String staffemail = staffemailTF.getText();
        String staffexp = staffexprTF.getText();
        String staffidproof = staffaddhaarTF.getText();
        String staffcertificate = staffcertificateTF.getText();
        String staffdepart = (String) staffDepartmentTF.getSelectedItem();
        System.out.println(staffdepart);
        System.out.println(staffGender);
        if (!isValidEmail(staffemail)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Email Id");
        } else if (!isValidAge(staffage)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
        } //        String staffName = staffNameTF.getText();
        else if (!isValidName(staffName)) {
            JOptionPane.showMessageDialog(this, "Enter correct Staff Name");
        } else if (!isValidMobileNumber(staffmob)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
        }
        if (!isValidAadharNumber(staffidproof)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Aadhar Number");
        } else {

            String myQuery //        1               2               3           4           5
                    = "insert into staff_details (`Staff_name`, `Staff_fathername`, `Staff_age`, `Staff_address`, `Staff_mobile`,"
                    + //                              6               7               8                       9
                    "                           `Staff_Gender`, `Staff_Department`, `Staff_Certificatenumber`, `staff_idproof`,"
                    + //                                  10                  11           12
                    "                           `Staff_EmergencyContact`, `Staff_email`, `staff_exp`) values("
                    // 1 2 3 4 5 6 7 8 9 0 1 2
                    + "?,?,?,?,?,?,?,?,?,?,?,?);";
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
                    query.setString(1, staffName);
                    //                  query.setString(2, stdLnametextField.getText());
                    query.setString(2, stafffatherName);
                    //                  query.setString(3, stdFathertextField.getText());
                    query.setString(3, staffage);
                    //                  query.setString(4, emailTextField.getText());
                    query.setString(4, staffaddress);
                    query.setString(5, staffmob);
                    query.setString(6, staffGender);
                    //                  query.setInt(5, Integer.parseInt(Student_Mobile_Number));
                    query.setString(7, staffdepart);
                    query.setString(8, staffcertificate);
                    query.setString(9, staffidproof);
                    query.setString(10, staffemlcont);
                    query.setString(11, staffemail);
                    query.setString(12, staffexp);
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

    private void stafffatherNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafffatherNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stafffatherNameTFActionPerformed

    private void staffaddressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffaddressTFActionPerformed

    private void staffaddhaarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddhaarTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffaddhaarTFActionPerformed

    private void staffemailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffemailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffemailTFActionPerformed

    private void staffexprTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffexprTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffexprTFActionPerformed

    private void staffgendercomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffgendercomboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffgendercomboxActionPerformed

    private void staffmobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffmobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffmobTFActionPerformed

    private void staffjoinTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffjoinTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffjoinTFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        staffaddhaarTF.setText(generateRandomString(12));
        staffemlcontactTF.setText(generateRandomString(10));
        staffmobTF.setText(generateRandomString(10));
        staffcertificateTF.setText(generateRandomString(12));
        staffAgeTF.setText(generateRandomString(2));
        stafffatherNameTF.setText(generateRandomFirstName());
        staffNameTF.setText(generateRandomFirstName());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel staffAadhaar;
    private javax.swing.JLabel staffAge;
    private javax.swing.JTextField staffAgeTF;
    private javax.swing.JComboBox<String> staffDepartmentTF;
    private javax.swing.JTextField staffNameTF;
    private javax.swing.JTextField staffaddhaarTF;
    private javax.swing.JLabel staffaddress;
    private javax.swing.JTextField staffaddressTF;
    private javax.swing.JLabel staffcertificate;
    private javax.swing.JTextField staffcertificateTF;
    private javax.swing.JLabel staffdepart;
    private javax.swing.JLabel staffemail;
    private javax.swing.JTextField staffemailTF;
    private javax.swing.JLabel staffemlcontact;
    private javax.swing.JTextField staffemlcontactTF;
    private javax.swing.JLabel staffexpir;
    private javax.swing.JTextField staffexprTF;
    private javax.swing.JTextField stafffatherNameTF;
    private javax.swing.JLabel stafffathername;
    private javax.swing.JLabel staffgender;
    private javax.swing.JComboBox<String> staffgendercombox;
    private javax.swing.JLabel staffjoin;
    private javax.swing.JTextField staffjoinTF;
    private javax.swing.JTextField staffmobTF;
    private javax.swing.JLabel staffmobile;
    private javax.swing.JLabel staffname;
    // End of variables declaration//GEN-END:variables
}
