package assignment3new;

public class Catalogue extends javax.swing.JFrame {

    int x,y;
    
    public Catalogue() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        reForm = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        shop = new javax.swing.JLabel();
        background9 = new javax.swing.JLabel();
        ps = new javax.swing.JLabel();
        pb = new javax.swing.JLabel();
        pd = new javax.swing.JLabel();
        pi = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        atc2 = new javax.swing.JButton();
        treadmill = new javax.swing.JLabel();
        stationary = new javax.swing.JLabel();
        bench = new javax.swing.JLabel();
        dumb = new javax.swing.JLabel();
        barb = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        atc3 = new javax.swing.JButton();
        atc4 = new javax.swing.JButton();
        atc5 = new javax.swing.JButton();
        atc1 = new javax.swing.JButton();
        vieww = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/x3.jpg"))); // NOI18N
        close.setText("jLabel1");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        reForm.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        reForm.setForeground(new java.awt.Color(255, 255, 0));
        reForm.setText("CATALOGUE");

        mini.setBackground(new java.awt.Color(0, 0, 0));
        mini.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 255, 255));
        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setText("—");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reForm))
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        shop.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        shop.setForeground(new java.awt.Color(255, 255, 255));
        shop.setText("Shop Your Favourite Gym Equipment");
        shop.setToolTipText("");
        jPanel1.add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        background9.setBackground(new java.awt.Color(0, 0, 0));
        background9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/t1.jpg"))); // NOI18N
        jPanel1.add(background9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 30, 620, 80));

        ps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/y2.jpg"))); // NOI18N
        ps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                psMouseClicked(evt);
            }
        });
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 170, 170));

        pb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/y5.jpg"))); // NOI18N
        pb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbMouseClicked(evt);
            }
        });
        jPanel1.add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 170));

        pd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/y4.jpg"))); // NOI18N
        pd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdMouseClicked(evt);
            }
        });
        jPanel1.add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 170, 170));

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/y3.jpg"))); // NOI18N
        pi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                piMouseClicked(evt);
            }
        });
        jPanel1.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 170, 170));

        pt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/y1.jpg"))); // NOI18N
        pt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptMouseClicked(evt);
            }
        });
        jPanel1.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 170));

        atc2.setBackground(new java.awt.Color(0, 0, 0));
        atc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atc2.setForeground(new java.awt.Color(255, 255, 255));
        atc2.setText("Add to Cart");
        atc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atc2ActionPerformed(evt);
            }
        });
        jPanel1.add(atc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 160, 30));

        treadmill.setFont(new java.awt.Font("Marcellus SC", 3, 18)); // NOI18N
        treadmill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treadmill.setText("Treadmill");
        jPanel1.add(treadmill, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 30));

        stationary.setFont(new java.awt.Font("Marcellus SC", 3, 18)); // NOI18N
        stationary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stationary.setText("Stationary Bike");
        jPanel1.add(stationary, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, 30));

        bench.setFont(new java.awt.Font("Marcellus SC", 3, 18)); // NOI18N
        bench.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bench.setText("Incline Bench Press");
        jPanel1.add(bench, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 180, 30));

        dumb.setFont(new java.awt.Font("Marcellus SC", 3, 18)); // NOI18N
        dumb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dumb.setText("Dumbbells Set");
        jPanel1.add(dumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 160, 30));

        barb.setFont(new java.awt.Font("Marcellus SC", 3, 18)); // NOI18N
        barb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barb.setText("Barbells Set");
        jPanel1.add(barb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 160, 30));

        c2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setText("RM 800.00");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 120, 30));

        c3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setText("RM 400.00");
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 120, 30));

        c4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setText("RM 400.00");
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 120, 30));

        c5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setText("RM 600.00");
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 120, 30));

        c1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setText("RM 2000.00");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 30));

        atc3.setBackground(new java.awt.Color(0, 0, 0));
        atc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atc3.setForeground(new java.awt.Color(255, 255, 255));
        atc3.setText("Add to Cart");
        atc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atc3ActionPerformed(evt);
            }
        });
        jPanel1.add(atc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 160, 30));

        atc4.setBackground(new java.awt.Color(0, 0, 0));
        atc4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atc4.setForeground(new java.awt.Color(255, 255, 255));
        atc4.setText("Add to Cart");
        atc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atc4ActionPerformed(evt);
            }
        });
        jPanel1.add(atc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 160, 30));

        atc5.setBackground(new java.awt.Color(0, 0, 0));
        atc5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atc5.setForeground(new java.awt.Color(255, 255, 255));
        atc5.setText("Add to Cart");
        atc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atc5ActionPerformed(evt);
            }
        });
        jPanel1.add(atc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 160, 30));

        atc1.setBackground(new java.awt.Color(0, 0, 0));
        atc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atc1.setForeground(new java.awt.Color(255, 255, 255));
        atc1.setText("Add to Cart");
        atc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atc1ActionPerformed(evt);
            }
        });
        jPanel1.add(atc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 30));

        vieww.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        vieww.setText("VIEW PRODUCT");
        vieww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewwActionPerformed(evt);
            }
        });
        jPanel1.add(vieww, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Catalogue.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void ptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptMouseClicked
        this.setVisible(false);
        Treadmill info = new Treadmill();
        info.setVisible(true);
    }//GEN-LAST:event_ptMouseClicked

    private void psMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psMouseClicked
        this.setVisible(false);
        Bike info = new Bike();
        info.setVisible(true);
    }//GEN-LAST:event_psMouseClicked

    private void piMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseClicked
        this.setVisible(false);
        Incline info = new Incline();
        info.setVisible(true);
    }//GEN-LAST:event_piMouseClicked

    private void pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdMouseClicked
        this.setVisible(false);
        Dumbbells info = new Dumbbells();
        info.setVisible(true);
    }//GEN-LAST:event_pdMouseClicked

    private void pbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbMouseClicked
        this.setVisible(false);
        Barbells info = new Barbells();
        info.setVisible(true);
    }//GEN-LAST:event_pbMouseClicked

    private void atc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atc1ActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_atc1ActionPerformed

    private void atc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atc2ActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_atc2ActionPerformed

    private void atc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atc3ActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_atc3ActionPerformed

    private void atc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atc4ActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_atc4ActionPerformed

    private void atc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atc5ActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_atc5ActionPerformed

    private void viewwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewwActionPerformed
        this.setVisible(false);
        PP info = new PP();
        info.setVisible(true);
    }//GEN-LAST:event_viewwActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atc1;
    private javax.swing.JButton atc2;
    private javax.swing.JButton atc3;
    private javax.swing.JButton atc4;
    private javax.swing.JButton atc5;
    private javax.swing.JLabel background9;
    private javax.swing.JLabel barb;
    private javax.swing.JLabel bench;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dumb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel pb;
    private javax.swing.JLabel pd;
    private javax.swing.JLabel pi;
    private javax.swing.JLabel ps;
    private javax.swing.JLabel pt;
    private javax.swing.JLabel reForm;
    private javax.swing.JLabel shop;
    private javax.swing.JLabel stationary;
    private javax.swing.JLabel treadmill;
    private javax.swing.JButton vieww;
    // End of variables declaration//GEN-END:variables
}
