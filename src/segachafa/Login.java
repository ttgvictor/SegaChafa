/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segachafa;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Eduardo Gutierrez Almanza
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

        BtnAceptar = new javax.swing.JButton();
        TxtContrasena = new javax.swing.JTextField();
        TxtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        BtnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAceptarKeyPressed(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 140, 90, -1));

        TxtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContrasenaActionPerformed(evt);
            }
        });
        TxtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContrasenaKeyPressed(evt);
            }
        });
        getContentPane().add(TxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contrase??a");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, -1));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/segachafa/menuimagen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed

    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContrasenaActionPerformed

    }//GEN-LAST:event_TxtContrasenaActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        int correcto = 0;
        String valor = null;
        File file = new File("src/segachafa/usuarios.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                if (correcto == 0) {
                    valor = sc.findInLine(TxtUsuario.getText());
                    if (valor == null) {
                        valor = "";
                    }
                    //System.out.println("correcto: " + correcto);
                    //System.out.println("valor: " + valor);
                    if (valor.equals(TxtUsuario.getText())) {
                        sc.nextLine();
                        correcto = 1;
                    } else {
                        sc.nextLine();
                    }
                } else {
                    valor = sc.findInLine(TxtContrasena.getText());
                    if (valor == null) {
                        valor = "";
                    }
                    //System.out.println("valor: " + valor);
                    //System.out.println("correcto2: " + correcto);
                    if (valor.equals(TxtContrasena.getText())) {
                        correcto = 3;
                    } else {
                        sc.nextLine();
                    }
                }
            }

            if (correcto == 3) {
                Principal Principal = new Principal();
                Principal.setVisible(true);
                this.setVisible(false);
                Principal.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(this, "El usuario o la contrase??a son incorrectos");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (TxtUsuario.getText().length() == 0 || TxtUsuario.getText().length() < 5 || TxtUsuario.getText().length() > 5) {
                JOptionPane.showMessageDialog(this, "El usuario no puede quedar vac??o y tiene que ser de 6 digitos");
            } else {
                TxtContrasena.requestFocus();
            }
        }
    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (TxtContrasena.getText().length() == 0 || TxtContrasena.getText().length() < 6 || TxtContrasena.getText().length() > 6) {
                JOptionPane.showMessageDialog(this, "La contrase??a no puede quedar vac??a y tiene que ser de 6 digitos");
            } else {
                BtnAceptar.requestFocus();
            }
        }
    }//GEN-LAST:event_TxtContrasenaKeyPressed

    private void BtnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAceptarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BtnAceptar.doClick();
        }
    }//GEN-LAST:event_BtnAceptarKeyPressed

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
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtContrasena;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
