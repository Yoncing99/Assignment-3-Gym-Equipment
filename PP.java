package assignment3new;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PP extends javax.swing.JFrame {

    int x,y;
    
    public PP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        reForm = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TT = new javax.swing.JRadioButton();
        SS = new javax.swing.JRadioButton();
        II = new javax.swing.JRadioButton();
        DD = new javax.swing.JRadioButton();
        BB = new javax.swing.JRadioButton();
        display = new javax.swing.JTextArea();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TT.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        TT.setText("Treadmill");
        TT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTActionPerformed(evt);
            }
        });
        jPanel1.add(TT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        SS.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        SS.setText("Stationary Bike");
        SS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSActionPerformed(evt);
            }
        });
        jPanel1.add(SS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        II.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        II.setText("Incline Bench Press");
        II.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IIActionPerformed(evt);
            }
        });
        jPanel1.add(II, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        DD.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        DD.setText("Dumbbell Set");
        DD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDActionPerformed(evt);
            }
        });
        jPanel1.add(DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        BB.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        BB.setText("Barbell Set");
        BB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBActionPerformed(evt);
            }
        });
        jPanel1.add(BB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        display.setLineWrap(true);
        display.setRows(5);
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 770, 520));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void TTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTActionPerformed
        if(TT.isSelected()){

            try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/a.txt");
                FileReader fr = new FileReader(file);

                Scanner sc = new Scanner(file);
                String fileContent = "INTRODUCTION OF GYM EQUIPMENT\n\n";
                while(sc.hasNextLine()){
                    fileContent = fileContent.concat(sc.nextLine()+"\n");
                }
                display.read(fr,"display");

                FileWriter writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/1.txt");
                writer.write(fileContent);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_TTActionPerformed

    private void SSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSActionPerformed
        if(SS.isSelected()){

            try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/b.txt");
                FileReader fr = new FileReader(file);

                Scanner sc = new Scanner(file);
                String fileContent = "INTRODUCTION OF GYM EQUIPMENT\n\n";
                while(sc.hasNextLine()){
                    fileContent = fileContent.concat(sc.nextLine()+"\n");
                }
                display.read(fr,"display");

                FileWriter writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/2.txt");
                writer.write(fileContent);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SSActionPerformed

    private void IIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IIActionPerformed
        if(II.isSelected()){

            try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/c.txt");
                FileReader fr = new FileReader(file);

                Scanner sc = new Scanner(file);
                String fileContent = "INTRODUCTION OF GYM EQUIPMENT\n\n";
                while(sc.hasNextLine()){
                    fileContent = fileContent.concat(sc.nextLine()+"\n");
                }
                display.read(fr,"display");

                FileWriter writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/3.txt");
                writer.write(fileContent);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_IIActionPerformed

    private void DDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDActionPerformed
        if(DD.isSelected()){

            try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/d.txt");
                FileReader fr = new FileReader(file);

                Scanner sc = new Scanner(file);
                String fileContent = "INTRODUCTION OF GYM EQUIPMENT\n\n";
                while(sc.hasNextLine()){
                    fileContent = fileContent.concat(sc.nextLine()+"\n");
                }
                display.read(fr,"display");

                FileWriter writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/4.txt");
                writer.write(fileContent);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DDActionPerformed

    private void BBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBActionPerformed
        if(BB.isSelected()){

            try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/e.txt");
                FileReader fr = new FileReader(file);

                Scanner sc = new Scanner(file);
                String fileContent = "INTRODUCTION OF GYM EQUIPMENT\n\n";
                while(sc.hasNextLine()){
                    fileContent = fileContent.concat(sc.nextLine()+"\n");
                }
                display.read(fr,"display");

                FileWriter writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/5.txt");
                writer.write(fileContent);
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BBActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Catalogue info = new Catalogue();
        info.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BB;
    private javax.swing.JRadioButton DD;
    private javax.swing.JRadioButton II;
    private javax.swing.JRadioButton SS;
    private javax.swing.JRadioButton TT;
    private javax.swing.JButton back;
    private javax.swing.JLabel close;
    private javax.swing.JTextArea display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel reForm;
    // End of variables declaration//GEN-END:variables
}
