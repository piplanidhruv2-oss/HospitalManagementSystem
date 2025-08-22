package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static raven.application.form.other.Functions.isValidName;
import static raven.application.form.other.Functions.searchbar;
import raven.requiredFunctions.DatabaseConnection;

/**
 *
 * @author Raven
 */
public class MedicineForm extends javax.swing.JPanel {

    public MedicineForm() {
        initComponents();
        String query = "select * from medicine_description;"; // Replace with your SQL query
        try {
            Connection sqlcon = DatabaseConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = sqlcon.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            Medtable.setModel(DbUtils.resultSetToTableModel(resultSet));
            preparedStatement.close();
//                while (resultSet.next()) {
            resultSet.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        MedicineName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Medtable = new javax.swing.JTable();
        paNumberTF = new javax.swing.JTextField();
        MedicineTF = new javax.swing.JTextField();
        Generic = new javax.swing.JLabel();
        GenericTF = new javax.swing.JTextField();
        brand = new javax.swing.JLabel();
        brandname = new javax.swing.JTextField();
        Dosage = new javax.swing.JLabel();
        strenght = new javax.swing.JLabel();
        strengthTF = new javax.swing.JTextField();
        dosageCombo = new javax.swing.JComboBox<>();
        quanitity = new javax.swing.JLabel();
        quanityTF = new javax.swing.JTextField();
        Exprydate = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        Batchnumber = new javax.swing.JLabel();
        batchTF = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        mydicine = new javax.swing.JLabel();
        storage = new javax.swing.JLabel();
        storageTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        typeTF = new javax.swing.JComboBox<>();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Medicine");

        MedicineName.setText("Medicine Name");

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Medtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Batch Number", "Dosage Form", "Strength", "Quanitity", "Medicine Type", "Price"
            }
        ));
        Medtable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MedtableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(Medtable);

        paNumberTF.setText("Medicine Name");
        paNumberTF.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                paNumberTFInputMethodTextChanged(evt);
            }
        });
        paNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paNumberTFActionPerformed(evt);
            }
        });
        paNumberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paNumberTFKeyReleased(evt);
            }
        });

        Generic.setText("Generic Name");

        brand.setText("Brand Name:");

        Dosage.setText("Dosage Form");

        strenght.setText("Strength");

        dosageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " tablet", " capsule", " syrup", " injection", "cream" }));

        quanitity.setText("Quantity");

        quanityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanityTFActionPerformed(evt);
            }
        });

        Exprydate.setText("Expiry Date");

        Batchnumber.setText("Batch Number");

        price.setText(" Price");

        mydicine.setText("Medicine Type");

        storage.setText("Storage Conditions");

        jLabel11.setText("Mg");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        typeTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antibiotics", "Analgesics", "Antihypertensives", "Antihistamines", "Antidiabetics", "Sedatives", "Vaccines" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(paNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dosage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedicineTF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dosageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Generic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(strenght, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mydicine, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GenericTF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(strengthTF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(typeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(quanitity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(brand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(storage)
                                        .addGap(19, 19, 19)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(brandname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quanityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Batchnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Exprydate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(batchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(storageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3))
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicineName)
                    .addComponent(MedicineTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generic)
                    .addComponent(GenericTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand)
                    .addComponent(brandname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batchnumber)
                    .addComponent(batchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dosage)
                    .addComponent(strenght, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strengthTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanitity)
                    .addComponent(quanityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exprydate)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mydicine)
                        .addComponent(storage)
                        .addComponent(storageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(paNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void paNumberTFInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_paNumberTFInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_paNumberTFInputMethodTextChanged

    private void paNumberTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paNumberTFKeyReleased
        // TODO add your handling code here:
        searchbar(Medtable, paNumberTF.getText());

    }//GEN-LAST:event_paNumberTFKeyReleased

    private void paNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paNumberTFActionPerformed

    private void quanityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanityTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(MedicineTF.getText());//1
        System.out.println(quanityTF.getText());//2
        System.out.println(batchTF.getText());//3
        System.out.println(dateTF.getText());//4
        System.out.println(brandname.getText());//5
//        System.out.println(batchTF.getText());//6
        System.out.println(GenericTF.getText());//7
        System.out.println(storageTF.getText()//8
        );
        System.out.println(strengthTF.getText());//9
        System.out.println(priceTF.getText()//10
        );
        String medtype = (String) typeTF.getSelectedItem();
        System.out.println(medtype);

        String medicineName = MedicineTF.getText();
        String quantity = quanityTF.getText();
//        String doctorGender = (String) doctorgendercombox.getSelectedItem();
        String medicinebatch = batchTF.getText();
        String datemedicine = dateTF.getText();
        //String medtype = typeTF.getText();
        String price = priceTF.getText();

        String brand = brandname.getText();
        String genericName = GenericTF.getText();
        String storage = storageTF.getText();
        String strength = strengthTF.getText();
        // String medicallicense = typeTF.getText();
        String dosage = (String) dosageCombo.getSelectedItem();
        System.out.println(dosage);
        // System.out.println(doctorGender);

        if (!isValidName(medicineName)) {

            JOptionPane.showMessageDialog(this, "Enter Valid Medicine Name");
        } else {

            String myQuery
                    = "insert into medicine_description(Medicine_name, Generic_name, Brand_name, expiry_date, Quantity, dosage, Batch_number,\n"
                    + "                                  storage, strength, medicine_type) values("
                    + "?,?,?,?,?,?,?,?,?,?);";
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
                    query.setString(1, medicineName);
                    //                  query.setString(2, stdLnametextField.getText());
                    query.setString(2, genericName);
                    //                  query.setString(3, stdFathertextField.getText());
                    query.setString(3, brand);
                    //                  query.setString(4, emailTextField.getText());
                    query.setString(4, datemedicine);
                    query.setString(5, quantity);
                    query.setString(6, dosage);
                    query.setString(7, medicinebatch);
                    query.setString(8, storage);
                    query.setString(9, strength);
                    query.setString(10, medtype);

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

    private void MedtableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MedtableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_MedtableAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Batchnumber;
    private javax.swing.JLabel Dosage;
    private javax.swing.JLabel Exprydate;
    private javax.swing.JLabel Generic;
    private javax.swing.JTextField GenericTF;
    private javax.swing.JLabel MedicineName;
    private javax.swing.JTextField MedicineTF;
    private javax.swing.JTable Medtable;
    private javax.swing.JTextField batchTF;
    private javax.swing.JLabel brand;
    private javax.swing.JTextField brandname;
    private javax.swing.JTextField dateTF;
    private javax.swing.JComboBox<String> dosageCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel mydicine;
    private javax.swing.JTextField paNumberTF;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel quanitity;
    private javax.swing.JTextField quanityTF;
    private javax.swing.JLabel storage;
    private javax.swing.JTextField storageTF;
    private javax.swing.JLabel strenght;
    private javax.swing.JTextField strengthTF;
    private javax.swing.JComboBox<String> typeTF;
    // End of variables declaration//GEN-END:variables
}
