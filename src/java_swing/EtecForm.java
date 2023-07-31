package java_swing;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;
public class EtecForm extends javax.swing.JFrame {

    /**
     * Creates new form EtecForm
     */
    public EtecForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGender = new javax.swing.ButtonGroup();
        bgDay = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        cbTime = new javax.swing.JComboBox<>();
        cbCourse = new javax.swing.JComboBox<>();
        ckMon = new javax.swing.JCheckBox();
        ckSat = new javax.swing.JCheckBox();
        cbPlace = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStu = new javax.swing.JTable();
        btnEdit = new com.k33ptoo.components.KButton();
        btnSave = new com.k33ptoo.components.KButton();
        btnExit = new com.k33ptoo.components.KButton();
        btnRemove = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 742));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("StuID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Time");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Place");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Course");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Day");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Price");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        bgGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMale.setText("Male");

        bgGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFemale.setText("Female");

        cbTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9-10:30", "11-12:15", "12:30-1:45", "2-3:15" }));

        cbCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C/C++/OOP", "Java + Sql ", "Web Development", "Mobile Development", " " }));

        bgDay.add(ckMon);
        ckMon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckMon.setText("Mon-Thur");

        bgDay.add(ckSat);
        ckSat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckSat.setText("Sat-Sun");

        cbPlace.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etec1", "Etec2", "Etec3", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(rbMale)
                            .addGap(99, 99, 99)
                            .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cbTime, 0, 272, Short.MAX_VALUE))
                    .addComponent(cbPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrice)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckMon)
                        .addGap(73, 73, 73)
                        .addComponent(ckSat))
                    .addComponent(txtName)
                    .addComponent(cbCourse, 0, 272, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMale)
                    .addComponent(rbFemale)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckMon)
                    .addComponent(ckSat))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10798281_19362653.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Register");

        tbStu.setBackground(new java.awt.Color(255, 102, 255));
        tbStu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbStu.setForeground(new java.awt.Color(255, 255, 255));
        tbStu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StuID", "Name", "Gender", "Course", "Price", "Time", "Place", "Day"
            }
        ));
        tbStu.setEditingRow(0);
        tbStu.setGridColor(new java.awt.Color(255, 51, 255));
        tbStu.setRowHeight(30);
        tbStu.setSelectionBackground(new java.awt.Color(255, 0, 255));
        tbStu.setSelectionForeground(new java.awt.Color(255, 204, 0));
        tbStu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStu);

        btnEdit.setText("Edit");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setkEndColor(new java.awt.Color(0, 0, 255));
        btnSave.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        btnSave.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        btnSave.setkSelectedColor(new java.awt.Color(204, 204, 204));
        btnSave.setkStartColor(new java.awt.Color(0, 0, 255));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setkEndColor(new java.awt.Color(255, 102, 0));
        btnExit.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        btnExit.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        btnExit.setkStartColor(new java.awt.Color(255, 153, 0));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemove.setkEndColor(new java.awt.Color(255, 0, 51));
        btnRemove.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        btnRemove.setkHoverForeGround(new java.awt.Color(0, 0, 255));
        btnRemove.setkHoverStartColor(new java.awt.Color(255, 51, 153));
        btnRemove.setkPressedColor(new java.awt.Color(255, 255, 255));
        btnRemove.setkSelectedColor(new java.awt.Color(255, 51, 255));
        btnRemove.setkStartColor(new java.awt.Color(255, 51, 51));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
    public void Getdata(){
        DefaultTableModel model=(DefaultTableModel)tbStu.getModel();
        for(int i=0;i<Stu_list.list.size();i++){
            Object row[]={
                Stu_list.list.get(i).getId(),
                Stu_list.list.get(i).getName(),
                Stu_list.list.get(i).getGender(),
                Stu_list.list.get(i).getCourse(),
                Stu_list.list.get(i).getPrice(),
                Stu_list.list.get(i).getTime(),
                Stu_list.list.get(i).getPlace(),
                Stu_list.list.get(i).getDay()
            };
            model.addRow(row);
        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model=(DefaultTableModel)tbStu.getModel();
        int id=Integer.parseInt(txtID.getText());
        String name=txtName.getText();
        String gender=(rbMale.isSelected()==true)?"Male":"Female";
        String place=cbPlace.getSelectedItem().toString();
        String time=cbTime.getSelectedItem().toString();
        String course=cbCourse.getSelectedItem().toString();
        float price=Float.parseFloat(txtPrice.getText());
        String Day=(ckMon.isSelected()==true)?"Mon-Thur":"Sat-Sun";
        Stu_list.list.add(new Stu_list(id, name, gender, course, place, price, time, Day));
        model.setRowCount(0);
        Getdata();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbStuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStuMouseClicked
        DefaultTableModel model=(DefaultTableModel)tbStu.getModel();
        int row=tbStu.getSelectedRow();
        txtID.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        String gender=model.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rbMale.setSelected(true);
        }else{
            rbFemale.setSelected(true);
        }
        cbCourse.setSelectedItem(model.getValueAt(row, 3));
        txtPrice.setText(model.getValueAt(row, 4).toString());
        cbTime.setSelectedItem(model.getValueAt(row, 5));
        cbPlace.setSelectedItem(model.getValueAt(row, 6));
        String day=model.getValueAt(row, 7).toString();
        if(day.equals("Mon-Thur")){
            ckMon.setSelected(true);            
        }else{
            ckSat.setSelected(true);
        }
    }//GEN-LAST:event_tbStuMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model=(DefaultTableModel)tbStu.getModel();
        int row=tbStu.getSelectedRow();
        Stu_list.list.remove(row);
        model.setRowCount(0);
        Getdata();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        DefaultTableModel model=(DefaultTableModel)tbStu.getModel();
        int id=Integer.parseInt(txtID.getText());
        String name=txtName.getText();
        String gender=(rbMale.isSelected()==true)?"Male":"Female";
        String place=cbPlace.getSelectedItem().toString();
        String time=cbTime.getSelectedItem().toString();
        String course=cbCourse.getSelectedItem().toString();
        float price=Float.parseFloat(txtPrice.getText());
        String Day=(ckMon.isSelected()==true)?"Mon-Thur":"Sat-Sun";
        int row=tbStu.getSelectedRow();
        Stu_list.list.set(row, new Stu_list(id, name, gender, course, place, price, time, Day));
        model.setRowCount(0);
        Getdata();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(EtecForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtecForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtecForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtecForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtecForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDay;
    private javax.swing.ButtonGroup bgGender;
    private com.k33ptoo.components.KButton btnEdit;
    private com.k33ptoo.components.KButton btnExit;
    private com.k33ptoo.components.KButton btnRemove;
    private com.k33ptoo.components.KButton btnSave;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbPlace;
    private javax.swing.JComboBox<String> cbTime;
    private javax.swing.JCheckBox ckMon;
    private javax.swing.JCheckBox ckSat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tbStu;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
