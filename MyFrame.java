package assignment3new;

import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;

public class MyFrame extends javax.swing.JFrame {

    int x,y;
    
    public MyFrame() {
        initComponents();
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
        un = new javax.swing.JLabel();
        passw = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
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
        lsystem.setText("LOGIN SYSTEM");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wel.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wel.setText("~WELCOME~");
        jPanel2.add(wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 280, 60));

        un.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        un.setText("User Name");
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        passw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passw.setText("Password");
        jPanel2.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, 20));

        userName.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 280, 30));

        password.setFont(new java.awt.Font("Lemon", 3, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 280, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 153, 270, 20));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 243, 270, 20));

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, 40));

        reset.setBackground(new java.awt.Color(255, 204, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setText("RESET");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 30));

        showPassword.setBackground(new java.awt.Color(204, 204, 204));
        showPassword.setFont(new java.awt.Font("Century Schoolbook", 3, 12)); // NOI18N
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 170, -1));

        background1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment3new/b6.jpg"))); // NOI18N
        background1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 460, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        userName.setText(null);
        password.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        String user = userName.getText();
        String pw = password.getText();
        
        if(user.equals("Goh Yon Cing") && (pw.equals("123456"))){
            JOptionPane.showMessageDialog(null, "Login Successfully !");
            userName.setText(null);
            password.setText(null);
            systemExit();
            this.setVisible(false);
            
            Register info = new Register();
            info.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
            userName.setText(null);
            password.setText(null);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if(showPassword.isSelected()){
            password.setEchoChar((char)0);
        }else{
            password.setEchoChar('`');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(MyFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background1;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton login;
    private javax.swing.JLabel lsystem;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel passw;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel un;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables

    private void systemExit(){
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
