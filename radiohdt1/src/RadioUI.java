public class RadioUI extends javax.swing.JFrame {
    radio laradio;
    int i;
    public RadioUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estacion = new javax.swing.JTextField();
        jSiguiente = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btn_estacion1 = new javax.swing.JButton();
        btn_estacion2 = new javax.swing.JButton();
        btn_estacion4 = new javax.swing.JButton();
        btn_estacion3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        btnguardar = new javax.swing.JButton();
        btn_estacion5 = new javax.swing.JButton();
        btn_estacion6 = new javax.swing.JButton();
        btn_estacion7 = new javax.swing.JButton();
        btn_estacion8 = new javax.swing.JButton();
        btn_estacion9 = new javax.swing.JButton();
        btn_estacion10 = new javax.swing.JButton();
        btn_estacion11 = new javax.swing.JButton();
        btn_estacion12 = new javax.swing.JButton();
        botonAMFM = new javax.swing.JToggleButton();
        botonONOFF = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estacion.setEditable(false);
        estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacionActionPerformed(evt);
            }
        });

        jSiguiente.setText("Siguiente");
        jSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiguienteActionPerformed(evt);
            }
        });

        btnanterior.setText("Anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btn_estacion1.setText("1");
        btn_estacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion1ActionPerformed(evt);
            }
        });

        btn_estacion2.setText("2");

        btn_estacion4.setText("4");

        btn_estacion3.setText("3");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnguardar.setText("Guardar");

        btn_estacion5.setText("5");
        btn_estacion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion5ActionPerformed(evt);
            }
        });

        btn_estacion6.setText("6");
        btn_estacion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion6ActionPerformed(evt);
            }
        });

        btn_estacion7.setText("7");
        btn_estacion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion7ActionPerformed(evt);
            }
        });

        btn_estacion8.setText("8");
        btn_estacion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion8ActionPerformed(evt);
            }
        });

        btn_estacion9.setText("9");
        btn_estacion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion9ActionPerformed(evt);
            }
        });

        btn_estacion10.setText("10");
        btn_estacion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion10ActionPerformed(evt);
            }
        });

        btn_estacion11.setText("11");
        btn_estacion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion11ActionPerformed(evt);
            }
        });

        btn_estacion12.setText("12");
        btn_estacion12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estacion12ActionPerformed(evt);
            }
        });

        botonAMFM.setText("AM / FM");
        botonAMFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAMFMActionPerformed(evt);
            }
        });

        botonONOFF.setText("On/Off");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_estacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_estacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_estacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_estacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_estacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_estacion10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_estacion11)
                                .addGap(10, 10, 10)
                                .addComponent(btn_estacion12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonAMFM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnanterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estacion))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_estacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_estacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_estacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_estacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(botonONOFF)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(botonAMFM)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(estacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnanterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_estacion1)
                    .addComponent(btn_estacion4)
                    .addComponent(btn_estacion3)
                    .addComponent(btn_estacion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_estacion5)
                    .addComponent(btn_estacion6)
                    .addComponent(btn_estacion7)
                    .addComponent(btn_estacion8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btn_estacion9)
                    .addComponent(btn_estacion10)
                    .addComponent(btn_estacion11)
                    .addComponent(btn_estacion12))
                .addGap(18, 18, 18)
                .addComponent(botonONOFF)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estacionActionPerformed

    private void jSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiguienteActionPerformed
        
    }//GEN-LAST:event_jSiguienteActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        ;// TODO add your handling code here:
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void btn_estacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion1ActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion1ActionPerformed

    private void btn_estacion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion5ActionPerformed

    private void btn_estacion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion6ActionPerformed

    private void btn_estacion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion7ActionPerformed

    private void btn_estacion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion8ActionPerformed

    private void btn_estacion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion9ActionPerformed

    private void btn_estacion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion10ActionPerformed

    private void btn_estacion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion11ActionPerformed

    private void btn_estacion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estacion12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_estacion12ActionPerformed

    private void botonAMFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAMFMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAMFMActionPerformed

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
            java.util.logging.Logger.getLogger(RadioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonAMFM;
    private javax.swing.JToggleButton botonONOFF;
    private javax.swing.JButton btn_estacion1;
    private javax.swing.JButton btn_estacion10;
    private javax.swing.JButton btn_estacion11;
    private javax.swing.JButton btn_estacion12;
    private javax.swing.JButton btn_estacion2;
    private javax.swing.JButton btn_estacion3;
    private javax.swing.JButton btn_estacion4;
    private javax.swing.JButton btn_estacion5;
    private javax.swing.JButton btn_estacion6;
    private javax.swing.JButton btn_estacion7;
    private javax.swing.JButton btn_estacion8;
    private javax.swing.JButton btn_estacion9;
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField estacion;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JButton jSiguiente;
    // End of variables declaration//GEN-END:variables
}
