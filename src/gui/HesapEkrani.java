package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;

public class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    public HesapEkrani() {
        initComponents();
        getEdits();

    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        hesapEkraniPanel.setFocusable(true);
        this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCekButton = new javax.swing.JButton();
        paraYatirButton = new javax.swing.JButton();
        odemelerButton = new javax.swing.JButton();
        havaleButton = new javax.swing.JButton();
        settingsIcon = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Baris Bank Hesap Ekranı");

        hesapEkraniPanel.setBackground(new java.awt.Color(0, 153, 102));

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(51, 51, 255));
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("HOŞGELDİN");

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        kullaniciAdSoyadLabel.setForeground(new java.awt.Color(51, 51, 255));
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");

        bakiyeLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 36)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");

        paraCekButton.setBackground(new java.awt.Color(0, 153, 153));
        paraCekButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paraCekButton.setForeground(new java.awt.Color(0, 51, 51));
        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        paraYatirButton.setBackground(new java.awt.Color(153, 153, 0));
        paraYatirButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paraYatirButton.setForeground(new java.awt.Color(0, 51, 51));
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseExited(evt);
            }
        });
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        odemelerButton.setBackground(new java.awt.Color(204, 204, 255));
        odemelerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        odemelerButton.setForeground(new java.awt.Color(0, 51, 51));
        odemelerButton.setText("Ödeme Yap");
        odemelerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseExited(evt);
            }
        });
        odemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemelerButtonActionPerformed(evt);
            }
        });

        havaleButton.setBackground(new java.awt.Color(204, 102, 0));
        havaleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        havaleButton.setForeground(new java.awt.Color(0, 51, 51));
        havaleButton.setText("Havale/EFT");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settings.png"))); // NOI18N
        settingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsIconMouseClicked(evt);
            }
        });

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/arrow.png"))); // NOI18N
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TL");

        javax.swing.GroupLayout hesapEkraniPanelLayout = new javax.swing.GroupLayout(hesapEkraniPanel);
        hesapEkraniPanel.setLayout(hesapEkraniPanelLayout);
        hesapEkraniPanelLayout.setHorizontalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paraCekButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(havaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paraYatirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odemelerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(hosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logoutIcon)))
                        .addGap(252, 252, 252)
                        .addComponent(settingsIcon)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        hesapEkraniPanelLayout.setVerticalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(settingsIcon))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutIcon)
                        .addGap(8, 8, 8)
                        .addComponent(hosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bakiyeLabel)
                    .addComponent(jLabel1)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paraCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odemelerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     *Buton renklendirmeleri ve icon değişimleri
     */
    private void setBgFg(Component c) {
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }
    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        this.setBgFg(evt.getComponent());
      //  IconAyarlari.changeIcon(paraCekIcon, "withdrawIcon2");
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
       // IconAyarlari.setOriginalIcon(paraCekIcon);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseEntered
        this.setBgFg(evt.getComponent());
      //  IconAyarlari.changeIcon(paraYatirIcon, "depositIcon2");
    }//GEN-LAST:event_paraYatirButtonMouseEntered

    private void paraYatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
      //  IconAyarlari.setOriginalIcon(paraYatirIcon);
    }//GEN-LAST:event_paraYatirButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        this.setBgFg(evt.getComponent());
       // IconAyarlari.changeIcon(havaleIcon, "transferIcon2");
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
       // IconAyarlari.setOriginalIcon(havaleIcon);
    }//GEN-LAST:event_havaleButtonMouseExited

    private void odemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseEntered
        this.setBgFg(evt.getComponent());
       // IconAyarlari.changeIcon(odemelerIcon, "paymentsIcon2");
    }//GEN-LAST:event_odemelerButtonMouseEntered

    private void odemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
       // IconAyarlari.setOriginalIcon(odemelerIcon);
    }//GEN-LAST:event_odemelerButtonMouseExited

    /*
     *Actionlar
     */
    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        ActionAyarlari.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void odemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemelerButtonActionPerformed
        ActionAyarlari.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_odemelerButtonActionPerformed

    private void logoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconMouseClicked
        String question = "Hesabınızdan çıkış yapılacaktır\n"
                + "Onaylıyor musunuz?";
        if (Dialogs.onayMesajiGoster(this, question) == 1) {
            this.cikisYap();
        }
    }//GEN-LAST:event_logoutIconMouseClicked

    private void cikisYap() {
        getHesapBilgileri().cikisYap();
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }


    private void settingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsIconMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsIconMouseClicked

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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JButton odemelerButton;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JLabel settingsIcon;
    // End of variables declaration//GEN-END:variables
}
