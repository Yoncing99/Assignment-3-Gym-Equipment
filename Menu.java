package assignment3new;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    int x,y;
    public Menu() {
        initComponents();
        JOptionPane.showMessageDialog(this, "Dear Customer, Please Select Correctly !\n\nexit     = not interested !\nlogin    = who have not registered an account !\ndisplay  = can learn more about gym equipment !\nregister = who have registered an account !\n\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        lsystem = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        wel = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        disp = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/x3.jpg"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        lsystem.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lsystem.setForeground(new java.awt.Color(255, 255, 51));
        lsystem.setText("ONLINE SHOPPING");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lsystem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lsystem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wel.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        wel.setForeground(new java.awt.Color(255, 255, 255));
        wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wel.setText("~MENU~");
        jPanel2.add(wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 280, 60));

        log.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log.setText("LOGIN");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel2.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 40));

        ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ex.setText("EXIT");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel2.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, 40));

        reg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reg.setText("REGISTER");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        jPanel2.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, 40));

        disp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        disp.setText("DISPLAY");
        disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispActionPerformed(evt);
            }
        });
        jPanel2.add(disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 140, 40));

        background1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/g9.jpg"))); // NOI18N
        background1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(MyFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        
        this.setVisible(false);
        MyFrame info = new MyFrame();
        info.setVisible(true);
    }//GEN-LAST:event_logActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        this.setVisible(false);
        Register info = new Register();
        info.setVisible(true);
    }//GEN-LAST:event_regActionPerformed

    private void dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispActionPerformed
        this.setVisible(false);
        PP info = new PP();
        info.setVisible(true);
    }//GEN-LAST:event_dispActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background1;
    private javax.swing.JLabel close;
    private javax.swing.JButton disp;
    private javax.swing.JButton ex;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log;
    private javax.swing.JLabel lsystem;
    private javax.swing.JLabel mini;
    private javax.swing.JButton reg;
    private javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables
}
