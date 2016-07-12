/* Clase con el GUI del programa

Autores: Rodrigo Arriaza, Sebastian Galindo, Alejandro Chaclan
*/

/**
 *
 * @author arriaza96
 */


public class RadioUI extends javax.swing.JFrame {
    radio laradio;
    int i;

    /**
     *
     */
    public RadioUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Edit = new javax.swing.JTextField();
        ButtonSiguiente = new javax.swing.JButton();
        ButtonAnterior = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Combobox1 = new javax.swing.JComboBox();
        ButtonGuardar = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        ToggleAMFM = new javax.swing.JToggleButton();
        ToggleOnOff = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Edit.setEditable(false);
        Edit.setText("87.9");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        ButtonSiguiente.setText("Siguiente");
        ButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSiguienteActionPerformed(evt);
            }
        });

        ButtonAnterior.setText("Anterior");
        ButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnteriorActionPerformed(evt);
            }
        });

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button10.setText("10");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        Button11.setText("11");
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });

        Button12.setText("12");
        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });

        ToggleAMFM.setText("FM");
        ToggleAMFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleAMFMActionPerformed(evt);
            }
        });

        ToggleOnOff.setText("On/Off");
        ToggleOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleOnOffActionPerformed(evt);
            }
        });

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
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button11)
                                .addGap(10, 10, 10)
                                .addComponent(Button12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(ToggleAMFM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(ToggleOnOff)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ButtonSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToggleAMFM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1)
                    .addComponent(Button4)
                    .addComponent(Button3)
                    .addComponent(Button2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5)
                    .addComponent(Button6)
                    .addComponent(Button7)
                    .addComponent(Button8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonGuardar)
                    .addComponent(Button9)
                    .addComponent(Button10)
                    .addComponent(Button11)
                    .addComponent(Button12))
                .addGap(18, 18, 18)
                .addComponent(ToggleOnOff)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

    }//GEN-LAST:event_EditActionPerformed

    private void ButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSiguienteActionPerformed
        // se revisa si la radio esta en AM o FM y depende de eso se muestra la emisora y cambia para arriba
        if (radio.getFrecuencia()) {
            radio.setEmisora(100 *(radio.getEmisora() + 0.2) / 100);
            Edit.setText(Double.toString(radio.getEmisora()));
        } else {
            radio.setEmisora(radio.getEmisora() + 10);
            Edit.setText(Double.toString(radio.getEmisora()));
        }
    }//GEN-LAST:event_ButtonSiguienteActionPerformed

    private void ButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnteriorActionPerformed
        // se revisa si la radio esta en AM o FM y depende de eso se muestra la emisora y cambia para abajo
        if (radio.getFrecuencia()) {
            radio.setEmisora(100 * (radio.getEmisora() - 0.2) / 100);
            Edit.setText(Double.toString(radio.getEmisora()));
        } else {
            radio.setEmisora(radio.getEmisora() - 10);
            Edit.setText(Double.toString(radio.getEmisora()));
        }
    }//GEN-LAST:event_ButtonAnteriorActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(1)));
        radio.setEmisora(radio.selectEmisora(1));
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(5)));
        radio.setEmisora(radio.selectEmisora(5));
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(6)));
        radio.setEmisora(radio.selectEmisora(6));
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(7)));
        radio.setEmisora(radio.selectEmisora(7));
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(8)));
        radio.setEmisora(radio.selectEmisora(8));
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(9)));
        radio.setEmisora(radio.selectEmisora(9));
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(10)));
        radio.setEmisora(radio.selectEmisora(10));
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(11)));
        radio.setEmisora(radio.selectEmisora(11));
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(12)));
        radio.setEmisora(radio.selectEmisora(12));
    }//GEN-LAST:event_Button12ActionPerformed

    private void ToggleAMFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleAMFMActionPerformed
        // aqui se especifica el funcionamiento del boton AM/FM
        if (radio.getFrecuencia()) {
            ToggleAMFM.setText("AM");
            radio.setFrecuencia(false);
            radio.setEmisora(530);
            Edit.setText("530");
        } else {
            ToggleAMFM.setText("FM");
            radio.setFrecuencia(true);
            radio.setEmisora(87.9);
            Edit.setText("87.9");
        }

    }//GEN-LAST:event_ToggleAMFMActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        radio.saveEmisora(Combobox1.getSelectedIndex(),radio.getEmisora());
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(2)));
        radio.setEmisora(radio.selectEmisora(2));
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(3)));
        radio.setEmisora(radio.selectEmisora(3));
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Edit.setText(Double.toString(radio.selectEmisora(4)));
        radio.setEmisora(radio.selectEmisora(4));
    }//GEN-LAST:event_Button4ActionPerformed

    private void ToggleOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleOnOffActionPerformed
       //cuando se apague se deshabilitan los demas botones
        if (radio.getEncendido()) {
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            Button10.setEnabled(false);
            Button11.setEnabled(false);
            Button12.setEnabled(false);
            ButtonSiguiente.setEnabled(false);
            ButtonAnterior.setEnabled(false);
            ButtonGuardar.setEnabled(false);
            Combobox1.setEnabled(false);
            Edit.setVisible(false);
            ToggleAMFM.setEnabled(false);
            radio.setEncendido(false);
        } else {
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(true);
            Button9.setEnabled(true);
            Button10.setEnabled(true);
            Button11.setEnabled(true);
            Button12.setEnabled(true);
            ButtonSiguiente.setEnabled(true);
            ButtonAnterior.setEnabled(true);
            ButtonGuardar.setEnabled(true);
            Combobox1.setEnabled(true);
            Edit.setVisible(true);
            ToggleAMFM.setEnabled(true);
            radio.setEncendido(true);
        }
    }//GEN-LAST:event_ToggleOnOffActionPerformed

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

    private usoRadio radio = new usoRadio();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAnterior;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonSiguiente;
    private javax.swing.JComboBox Combobox1;
    private javax.swing.JTextField Edit;
    private javax.swing.JToggleButton ToggleAMFM;
    private javax.swing.JToggleButton ToggleOnOff;
    // End of variables declaration//GEN-END:variables
}
