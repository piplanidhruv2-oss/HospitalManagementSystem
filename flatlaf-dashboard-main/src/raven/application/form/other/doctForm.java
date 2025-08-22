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
import static raven.application.form.other.Functions.isValidName;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class doctForm extends javax.swing.JPanel {

    public doctForm() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        docname = new javax.swing.JLabel();
        doctorNameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        docfathername = new javax.swing.JLabel();
        doctorfatherNameTF = new javax.swing.JTextField();
        doctmobile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        doctaddress = new javax.swing.JLabel();
        doctorAge = new javax.swing.JLabel();
        doctoraddhaarTF = new javax.swing.JTextField();
        doctoremailTF = new javax.swing.JTextField();
        doctoraddressTF = new javax.swing.JTextField();
        doctgender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doctorAgeTF = new javax.swing.JTextField();
        doctemail = new javax.swing.JLabel();
        doctorgendercombox = new javax.swing.JComboBox<>();
        doctinsurance = new javax.swing.JLabel();
        doctorinsuranceTF = new javax.swing.JTextField();
        medicallicense = new javax.swing.JLabel();
        doctoremergencyTF = new javax.swing.JTextField();
        doctoremercont = new javax.swing.JLabel();
        licenseTF = new javax.swing.JTextField();
        doctspecialist = new javax.swing.JLabel();
        doctorspecialistTF = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        doctoraddhaar = new javax.swing.JLabel();
        doctormobTF = new javax.swing.JTextField();
        doctordate = new javax.swing.JLabel();
        doctordateTF = new javax.swing.JTextField();
        doctorexp = new javax.swing.JLabel();
        doctorexpTF = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("New-Doctor");

        docname.setText("Doctor Name");

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        docfathername.setText("Father/Guardian Name");

        doctorfatherNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorfatherNameTFActionPerformed(evt);
            }
        });

        doctmobile.setText("Mobile Number");

        doctaddress.setText("Residential Address");

        doctorAge.setText("Age");

        doctoraddhaarTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoraddhaarTFActionPerformed(evt);
            }
        });

        doctoremailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoremailTFActionPerformed(evt);
            }
        });

        doctoraddressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoraddressTFActionPerformed(evt);
            }
        });

        doctgender.setText("Gender");

        jLabel9.setText(" ");

        doctemail.setText("Email Id");

        doctorgendercombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        doctorgendercombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorgendercomboxActionPerformed(evt);
            }
        });

        doctinsurance.setText("Insurance Number");

        doctorinsuranceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorinsuranceTFActionPerformed(evt);
            }
        });

        medicallicense.setText("Medical License Number");

        doctoremercont.setText("Emergency Number");

        doctspecialist.setText("Sepcialist");

        doctorspecialistTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Practitioner", "Cardiologist", "Dermatologist", "Allergist/Immunologist", "Anesthesiologist", "Gastroenterologist,", "Hematologist", "Endocrinologist ", "Family Medicine Physician", "Infectious Disease Specialist", "Internal Medicine Physician", "Nuephrologist", "Neurologist", "Obstetrician/Gynecologist", "Oncologist", "Ophthalmologist", "Orthopedic Surgeon", "Otolaryngologist (ENT Specialist) ", "Pediatrician", "Physical Medicine ", "Rehabilitation Specialist", "Psychiatrist", "Pulmonologist", "Radiologist", "Rheumatologist", "Urologist" }));

        jButton2.setText("Print");

        doctoraddhaar.setText("Addhaar Number");

        doctormobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctormobTFActionPerformed(evt);
            }
        });

        doctordate.setText("Date");

        doctorexp.setText("Expirence ");

        jButton3.setText("Random");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(docfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(doctmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(doctorfatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(doctormobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(150, 150, 150)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(medicallicense)
                                                                    .addComponent(doctoremercont, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(licenseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(doctoremergencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(doctaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(doctoraddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(150, 150, 150)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(doctspecialist, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(doctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(28, 28, 28))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(doctoraddhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                                                                .addComponent(doctorexp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(doctorexpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(5, 5, 5)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(doctorspecialistTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(doctorAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(123, 123, 123)
                                                                                .addComponent(doctordate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(doctordateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                    .addComponent(doctoraddhaarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(doctorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addComponent(doctgender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(98, 98, 98)
                                            .addComponent(doctinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(doctorinsuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(164, 164, 164)
                                                .addComponent(jButton3)
                                                .addGap(89, 89, 89)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(doctemail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(doctorgendercombox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(doctoremailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(86, 86, 86)))
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
                            .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorAge)
                            .addComponent(doctordate)
                            .addComponent(doctordateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(docfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doctorfatherNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(doctorspecialistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doctspecialist)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctormobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doctorexpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorexp))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doctoraddhaarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctoraddhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctemail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctoremailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctgender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorgendercombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctoraddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctaddress))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doctinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorinsuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(medicallicense, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(licenseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doctoremercont)
                                    .addComponent(doctoremergencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(doctorNameTF.getText());
        System.out.println(doctorfatherNameTF.getText());
        System.out.println(doctorAgeTF.getText());
        System.out.println(doctormobTF.getText());
        System.out.println(doctorinsuranceTF.getText());
        System.out.println(doctoremailTF.getText());
        System.out.println(doctoraddhaarTF.getText());
        System.out.println(doctoraddressTF.getText());
        System.out.println(licenseTF.getText());
        System.out.println(doctordateTF.getText());
        System.out.println(doctorexpTF.getText());
        System.out.println(doctoremergencyTF.getText());

        String docName = doctorNameTF.getText();
        String doctorfatherName = doctorfatherNameTF.getText();
        String doctorGender = (String) doctorgendercombox.getSelectedItem();
        String doctoraddress = doctoraddressTF.getText();
        String doctmobile = doctormobTF.getText();
        String doctorexp = doctorexpTF.getText();
        String docAadhar = doctoraddhaarTF.getText();

        String doctordate = doctordateTF.getText();
        String doctorage = doctorAge.getText();
        String doctoremergcont = doctoremergencyTF.getText();
        String doctemail = doctoremailTF.getText();
        String doctinsurance = doctorinsuranceTF.getText();
        String medicallicense = licenseTF.getText();
        String specialist = (String) doctorspecialistTF.getSelectedItem();
        System.out.println(specialist);
        System.out.println(doctorGender);
        if (!isValidEmail(doctemail)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Email Id");
        } else if (!isValidAge(doctorage)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
        } //        String staffName = staffNameTF.getText();
        else if (!isValidName(doctorfatherName)) {
            JOptionPane.showMessageDialog(this, "Enter correct Staff father's Name");
        }
//        if(!isValidMobileNumber(doctmobile) {
//
//            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
//        }
        if (!isValidAadharNumber(docAadhar)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Aadhar Number");
        } else {

            String myQuery
                    //                                  1                2             3           4              5
                    = "insert into doctor_details ( Doctor_name, Doctor_fathname, Doctor_age, Doctor_mobile, Doctor_address,\n"
                    //                                   6             7              8                   9                10
                    + "                              Doctor_gender, Doctor_email, Doctor_insurance, Doctor_license, Doctor_EmergencyContact,\n"
                    //                                     11         12              13                    14
                    + "                               doctor_aadhaar, Doctor_specialist, Doctor_Expirence) values("
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?);";
//            //       1 2 3 4 5 6 7 8 9 10 11 12 13 14
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
                    query.setString(1, docName);
                    //                  query.setString(2, stdLnametextField.getText());
                    query.setString(2, doctorfatherName);
                    //                  query.setString(3, stdFathertextField.getText());
                    query.setString(3, doctorage);
                    //                  query.setString(4, emailTextField.getText());
                    query.setString(4, doctmobile);
                    query.setString(5, doctoraddress);
                    //                  query.setInt(5, Integer.parseInt(Student_Mobile_Number));
                    query.setString(6, doctorGender);
                    query.setString(7, doctemail);
                    query.setString(8, doctinsurance);
                    query.setString(9, medicallicense);
                    query.setString(10, doctoremergcont);
                    //query.setString(1, doctordate);
                    query.setString(11, docAadhar);
                    query.setString(12, specialist);
                    query.setString(13, doctorexp);
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

    private void doctorfatherNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorfatherNameTFActionPerformed
        // TODO add your handling code here:
        System.err.println("");
    }//GEN-LAST:event_doctorfatherNameTFActionPerformed

    private void doctoraddressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoraddressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoraddressTFActionPerformed

    private void doctoraddhaarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoraddhaarTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoraddhaarTFActionPerformed

    private void doctoremailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoremailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoremailTFActionPerformed

    private void doctorinsuranceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorinsuranceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorinsuranceTFActionPerformed

    private void doctorgendercomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorgendercomboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorgendercomboxActionPerformed

    private void doctormobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctormobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctormobTFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        doctoraddhaarTF.setText(generateRandomString(12));
        doctormobTF.setText(generateRandomString(10));
        licenseTF.setText(generateRandomString(15));
        doctoremergencyTF.setText(generateRandomString(12));
        doctorAgeTF.setText(generateRandomString(2));
        doctorfatherNameTF.setText(generateRandomFirstName());
        doctorNameTF.setText(generateRandomFirstName());
        doctorexpTF.setText(generateRandomString(1));
        doctorinsuranceTF.setText(generateRandomString(12));
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel docfathername;
    private javax.swing.JLabel docname;
    private javax.swing.JLabel doctaddress;
    private javax.swing.JLabel doctemail;
    private javax.swing.JLabel doctgender;
    private javax.swing.JLabel doctinsurance;
    private javax.swing.JLabel doctmobile;
    private javax.swing.JLabel doctorAge;
    private javax.swing.JTextField doctorAgeTF;
    private javax.swing.JTextField doctorNameTF;
    private javax.swing.JLabel doctoraddhaar;
    private javax.swing.JTextField doctoraddhaarTF;
    private javax.swing.JTextField doctoraddressTF;
    private javax.swing.JLabel doctordate;
    private javax.swing.JTextField doctordateTF;
    private javax.swing.JTextField doctoremailTF;
    private javax.swing.JLabel doctoremercont;
    private javax.swing.JTextField doctoremergencyTF;
    private javax.swing.JLabel doctorexp;
    private javax.swing.JTextField doctorexpTF;
    private javax.swing.JTextField doctorfatherNameTF;
    private javax.swing.JComboBox<String> doctorgendercombox;
    private javax.swing.JTextField doctorinsuranceTF;
    private javax.swing.JTextField doctormobTF;
    private javax.swing.JComboBox<String> doctorspecialistTF;
    private javax.swing.JLabel doctspecialist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JTextField licenseTF;
    private javax.swing.JLabel medicallicense;
    // End of variables declaration//GEN-END:variables
}
