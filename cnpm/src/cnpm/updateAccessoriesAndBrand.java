/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class updateAccessoriesAndBrand extends javax.swing.JPanel {

    /**
     * Creates new form updateAccessoriesAndBrand
     */
    public updateAccessoriesAndBrand() {
        initComponents();
        logoMazda.setSize(130, 80);
        Image img=new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\1.png").getImage().getScaledInstance(310, 250, Image.SCALE_SMOOTH);
        logoMazda.setIcon(new ImageIcon(img));

        
          logoProduct.setSize(180, 150);
        Image img3=new ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\pngguru.com.png").getImage().getScaledInstance(310, 250, Image.SCALE_SMOOTH);
        logoProduct.setIcon(new ImageIcon(img3));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoMazda = new javax.swing.JLabel();
        lbTextManage = new javax.swing.JLabel();
        logoProduct = new javax.swing.JLabel();
        lbTextManage1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoMazda.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\1.png")); // NOI18N
        logoMazda.setPreferredSize(new java.awt.Dimension(180, 140));
        jPanel1.add(logoMazda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 250));

        lbTextManage.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbTextManage.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\Setting_48.png")); // NOI18N
        lbTextManage.setText("MANAGE CAR'S BRAND");
        lbTextManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbTextManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTextManageMouseExited(evt);
            }
        });
        jPanel1.add(lbTextManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));
        jPanel1.add(logoProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 350, 250));

        lbTextManage1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbTextManage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\Image\\Setting_48.png")); // NOI18N
        lbTextManage1.setText("MANAGE CAR ACCESSORIES");
        lbTextManage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbTextManage1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTextManage1MouseExited(evt);
            }
        });
        jPanel1.add(lbTextManage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 330, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbTextManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextManageMouseExited
        // TODO add your handling code here:
        lbTextManage.setForeground(Color.black);
    }//GEN-LAST:event_lbTextManageMouseExited

    private void lbTextManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextManageMouseEntered
        // TODO add your handling code here:
        lbTextManage.setForeground(Color.yellow);
    }//GEN-LAST:event_lbTextManageMouseEntered

    private void lbTextManage1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextManage1MouseEntered
        // TODO add your handling code here:
        lbTextManage1.setForeground(Color.yellow);
    }//GEN-LAST:event_lbTextManage1MouseEntered

    private void lbTextManage1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextManage1MouseExited
        // TODO add your handling code here:
         lbTextManage1.setForeground(Color.black);
    }//GEN-LAST:event_lbTextManage1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbTextManage;
    public javax.swing.JLabel lbTextManage1;
    public javax.swing.JLabel logoMazda;
    public javax.swing.JLabel logoProduct;
    // End of variables declaration//GEN-END:variables
}