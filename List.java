package assignment3new;

public class List extends javax.swing.JFrame {

    int x,y;
    
    public List() {
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
        top = new javax.swing.JLabel();
        tread = new javax.swing.JButton();
        station = new javax.swing.JButton();
        incline = new javax.swing.JButton();
        dumb = new javax.swing.JButton();
        bar = new javax.swing.JButton();
        cata = new javax.swing.JButton();
        background3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        reForm.setText("PRODUCT");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(reForm)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

        top.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        top.setForeground(new java.awt.Color(255, 255, 255));
        top.setText("Top 5 Gym Equipment");
        jPanel1.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        tread.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        tread.setText("Treadmill");
        tread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treadActionPerformed(evt);
            }
        });
        jPanel1.add(tread, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, -1));

        station.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        station.setText("Stationary Bike");
        station.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationActionPerformed(evt);
            }
        });
        jPanel1.add(station, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, -1));

        incline.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        incline.setText("Incline Bench Press");
        incline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclineActionPerformed(evt);
            }
        });
        jPanel1.add(incline, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, -1));

        dumb.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        dumb.setText("Dumbells Set");
        dumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumbActionPerformed(evt);
            }
        });
        jPanel1.add(dumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, -1));

        bar.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        bar.setText("Barbells Set");
        bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barActionPerformed(evt);
            }
        });
        jPanel1.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, -1));

        cata.setBackground(new java.awt.Color(255, 255, 0));
        cata.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        cata.setText("CATALOUGE");
        cata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cataActionPerformed(evt);
            }
        });
        jPanel1.add(cata, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/1_1.jpg"))); // NOI18N
        jPanel1.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(List.ICONIFIED);
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

    private void treadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treadActionPerformed
        this.setVisible(false);
        Treadmill info = new Treadmill();
        info.setVisible(true);
    }//GEN-LAST:event_treadActionPerformed

    private void barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barActionPerformed
        this.setVisible(false);
        Barbells info = new Barbells();
        info.setVisible(true);
    }//GEN-LAST:event_barActionPerformed

    private void dumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumbActionPerformed
        this.setVisible(false);
        Dumbbells info = new Dumbbells();
        info.setVisible(true);
    }//GEN-LAST:event_dumbActionPerformed

    private void inclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclineActionPerformed
        this.setVisible(false);
        Incline info = new Incline ();
        info.setVisible(true);
    }//GEN-LAST:event_inclineActionPerformed

    private void stationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationActionPerformed
        this.setVisible(false);
        Bike info = new Bike ();
        info.setVisible(true);
    }//GEN-LAST:event_stationActionPerformed

    private void cataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cataActionPerformed
        this.setVisible(false);
        Catalogue info = new Catalogue ();
        info.setVisible(true);
    }//GEN-LAST:event_cataActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background3;
    private javax.swing.JButton bar;
    private javax.swing.JButton cata;
    private javax.swing.JLabel close;
    private javax.swing.JButton dumb;
    private javax.swing.JButton incline;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel reForm;
    private javax.swing.JButton station;
    private javax.swing.JLabel top;
    private javax.swing.JButton tread;
    // End of variables declaration//GEN-END:variables
}
