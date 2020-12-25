/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpm;

import static cnpm.Connecting.Connect;
import java.sql.ResultSet;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Messager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author USER
 */
public class AddServicesForCar extends javax.swing.JFrame {
    boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public AddServicesForCar() {
    initComponents();
    
            //Ban đầu cho các lb ẩn
            getComboBoxNameService();
        lbErrorPriceValid.setVisible(false);
        //Set nut update an
        btDelete.setVisible(false);
        lbDelete.setVisible(false);
        txtPrice.setEditable(false);
        txtPrice.setForeground(Color.black);
        this.setSize(400,295);
   this.getContentPane().setBackground(new Color(194, 194, 214));
    this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBackground = new javax.swing.JPanel();
        panelRegister = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        lbAdding = new javax.swing.JLabel();
        btAdding = new javax.swing.JButton();
        lbDelete = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        cbServiceName = new javax.swing.JComboBox<>();
        lbErrorPriceValid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(51, 51, 51));
        panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Add Services", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102))); // NOI18N
        panelRegister.setPreferredSize(new java.awt.Dimension(250, 530));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        panelRegister.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 50));

        lbAdding.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbAdding.setForeground(new java.awt.Color(255, 255, 102));
        lbAdding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAdding.setText("ADD");
        panelRegister.add(lbAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        btAdding.setBackground(new java.awt.Color(102, 102, 102));
        btAdding.setForeground(new java.awt.Color(255, 255, 0));
        btAdding.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btAdding.setBorder(null);
        btAdding.setBorderPainted(false);
        btAdding.setContentAreaFilled(false);
        panelRegister.add(btAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 70));

        lbDelete.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbDelete.setForeground(new java.awt.Color(255, 255, 102));
        lbDelete.setText("DELETE");
        panelRegister.add(lbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, 30));

        btDelete.setBackground(new java.awt.Color(102, 102, 102));
        btDelete.setForeground(new java.awt.Color(255, 255, 0));
        btDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btDelete.setBorder(null);
        btDelete.setBorderPainted(false);
        btDelete.setContentAreaFilled(false);
        panelRegister.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 70));

        txtMinimize.setBackground(new java.awt.Color(51, 51, 51));
        txtMinimize.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtMinimize.setForeground(new java.awt.Color(255, 255, 102));
        txtMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMinimize.setText("-");
        txtMinimize.setOpaque(true);
        txtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseExited(evt);
            }
        });
        panelRegister.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 20));

        txtExit.setBackground(new java.awt.Color(51, 51, 51));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 102));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("x");
        txtExit.setOpaque(true);
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });
        panelRegister.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 20));

        cbServiceName.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cbServiceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServiceNameActionPerformed(evt);
            }
        });
        panelRegister.add(cbServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 50));

        panelBackground.add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        lbErrorPriceValid.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorPriceValid.setForeground(new java.awt.Color(255, 51, 51));
        lbErrorPriceValid.setToolTipText("");
        panelBackground.add(lbErrorPriceValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 150, -1));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        // TODO add your handling code here:
        txtExit.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtExitMouseExited

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        // TODO add your handling code here:
        txtExit.setBackground(new Color(200, 0,0));
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseExited
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_txtMinimizeMouseExited

    private void txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseEntered
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(200, 0,0));
    }//GEN-LAST:event_txtMinimizeMouseEntered

    private void txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_txtMinimizeMouseClicked

    private void cbServiceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServiceNameActionPerformed
        // TODO add your handling code here:
        getPriceService(String.valueOf(cbServiceName.getEditor().getItem()));
    }//GEN-LAST:event_cbServiceNameActionPerformed
                    
    /**
     * @param args the command line arguments
     */
    private void getComboBoxNameService()
    {
        try {
            Connection connect=Connect();
            String sql=" select TENDV from DichVu";
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                cbServiceName.addItem(rs.getString(1));
            }
            pr.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void getPriceService(String idService)
  {
              try {
            Connection connect=Connect();
            String sql=" select DONGIA from DichVu Where TENDV like N'%"+idService+"%'";
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                txtPrice.setText(rs.getString(1));
            }
            pr.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
  }
  public boolean checkServiceForCar(String idCar)
  {
      
        try {
            setCheck(false);
            Connection connect=Connect();
            String sql=" select MAXE from ChiTietDichVu ";
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                
                if(rs.getString(1).equals(idCar))
                {
                setCheck(true);
                break;
                }
            }
            pr.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
        }
      return isCheck();
  }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddServicesForCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAdding;
    public javax.swing.JButton btDelete;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbServiceName;
    public javax.swing.JLabel lbAdding;
    public javax.swing.JLabel lbDelete;
    public javax.swing.JLabel lbErrorPriceValid;
    private javax.swing.JPanel panelBackground;
    public javax.swing.JPanel panelRegister;
    public javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
