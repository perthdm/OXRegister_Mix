/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MYSNACK
 */

import java.util.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;


public class signup extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signup = new javax.swing.JButton();
        signup1 = new javax.swing.JButton();
        Cpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        nickname = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Login");
        signup.setBorder(null);
        signup.setContentAreaFilled(false);
        getContentPane().add(signup);
        signup.setBounds(640, 510, 250, 30);

        signup1.setBorder(null);
        signup1.setContentAreaFilled(false);
        signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(signup1);
        signup1.setBounds(640, 400, 250, 30);

        Cpassword.setBorder(null);
        getContentPane().add(Cpassword);
        Cpassword.setBounds(680, 350, 190, 30);

        password.setBorder(null);
        getContentPane().add(password);
        password.setBounds(680, 303, 190, 30);

        username.setAutoscrolls(false);
        username.setBorder(null);
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(680, 260, 200, 30);

        nickname.setAutoscrolls(false);
        nickname.setBorder(null);
        nickname.setOpaque(false);
        nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameActionPerformed(evt);
            }
        });
        getContentPane().add(nickname);
        nickname.setBounds(680, 220, 200, 30);
        nickname.getAccessibleContext().setAccessibleName("");

        bg.setIcon(new javax.swing.ImageIcon("E:\\soft\\Program\\Game\\OX\\images\\sign up.JPG")); // NOI18N
        bg.setText("jLabel1");
        bg.setMaximumSize(new java.awt.Dimension(1024, 768));
        bg.setMinimumSize(new java.awt.Dimension(1024, 768));
        bg.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup1ActionPerformed
        String name ;
        String user ;
        String pass ;
        
        
        if(password.getText().equals(Cpassword.getText())){
             name = nickname.getText();
             user = username.getText();
             pass = password.getText();
            
             
            try {
                Register.sendToServer(user , pass, name, "sur",name);
                nickname.setText("");
                username.setText("");
                password.setText("");
                Cpassword.setText("");
                login lo = new login();
                lo.setVisible(true);
                
               
              
                
            } catch (Exception e) {
                
            }
            
            
             
        }else{
            
            JOptionPane.showMessageDialog(null, "รหัสผ่านไม่ถูกต้อง");
            password.setText("");
            Cpassword.setText("");
        }
       
    }//GEN-LAST:event_signup1ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Cpassword;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField nickname;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JButton signup1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}