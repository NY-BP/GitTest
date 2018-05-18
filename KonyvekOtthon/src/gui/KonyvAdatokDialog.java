/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import modell.Konyv;

/**
 *
 * @author Safi
 */
public class KonyvAdatokDialog extends javax.swing.JDialog {

    private Konyv konyv;
    private boolean mentes;
    
    
    
    public KonyvAdatokDialog(java.awt.Frame parent, boolean modal, Konyv konyv) {
        super(parent, modal);
        initComponents();
        
        this.konyv=konyv;
        
        if(konyv == null){
            setTitle("Új könyv felvétele");
        } else {
            setTitle("Könyv adatainak módosítása");
            tfIroKolto.setText(konyv.getIroKolto());
            tfCim.setText(konyv.getCim());
            tfHollet.setText(konyv.getHollet());
        }
        
        setLocationRelativeTo(parent);
        mentes = false;
        
    }

    public boolean isMentes() {
        return mentes;
    }

    
    public Konyv getKonyv() {
        return konyv;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfHollet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btMegsem = new javax.swing.JButton();
        btMentes = new javax.swing.JButton();
        tfCim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfIroKolto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cím:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Hollét:");

        btMegsem.setText("Mégsem");
        btMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegsemActionPerformed(evt);
            }
        });

        btMentes.setText("Mentés");
        btMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMentesActionPerformed(evt);
            }
        });

        jLabel4.setText("Iró/Költő:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfHollet, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(tfCim, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(tfIroKolto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btMegsem)
                .addGap(51, 51, 51)
                .addComponent(btMentes)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfIroKolto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfCim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfHollet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMegsem)
                    .addComponent(btMentes))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegsemActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_btMegsemActionPerformed

    private void btMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMentesActionPerformed
        
        if (tfIroKolto.getText().isEmpty() || tfCim.getText().isEmpty() || tfHollet.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tölts ki minden mezőt", "Hiányzó adat", JOptionPane.ERROR_MESSAGE);
        } else { // mindkét mező ki van töltve
            mentes = true;
            
            if (konyv == null){ // 
                konyv = new Konyv();
                
            }
            konyv.setIroKolto(tfIroKolto.getText());
            konyv.setCim(tfCim.getText());
            konyv.setHollet(tfHollet.getText());
            setVisible(false);
        }
        
    }//GEN-LAST:event_btMentesActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMegsem;
    private javax.swing.JButton btMentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfCim;
    private javax.swing.JTextField tfHollet;
    private javax.swing.JTextField tfIroKolto;
    // End of variables declaration//GEN-END:variables
}
