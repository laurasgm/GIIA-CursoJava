/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurasgm.calculadora;

/**
 *
 * @author Laura
 */
public class Grafico extends javax.swing.JFrame {

    /**
     * Creates new form GraficoCal
     */
    public Grafico() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jColorChooser1 = new javax.swing.JColorChooser();
        number7 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pantalla = new javax.swing.JTextField();
        div = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        res = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        result = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        div1 = new javax.swing.JButton();
        div2 = new javax.swing.JButton();
        div3 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        multi.setText("x");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        res.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        res.setText("-");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        number0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        punto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result.setText("=");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        sum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        div1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        div1.setText("BIN");
        div1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div1ActionPerformed(evt);
            }
        });

        div2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        div2.setText("HEX");
        div2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div2ActionPerformed(evt);
            }
        });

        div3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        div3.setText("DEC");
        div3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(number4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(number7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(number5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(number8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(number6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(number9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(div2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(div3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(div1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        pantalla.setText(pantalla.getText()+"1");
        
    }//GEN-LAST:event_number1ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_number8ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_number2ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_number9ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_number3ActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        
    }//GEN-LAST:event_pantallaActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        pantalla.setText(pantalla.getText()+"/");
    }//GEN-LAST:event_divActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        pantalla.setText(pantalla.getText()+"x");
    }//GEN-LAST:event_multiActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        pantalla.setText(pantalla.getText()+"-");
    }//GEN-LAST:event_resActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_number0ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        pantalla.setText(pantalla.getText()+".");
    }//GEN-LAST:event_puntoActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        pantalla.setText(pantalla.getText()+"+");
    }//GEN-LAST:event_sumActionPerformed

    private void div1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div1ActionPerformed

    private void div2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div2ActionPerformed

    private void div3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_div3ActionPerformed

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton div;
    private javax.swing.JButton div1;
    private javax.swing.JButton div2;
    private javax.swing.JButton div3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton multi;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton punto;
    private javax.swing.JButton res;
    private javax.swing.JButton result;
    private javax.swing.JButton sum;
    // End of variables declaration//GEN-END:variables
}
