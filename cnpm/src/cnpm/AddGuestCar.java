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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Messager;
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
public class AddGuestCar extends javax.swing.JFrame {
    /**
     * Creates new form RegisterMember
     */
    upDateStaffPanel t;
    public String id;
    public AddGuestCar() {
    initComponents();
    getInforGuestCar();
            //Ban đầu cho các lb ẩn
        lbErrorNumberPlate.setVisible(false);
        lbErrorNameCar.setVisible(false);
        lbErrorNumberPlateEmpty.setVisible(false);
        lbErrorNameCarEmpty.setVisible(false);
        lbErrorExistedNumberPlate.setVisible(false);
        //Set nut update an
        btUpdate.setVisible(false);
        lbUpdate.setVisible(false);
        btDelete.setVisible(false);
        lbDelete.setVisible(false);
        txtAddress.setEnabled(false);
        txtSDT.setEnabled(false);
       cbGuestName.addItemListener(new ItemListener()
               {
                   public void itemStateChanged(ItemEvent e)
                    {
                        cbGuestID.setSelectedIndex(cbGuestName.getSelectedIndex());
                        getInforGuestWithGuestID(String.valueOf(cbGuestID.getEditor().getItem()) );
                    }
               });
       
        this.setSize(400,580);
    this.getContentPane().setBackground(new Color(209, 209, 224));
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
        txtNameCar = new javax.swing.JTextField();
        cbGuestName = new javax.swing.JComboBox<>();
        lbUpdate = new javax.swing.JLabel();
        lbAdd = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        txtNumberPlate = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();
        lbDelete = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        cbGuestID = new javax.swing.JComboBox<>();
        lbErrorNameCar = new javax.swing.JLabel();
        lbErrorNameCarEmpty = new javax.swing.JLabel();
        lbErrorNumberPlate = new javax.swing.JLabel();
        lbErrorNumberPlateEmpty = new javax.swing.JLabel();
        lbErrorExistedNumberPlate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setOpacity(0.95F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setPreferredSize(new java.awt.Dimension(600, 335));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(51, 51, 51));
        panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "Guest's Car", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 102))); // NOI18N
        panelRegister.setPreferredSize(new java.awt.Dimension(400, 350));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameCar.setBackground(new java.awt.Color(255, 255, 255));
        txtNameCar.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtNameCar.setForeground(new java.awt.Color(133, 173, 173));
        txtNameCar.setText("CAR'S NAME*");
        txtNameCar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtNameCar.setCaretColor(new java.awt.Color(204, 0, 0));
        txtNameCar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNameCar.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        txtNameCar.setDragEnabled(true);
        txtNameCar.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        txtNameCar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameCarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameCarFocusLost(evt);
            }
        });
        panelRegister.add(txtNameCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 50));

        cbGuestName.setBackground(new java.awt.Color(255, 255, 255));
        cbGuestName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbGuestName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        panelRegister.add(cbGuestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 50));

        lbUpdate.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbUpdate.setForeground(new java.awt.Color(255, 255, 102));
        lbUpdate.setText("UPDATE");
        panelRegister.add(lbUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 120, 30));

        lbAdd.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 102));
        lbAdd.setText("ADD");
        panelRegister.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 140, 30));

        btAdd.setBackground(new java.awt.Color(102, 102, 102));
        btAdd.setForeground(new java.awt.Color(255, 255, 0));
        btAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btAdd.setBorder(null);
        btAdd.setBorderPainted(false);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        panelRegister.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 180, 70));

        txtNumberPlate.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberPlate.setFont(new java.awt.Font("Dubai Light", 2, 16)); // NOI18N
        txtNumberPlate.setForeground(new java.awt.Color(133, 173, 173));
        txtNumberPlate.setText("CAR'S NUMBER PLATE*");
        txtNumberPlate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtNumberPlate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumberPlateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumberPlateFocusLost(evt);
            }
        });
        panelRegister.add(txtNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 360, 50));

        btUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btUpdate.setBorder(null);
        btUpdate.setBorderPainted(false);
        btUpdate.setContentAreaFilled(false);
        panelRegister.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 180, 70));

        lbDelete.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lbDelete.setForeground(new java.awt.Color(255, 255, 102));
        lbDelete.setText("DELETE");
        panelRegister.add(lbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 120, 30));

        btDelete.setBackground(new java.awt.Color(102, 102, 102));
        btDelete.setForeground(new java.awt.Color(255, 255, 0));
        btDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btDelete.setBorder(null);
        btDelete.setBorderPainted(false);
        btDelete.setContentAreaFilled(false);
        panelRegister.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 70));

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

        txtSDT.setBackground(new java.awt.Color(255, 255, 255));
        txtSDT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(0, 0, 0));
        txtSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtSDT.setCaretColor(new java.awt.Color(204, 0, 0));
        txtSDT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSDT.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        txtSDT.setDragEnabled(true);
        txtSDT.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        panelRegister.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 50));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtAddress.setCaretColor(new java.awt.Color(204, 0, 0));
        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        txtAddress.setDragEnabled(true);
        txtAddress.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        panelRegister.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 50));

        cbGuestID.setBackground(new java.awt.Color(153, 153, 153));
        cbGuestID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbGuestID.setForeground(new java.awt.Color(255, 255, 255));
        cbGuestID.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        cbGuestID.setEnabled(false);
        cbGuestID.setOpaque(false);
        panelRegister.add(cbGuestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 50));

        panelBackground.add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        lbErrorNameCar.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNameCar.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNameCar.setText("Car's name invalid");
        getContentPane().add(lbErrorNameCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 180, 40));

        lbErrorNameCarEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNameCarEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNameCarEmpty.setText("Car's name empty");
        lbErrorNameCarEmpty.setToolTipText("");
        getContentPane().add(lbErrorNameCarEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 170, -1));

        lbErrorNumberPlate.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNumberPlate.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNumberPlate.setText("Number plate's invalid");
        getContentPane().add(lbErrorNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 220, 50));

        lbErrorNumberPlateEmpty.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorNumberPlateEmpty.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorNumberPlateEmpty.setText("Number plate's empty");
        lbErrorNumberPlateEmpty.setToolTipText("");
        getContentPane().add(lbErrorNumberPlateEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 200, -1));

        lbErrorExistedNumberPlate.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        lbErrorExistedNumberPlate.setForeground(new java.awt.Color(255, 92, 51));
        lbErrorExistedNumberPlate.setText("Number plate's existing");
        getContentPane().add(lbErrorExistedNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 240, 50));

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

    private void txtNumberPlateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberPlateFocusLost
        // TODO add your handling code here:
        if(txtNumberPlate.getText().trim().toUpperCase().equals(""))
        {
            txtNumberPlate.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtNumberPlate.setForeground(new Color(133,173,173));
            txtNumberPlate.setText("CAR'S NUMBER PLATE*");
        }
    }//GEN-LAST:event_txtNumberPlateFocusLost

    private void txtNumberPlateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberPlateFocusGained
        if(txtNumberPlate.getText().trim().toUpperCase().equals("CAR'S NUMBER PLATE*"))
        {
            txtNumberPlate.setFont(new Font("Dialog", Font.BOLD, 16));
            txtNumberPlate.setForeground(new Color(10, 15, 15));
            txtNumberPlate.setText("");
        }
    }//GEN-LAST:event_txtNumberPlateFocusGained

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btAddActionPerformed

    private void txtNameCarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameCarFocusLost
        // TODO add your handling code here:
        if(txtNameCar.getText().trim().toUpperCase().equals(""))
        {
            txtNameCar.setFont(new Font("Dubai Light", Font.ITALIC, 16));
            txtNameCar.setForeground(new Color(133,173,173));
            txtNameCar.setBackground(Color.white);
            txtNameCar.setText("CAR'S NAME*");
        }
    }//GEN-LAST:event_txtNameCarFocusLost

    private void txtNameCarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameCarFocusGained
        // TODO add your handling code here:
        if(txtNameCar.getText().trim().toUpperCase().equals("CAR'S NAME*"))
        {
            txtNameCar.setFont(new Font("Dialog", Font.BOLD, 16));
            txtNameCar.setForeground(new Color(10, 15, 15));
            txtNameCar.setBackground(Color.white);
            txtNameCar.setText("");
        }
        //do nothing
    }//GEN-LAST:event_txtNameCarFocusGained
     
    public void getInforGuestCar()
    {
        try {
            Connection c=Connect();
            String sql="Select TENKH,TRANGTHAI,MAKH,SDT,DIACHI from KhachHang";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            int count=0;
            while(rs.next())
            {
                if(count==0)
                {
                    txtSDT.setText(rs.getString(4));
                    txtAddress.setText(rs.getString(5));
                    count++;
                }
                if(!rs.getString(2).equals("1"))
                {
                cbGuestName.addItem(rs.getString(1));
                cbGuestID.addItem(rs.getString(3));
                }
            }
            pr.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * @param args the command line arguments
     */
//    private void createAccount(String userName,String password)
//    {
//        try {
//            Connection connect=Connect();
//            String sql1=" insert into Account values (?,?)";
//            PreparedStatement pr1=connect.prepareStatement(sql1);
//            pr1.setString(1, userName);
//            pr1.setString(2, password);
//            pr1.executeUpdate();
//            pr1.close();
//            connect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//   
// private void createStaff(String name,String userName,String sex,String position,String phoneNumber,String date,String address,String email)
// {
//        try {
//            Connection connect=Connect();
//            String sql=" insert into NhanVien (TENNV,USERNAME,GIOITINH,CHUCVU,SDT,NGAYSINH,DIACHI,EMAIL) values (?,?,?,?,?,?,?,?)";
//            PreparedStatement pr=connect.prepareStatement(sql);
//            pr.setString(1, name);
//            pr.setString(2, userName);
//            pr.setString(3, sex);
//            pr.setString(4, position);
//            pr.setString(5, phoneNumber);
//            pr.setString(6, date);
//            pr.setString(7, address);
//            pr.setString(8, email);
//            pr.executeUpdate();
//            pr.close();
//            connect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterMember.class.getName()).log(Level.SEVERE, null, ex);
//        }
// }
public void getInforGuestWithGuestID(String idGuest)
{
        try {
            Connection c=Connect();
            String sql="Select SDT,DIACHI from KhachHang where MAKH='"+idGuest+"'";
            PreparedStatement pr=c.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next())
            {
                txtSDT.setText(rs.getString(1));
                txtAddress.setText(rs.getString(2));
            }
            rs.close();
            pr.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddGuestCar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
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
            java.util.logging.Logger.getLogger(AddGuestCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGuestCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGuestCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGuestCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGuestCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAdd;
    public javax.swing.JButton btDelete;
    public javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbGuestID;
    public javax.swing.JComboBox<String> cbGuestName;
    public javax.swing.JLabel lbAdd;
    public javax.swing.JLabel lbDelete;
    public javax.swing.JLabel lbErrorExistedNumberPlate;
    public javax.swing.JLabel lbErrorNameCar;
    public javax.swing.JLabel lbErrorNameCarEmpty;
    public javax.swing.JLabel lbErrorNumberPlate;
    public javax.swing.JLabel lbErrorNumberPlateEmpty;
    public javax.swing.JLabel lbUpdate;
    private javax.swing.JPanel panelBackground;
    public javax.swing.JPanel panelRegister;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JTextField txtNameCar;
    public javax.swing.JTextField txtNumberPlate;
    public javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
