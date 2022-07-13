package com.mycompany.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        pnlGrafico = new javax.swing.JPanel();
        pnlElementos = new javax.swing.JPanel();
        labelElementos = new javax.swing.JLabel();
        ckbTitulo = new javax.swing.JCheckBox();
        ckbLegendas = new javax.swing.JCheckBox();
        ckbTituloEixos = new javax.swing.JCheckBox();
        ckbRotuloPorcento = new javax.swing.JCheckBox();
        ckbRotuloValor = new javax.swing.JCheckBox();
        ckbRotuloValorPorcento = new javax.swing.JCheckBox();
        ckbCorBarras = new javax.swing.JCheckBox();
        ckbCorBarrasGrupo = new javax.swing.JCheckBox();
        ckbGrade = new javax.swing.JCheckBox();
        btnFechar = new javax.swing.JButton();
        btnDesfazer = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        labelGraficosPadrao = new javax.swing.JLabel();
        cmbxGraficosPadrao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlGraficoLayout = new javax.swing.GroupLayout(pnlGrafico);
        pnlGrafico.setLayout(pnlGraficoLayout);
        pnlGraficoLayout.setHorizontalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        pnlGraficoLayout.setVerticalGroup(
            pnlGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelElementos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelElementos.setText("Elementos Gráficos");

        ckbTitulo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbTitulo.setText("Título");
        ckbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTituloActionPerformed(evt);
            }
        });

        ckbLegendas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbLegendas.setText("Legendas");
        ckbLegendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbLegendasActionPerformed(evt);
            }
        });

        ckbTituloEixos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbTituloEixos.setText("Título dos Eixos");

        ckbRotuloPorcento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbRotuloPorcento.setText("Rótulo de Dados (%)");
        ckbRotuloPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbRotuloPorcentoActionPerformed(evt);
            }
        });

        ckbRotuloValor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbRotuloValor.setText("Rótulo de Dados - Valor");

        ckbRotuloValorPorcento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbRotuloValorPorcento.setText("Rótulo de Dados - Valor (%)");

        ckbCorBarras.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbCorBarras.setText("Cor da Barras");

        ckbCorBarrasGrupo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbCorBarrasGrupo.setText("Cor das Barras (por grupo)");

        ckbGrade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ckbGrade.setText("Grade");

        javax.swing.GroupLayout pnlElementosLayout = new javax.swing.GroupLayout(pnlElementos);
        pnlElementos.setLayout(pnlElementosLayout);
        pnlElementosLayout.setHorizontalGroup(
            pnlElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbCorBarrasGrupo)
                    .addComponent(ckbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbLegendas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTituloEixos)
                    .addComponent(ckbRotuloValor)
                    .addComponent(ckbRotuloValorPorcento)
                    .addComponent(ckbRotuloPorcento)
                    .addComponent(ckbCorBarras)
                    .addComponent(ckbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlElementosLayout.setVerticalGroup(
            pnlElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ckbTitulo)
                .addGap(18, 18, 18)
                .addComponent(ckbLegendas)
                .addGap(18, 18, 18)
                .addComponent(ckbTituloEixos)
                .addGap(18, 18, 18)
                .addComponent(ckbRotuloPorcento)
                .addGap(18, 18, 18)
                .addComponent(ckbRotuloValor)
                .addGap(18, 18, 18)
                .addComponent(ckbRotuloValorPorcento)
                .addGap(18, 18, 18)
                .addComponent(ckbCorBarras)
                .addGap(18, 18, 18)
                .addComponent(ckbCorBarrasGrupo)
                .addGap(18, 18, 18)
                .addComponent(ckbGrade)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnFechar.setText("Fechar");

        btnDesfazer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDesfazer.setText("Desfazer");

        btnRestaurar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRestaurar.setText("Restaurar Padrão");

        labelGraficosPadrao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelGraficosPadrao.setText("Gráficos padrão ");

        cmbxGraficosPadrao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barras Horizontais", "Barras Verticais" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDesfazer)
                                .addGap(18, 18, 18)
                                .addComponent(btnRestaurar)
                                .addGap(18, 18, 18)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelGraficosPadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxGraficosPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlElementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGraficosPadrao)
                    .addComponent(cmbxGraficosPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlElementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbTituloActionPerformed

    private void ckbLegendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbLegendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbLegendasActionPerformed

    private void ckbRotuloPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbRotuloPorcentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbRotuloPorcentoActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JCheckBox ckbCorBarras;
    private javax.swing.JCheckBox ckbCorBarrasGrupo;
    private javax.swing.JCheckBox ckbGrade;
    private javax.swing.JCheckBox ckbLegendas;
    private javax.swing.JCheckBox ckbRotuloPorcento;
    private javax.swing.JCheckBox ckbRotuloValor;
    private javax.swing.JCheckBox ckbRotuloValorPorcento;
    private javax.swing.JCheckBox ckbTitulo;
    private javax.swing.JCheckBox ckbTituloEixos;
    private javax.swing.JComboBox<String> cmbxGraficosPadrao;
    private javax.swing.JLabel labelElementos;
    private javax.swing.JLabel labelGraficosPadrao;
    private javax.swing.JPanel pnlElementos;
    private javax.swing.JPanel pnlGrafico;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnDesfazer() {
        return btnDesfazer;
    }

    public void setBtnDesfazer(JButton btnDesfazer) {
        this.btnDesfazer = btnDesfazer;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public void setBtnFechar(JButton btnFechar) {
        this.btnFechar = btnFechar;
    }

    public JButton getBtnRestaurar() {
        return btnRestaurar;
    }

    public void setBtnRestaurar(JButton btnRestaurar) {
        this.btnRestaurar = btnRestaurar;
    }

    public JCheckBox getCkbCorBarras() {
        return ckbCorBarras;
    }

    public void setCkbCorBarras(JCheckBox ckbCorBarras) {
        this.ckbCorBarras = ckbCorBarras;
    }

    public JCheckBox getCkbCorBarrasGrupo() {
        return ckbCorBarrasGrupo;
    }

    public void setCkbCorBarrasGrupo(JCheckBox ckbCorBarrasGrupo) {
        this.ckbCorBarrasGrupo = ckbCorBarrasGrupo;
    }

    public JCheckBox getCkbGrade() {
        return ckbGrade;
    }

    public void setCkbGrade(JCheckBox ckbGrade) {
        this.ckbGrade = ckbGrade;
    }

    public JCheckBox getCkbLegenda() {
        return ckbLegendas;
    }

    public void setCkbLegenda(JCheckBox ckbLegenda) {
        this.ckbLegendas = ckbLegenda;
    }

    public JCheckBox getCkbRotuloPorcento() {
        return ckbRotuloPorcento;
    }

    public void setCkbRotuloPorcento(JCheckBox ckbRotuloPorcento) {
        this.ckbRotuloPorcento = ckbRotuloPorcento;
    }

    public JCheckBox getCkbRotuloValor() {
        return ckbRotuloValor;
    }

    public void setCkbRotuloValor(JCheckBox ckbRotuloValor) {
        this.ckbRotuloValor = ckbRotuloValor;
    }

    public JCheckBox getCkbRotuloValorPorcento() {
        return ckbRotuloValorPorcento;
    }

    public void setCkbRotuloValorPorcento(JCheckBox ckbRotuloValorPorcento) {
        this.ckbRotuloValorPorcento = ckbRotuloValorPorcento;
    }

    public JCheckBox getCkbTitulo() {
        return ckbTitulo;
    }

    public void setCkbTitulo(JCheckBox ckbTitulo) {
        this.ckbTitulo = ckbTitulo;
    }

    public JCheckBox getCkbTituloEixos() {
        return ckbTituloEixos;
    }

    public void setCkbTituloEixos(JCheckBox ckbTituloEixos) {
        this.ckbTituloEixos = ckbTituloEixos;
    }

    public JComboBox<String> getCmbxGraficosPadrao() {
        return cmbxGraficosPadrao;
    }

    public void setCmbxGraficosPadrao(JComboBox<String> cmbxGraficosPadrao) {
        this.cmbxGraficosPadrao = cmbxGraficosPadrao;
    }

    public JLabel getLabelElementos() {
        return labelElementos;
    }

    public void setLabelElementos(JLabel labelElementos) {
        this.labelElementos = labelElementos;
    }

    public JLabel getLabelGraficosPadrao() {
        return labelGraficosPadrao;
    }

    public void setLabelGraficosPadrao(JLabel labelGraficosPadrao) {
        this.labelGraficosPadrao = labelGraficosPadrao;
    }

    public JPanel getPnlElementos() {
        return pnlElementos;
    }

    public void setPnlElementos(JPanel pnlElementos) {
        this.pnlElementos = pnlElementos;
    }

    public JPanel getPnlGrafico() {
        return pnlGrafico;
    }

    public void setPnlGrafico(JPanel pnlGrafico) {
        this.pnlGrafico = pnlGrafico;
    }
}
