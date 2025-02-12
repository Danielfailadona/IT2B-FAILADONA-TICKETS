/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatergui;

import config.dbConnect;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author DANIEL FAILADONA
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form newManager
     */
    public Registration() {
        initComponents();
        this.setResizable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        New_Manager = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Navigation = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MR_cancel = new javax.swing.JButton();
        MR_username = new javax.swing.JTextField();
        MR_passwordConfirm = new javax.swing.JPasswordField();
        MR_password = new javax.swing.JPasswordField();
        ConfirmNM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        New_Manager.setBackground(new java.awt.Color(39, 39, 39));
        New_Manager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Registration");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1310, 40));

        New_Manager.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 100));

        Navigation.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        New_Manager.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 540));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Account Type:");
        New_Manager.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password:");
        New_Manager.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 80, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password:");
        New_Manager.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 140, 30));

        MR_cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MR_cancel.setText("Cancel");
        MR_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_cancelActionPerformed(evt);
            }
        });
        New_Manager.add(MR_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 90, 30));

        MR_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_usernameActionPerformed(evt);
            }
        });
        New_Manager.add(MR_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 330, 30));

        MR_passwordConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_passwordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_passwordConfirmActionPerformed(evt);
            }
        });
        New_Manager.add(MR_passwordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 330, 30));

        MR_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_passwordActionPerformed(evt);
            }
        });
        New_Manager.add(MR_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 330, 30));

        ConfirmNM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ConfirmNM.setText("Confirm");
        ConfirmNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmNMActionPerformed(evt);
            }
        });
        New_Manager.add(ConfirmNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 550, 90, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last Name:");
        New_Manager.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 80, 30));

        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        New_Manager.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 330, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("  First Name:");
        New_Manager.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, 30));

        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        New_Manager.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 330, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Phone Number:");
        New_Manager.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 130, 30));

        PhoneNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumActionPerformed(evt);
            }
        });
        New_Manager.add(PhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 330, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager" }));
        New_Manager.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 330, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        New_Manager.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(New_Manager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(New_Manager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MR_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_cancelActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MR_cancelActionPerformed

    private void MR_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_usernameActionPerformed

    private void MR_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_passwordActionPerformed

    private void MR_passwordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_passwordConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_passwordConfirmActionPerformed

    private void ConfirmNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmNMActionPerformed
    dbConnect dbc = new dbConnect();
    String password = new String(MR_password.getPassword()).trim();
    String Cpassword = new String(MR_passwordConfirm.getPassword()).trim();
    String phone = PhoneNum.getText().trim();
    String username = MR_username.getText().trim();
    String ln = Lname.getText().trim();
    String fn = Fname.getText().trim();
    



        if(username.isEmpty() || password.isEmpty() || Cpassword.isEmpty() || ln.isEmpty() || fn.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Boxes");

        }else if(!password.equals(Cpassword))
        {
            JOptionPane.showMessageDialog(null, "Password Does Not Match");
//            System.out.println("Password ["+password+"] Length: "+password.length());
//            System.out.println("Confirm Password ["+Cpassword+"] Length: "+Cpassword.length());

        }else if(!phone.matches("\\d+"))
        {
            JOptionPane.showMessageDialog(null, "Phone Must Only Contain Numbers");
        }else if(password.length() != 8)
        {
            JOptionPane.showMessageDialog(null, "Password Must be Exactly 8 Characters Long");
        }else if(phone.length() > 15 || phone.length() < 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }

    }//GEN-LAST:event_ConfirmNMActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void PhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmNM;
    private javax.swing.JTextField Fname;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField Lname;
    private javax.swing.JButton MR_cancel;
    private javax.swing.JPasswordField MR_password;
    private javax.swing.JPasswordField MR_passwordConfirm;
    private javax.swing.JTextField MR_username;
    private javax.swing.JPanel Navigation;
    private javax.swing.JPanel New_Manager;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
