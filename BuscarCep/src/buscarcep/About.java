package buscarcep;

import java.awt.Desktop;
import java.net.URI;


public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscarCep = new javax.swing.JLabel();
        lblWebService = new javax.swing.JLabel();
        lblSite = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JButton();
        lblAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("Sobre"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscarCep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBuscarCep.setText("Buscar CEP - V 1.0");
        getContentPane().add(lblBuscarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 34, -1, -1));

        lblWebService.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblWebService.setText("WEB service: ");
        getContentPane().add(lblWebService, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 111, -1, -1));

        lblSite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSite.setForeground(new java.awt.Color(0, 102, 255));
        lblSite.setText("republicavirtual.com.br");
        lblSite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiteMouseClicked(evt);
            }
        });
        getContentPane().add(lblSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 115, -1, -1));

        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/github.png"))); // NOI18N
        btnGitHub.setToolTipText("GitHub");
        btnGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });
        getContentPane().add(btnGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 155, -1, -1));

        lblAuthor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAuthor.setText("@Author Victor Hugo");
        getContentPane().add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 253, -1, -1));

        setSize(new java.awt.Dimension(468, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        // Abrir o site no browser
        Link("https://github.com/huguds");
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        new Cep().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void lblSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiteMouseClicked
        // Ao clicar no link ele abrirá o site
        Link("https://www.republicavirtual.com.br/");
    }//GEN-LAST:event_lblSiteMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
                
            }
           
        });
    }
    
    // Método responsável por abrir um link no browser
    private void Link(String site){
        Desktop desktop = Desktop.getDesktop();
        try{
            URI uri = new URI(site);
            desktop.browse(uri);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGitHub;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBuscarCep;
    private javax.swing.JLabel lblSite;
    private javax.swing.JLabel lblWebService;
    // End of variables declaration//GEN-END:variables
}
