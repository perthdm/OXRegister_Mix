package ox;

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

public class OX_Regis extends javax.swing.JFrame {
    
    public OX_Regis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cancel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        Button_confirm = new javax.swing.JLabel();
        Button_cancel = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        input_pass = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        input_Cpass = new javax.swing.JTextField();
        Text_Regis = new javax.swing.JLabel();
        Text_Pass = new javax.swing.JLabel();
        Text_ID = new javax.swing.JLabel();
        Text_CPass = new javax.swing.JLabel();
        Text_maiil = new javax.swing.JLabel();
        input_name = new javax.swing.JTextField();
        Text_name = new javax.swing.JLabel();
        Text_surname = new javax.swing.JLabel();
        input_surname = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        Cancel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        Cancel1.setForeground(new java.awt.Color(255, 255, 255));
        Cancel1.setText("Confirm");
        getContentPane().add(Cancel1);
        Cancel1.setBounds(602, 520, 120, 40);

        Cancel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        getContentPane().add(Cancel);
        Cancel.setBounds(380, 520, 100, 40);

        Button_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ox/BT_PauseSiilver.png"))); // NOI18N
        Button_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_confirmMouseExited(evt);
            }
        });
        getContentPane().add(Button_confirm);
        Button_confirm.setBounds(580, 510, 159, 66);

        Button_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ox/BT_PauseSiilver.png"))); // NOI18N
        Button_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_cancelMouseExited(evt);
            }
        });
        getContentPane().add(Button_cancel);
        Button_cancel.setBounds(350, 510, 160, 70);

        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });
        getContentPane().add(input_id);
        input_id.setBounds(310, 200, 180, 40);

        input_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passActionPerformed(evt);
            }
        });
        getContentPane().add(input_pass);
        input_pass.setBounds(310, 270, 180, 40);
        getContentPane().add(input_email);
        input_email.setBounds(670, 340, 180, 40);

        input_Cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_CpassActionPerformed(evt);
            }
        });
        getContentPane().add(input_Cpass);
        input_Cpass.setBounds(310, 340, 180, 40);

        Text_Regis.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Text_Regis.setForeground(new java.awt.Color(255, 255, 255));
        Text_Regis.setText("REGISTER");
        getContentPane().add(Text_Regis);
        Text_Regis.setBounds(410, 60, 270, 70);

        Text_Pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_Pass.setForeground(new java.awt.Color(255, 255, 255));
        Text_Pass.setText("Pass :");
        getContentPane().add(Text_Pass);
        Text_Pass.setBounds(230, 260, 110, 50);

        Text_ID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_ID.setForeground(new java.awt.Color(255, 255, 255));
        Text_ID.setText("ID :");
        getContentPane().add(Text_ID);
        Text_ID.setBounds(250, 200, 70, 50);

        Text_CPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_CPass.setForeground(new java.awt.Color(255, 255, 255));
        Text_CPass.setText("Confirm Pass :");
        getContentPane().add(Text_CPass);
        Text_CPass.setBounds(140, 330, 170, 50);

        Text_maiil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_maiil.setForeground(new java.awt.Color(255, 255, 255));
        Text_maiil.setText("E-mail :");
        getContentPane().add(Text_maiil);
        Text_maiil.setBounds(570, 330, 110, 50);
        getContentPane().add(input_name);
        input_name.setBounds(670, 200, 180, 40);

        Text_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_name.setForeground(new java.awt.Color(255, 255, 255));
        Text_name.setText("Name :");
        getContentPane().add(Text_name);
        Text_name.setBounds(580, 200, 120, 50);

        Text_surname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text_surname.setForeground(new java.awt.Color(255, 255, 255));
        Text_surname.setText("Surname : ");
        getContentPane().add(Text_surname);
        Text_surname.setBounds(550, 260, 180, 50);
        getContentPane().add(input_surname);
        input_surname.setBounds(670, 270, 180, 40);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ox/bg.png"))); // NOI18N
        BG.setText("jLabel4");
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.setMaximumSize(new java.awt.Dimension(1024, 768));
        BG.setMinimumSize(new java.awt.Dimension(1024, 768));
        BG.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
       
    }//GEN-LAST:event_input_idActionPerformed

    private void input_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passActionPerformed
       
    }//GEN-LAST:event_input_passActionPerformed

    private void input_CpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_CpassActionPerformed
       
    }//GEN-LAST:event_input_CpassActionPerformed

    private void Button_confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_confirmMouseClicked
        String id ;
        String pass ;
        String name ;
        String surname ;
        String mail ;
        
        if(input_pass.getText().equals(input_Cpass.getText())){
             id = input_id.getText();   
             pass = input_pass.getText();
             name = input_name.getText();
             surname = input_surname.getText();
             mail = input_email.getText();
             
            try {
                 JSONObject check = Register.sendToServer(id, pass, name, surname, mail);
                
                if(check.getInt("status") == 0){
                    JOptionPane.showMessageDialog(null, "Success");
                    
                    input_pass.setText("");
                    input_Cpass.setText("");
                    input_id.setText("");
                    input_name.setText("");
                    input_surname.setText("");
                    input_email.setText("");
                     
                }else if(check.getInt("status")== 1){
                    String Alart = check.getString("message");
                    JOptionPane.showMessageDialog(null,Alart );
                    
                    if(Alart.equals("Username is already in use")){
                         input_id.setText("");
                         input_pass.setText("");
                         input_Cpass.setText("");
                    }
                    else if(Alart.equals("E-Mail is already in use")){
                         input_email.setText("");
                    }
                }
                
                
            } catch (Exception e) {
            
            }
            
        }else{
            String mis = "A password mismatch (pls, try again)";
            JOptionPane.showMessageDialog(null, mis);
            input_pass.setText("");
            input_Cpass.setText("");
        }
    }//GEN-LAST:event_Button_confirmMouseClicked

    private void Button_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Button_cancelMouseClicked

    private void Button_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_cancelMouseEntered
       ImageIcon img = new ImageIcon(this.getClass().getResource("BT_PauseGold.png"));
       Button_cancel.setIcon(img);
       
    }//GEN-LAST:event_Button_cancelMouseEntered

    private void Button_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_cancelMouseExited
        ImageIcon img = new ImageIcon(this.getClass().getResource("BT_PauseSiilver.png"));
         Button_cancel.setIcon(img);
    }//GEN-LAST:event_Button_cancelMouseExited

    private void Button_confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_confirmMouseEntered
        ImageIcon img = new ImageIcon(this.getClass().getResource("BT_PauseGold.png"));
       Button_confirm.setIcon(img);
    }//GEN-LAST:event_Button_confirmMouseEntered

    private void Button_confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_confirmMouseExited
        ImageIcon img = new ImageIcon(this.getClass().getResource("BT_PauseSiilver.png"));
         Button_confirm.setIcon(img);
    }//GEN-LAST:event_Button_confirmMouseExited
    
   
    
    public static void main(String args[]) {
       
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OX_Regis().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Button_cancel;
    private javax.swing.JLabel Button_confirm;
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Cancel1;
    private javax.swing.JLabel Text_CPass;
    private javax.swing.JLabel Text_ID;
    private javax.swing.JLabel Text_Pass;
    private javax.swing.JLabel Text_Regis;
    private javax.swing.JLabel Text_maiil;
    private javax.swing.JLabel Text_name;
    private javax.swing.JLabel Text_surname;
    private javax.swing.JTextField input_Cpass;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_pass;
    private javax.swing.JTextField input_surname;
    // End of variables declaration//GEN-END:variables
}
