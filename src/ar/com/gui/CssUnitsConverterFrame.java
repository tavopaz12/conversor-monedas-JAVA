package ar.com.gui;

import java.awt.*;
import ar.com.logic.*;
import javax.swing.*;

public class CssUnitsConverterFrame extends javax.swing.JFrame {

    CssUnitsController controller;
    int xMouse, yMouse;

    public CssUnitsConverterFrame(CssUnitsController controller) {
        this.controller = controller;
        initComponents();
    }

    private CssUnitsConverterFrame() {
        initComponents();
    }
    
    private void setInactiveBorderGray(JComponent component){
        component.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50)));
    }
    
    private void setActiveBorderGray(JComponent component){
        component.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        topBar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JPanel();
        closeTxt = new javax.swing.JLabel();
        returnBtn = new javax.swing.JPanel();
        returnTxt = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        rootPxInputLabel = new javax.swing.JLabel();
        rootPxInput = new javax.swing.JTextField();
        pxInputLabel = new javax.swing.JLabel();
        pxInput = new javax.swing.JTextField();
        remInputLabel = new javax.swing.JLabel();
        remInput = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        frameTitle = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(27, 27, 27));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setPreferredSize(new java.awt.Dimension(500, 540));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBar.setOpaque(false);
        topBar.setPreferredSize(new java.awt.Dimension(498, 38));
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

        closeBtn.setBackground(new java.awt.Color(27, 27, 27));
        closeBtn.setAlignmentX(-1.0F);
        closeBtn.setPreferredSize(new java.awt.Dimension(48, 38));

        closeTxt.setBackground(new java.awt.Color(27, 27, 27));
        closeTxt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        closeTxt.setForeground(new java.awt.Color(183, 187, 189));
        closeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeTxt.setText("X");
        closeTxt.setToolTipText("Salir.");
        closeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeTxt.setMaximumSize(new java.awt.Dimension(32767, 32767));
        closeTxt.setMinimumSize(new java.awt.Dimension(0, 0));
        closeTxt.setPreferredSize(new java.awt.Dimension(48, 38));
        closeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeBtnLayout = new javax.swing.GroupLayout(closeBtn);
        closeBtn.setLayout(closeBtnLayout);
        closeBtnLayout.setHorizontalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(closeBtnLayout.createSequentialGroup()
                    .addComponent(closeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        closeBtnLayout.setVerticalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(closeBtnLayout.createSequentialGroup()
                    .addComponent(closeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        returnBtn.setBackground(new java.awt.Color(27, 27, 27));
        returnBtn.setPreferredSize(new java.awt.Dimension(48, 38));

        returnTxt.setBackground(new java.awt.Color(27, 27, 27));
        returnTxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        returnTxt.setForeground(new java.awt.Color(183, 187, 189));
        returnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnTxt.setText("←");
        returnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnTxt.setPreferredSize(new java.awt.Dimension(15, 29));
        returnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout returnBtnLayout = new javax.swing.GroupLayout(returnBtn);
        returnBtn.setLayout(returnBtnLayout);
        returnBtnLayout.setHorizontalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBtnLayout.createSequentialGroup()
                .addComponent(returnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        returnBtnLayout.setVerticalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBtnLayout.createSequentialGroup()
                .addComponent(returnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        background.add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 498, 38));

        mainPanel.setBackground(new java.awt.Color(27, 27, 27));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 400));

        rootPxInputLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rootPxInputLabel.setForeground(new java.awt.Color(216, 216, 216));
        rootPxInputLabel.setText("font-size root (px)");

        rootPxInput.setBackground(new java.awt.Color(27, 27, 27));
        rootPxInput.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rootPxInput.setForeground(new java.awt.Color(216, 216, 216));
        rootPxInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rootPxInput.setText("16.0");
        rootPxInput.setToolTipText("");
        rootPxInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 90, 90)));
        rootPxInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rootPxInputFocusLost(evt);
            }
        });
        rootPxInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rootPxInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rootPxInputMouseExited(evt);
            }
        });
        rootPxInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rootPxInputKeyReleased(evt);
            }
        });

        pxInputLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        pxInputLabel.setForeground(new java.awt.Color(216, 216, 216));
        pxInputLabel.setText("PX");

        pxInput.setBackground(new java.awt.Color(27, 27, 27));
        pxInput.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        pxInput.setForeground(new java.awt.Color(41, 155, 255));
        pxInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pxInput.setText("16.0");
        pxInput.setToolTipText("");
        pxInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        pxInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pxInputFocusLost(evt);
            }
        });
        pxInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pxInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pxInputMouseExited(evt);
            }
        });
        pxInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pxInputKeyReleased(evt);
            }
        });

        remInputLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        remInputLabel.setForeground(new java.awt.Color(216, 216, 216));
        remInputLabel.setText("REM:");

        remInput.setBackground(new java.awt.Color(27, 27, 27));
        remInput.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        remInput.setForeground(new java.awt.Color(216, 216, 216));
        remInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        remInput.setText("1.0");
        remInput.setToolTipText("");
        remInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        remInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                remInputFocusLost(evt);
            }
        });
        remInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remInputMouseExited(evt);
            }
        });
        remInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                remInputKeyReleased(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(27, 27, 27));
        resetBtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(216, 216, 216));
        resetBtn.setText("RESET");
        resetBtn.setToolTipText("");
        resetBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 61, 87)));
        resetBtn.setContentAreaFilled(false);
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.setFocusPainted(false);
        resetBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetBtnMouseExited(evt);
            }
        });

        frameTitle.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        frameTitle.setForeground(new java.awt.Color(216, 216, 216));
        frameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameTitle.setText("Conversor PX - REM");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(rootPxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remInputLabel)
                    .addComponent(rootPxInputLabel)
                    .addComponent(pxInputLabel)
                    .addComponent(pxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameTitle)
                .addGap(45, 45, 45)
                .addComponent(rootPxInputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rootPxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(pxInputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(remInputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        background.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 400));

        creditsLabel.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        creditsLabel.setForeground(new java.awt.Color(186, 215, 233));
        creditsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLabel.setText("Creado por Gaston Ezequiel Giacobini - 2023 - Conversor de PX a REM ");
        creditsLabel.setPreferredSize(new java.awt.Dimension(700, 13));
        background.add(creditsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_topBarMouseDragged

    private void closeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeTxtMouseClicked

    private void closeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTxtMouseEntered
        closeBtn.setBackground(new Color(235, 69, 95));
    }//GEN-LAST:event_closeTxtMouseEntered

    private void closeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTxtMouseExited
        closeBtn.setBackground(new Color(27, 27, 27));
    }//GEN-LAST:event_closeTxtMouseExited

    private void returnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseClicked
        this.dispose();
        App.openMainSelection();
    }//GEN-LAST:event_returnTxtMouseClicked

    private void returnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseEntered
        returnBtn.setBackground(new Color(95, 69, 235));
    }//GEN-LAST:event_returnTxtMouseEntered

    private void returnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnTxtMouseExited
        returnBtn.setBackground(new Color(27, 27, 27));
    }//GEN-LAST:event_returnTxtMouseExited

    private void resetBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseExited
        resetBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(22, 61, 87)));
        resetBtn.setForeground(new Color(216, 216, 216));
    }//GEN-LAST:event_resetBtnMouseExited

    private void resetBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseEntered
        resetBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(42, 81, 107)));
        resetBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_resetBtnMouseEntered

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseClicked
        rootPxInput.setText("16.0");
        pxInput.setText("16.0");
        remInput.setText("1.0");
    }//GEN-LAST:event_resetBtnMouseClicked

    private void pxInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pxInputKeyReleased
        try {
            double rootPx = Double.parseDouble(rootPxInput.getText());
            double px = Double.parseDouble(pxInput.getText());
            String result = String.valueOf(controller.pxToRem(px, rootPx));

            remInput.setText(result);
        } catch (NumberFormatException e) {
            remInput.setText("---");
        }
    }//GEN-LAST:event_pxInputKeyReleased

    private void remInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_remInputKeyReleased
        try {
            double rootPx = Double.parseDouble(rootPxInput.getText());
            double rem = Double.parseDouble(remInput.getText());
            String result = String.valueOf(controller.remToPx(rem, rootPx));

            pxInput.setText(result);
        } catch (NumberFormatException e) {
            pxInput.setText("---");
        }
    }//GEN-LAST:event_remInputKeyReleased

    private void rootPxInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rootPxInputKeyReleased
        pxInputKeyReleased(evt);
    }//GEN-LAST:event_rootPxInputKeyReleased

    private void rootPxInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootPxInputMouseEntered
        setActiveBorderGray(rootPxInput);
    }//GEN-LAST:event_rootPxInputMouseEntered

    private void rootPxInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootPxInputMouseExited
        if (!rootPxInput.hasFocus())
            setInactiveBorderGray(rootPxInput);
    }//GEN-LAST:event_rootPxInputMouseExited

    private void pxInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pxInputMouseEntered
        setActiveBorderGray(pxInput);
    }//GEN-LAST:event_pxInputMouseEntered

    private void pxInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pxInputMouseExited
        if (!pxInput.hasFocus())
            setInactiveBorderGray(pxInput);
    }//GEN-LAST:event_pxInputMouseExited

    private void remInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remInputMouseEntered
        setActiveBorderGray(remInput);
    }//GEN-LAST:event_remInputMouseEntered

    private void remInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remInputMouseExited
        if (!remInput.hasFocus())
            setInactiveBorderGray(remInput);
    }//GEN-LAST:event_remInputMouseExited

    private void rootPxInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rootPxInputFocusLost
        setInactiveBorderGray(rootPxInput);
    }//GEN-LAST:event_rootPxInputFocusLost

    private void pxInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pxInputFocusLost
        setInactiveBorderGray(pxInput);
    }//GEN-LAST:event_pxInputFocusLost

    private void remInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_remInputFocusLost
        setInactiveBorderGray(remInput);
    }//GEN-LAST:event_remInputFocusLost

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
            java.util.logging.Logger.getLogger(CssUnitsConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CssUnitsConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CssUnitsConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CssUnitsConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CssUnitsConverterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel closeBtn;
    private javax.swing.JLabel closeTxt;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel frameTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField pxInput;
    private javax.swing.JLabel pxInputLabel;
    private javax.swing.JTextField remInput;
    private javax.swing.JLabel remInputLabel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JPanel returnBtn;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JTextField rootPxInput;
    private javax.swing.JLabel rootPxInputLabel;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
