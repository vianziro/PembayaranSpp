package com.yf.kp.design;

import com.yf.kp.design.siswa.FrameSiswa;
import com.yf.kp.design.kelas.FrameKelas;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BlackCode
 */
public class FrameAplikasi extends javax.swing.JFrame {

    private Dimension dimension;
    private Image image;
    private Object desktopPaneCustom1;

    /**
     * Creates new form FrameAplikasi
     */
    public FrameAplikasi() {
        initComponents();
        setLocationRelativeTo(null);
        fullScreen();
        setIcon();
    }

    private void fullScreen() {
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, dimension.width, dimension.height);
    }

    private void setIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/yf/kp/images/icon_package_open.gif"));
        image = icon.getImage();
        setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customDesktopPane1 = new com.yf.kp.template.CustomDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonMenuDataSiswa = new javax.swing.JButton();
        jButtonMenuKelas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonMenuJenisPembayaran = new javax.swing.JButton();
        jButtonMenuBilingPembayaran = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMTransaksi = new javax.swing.JMenu();
        jmiTransaksi = new javax.swing.JMenuItem();
        jMLaporan = new javax.swing.JMenu();
        jmiDataSiswa = new javax.swing.JMenuItem();
        jmiPembayaran = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Aplikasi Pembayaran");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(79, 167, 182));

        jPanel1.setBackground(new java.awt.Color(149, 186, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonMenuDataSiswa.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuDataSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/list_users.gif"))); // NOI18N
        jButtonMenuDataSiswa.setText("DATA SISWA");
        jButtonMenuDataSiswa.setToolTipText("Untuk membuat nama kelas");
        jButtonMenuDataSiswa.setBorder(null);
        jButtonMenuDataSiswa.setPreferredSize(new java.awt.Dimension(150, 70));
        jButtonMenuDataSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuDataSiswaActionPerformed(evt);
            }
        });

        jButtonMenuKelas.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/icon_home.gif"))); // NOI18N
        jButtonMenuKelas.setText("KELAS");
        jButtonMenuKelas.setToolTipText("Untuk membuat nama kelas");
        jButtonMenuKelas.setPreferredSize(new java.awt.Dimension(150, 70));
        jButtonMenuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonMenuDataSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenuKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonMenuDataSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonMenuKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("KESISWAAN", jPanel1);

        jPanel5.setBackground(new java.awt.Color(149, 186, 211));
        jPanel5.setPreferredSize(new java.awt.Dimension(700, 65));

        jButtonMenuJenisPembayaran.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuJenisPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/icon_network.gif"))); // NOI18N
        jButtonMenuJenisPembayaran.setText("JENIS PEMBAYARAN");
        jButtonMenuJenisPembayaran.setToolTipText("Untuk membuat jenis/nama pembayaran");
        jButtonMenuJenisPembayaran.setPreferredSize(new java.awt.Dimension(180, 68));
        jButtonMenuJenisPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuJenisPembayaranActionPerformed(evt);
            }
        });

        jButtonMenuBilingPembayaran.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonMenuBilingPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/list_comments.gif"))); // NOI18N
        jButtonMenuBilingPembayaran.setText("BILING PEMBAYARAN");
        jButtonMenuBilingPembayaran.setToolTipText("Membagi siswa dalam jenis pembayaran");
        jButtonMenuBilingPembayaran.setPreferredSize(new java.awt.Dimension(180, 68));
        jButtonMenuBilingPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBilingPembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButtonMenuJenisPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenuBilingPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonMenuBilingPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonMenuJenisPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("PEMBAYARAN", jPanel5);

        customDesktopPane1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 700, 100);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/action_stop.gif"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMTransaksi.setText("Transaksi");

        jmiTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/list_users.gif"))); // NOI18N
        jmiTransaksi.setText("Pembayaran");
        jmiTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTransaksiActionPerformed(evt);
            }
        });
        jMTransaksi.add(jmiTransaksi);

        jMenuBar1.add(jMTransaksi);

        jMLaporan.setText("Laporan");

        jmiDataSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/icon_user.gif"))); // NOI18N
        jmiDataSiswa.setText("Data Siswa");
        jmiDataSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDataSiswaActionPerformed(evt);
            }
        });
        jMLaporan.add(jmiDataSiswa);

        jmiPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yf/kp/images/action_paste.gif"))); // NOI18N
        jmiPembayaran.setText("Pembayaran");
        jmiPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPembayaranActionPerformed(evt);
            }
        });
        jMLaporan.add(jmiPembayaran);

        jMenuBar1.add(jMLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTransaksiActionPerformed
        FrameTransaksi Ft = new FrameTransaksi();
        Ft.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(Ft);
        Ft.setVisible(true);
    }//GEN-LAST:event_jmiTransaksiActionPerformed

    private void jButtonMenuDataSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuDataSiswaActionPerformed
        FrameSiswa fs = new FrameSiswa();
        fs.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(fs);
        fs.setVisible(true);
    }//GEN-LAST:event_jButtonMenuDataSiswaActionPerformed

    private void jButtonMenuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuKelasActionPerformed
        // TODO add your handling code here:
        FrameKelas fk = new FrameKelas();
        fk.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(fk);
        fk.setVisible(true);
    }//GEN-LAST:event_jButtonMenuKelasActionPerformed

    private void jButtonMenuJenisPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuJenisPembayaranActionPerformed
        FrameJenisPembayaran frameJenisPembayaran = new FrameJenisPembayaran();
        frameJenisPembayaran.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(frameJenisPembayaran);
        frameJenisPembayaran.setVisible(true);
    }//GEN-LAST:event_jButtonMenuJenisPembayaranActionPerformed

    private void jButtonMenuBilingPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBilingPembayaranActionPerformed
        FrameBiling Fb = new FrameBiling();
        Fb.setBounds(0, 0, customDesktopPane1.getWidth(), customDesktopPane1.getHeight());
        customDesktopPane1.add(Fb);
        Fb.setVisible(true);
    }//GEN-LAST:event_jButtonMenuBilingPembayaranActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Are You Sure to Exit?", "Exit Application", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are You Sure to Exit?", "Exit Application", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiDataSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDataSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiDataSiswaActionPerformed

    private void jmiPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPembayaranActionPerformed
        
    }//GEN-LAST:event_jmiPembayaranActionPerformed

    /**
     * @param args the command line argument
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.yf.kp.template.CustomDesktopPane customDesktopPane1;
    private javax.swing.JButton jButtonMenuBilingPembayaran;
    private javax.swing.JButton jButtonMenuDataSiswa;
    private javax.swing.JButton jButtonMenuJenisPembayaran;
    private javax.swing.JButton jButtonMenuKelas;
    private javax.swing.JMenu jMLaporan;
    private javax.swing.JMenu jMTransaksi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem jmiDataSiswa;
    private javax.swing.JMenuItem jmiPembayaran;
    private javax.swing.JMenuItem jmiTransaksi;
    // End of variables declaration//GEN-END:variables

}
