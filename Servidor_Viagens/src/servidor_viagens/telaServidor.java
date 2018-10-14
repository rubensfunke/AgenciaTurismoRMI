/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servidor_viagens.InterfaceServidorImp;
import servidor_viagens.Servidor_Main;

/**
 *
 * @author rubensFunke
 */
public class telaServidor extends javax.swing.JFrame {

    InterfaceServidorImp servImpl;
    
    public telaServidor(InterfaceServidorImp servImplRecebido) {
        this.servImpl = servImplRecebido;
        initComponents();
        
        this.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAdicionarVoo = new javax.swing.JButton();
        btAdicionarQuarto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Servidor");

        btAdicionarVoo.setText("Adicionar voo");
        btAdicionarVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarVooActionPerformed(evt);
            }
        });

        btAdicionarQuarto.setText("Adicionar quarto");
        btAdicionarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarQuartoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAdicionarQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(btAdicionarVoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btAdicionarVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAdicionarQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarVooActionPerformed
        telaNovoVoo telaVoo = new telaNovoVoo();
    }//GEN-LAST:event_btAdicionarVooActionPerformed

    private void btAdicionarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarQuartoActionPerformed
        telaNovoQuarto telaQuarto = new telaNovoQuarto();
        
    }//GEN-LAST:event_btAdicionarQuartoActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarQuarto;
    private javax.swing.JButton btAdicionarVoo;
    // End of variables declaration//GEN-END:variables
}
