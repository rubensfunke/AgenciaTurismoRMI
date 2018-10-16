/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import servidor_viagens.InterfaceServidorImp;
import servidor_viagens.Servidor_Main;

/**
 *
 * @author rubensFunke
 */
public class TelaServidor extends javax.swing.JFrame {

    InterfaceServidorImp servImpl;
    
    public TelaServidor(InterfaceServidorImp servImplRecebido) throws ParseException {
        this.servImpl = servImplRecebido;
        initComponents();
        
        //setando as listas de quartos e de voos
        List<ClasseQuarto> quartos = new ArrayList<>();
        List<ClasseVoo> voos = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        //Adicionando vários voos
        voos.add(new ClasseVoo("25-12-2018", 100, 0, "Curitiba", "Recife", 12.5));
        voos.add(new ClasseVoo("31-12-2018", 100, 0, "Recife", "Curitiba", 12.5));
        voos.add(new ClasseVoo("25-12-2018", 100, 0, "Curitiba", "Matinhos", 12.5));
        voos.add(new ClasseVoo("25-12-2018", 100, 0, "Matinhos", "Curitiba", 12.5));
        
        //Adicionando vários quartos
        
        
        
        
        
        this.setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaVoos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaQaurtos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Servidor");

        jLabel1.setText("Voos:");

        jLabel2.setText("Quartos:");

        tabelaVoos.setAutoCreateRowSorter(true);
        tabelaVoos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Curitiba", "São Paulo", "22/12/2018", "50"},
                {"São Paulo", "Curitiba", "31/12/2018", "60"},
                {"Recife", "Curitiba", "01/12/2018", "60"},
                {"Curitiba", "Recife", "20/11/2018", "55"}
            },
            new String [] {
                "Origem", "Destino", "Data", "Lugares Vagos"
            }
        ));
        tabelaVoos.setToolTipText("");
        jScrollPane3.setViewportView(tabelaVoos);

        tabelaQaurtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Recife", "4", null, null},
                {"Recife", "2", null, null},
                {"São Paulo", "4", null, null},
                {"São Paulo", "2", null, null},
                {"Recife", "4", null, null},
                {"Recife", "4", null, null},
                {"São Paulo", "4", null, null},
                {"São Paulo", "4", null, null}
            },
            new String [] {
                "Cidade", "Ocupantes", "DataEntrada", "DataSaida"
            }
        ));
        jScrollPane1.setViewportView(tabelaQaurtos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaQaurtos;
    private javax.swing.JTable tabelaVoos;
    // End of variables declaration//GEN-END:variables
}
