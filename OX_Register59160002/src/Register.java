
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class Register extends javax.swing.JFrame {

    private String id = "", name = "", pass = "", confirmpass = "", email = "", surname = "";

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        g_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        g_conpass = new javax.swing.JTextField();
        g_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        g_pass = new javax.swing.JTextField();
        g_mail = new javax.swing.JTextField();
        g_sur = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g_id.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 280, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 270, 60));

        g_conpass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 280, 40));

        g_name.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 280, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-mail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Pass");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pass");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Surname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, 40));

        g_pass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 280, 40));

        g_mail.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 280, 40));

        g_sur.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(g_sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 280, 40));

        jButton1.setText("Confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 100, 50));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 100, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pug_dog_art_126523_1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.id = g_id.getText();
        this.name = g_name.getText();
        this.pass = g_pass.getText();
        this.confirmpass = g_conpass.getText();
        this.email = g_mail.getText();
        this.surname = g_sur.getText();

        if (!pass.equals(confirmpass)) {
            JOptionPane.showMessageDialog(null, "รหัสผ่านไม่ตรงกัน");
        }

        if (g_id.getText().equals("") || g_name.getText().equals("") || g_pass.getText().equals("") || g_conpass.getText().equals("") || g_mail.getText().equals("") || g_sur.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบ");
        } else {
            try {

                JSONObject json = Regis.sendToServer(id, pass, name, surname, email);

                if (json.getInt("status") == 0) {
                    JOptionPane.showMessageDialog(null, "Success!!");
                } else {
                    JOptionPane.showMessageDialog(null, json.getString("message"));
                    if (json.getString("message").equals("Username is already in use")) {
                        g_id.setText("");

                        g_pass.setText("");
                        g_conpass.setText("");
                    } else if (json.getString("message").equals("E-Mail is already in use")) {
                        g_mail.setText("");
                    }
                }

            } catch (Exception ex) {

            }
        }
        setText();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setText();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    private void setText() {
        g_id.setText("");
        g_name.setText("");
        g_pass.setText("");
        g_conpass.setText("");
        g_mail.setText("");
        g_sur.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g_conpass;
    private javax.swing.JTextField g_id;
    private javax.swing.JTextField g_mail;
    private javax.swing.JTextField g_name;
    private javax.swing.JTextField g_pass;
    private javax.swing.JTextField g_sur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
