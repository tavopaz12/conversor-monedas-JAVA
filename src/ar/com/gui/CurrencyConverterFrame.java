package ar.com.gui;

import java.awt.*;
import java.util.List;
import ar.com.logic.*;
import javax.swing.*;

public class CurrencyConverterFrame extends javax.swing.JFrame {

    CurrencyController controller;
    int xMouse, yMouse;

    public CurrencyConverterFrame(CurrencyController controller) {
        this.controller = controller;
        initComponents();
        initComboboxCurrencies();
    }

    private CurrencyConverterFrame() {
        initComponents();
        initComboboxCurrencies();
    }

    private void setInactiveBorderGray(JComponent component) {
        component.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50)));
    }

    private void setActiveBorderGray(JComponent component) {
        component.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
    }

    private void setComboboxDarkStyle(JComboBox<String> jComboBox) {
        jComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setBackground(new Color(27, 27, 27));
                setForeground(new Color(216, 216, 216));
                setBorder(BorderFactory.createEmptyBorder(7, 7, 7, 7));
                super.paint(g);
            }
        });
    }

    private void initComboboxCurrencies() {
        inputCoin.setModel(new javax.swing.DefaultComboBoxModel<>(controller.getCodeWithDescription()));
        inputCoin.setSelectedIndex(controller.getCurrencyIndexByCode("ARS"));
        setComboboxDarkStyle(inputCoin);

        outputCoin.setModel(new javax.swing.DefaultComboBoxModel<>(controller.getCodeWithDescription()));
        outputCoin.setSelectedIndex(controller.getCurrencyIndexByCode("USD"));
        setComboboxDarkStyle(outputCoin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        inputValue = new javax.swing.JTextField();
        inputCoin = new javax.swing.JComboBox<>();
        outputCoin = new javax.swing.JComboBox<>();
        inputLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        inputLabel1 = new javax.swing.JLabel();
        swapBtn = new javax.swing.JButton();
        frameTitle = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JPanel();
        closeTxt = new javax.swing.JLabel();
        returnBtn = new javax.swing.JPanel();
        returnTxt = new javax.swing.JLabel();
        convertBtn = new javax.swing.JButton();
        creditsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(27, 27, 27));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setPreferredSize(new java.awt.Dimension(700, 540));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(27, 27, 27));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 450));

        inputValue.setBackground(new java.awt.Color(27, 27, 27));
        inputValue.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        inputValue.setForeground(new java.awt.Color(41, 155, 255));
        inputValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputValue.setText("1.00");
        inputValue.setToolTipText("Monto que desea convertir.");
        inputValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        inputValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputValueFocusLost(evt);
            }
        });
        inputValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputValueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inputValueMouseExited(evt);
            }
        });

        inputCoin.setBackground(new java.awt.Color(27, 27, 27));
        inputCoin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputCoin.setForeground(new java.awt.Color(216, 216, 216));
        inputCoin.setToolTipText("Moneda que quiere convertir.");
        inputCoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        inputCoin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCoin.setPreferredSize(new java.awt.Dimension(100, 23));

        outputCoin.setBackground(new java.awt.Color(27, 27, 27));
        outputCoin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        outputCoin.setForeground(new java.awt.Color(216, 216, 216));
        outputCoin.setToolTipText("Moneda a la que se convertirá.");
        outputCoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 53, 53)));
        outputCoin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outputCoin.setPreferredSize(new java.awt.Dimension(130, 50));

        inputLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        inputLabel.setForeground(new java.awt.Color(216, 216, 216));
        inputLabel.setText("DE:");

        outputLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(216, 216, 216));
        outputLabel.setText("A:");

        inputLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        inputLabel1.setForeground(new java.awt.Color(216, 216, 216));
        inputLabel1.setText("Cantidad");

        swapBtn.setBackground(new java.awt.Color(27, 27, 27));
        swapBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        swapBtn.setForeground(new java.awt.Color(216, 216, 216));
        swapBtn.setText("⥮");
        swapBtn.setToolTipText("Intercambiar Monedas.");
        swapBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 61, 87), 1, true));
        swapBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        swapBtn.setFocusPainted(false);
        swapBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        swapBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                swapBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                swapBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                swapBtnMouseExited(evt);
            }
        });

        frameTitle.setFont(new java.awt.Font("Roboto", 0, 43)); // NOI18N
        frameTitle.setForeground(new java.awt.Color(216, 216, 216));
        frameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameTitle.setText("Conversor de Monedas");
        frameTitle.setPreferredSize(new java.awt.Dimension(446, 57));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLabel1)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(inputValue, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(swapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(outputCoin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(outputLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCoin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(inputLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputValue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swapBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(inputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputCoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        background.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 390));

        topBar.setBackground(new java.awt.Color(27, 27, 27));
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

        closeTxt.setBackground(new java.awt.Color(43, 52, 103));
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
            .addComponent(closeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        closeBtnLayout.setVerticalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        returnBtn.setBackground(new java.awt.Color(27, 27, 27));
        returnBtn.setPreferredSize(new java.awt.Dimension(48, 38));

        returnTxt.setBackground(new java.awt.Color(43, 52, 103));
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
                .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

        convertBtn.setBackground(new java.awt.Color(27, 27, 27));
        convertBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        convertBtn.setForeground(new java.awt.Color(216, 216, 216));
        convertBtn.setText("CONVERTIR");
        convertBtn.setToolTipText("Realizar la conversión.");
        convertBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 87, 61), 1, true));
        convertBtn.setContentAreaFilled(false);
        convertBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertBtn.setFocusPainted(false);
        convertBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        convertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                convertBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                convertBtnMouseExited(evt);
            }
        });
        background.add(convertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 450, -1, -1));

        creditsLabel.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        creditsLabel.setForeground(new java.awt.Color(186, 215, 233));
        creditsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLabel.setText("Creado por Gaston Ezequiel Giacobini - 2023 - Conversor de Monedas");
        creditsLabel.setPreferredSize(new java.awt.Dimension(700, 13));
        background.add(creditsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
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

    private void convertBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertBtnMouseClicked
        String amount = inputValue.getText();

        try {
            Double.valueOf(amount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor insertado es incorrecto, vuelva a intentarlo");
            System.out.println(e.getMessage());
            return;
        }

        String from = controller.getCodes()[inputCoin.getSelectedIndex()];
        String to = controller.getCodes()[outputCoin.getSelectedIndex()];

        List<String> response = controller.convertCurrency(from, to, amount);
        String oldAmount = response.get(0);
        String oldCurrency = response.get(1);
        String newAmount = response.get(2);
        String newCurrency = response.get(3);

        String message = oldAmount + " " + oldCurrency + " equivale a: " + newAmount + " " + newCurrency + "\n\n¿Desea Continuar? ";
        int continueOption = JOptionPane.showConfirmDialog(this, message, "Conversion Exitosa!", 0);

        if (continueOption == 1)
            System.exit(0);
    }//GEN-LAST:event_convertBtnMouseClicked

    private void swapBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swapBtnMouseClicked
        int input = inputCoin.getSelectedIndex();
        int output = outputCoin.getSelectedIndex();
        inputCoin.setSelectedIndex(output);
        outputCoin.setSelectedIndex(input);
    }//GEN-LAST:event_swapBtnMouseClicked

    private void swapBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swapBtnMouseEntered
        swapBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(42, 81, 107)));
        swapBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_swapBtnMouseEntered

    private void swapBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swapBtnMouseExited
        swapBtn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(22, 61, 87)));
        swapBtn.setForeground(new Color(216, 216, 216));
    }//GEN-LAST:event_swapBtnMouseExited

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

    private void inputValueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputValueMouseEntered
        setActiveBorderGray(inputValue);
    }//GEN-LAST:event_inputValueMouseEntered

    private void inputValueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputValueMouseExited
        if (!inputValue.hasFocus())
            setInactiveBorderGray(inputValue);
    }//GEN-LAST:event_inputValueMouseExited

    private void convertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertBtnMouseEntered
        convertBtn.setBorder(BorderFactory.createLineBorder(new Color(52, 117, 91)));
        convertBtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_convertBtnMouseEntered

    private void convertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertBtnMouseExited
        convertBtn.setBorder(BorderFactory.createLineBorder(new Color(22, 87, 61)));
        convertBtn.setForeground(new Color(216, 216, 216));
    }//GEN-LAST:event_convertBtnMouseExited

    private void inputValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputValueFocusLost
        setInactiveBorderGray(inputValue);
    }//GEN-LAST:event_inputValueFocusLost

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
            java.util.logging.Logger.getLogger(CurrencyConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel closeBtn;
    private javax.swing.JLabel closeTxt;
    private javax.swing.JButton convertBtn;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel frameTitle;
    private javax.swing.JComboBox<String> inputCoin;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JTextField inputValue;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> outputCoin;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel returnBtn;
    private javax.swing.JLabel returnTxt;
    private javax.swing.JButton swapBtn;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
