package ar.com.gui;

import java.awt.Color;
import ar.com.logic.App;
import javax.swing.BorderFactory;

public class MainSelectionFrame extends javax.swing.JFrame {

    int xMouse, yMouse;

    public MainSelectionFrame() {
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

        background = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        currencyBtn = new javax.swing.JButton();
        pxToRemBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(27, 27, 27));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setPreferredSize(new java.awt.Dimension(300, 300));

        titleLabel.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(216, 216, 216));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Conversor Alura v1.0");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setPreferredSize(new java.awt.Dimension(240, 50));

        currencyBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        currencyBtn.setForeground(new java.awt.Color(216, 216, 216));
        currencyBtn.setText("Monedas");
        currencyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        currencyBtn.setContentAreaFilled(false);
        currencyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currencyBtn.setFocusPainted(false);
        currencyBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        currencyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currencyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currencyBtnMouseExited(evt);
            }
        });
        currencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyBtnActionPerformed(evt);
            }
        });

        pxToRemBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        pxToRemBtn.setForeground(new java.awt.Color(216, 216, 216));
        pxToRemBtn.setText("Unidades CSS");
        pxToRemBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        pxToRemBtn.setContentAreaFilled(false);
        pxToRemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pxToRemBtn.setFocusPainted(false);
        pxToRemBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        pxToRemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pxToRemBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pxToRemBtnMouseExited(evt);
            }
        });
        pxToRemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pxToRemBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(210, 5, 0));
        closeBtn.setText("SALIR");
        closeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 5, 0)));
        closeBtn.setContentAreaFilled(false);
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.setFocusPainted(false);
        closeBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        topBar.setOpaque(false);
        topBar.setPreferredSize(new java.awt.Dimension(300, 25));
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 216, 216));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creado por Gaston Giacobini - 2023");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currencyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pxToRemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(currencyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pxToRemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyBtnActionPerformed
        this.dispose();
        App.openCurrencyConverter();
    }//GEN-LAST:event_currencyBtnActionPerformed

    private void pxToRemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pxToRemBtnActionPerformed
        this.dispose();
        App.openCssUnitsConverter();
    }//GEN-LAST:event_pxToRemBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_topBarMouseDragged

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        closeBtn.setForeground(new Color(255,60,50));
    }//GEN-LAST:event_closeBtnMousePressed

    private void currencyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyBtnMouseEntered
        currencyBtn.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
        currencyBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_currencyBtnMouseEntered

    private void currencyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyBtnMouseExited
        currencyBtn.setBorder(BorderFactory.createLineBorder(new Color(53, 53,53)));
        currencyBtn.setForeground(new Color(216,216,216));
    }//GEN-LAST:event_currencyBtnMouseExited

    private void pxToRemBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pxToRemBtnMouseEntered
        pxToRemBtn.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
        pxToRemBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_pxToRemBtnMouseEntered

    private void pxToRemBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pxToRemBtnMouseExited
        pxToRemBtn.setBorder(BorderFactory.createLineBorder(new Color(53, 53,53)));
        pxToRemBtn.setForeground(new Color(216,216,216));
    }//GEN-LAST:event_pxToRemBtnMouseExited

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setBorder(BorderFactory.createLineBorder(new Color(255,48,33)));
        closeBtn.setForeground(new Color(255,48,33));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBorder(BorderFactory.createLineBorder(new Color(210,5,0)));
        closeBtn.setForeground(new Color(210,5,0));
    }//GEN-LAST:event_closeBtnMouseExited

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
            java.util.logging.Logger.getLogger(MainSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSelectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton currencyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pxToRemBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
