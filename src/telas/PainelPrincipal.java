
package telas;

import calculoImc.CaminhoArquivo;
import calculoimc.Imc;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PainelPrincipal extends javax.swing.JPanel {

    public PainelPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpPeso = new javax.swing.JTextField();
        cpAltura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cpSituacao = new javax.swing.JLabel();
        LabelVlrImc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelsituacaoImc = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelNomeImc = new javax.swing.JLabel();
        labelNomeIMC = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Peso:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Altura:");

        cpPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpPesoActionPerformed(evt);
            }
        });

        cpAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpAlturaActionPerformed(evt);
            }
        });

        calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calcular.setText("Calcular IMC");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor do IMC:");

        cpSituacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpSituacao.setText("Situaçâo do IMC:");

        LabelVlrImc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelVlrImc.setText("Valor_imc");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Situaçâo do IMC:");

        labelsituacaoImc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelsituacaoImc.setText("Situaçâo_imc");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Nome");

        cpNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelNomeIMC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpNome, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(cpPeso)
                            .addComponent(cpAltura))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cpSituacao)
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelVlrImc)
                                            .addComponent(labelsituacaoImc)
                                            .addComponent(labelNomeImc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(labelNomeIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calcular)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LabelVlrImc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelsituacaoImc)
                            .addComponent(cpSituacao))
                        .addGap(52, 52, 52)
                        .addComponent(labelNomeImc))
                    .addComponent(labelNomeIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpAlturaActionPerformed


    }//GEN-LAST:event_cpAlturaActionPerformed

    private void cpPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpPesoActionPerformed
        
    }//GEN-LAST:event_cpPesoActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
        // variaveis da label peso altura situacao 
     // para o ususario poder digitar o texto peso altura, situacao.
        
        String strPeso = cpPeso.getText();
        String strAltura = cpAltura.getText();
        String strSituacao = cpSituacao.getText();
        String strNome = cpNome.getText();
        
        
        ////
        strPeso = strPeso.replaceAll(",", ".");
        strAltura = strAltura.replaceAll(",", ".");
        strSituacao = strSituacao.replaceAll(",",".");
        strNome = strNome.replaceAll(",",".");
        
        
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        String situacao = String.format(strSituacao);
        String nome = String.format(strNome);
        
        // chamando o metodo imc da classe imc.
        
        Imc im = new Imc();
        
        double vlrImc = im.calcular(peso, altura);
       
        String situacaoImc = im.pública(vlrImc);
        String nomeImc = im.Identidade(nome);
        
        
        DecimalFormat df = new DecimalFormat("#.00");
        String numeroFormatado = df.format(vlrImc);

        LabelVlrImc.setText(numeroFormatado);
        labelsituacaoImc.setText(situacaoImc);
        labelNomeIMC.setText(nome);
        
        
        CaminhoArquivo ca = new CaminhoArquivo("C:\\Users\\Suporte\\Documents\\NetBeansProjects\\c-uculo-imc-java Filipe","Dados.txt");
        
        String Conteudo = cpNome.getText()+" / "+cpPeso.getText()+"/"+cpNome.getText()+"/"+strPeso+"//"+strAltura+"//"+strSituacao+"/"+numeroFormatado+"/"+situacaoImc+"/ ";
        
        try {
            ca.gravar(Conteudo);
        } catch (IOException ex) {
            Logger.getLogger(PainelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }//GEN-LAST:event_calcularActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelVlrImc;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField cpAltura;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpPeso;
    private javax.swing.JLabel cpSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelNomeIMC;
    private javax.swing.JLabel labelNomeImc;
    private javax.swing.JLabel labelsituacaoImc;
    // End of variables declaration//GEN-END:variables
}
