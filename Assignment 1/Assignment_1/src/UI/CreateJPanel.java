/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import model.EmployeeDetails;
import model.ProfileList;

/**
 *
 * @author anweshpeddineni
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    ProfileList list;
    
    public CreateJPanel(ProfileList list) {
        initComponents();
        this.list = list;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblCellphoneNo = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtCellphoneNo = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        radBtnMale = new javax.swing.JRadioButton();
        radBtnFemale = new javax.swing.JRadioButton();
        radBtnOther = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        imgProfile = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee Profile");

        lblName.setText("Name :");

        lblEmployeeId.setText("Employee ID :");

        lblAge.setText("Age :");

        lblGender.setText("Gender :");

        lblStartDate.setText("Start Date :");

        lblLevel.setText("Level :");

        lblTeamInfo.setText("Team Info :");

        lblPositionTitle.setText("Position Tile :");

        lblContactInfo.setText("Contact Info :");

        lblCellphoneNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCellphoneNo.setText("Cellphone No :");

        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailId.setText("Email ID :");

        lblPhoto.setText("Photo :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });

        txtCellphoneNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCellphoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellphoneNoActionPerformed(evt);
            }
        });

        txtEmailId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        genderGroup.add(radBtnMale);
        radBtnMale.setText("Male");
        radBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMaleActionPerformed(evt);
            }
        });

        genderGroup.add(radBtnFemale);
        radBtnFemale.setText("Female");
        radBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnFemaleActionPerformed(evt);
            }
        });

        genderGroup.add(radBtnOther);
        radBtnOther.setText("Other");
        radBtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnOtherActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        imgProfile.setIcon(new javax.swing.ImageIcon("/Users/anweshpeddineni/Documents/AED class/profilephoto.jpeg")); // NOI18N

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContactInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCellphoneNo)
                                    .addComponent(lblEmailId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCellphoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTeamInfo)
                            .addComponent(lblPositionTitle)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName)
                                        .addComponent(lblEmployeeId)
                                        .addComponent(lblAge)
                                        .addComponent(lblGender))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radBtnMale)
                                        .addComponent(radBtnFemale)
                                        .addComponent(radBtnOther)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStartDate)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtStartDate))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLevel)
                                    .addGap(73, 73, 73)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTeamInfo)
                                        .addComponent(txtLevel)
                                        .addComponent(txtPositionTitle))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoto)
                                .addGap(18, 18, 18)
                                .addComponent(imgProfile)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpload)))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radBtnMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radBtnFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radBtnOther)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactInfo)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellphoneNo)
                    .addComponent(txtCellphoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblPhoto))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addComponent(btnSave)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void radBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radBtnMaleActionPerformed

    private void radBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnFemaleActionPerformed

    private void radBtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnOtherActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void txtCellphoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellphoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellphoneNoActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        int employeeId = Integer.parseInt(txtEmployeeId.getText());
        int age = Integer.parseInt(txtAge.getText());
        String gender = genderGroup.getSelection().getActionCommand();
        
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String positionTitle = txtPositionTitle.getText();
        int cellPhoneNumber = Integer.parseInt(txtCellphoneNo.getText());
        String emailId = txtEmailId.getText();
        
        /*profile photo*/
//        product.setPhoto(imgProfile.getIcon().getImage());
        
        EmployeeDetails ed = list.addNewEmployee();
        ed.setName(name);
        ed.setEmployeeId(employeeId);
        ed.setAge(age);
        ed.setGender(gender);
        ed.setStartDate(startDate);
        ed.setLevel(level);
        ed.setTeamInfo(teamInfo);
        ed.setPositionTitle(positionTitle);
        ed.setCellPhoneNumber(cellPhoneNumber);
        ed.setEmailId(emailId);
        
        JOptionPane.showMessageDialog(this, "New Profile Data Added.");
        
        txtName.setText("");
        txtEmployeeId.setText("");
        txtAge.setText("");
        genderGroup.clearSelection();
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellphoneNo.setText("");
        txtEmailId.setText("");
//        photo
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String path = file.getAbsolutePath();
        Image im = Toolkit.getDefaultToolkit().createImage(path);
//        im = im.getScaledInstance(imgProfile.getWidth(), imgProfile.getHeight());
        ImageIcon ii = new ImageIcon(im);
        imgProfile.setIcon(ii);
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel imgProfile;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellphoneNo;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radBtnFemale;
    private javax.swing.JRadioButton radBtnMale;
    private javax.swing.JRadioButton radBtnOther;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellphoneNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
