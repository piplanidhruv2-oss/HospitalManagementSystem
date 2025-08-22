package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static raven.application.form.other.Functions.generateRandomString;
import static raven.application.form.other.Functions.isValidAge;
import static raven.application.form.other.Functions.isValidMobileNumber;
import static raven.application.form.other.Functions.isValidName;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class WithappointmentForm extends javax.swing.JPanel {

    public WithappointmentForm() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        appointname = new javax.swing.JLabel();
        appNameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        appointmobile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        appointage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        appAgeTF = new javax.swing.JTextField();
        tokennum = new javax.swing.JLabel();
        tokenTF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        apodoctname = new javax.swing.JLabel();
        appmobTF = new javax.swing.JTextField();
        tokenBT = new javax.swing.JButton();
        appointdoctcombox = new javax.swing.JComboBox<>();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("New-Appointment");

        appointname.setText("Patient Name");

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        appointmobile.setText("Mobile Number");

        appointage.setText("Age");

        jLabel9.setText(" ");

        tokennum.setText("Token Number");

        jButton2.setText("Print");

        apodoctname.setText("Doctor Appoint");

        appmobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appmobTFActionPerformed(evt);
            }
        });

        tokenBT.setText("Generate Token");
        tokenBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tokenBTActionPerformed(evt);
            }
        });

        appointdoctcombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Practitioner", "Cardiologist", "Dermatologist", "Allergist/Immunologist", "Anesthesiologist", "Gastroenterologist,", "Hematologist", "Endocrinologist ", "Family Medicine Physician", "Infectious Disease Specialist", "Internal Medicine Physician", "Nuephrologist", "Neurologist", "Obstetrician/Gynecologist", "Oncologist", "Ophthalmologist", "Orthopedic Surgeon", "Otolaryngologist (ENT Specialist) ", "Pediatrician", "Physical Medicine ", "Rehabilitation Specialist", "Psychiatrist", "Pulmonologist", "Radiologist", "Rheumatologist", "Urologist" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(appointname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(appNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(appointage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(appAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(appointmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(appmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apodoctname, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(appointdoctcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(tokennum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tokenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(tokenBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointage)
                    .addComponent(appAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apodoctname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointdoctcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tokennum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tokenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(tokenBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(appNameTF.getText());
        String appName = appNameTF.getText();

        String apodoctName = (String) appointdoctcombox.getSelectedItem();
        System.out.println(apodoctName);

        System.out.println(appAgeTF.getText());
        String appAge = appAgeTF.getText();

        System.out.println(appmobTF.getText());
        String appmobile = appmobTF.getText();

        System.out.println(tokenTF.getText());
        String tokennum = tokenTF.getText();
        if (!isValidMobileNumber(appmobile)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
        } else if (!isValidName(appName)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Name");
        } else if (!isValidAge(appAge)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Age");

        } else {

            String myQuery
                    = "insert into withappoint_details (Patient_name, Patient_mobilenumber, Patient_age, tokennumber,Doct_Appoint) values("
                    + "?,?,?,?,?);";
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
                    //                  query.setString(1, patnameTF.getText());
                    query.setString(1, appName);
                    //                  query.setString(2, patagetextField.getText());
                    query.setString(2, appmobile);
                    //                  query.setString(3, patmobiletextField.getText());
                    query.setString(3, appAge);
                    //                  query.setString(4, tokennumberTextField.getText());
                    query.setString(4, tokennum);
                    //                  query.setString(5,doctorAppointmentname.getText());
                    query.setString(5, appointdoctcombox.getSelectedItem().toString());
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

    private void appmobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appmobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appmobTFActionPerformed

    private void tokenBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tokenBTActionPerformed
        // TODO add your handling code here:
//        tokenTF.setText(generateCode());
        tokenTF.setText(generateRandomString(5));
    }//GEN-LAST:event_tokenBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apodoctname;
    private javax.swing.JTextField appAgeTF;
    private javax.swing.JTextField appNameTF;
    private javax.swing.JTextField appmobTF;
    private javax.swing.JLabel appointage;
    private javax.swing.JComboBox<String> appointdoctcombox;
    private javax.swing.JLabel appointmobile;
    private javax.swing.JLabel appointname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JButton tokenBT;
    private javax.swing.JTextField tokenTF;
    private javax.swing.JLabel tokennum;
    // End of variables declaration//GEN-END:variables
}
