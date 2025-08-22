package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static raven.application.form.other.Functions.generateRandomFirstName;
import static raven.application.form.other.Functions.generateRandomString;
import static raven.application.form.other.Functions.isValidMobileNumber;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class PatientReportForm11 extends javax.swing.JPanel {

    public PatientReportForm11() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        PatientmobTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PAtientMob = new javax.swing.JLabel();
        REportdate = new javax.swing.JLabel();
        ReportdateTF = new javax.swing.JTextField();
        PatientName = new javax.swing.JLabel();
        PatientNameTF = new javax.swing.JTextField();
        UHID = new javax.swing.JLabel();
        uhidTF = new javax.swing.JTextField();
        GenderAge = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genderTF = new javax.swing.JComboBox<>();
        AgeTF = new javax.swing.JTextField();
        bp = new javax.swing.JLabel();
        PR = new javax.swing.JLabel();
        temprature = new javax.swing.JLabel();
        patientweight = new javax.swing.JLabel();
        bpTF = new javax.swing.JTextField();
        tempTF = new javax.swing.JTextField();
        prTF = new javax.swing.JTextField();
        patwtTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Daibetic = new javax.swing.JLabel();
        diabeteTF = new javax.swing.JComboBox<>();
        Hypertension = new javax.swing.JLabel();
        hyperTF = new javax.swing.JComboBox<>();
        tsh = new javax.swing.JLabel();
        tshTF = new javax.swing.JTextField();
        foodTF = new javax.swing.JTextField();
        drugallergy = new javax.swing.JLabel();
        drugTF = new javax.swing.JTextField();
        Complaints = new javax.swing.JLabel();
        complainTF = new javax.swing.JTextField();
        pathologytestTF = new javax.swing.JTextField();
        advise = new javax.swing.JLabel();
        adviseTF = new javax.swing.JTextField();
        review = new javax.swing.JLabel();
        reviewTF = new javax.swing.JTextField();
        DoctorSign = new javax.swing.JLabel();
        signTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pathology1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateofservice = new javax.swing.JLabel();
        ConsFee = new javax.swing.JLabel();
        medicineFeeTF = new javax.swing.JLabel();
        testfeeTF = new javax.swing.JLabel();
        admitcharge = new javax.swing.JLabel();
        consfeeTF = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        dateserviceTF = new javax.swing.JTextField();
        admitchargeTF = new javax.swing.JTextField();
        totalfees = new javax.swing.JLabel();
        totalTF = new javax.swing.JTextField();
        paymentoption = new javax.swing.JLabel();
        paymentoptionTF = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Patient-Report");

        jLabel9.setText(" ");

        PAtientMob.setText("Patient Mobile");

        REportdate.setText("Date");

        PatientName.setText("Patient Name");

        PatientNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTFActionPerformed(evt);
            }
        });

        UHID.setText("UHID");

        GenderAge.setText("Gender/Age");

        genderTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        bp.setText("B.P :-");

        PR.setText("P.R :-");

        temprature.setText("Temp:-");

        patientweight.setText("Wt :-");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("HISTORY");

        Daibetic.setText("Diabetes :");

        diabeteTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        Hypertension.setText("Hypertension :");

        hyperTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "High", "Low", "Medium" }));

        tsh.setText("TSH :-");

        drugallergy.setText("Drug Allergy :-");

        Complaints.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Complaints.setText("COMPLAINTS");

        pathologytestTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathologytestTFActionPerformed(evt);
            }
        });

        advise.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        advise.setText("ADVISE ;-");

        review.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        review.setText("REVIEW AFTER :-");

        DoctorSign.setText("Doctor Sighnature");

        signTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signTFActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pathology1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pathology1.setText("PATHOLOGY INVESTIGATION");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("BILLING");

        jLabel2.setText("Food Allergy");

        dateofservice.setText("Date of Service");

        ConsFee.setText("Doctor's Consultation ");

        medicineFeeTF.setText("Medication Charge");

        testfeeTF.setText("Test and Diagonsis Charge");

        admitcharge.setText("Admit Charge");

        consfeeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consfeeTFActionPerformed(evt);
            }
        });

        dateserviceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateserviceTFActionPerformed(evt);
            }
        });

        admitchargeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitchargeTFActionPerformed(evt);
            }
        });

        totalfees.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalfees.setText("Total Charge: ");

        paymentoption.setText("Payment Options");

        paymentoptionTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online Payment", "Mail Check", "In-Person Payment" }));
        paymentoptionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentoptionTFActionPerformed(evt);
            }
        });

        jButton4.setText("Calculate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DoctorSign, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(signTF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Complaints, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(patientweight)
                                                                .addComponent(Daibetic))))
                                                    .addGap(26, 26, 26)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PatientNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(patwtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(diabeteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(59, 59, 59)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(bp)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(bpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(Hypertension)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(hyperTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(GenderAge, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tsh)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PR)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pathology1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ConsFee)
                                                .addComponent(medicineFeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(testfeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(consfeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(complainTF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pathologytestTF, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ReportdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(advise, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(review)
                                                .addComponent(dateofservice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(admitcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(paymentoption, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(totalfees, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(15, 15, 15)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(reviewTF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(adviseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(admitchargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dateserviceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(paymentoptionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genderTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tshTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(temprature)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tempTF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foodTF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(243, 243, 243)
                                        .addComponent(drugTF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(drugallergy)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PAtientMob)
                                    .addGap(85, 85, 85)
                                    .addComponent(PatientmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(UHID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(uhidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(REportdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 560, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientmobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAtientMob, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UHID))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientName)
                            .addComponent(PatientNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugallergy)
                            .addComponent(drugTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REportdate)
                            .addComponent(ReportdateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(uhidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Daibetic)
                                    .addComponent(diabeteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hypertension)
                                    .addComponent(hyperTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tsh)
                                    .addComponent(tshTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Complaints, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complainTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(advise)
                            .addComponent(adviseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patwtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientweight)
                            .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PR)
                            .addComponent(prTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temprature)
                            .addComponent(tempTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathology1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathologytestTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(review)
                    .addComponent(reviewTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsFee)
                    .addComponent(consfeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateofservice)
                    .addComponent(dateserviceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admitcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admitchargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(medicineFeeTF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentoption)
                    .addComponent(paymentoptionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testfeeTF)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalfees, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorSign, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(signTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(320, 320, 320))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(PatientNameTF.getText());
        System.out.println(PatientmobTF.getText());
        System.out.println(AgeTF.getText());
        System.out.println(uhidTF.getText());
        System.out.println(adviseTF.getText());
        System.out.println(bpTF.getText());
        System.out.println(tshTF.getText());
        System.out.println(complainTF.getText());
        System.out.println(foodTF.getText());
        System.out.println(drugTF.getText());
        System.out.println(tempTF.getText());
        System.out.println(pathologytestTF.getText());
        System.out.println(ReportdateTF.getText());
        String Diabetes = (String) diabeteTF.getSelectedItem();//1
        System.out.println(Diabetes);
        // Biilling wala part  opened  ======================================= //
        System.out.println(consfeeTF.getText());
        System.out.println(admitchargeTF.getText());
        System.out.println(testfeeTF.getText());
        System.out.println(medicineFeeTF.getText());
        System.out.println(dateserviceTF.getText());
        System.out.println(totalTF.getText());
        // consalting// TestCharge // Admitcharge // medicineCharge //  dateservice //   total // paymentoption
        String consalting = consfeeTF.getText();//14
        String Admitcharge = admitchargeTF.getText();//15
        String TestCharge = testfeeTF.getText();//16
        String medicineCharge = medicineFeeTF.getText();//17
        String dateservice = dateserviceTF.getText();//18
        String total = totalTF.getText();//19
        String paymentoption = (String) paymentoptionTF.getSelectedItem();//20
        System.out.println(paymentoption);
        // billing wala part closed  ==================================== //////
        System.out.println(patwtTF.getText());
        String PatWeight = patwtTF.getText();//2
        String Advise = adviseTF.getText();//3
        System.out.println(prTF.getText());
        String PR = prTF.getText();//4
        String review = reviewTF.getText();//5
        String temp = tempTF.getText();//6
        String Review = reviewTF.getText();//7
        String PatName = PatientNameTF.getText();//8
        String Patmob = PatientmobTF.getText();//9
        String PatGender = (String) genderTF.getSelectedItem();//10
        String Uhid = uhidTF.getText();//11
        String Bloodpressure = bpTF.getText();//12
        String tsh = tshTF.getText();//13
        String Age = AgeTF.getText();//14
        String complain = complainTF.getText();//15
        String foodAllergy = foodTF.getText();//16
        String drugAllergy = drugTF.getText();//17
        String Reportpatient = ReportdateTF.getText();//18
        String pathlabtest = pathologytestTF.getText();//19
        String hypertension = (String) hyperTF.getSelectedItem();//20
        System.out.println(hypertension);
        System.out.println(PatGender);
        if (!isValidMobileNumber(Patmob)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number");
        } else {

            String myQuery //                      1               2          3           4           5             6        7
                    = "insert into report (Patient_mobile, Patient_name, uhid_number, Report_date, patient_bp, patient_pr, patient_temp,\n"
                    + "                    patient_weight, patient_diabetes, hypertension, patient_tsh, food_allergy, drug_allergy, complaint,\n"
                    + "                    doctor_advise, pathology_test, review_after, patient_gender, patient_age, \"date\",\n"
                    + "                    doctor_consaltfees, medicinefeeTF, test_Fee, admit_charge, dateofService, Total_charge,\n"
                    + "                    Payment_option) values("
                    //  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0 1 2 3 4 5
                    + " ? ,?, ?, ?, ?, ?, ?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?,?,?,?,?);";

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
                    query.setString(1, Patmob);//name
                    //                  query.setString(2, mobiletextField.getText());
                    query.setString(2, PatName);//mobile
                    //                  query.setString(3, UHIDextField.getText());
                    query.setString(3, Uhid);//uhid
                    //                  query.setString(4, DateField.getText());
                    query.setString(4, Reportpatient);//date
                    query.setString(5, Bloodpressure);//bp
                    //                  query.setInt(5, Integer.parseInt(Student_Mobile_Number));
                    query.setString(6, PR);//pr
                    query.setString(7, temp);
                    query.setString(8, PatWeight);
                    query.setString(9, Diabetes);
                    query.setString(10, hypertension);
                    query.setString(11, tsh);
                    query.setString(12, foodAllergy);
                    query.setString(13, drugAllergy);
                    query.setString(14, complain);
                    query.setString(15, Advise);
                    query.setString(16, pathlabtest);
                    query.setString(17, Review);
                    query.setString(18, PatGender);
                    query.setString(19, Age);
                    // billing string in database//    // // e //  //  //  //    //
                    query.setString(20, consalting);
                    query.setString(21, medicineCharge);
                    query.setString(22, TestCharge);
                    query.setString(23, Admitcharge);
                    query.setString(24, dateservice);
                    query.setString(25, total);
                    query.setString(26, paymentoption);

                    //  query.setString(19,drugAllergy );
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        PatientmobTF.setText(generateRandomString(10));
        uhidTF.setText(generateRandomString(10));
        patwtTF.setText(generateRandomString(2));
        //patwtTF.setText(generateRandomString(2));
        AgeTF.setText(generateRandomString(2));
        PatientNameTF.setText(generateRandomFirstName());
        tempTF.setText(generateRandomString(2));

        tshTF.setText(generateRandomString(1));
        complainTF.setText(generateRandomString(5));
        adviseTF.setText(generateRandomString(2));
        prTF.setText(generateRandomString(2));
        reviewTF.setText(generateRandomString(1));
        pathologytestTF.setText(generateRandomFirstName());
        // staffNameTF.setText(generateRandomFirstName());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void signTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signTFActionPerformed

    private void consfeeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consfeeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consfeeTFActionPerformed

    private void admitchargeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitchargeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admitchargeTFActionPerformed

    private void dateserviceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateserviceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateserviceTFActionPerformed

    private void paymentoptionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentoptionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentoptionTFActionPerformed

    private void pathologytestTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathologytestTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathologytestTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTF;
    private javax.swing.JLabel Complaints;
    private javax.swing.JLabel ConsFee;
    private javax.swing.JLabel Daibetic;
    private javax.swing.JLabel DoctorSign;
    private javax.swing.JLabel GenderAge;
    private javax.swing.JLabel Hypertension;
    private javax.swing.JLabel PAtientMob;
    private javax.swing.JLabel PR;
    private javax.swing.JLabel PatientName;
    private javax.swing.JTextField PatientNameTF;
    private javax.swing.JTextField PatientmobTF;
    private javax.swing.JLabel REportdate;
    private javax.swing.JTextField ReportdateTF;
    private javax.swing.JLabel UHID;
    private javax.swing.JLabel admitcharge;
    private javax.swing.JTextField admitchargeTF;
    private javax.swing.JLabel advise;
    private javax.swing.JTextField adviseTF;
    private javax.swing.JLabel bp;
    private javax.swing.JTextField bpTF;
    private javax.swing.JTextField complainTF;
    private javax.swing.JTextField consfeeTF;
    private javax.swing.JLabel dateofservice;
    private javax.swing.JTextField dateserviceTF;
    private javax.swing.JComboBox<String> diabeteTF;
    private javax.swing.JTextField drugTF;
    private javax.swing.JLabel drugallergy;
    private javax.swing.JTextField foodTF;
    private javax.swing.JComboBox<String> genderTF;
    private javax.swing.JComboBox<String> hyperTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel medicineFeeTF;
    private javax.swing.JLabel pathology1;
    private javax.swing.JTextField pathologytestTF;
    private javax.swing.JLabel patientweight;
    private javax.swing.JTextField patwtTF;
    private javax.swing.JLabel paymentoption;
    private javax.swing.JComboBox<String> paymentoptionTF;
    private javax.swing.JTextField prTF;
    private javax.swing.JLabel review;
    private javax.swing.JTextField reviewTF;
    private javax.swing.JTextField signTF;
    private javax.swing.JTextField tempTF;
    private javax.swing.JLabel temprature;
    private javax.swing.JLabel testfeeTF;
    private javax.swing.JTextField totalTF;
    private javax.swing.JLabel totalfees;
    private javax.swing.JLabel tsh;
    private javax.swing.JTextField tshTF;
    private javax.swing.JTextField uhidTF;
    // End of variables declaration//GEN-END:variables
}
