package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private TelNoYenileme telNoYenilemeObject = null;

    private String eskiTelNo = null;

    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ayarlarEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        this.telNoText.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo = telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if (this.telNoYenilemeObject == null) {
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajTelNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        mesajSifreLabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        sifreDegistirIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Baris Bank Ayarlar Ekranı");
        setResizable(false);

        ayarlarEkraniPanel.setBackground(new java.awt.Color(0, 102, 102));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/arrow.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("Telefon Numaranız :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.setEnabled(false);

        telNoDegistirIcon.setBackground(new java.awt.Color(153, 0, 51));
        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/exchange.png"))); // NOI18N
        telNoDegistirIcon.setToolTipText("");
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });

        mesajSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel.setText("Şifreniz :");

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setText("*************");
        sifreText.setEnabled(false);

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/reset-password(3).png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.setMaximumSize(new java.awt.Dimension(512, 512));
        sifreDegistirIcon.setMinimumSize(new java.awt.Dimension(512, 512));
        sifreDegistirIcon.setPreferredSize(new java.awt.Dimension(512, 512));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanelLayout = new javax.swing.GroupLayout(ayarlarEkraniPanel);
        ayarlarEkraniPanel.setLayout(ayarlarEkraniPanelLayout);
        ayarlarEkraniPanelLayout.setHorizontalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(mesajSifreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(telNoDegistirIcon)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        ayarlarEkraniPanelLayout.setVerticalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(2, 2, 2)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajSifreLabel)))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private int clickCounter = 0;
    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        if (this.clickCounter == 0) { //daha önce tıklanmamışsa
            telNoText.setEnabled(true);
            IconAyarlari.changeIcon(telNoDegistirIcon, "updateTelIcon2");
            clickCounter++;
        } else { //daha önce tıklanmışsa
            telNoText.setEnabled(false);
            this.telNoYenile();
            IconAyarlari.setOriginalIcon(telNoDegistirIcon);
            clickCounter = 0;
        }
    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void telNoYenile() {
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon numarası " + yeniTelNo + " olarak güncellenmiştir.");
            } else {
                Dialogs.ozelMesajGoster(this, "Başarısız.Bilgileri kontrol edin!");
                this.telNoText.setText(this.eskiTelNo);
            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            this.telNoText.setText(this.eskiTelNo);
        }
    }

    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
