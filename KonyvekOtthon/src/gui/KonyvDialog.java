 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modell.IModell;
import modell.Konyv;

/**
 *
 * @author Safi
 */
public class KonyvDialog extends javax.swing.JDialog {

    private IModell model;
    private Frame parent;
    List <Konyv> konyvek;
    
    

    public KonyvDialog(java.awt.Frame parent, boolean modal, IModell model) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Könyvek adminisztrálása");

        getRootPane().setDefaultButton(btnKeres);

        this.model = model;
        this.parent = parent;
        
        

        try {
            konyvek = model.getKonyv();
            lstKonyvek.setListData(konyvek.toArray());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstKonyvek = new javax.swing.JList();
        btnUj = new javax.swing.JButton();
        btnSzerkeszt = new javax.swing.JButton();
        btnTorol = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        tfKonyvCime = new javax.swing.JLabel();
        tfNev = new javax.swing.JTextField();
        btnKeres = new javax.swing.JButton();
        cbAuto = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(lstKonyvek);

        btnUj.setText("Új");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnSzerkeszt.setText("Szerkeszt");
        btnSzerkeszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzerkesztActionPerformed(evt);
            }
        });

        btnTorol.setText("Töröl");
        btnTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorolActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        tfKonyvCime.setText("Könyv címe: ");

        tfNev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNevActionPerformed(evt);
            }
        });
        tfNev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNevKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNevKeyTyped(evt);
            }
        });

        btnKeres.setText("Keres");
        btnKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeresActionPerformed(evt);
            }
        });

        cbAuto.setSelected(true);
        cbAuto.setText("automatikus keresés");
        cbAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAuto)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tfKonyvCime)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNev, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnKeres)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUj)
                    .addComponent(btnSzerkeszt)
                    .addComponent(btnTorol)
                    .addComponent(btnOK))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnOK, btnSzerkeszt, btnTorol, btnUj});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSzerkeszt))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tfKonyvCime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAuto))
                            .addComponent(btnKeres)
                            .addComponent(tfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTorol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(btnOK))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed
        keres();
    }//GEN-LAST:event_btnKeresActionPerformed
    public void keres() {
        String konyvCime = tfNev.getText();

        try {
            konyvek = model.getKonyvekByCim(konyvCime);
            lstKonyvek.setListData(konyvek.toArray());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
        }

    }
    private void tfNevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNevKeyTyped

    }//GEN-LAST:event_tfNevKeyTyped

    private void tfNevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNevKeyReleased
        if (cbAuto.isSelected()) {
            keres();
        }


    }//GEN-LAST:event_tfNevKeyReleased

    private void cbAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAutoActionPerformed
        tfNev.grabFocus();
    }//GEN-LAST:event_cbAutoActionPerformed

    private void tfNevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNevActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        KonyvAdatokDialog mad = new KonyvAdatokDialog(parent, true,null); // azert null a harmadik, mert -null-jelenti, hogy új személyt kell felvenni
        mad.setVisible(true);

        if (mad.isMentes()) { // megnézzük, hogy megnyomta-e a mentés gombot
                              // és ha igen, akkor hozzuk létre az új személyt, és adjuk hozzá az adatbázishoz
            
            Konyv ujKonyv = mad.getKonyv();

            try {   // adatbázisba mentés

                model.addKonyv(ujKonyv);
                keres(); // újrakiiratom a neveket, immár a hozzáadott Szemely adattal

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnUjActionPerformed

    private void btnSzerkesztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSzerkesztActionPerformed
        Konyv kivalasztott = (Konyv)lstKonyvek.getSelectedValue();
        if (kivalasztott != null){
            KonyvAdatokDialog mad = new KonyvAdatokDialog(parent, true, kivalasztott);
            mad.setVisible(true);
            
            if(mad.isMentes()){
                try {
                    model.updateKonyv(mad.getKonyv());
                    
                    keres();
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        } else {
            JOptionPane.showMessageDialog(parent, "Válassz valakit a listából", "Nincs kiválasztott személy", JOptionPane.ERROR_MESSAGE);
            }
    
    }//GEN-LAST:event_btnSzerkesztActionPerformed

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
        Konyv kivalasztott = (Konyv)lstKonyvek.getSelectedValue();
        
        if (kivalasztott !=null ){
            
            
            int valasz = JOptionPane.showConfirmDialog(parent, "Biztosan törölni akarod?", "Törlési megerősítés", JOptionPane.YES_NO_OPTION);
            
            if (valasz == JOptionPane.YES_OPTION){ try {
                // ha yes akkor törölni kell
                model.removeKonyv(kivalasztott);
                keres();
                
                
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane , ex, "Adatbázis hiba", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(parent, "Válassz valakit a listából", "Nincs kiválasztott személy", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnTorolActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSzerkeszt;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnUj;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstKonyvek;
    private javax.swing.JLabel tfKonyvCime;
    private javax.swing.JTextField tfNev;
    // End of variables declaration//GEN-END:variables
}
