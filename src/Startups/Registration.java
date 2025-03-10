/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startups;

import Startups.Login;
import config.dbConnect;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;


public class Registration extends javax.swing.JFrame {

    
    private Color H;
    Color h = new Color(51,51,255);
    private Color D;
    Color d = new Color(240,240,240);
    
    
    public Registration() {
        initComponents();
        this.setResizable(false);
    }
    
    public static String phone,usname;
   

    
    public boolean duplicateCheck()
    {
        dbConnect dbc = new dbConnect();
        String p = PhoneNum.getText().trim();
        String us = MR_username.getText().trim();
        
        try
        {
            String query = "SELECT * FROM tbl_accounts WHERE u_username='"+ us +"'OR u_phone='"+ p +"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next())
            {
                phone = resultSet.getString("u_phone");
                if(phone.equals(p))
                {
                    JOptionPane.showMessageDialog(null, "Phone Number is Already Used");
                    PhoneNum.setText("");
                }
                
                usname = resultSet.getString("u_username");
                if(usname.equals(us))
                {
                    JOptionPane.showMessageDialog(null, "Username is Already Used");
                    MR_username.setText("");
                }
                return true;
            }else
            {
                return false;
            }
        }catch(SQLException ex)
        {
            System.out.println(""+ex);
            return false;
        }
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
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MR_username = new javax.swing.JTextField();
        MR_passwordConfirm = new javax.swing.JPasswordField();
        MR_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        New_Manager.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/e.jpg"))); // NOI18N

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NavigationLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NavigationLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        New_Manager.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 540));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Account Type:");
        New_Manager.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password:");
        New_Manager.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 80, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password:");
        New_Manager.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 140, 30));

        MR_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_usernameActionPerformed(evt);
            }
        });
        New_Manager.add(MR_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 330, 30));

        MR_passwordConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_passwordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_passwordConfirmActionPerformed(evt);
            }
        });
        New_Manager.add(MR_passwordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 330, 30));

        MR_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MR_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR_passwordActionPerformed(evt);
            }
        });
        New_Manager.add(MR_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 330, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last Name:");
        New_Manager.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 80, 30));

        Lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        New_Manager.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 330, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("  First Name:");
        New_Manager.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 90, 30));

        Fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        New_Manager.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 330, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Phone Number:");
        New_Manager.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 130, 30));

        PhoneNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumActionPerformed(evt);
            }
        });
        New_Manager.add(PhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 330, 30));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        New_Manager.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 330, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        New_Manager.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 80, 30));

        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancel");
        cancel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 90, -1));

        New_Manager.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 90, 30));

        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Confirm");
        confirm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 90, -1));

        New_Manager.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, 90, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/po.png"))); // NOI18N
        New_Manager.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 480, 560));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kl.png"))); // NOI18N
        New_Manager.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 240, 90));

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

    private void MR_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_usernameActionPerformed

    private void MR_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_passwordActionPerformed

    private void MR_passwordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR_passwordConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MR_passwordConfirmActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void PhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(h);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(d);
    }//GEN-LAST:event_cancelMouseExited

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
    dbConnect dbc = new dbConnect();
    String fn = Fname.getText().trim();
    String ln = Lname.getText().trim();
    String uname = MR_username.getText().trim();
    String pass = new String(MR_password.getPassword()).trim();
    String Cpass = new String(MR_passwordConfirm.getPassword()).trim();
    String p = PhoneNum.getText().trim();
    String at = type.getSelectedItem().toString().trim();
    



        if(uname.isEmpty() || pass.isEmpty() || Cpass.isEmpty() || ln.isEmpty() || fn.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Boxes");

        }else if(!pass.equals(Cpass))
        {
            JOptionPane.showMessageDialog(null, "Password Does Not Match");
            //System.out.println("Password ["+password+"] Length: "+password.length());
            //System.out.println("Confirm Password ["+Cpassword+"] Length: "+Cpassword.length());
        }else if(!p.matches("\\d+"))
        {
            JOptionPane.showMessageDialog(null, "Phone Must Only Contain Numbers");
        }else if(pass.length() <= 7)
        {
            JOptionPane.showMessageDialog(null, "Password Must be Exactly 8 Characters Long");
        }else if(p.length() > 15 || p.length() < 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }else if(duplicateCheck())
        {
            System.out.println("Duplicate Exists");
        }else if (dbc.insertData("INSERT INTO tbl_accounts (u_fname, u_lname, u_username, u_type, u_password, u_phone, u_status) "
        + "VALUES ('" + fn + "', '" + ln + "', '" + uname + "', '"+at+"','" + pass + "', '" + p + "', 'Pending')")) 
        {
            JOptionPane.showMessageDialog(null, "Registered succesfully!");
            Login l = new Login();
            l.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(h);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(d);
    }//GEN-LAST:event_confirmMouseExited

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
    private javax.swing.JTextField Fname;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField Lname;
    private javax.swing.JPasswordField MR_password;
    private javax.swing.JPasswordField MR_passwordConfirm;
    private javax.swing.JTextField MR_username;
    private javax.swing.JPanel Navigation;
    private javax.swing.JPanel New_Manager;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
