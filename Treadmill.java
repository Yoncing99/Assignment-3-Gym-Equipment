package assignment3new;

public class Treadmill extends javax.swing.JFrame {

    int x,y;
    
    public Treadmill() {
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
        tre = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        charac = new javax.swing.JTextArea();
        inf = new javax.swing.JTextArea();
        wostep = new javax.swing.JLabel();
        infos = new javax.swing.JLabel();
        workout = new javax.swing.JList<>();
        back = new javax.swing.JButton();
        background4 = new javax.swing.JLabel();

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
        reForm.setText("TOP 1 GYM EQUIPMENT");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        tre.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        tre.setText("~ TREADMILL ~");
        jPanel1.add(tre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 260, 50));

        brand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/b1.jpg"))); // NOI18N
        brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, 80));

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/a1.jpg"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 270, 220));

        charac.setEditable(false);
        charac.setColumns(20);
        charac.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        charac.setLineWrap(true);
        charac.setRows(5);
        charac.setText("BRAND\t : NORDICTRACK\nCOLOR\t : BLACK\nPRICE\t : RM 2000.00\nPATTERN\t : FOLDABLE");
        charac.setBorder(null);
        jPanel1.add(charac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 260, 110));

        inf.setEditable(false);
        inf.setColumns(20);
        inf.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        inf.setLineWrap(true);
        inf.setRows(5);
        inf.setText("Intro            : A device that consists of a moving belt on which a person walks,                      runs or climbs while staying in the same place. \nFunction      : can help to lose weight and build strength.\nTreadmill is suitable for beginners.\nTreadmill involves cardiovascular system and the full body.\nTreadmill can display speed, time, mileage, calories burned, and heart rate.\nTreadmill have adjustable incline levels.");
        inf.setBorder(null);
        jPanel1.add(inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 620, -1));

        wostep.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        wostep.setText("~~ WORK OUT STEP ~~");
        wostep.setToolTipText("");
        jPanel1.add(wostep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        infos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        infos.setText("~~ INFO ~~");
        infos.setToolTipText("");
        jPanel1.add(infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        workout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "POWER ON !", "SPEED UP !", "SPEED DOWN !", "POWER OFF !" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jPanel1.add(workout, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 140, 110));

        back.setBackground(new java.awt.Color(255, 255, 0));
        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 100, 40));

        background4.setBackground(new java.awt.Color(255, 255, 255));
        background4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/g1.png"))); // NOI18N
        jPanel1.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Treadmill.ICONIFIED);
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        List info = new List();
        info.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treadmill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background4;
    private javax.swing.JLabel brand;
    private javax.swing.JTextArea charac;
    private javax.swing.JLabel close;
    private javax.swing.JTextArea inf;
    private javax.swing.JLabel infos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel reForm;
    private javax.swing.JLabel tre;
    private javax.swing.JList<String> workout;
    private javax.swing.JLabel wostep;
    // End of variables declaration//GEN-END:variables
}
