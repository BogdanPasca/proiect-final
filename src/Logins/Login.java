/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
//import Logins.Login_s;



/**
 *
 * @author Dumnezeu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelParola = new javax.swing.JLabel();
        jTxtUtilizator = new javax.swing.JTextField();
        jLabelUtilizator = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jBtnReset = new javax.swing.JButton();
        jBtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autentificare");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logins/login2.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Te rugăm să te autentifici");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 320, 520);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Autentificare");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 80, 200, 50);

        jLabelParola.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelParola.setForeground(new java.awt.Color(51, 51, 51));
        jLabelParola.setText("Parolă");
        jPanel1.add(jLabelParola);
        jLabelParola.setBounds(360, 270, 90, 16);

        jTxtUtilizator.setBackground(new java.awt.Color(255, 255, 255));
        jTxtUtilizator.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTxtUtilizator.setForeground(new java.awt.Color(51, 51, 51));
        jTxtUtilizator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTxtUtilizator);
        jTxtUtilizator.setBounds(360, 180, 260, 40);

        jLabelUtilizator.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelUtilizator.setForeground(new java.awt.Color(51, 51, 51));
        jLabelUtilizator.setText("Utilizator");
        jPanel1.add(jLabelUtilizator);
        jLabelUtilizator.setBounds(360, 160, 90, 16);

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword);
        jPassword.setBounds(360, 290, 260, 40);

        jBtnReset.setBackground(new java.awt.Color(0, 102, 204));
        jBtnReset.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Resetează");
        jBtnReset.setBorder(null);
        jBtnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnReset);
        jBtnReset.setBounds(520, 380, 100, 30);

        jBtnLogin.setBackground(new java.awt.Color(0, 102, 204));
        jBtnLogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLogin.setText("Continuă");
        jBtnLogin.setBorder(null);
        jBtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLogin.setMaximumSize(new java.awt.Dimension(92, 23));
        jBtnLogin.setMinimumSize(new java.awt.Dimension(92, 23));
        jBtnLogin.setPreferredSize(new java.awt.Dimension(92, 23));
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLogin);
        jBtnLogin.setBounds(360, 380, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(662, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jPassword.setText(null);
        jTxtUtilizator.setText(null);
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        String password = jPassword.getText();
        String username = jTxtUtilizator.getText();
        if ( password.contains("changeit") && (username.contains("bogdan")))
        {
            jTxtUtilizator.setText(null);
            jPassword.setText(null);
            systemExit();
                 close();
            Logins.MainMenu Info = new Logins.MainMenu();
            Info.setVisible(true);
       
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Datele de autentificare sunt gresite!", "Login Error", JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
            jTxtUtilizator.setText(null);
        }
    }//GEN-LAST:event_jBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelParola;
    private javax.swing.JLabel jLabelUtilizator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTxtUtilizator;
    // End of variables declaration//GEN-END:variables

    
    private void systemExit()
    {
     WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING );
    }
    
    //inchide fereastra de login
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
}
