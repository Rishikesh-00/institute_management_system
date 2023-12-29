
package raysproject;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class CourseMdiForm extends javax.swing.JFrame {
 
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str,url;
    int ano;
    Label l;
    DefaultTableModel model;
    boolean flag;
    public CourseMdiForm() throws SQLException {
         initComponents();
         pan.setVisible(false);
         upd_bt.setVisible(false);
        del_bt.setVisible(false);
         con=ConnDb.conLink();
         this.setLocationRelativeTo(null);
         Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icon/raysnew.png"));
        this.setIconImage(icon);
         setTitle("CourseForm");
         this.getRootPane().setDefaultButton(add_bt);
         this.setLocationRelativeTo(null);
         cor_nam.requestFocus();
         tabl.setVisible(true);
       //************this code use service form*****************  
        ser_tf.setVisible(true);
        cur_cb.setSelectedIndex(0);
        url="select * from course where upper(CID)=?";  
        stmt=con.prepareStatement("select cid from automatic");
        rs=stmt.executeQuery();
        rs.next();
        ano=rs.getInt(1)+1;
    
     auto();
    }
     void auto(){
       boolean flag=true;
       if(ano<10)
           str="REPLC00"+ano;
       else if(ano<100)
           str="REPLC0"+ano;
       else if(ano<1000)
           str="REPLC"+ano;
       else{
           String showInputDialog = JOptionPane.showInputDialog("more than 999 not allow");
           flag=false;
       }
       if(flag)
       {
       cor_Id.setText(str);
       cor_nam.requestFocus();
       } 
       else
           add_bt.setVisible(false);
}
     void RedBorder(){
         flcourse(cor_nam);
         flcourse(cor_fee);
         flcourse(cor_dur);
        
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXSearchPanel1 = new org.jdesktop.swingx.JXSearchPanel();
        jLabel9 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cor_dur = new javax.swing.JTextField();
        cor_nam = new javax.swing.JTextField();
        cor_fee = new javax.swing.JTextField();
        cor_Id = new javax.swing.JTextField();
        add_bt = new javax.swing.JButton();
        cen_bt = new javax.swing.JButton();
        time_cb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        cur_cb = new javax.swing.JComboBox<>();
        del_bt = new javax.swing.JButton();
        upd_bt = new javax.swing.JButton();
        ser_tf = new org.jdesktop.swingx.JXSearchField();
        ref_bt = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setFocusable(false);
        tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab.setRequestFocusEnabled(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(49, 183, 194));
        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(123, 195, 147));
        kGradientPanel1.setRequestFocusEnabled(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(56, 78, 120));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 205));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COURSE DETAILS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 230, 29));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Course Fee");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Course Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Duration");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Course Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 30));

        cor_dur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cor_durFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cor_durFocusLost(evt);
            }
        });
        cor_dur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cor_durKeyTyped(evt);
            }
        });
        jPanel1.add(cor_dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 110, 30));

        cor_nam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cor_namFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cor_namFocusLost(evt);
            }
        });
        cor_nam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cor_namKeyTyped(evt);
            }
        });
        jPanel1.add(cor_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 180, 30));

        cor_fee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cor_feeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cor_feeFocusLost(evt);
            }
        });
        cor_fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cor_feeKeyTyped(evt);
            }
        });
        jPanel1.add(cor_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 102, 160, 30));

        cor_Id.setEditable(false);
        cor_Id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(cor_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 30));

        add_bt.setBackground(new java.awt.Color(0, 102, 102));
        add_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_bt.setForeground(new java.awt.Color(255, 255, 255));
        add_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/submit (1).png"))); // NOI18N
        add_bt.setText("ADD");
        add_bt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_bt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                add_btFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                add_btFocusLost(evt);
            }
        });
        add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btActionPerformed(evt);
            }
        });
        jPanel1.add(add_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 30));

        cen_bt.setBackground(new java.awt.Color(204, 0, 51));
        cen_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cen_bt.setForeground(new java.awt.Color(255, 255, 255));
        cen_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh (1).png"))); // NOI18N
        cen_bt.setText("Refresh");
        cen_bt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cen_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cen_btActionPerformed(evt);
            }
        });
        cen_bt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cen_btKeyPressed(evt);
            }
        });
        jPanel1.add(cen_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 100, 30));

        time_cb.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        time_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOUR", "DAY", "MONTH" }));
        jPanel1.add(time_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 20, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 20, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 20, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 20, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 750, 260));

        tab.addTab("Course Entry From", kGradientPanel1);

        kGradientPanel6.setkEndColor(new java.awt.Color(38, 144, 140));
        kGradientPanel6.setkGradientFocus(100);
        kGradientPanel6.setkStartColor(new java.awt.Color(38, 173, 166));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(56, 78, 120));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course Service Form");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 11, 232, 36));

        kGradientPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        Search.setBackground(new java.awt.Color(0, 153, 255));
        Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon-png-9964 (1).png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        kGradientPanel6.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 100, 31));

        cur_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Id","Course Name" }));
        cur_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cur_cbActionPerformed(evt);
            }
        });
        kGradientPanel6.add(cur_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 192, 31));

        del_bt.setBackground(new java.awt.Color(255, 148, 70));
        del_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        del_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete (1).png"))); // NOI18N
        del_bt.setText("DELETE");
        del_bt.setBorder(null);
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });
        kGradientPanel6.add(del_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 100, 30));

        upd_bt.setBackground(new java.awt.Color(0, 204, 204));
        upd_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        upd_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/update (1).png"))); // NOI18N
        upd_bt.setText("UPDATE");
        upd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_btActionPerformed(evt);
            }
        });
        kGradientPanel6.add(upd_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 30));
        kGradientPanel6.add(ser_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, 30));

        ref_bt.setBackground(new java.awt.Color(102, 255, 255));
        ref_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ref_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh (1).png"))); // NOI18N
        ref_bt.setText("Refresh");
        ref_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_btActionPerformed(evt);
            }
        });
        kGradientPanel6.add(ref_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 100, 30));

        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Id", "Course Name", "Course Duration", "Course fee", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tabl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabl);

        pan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 260));

        kGradientPanel6.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 830, 260));

        tab.addTab("Service Form", kGradientPanel6);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cen_btKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cen_btKeyPressed
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
        if(ch==10)
        {
            cor_nam.setText("");
            cor_nam.requestFocus();
            cor_nam.setBorder(new LineBorder(Color.BLACK));
            cor_fee.setText("");
            cor_fee.setBorder(new LineBorder(Color.BLACK));
            cor_dur.setText("");
            cor_dur.setBorder(new LineBorder(Color.BLACK));

        }
    }//GEN-LAST:event_cen_btKeyPressed

    private void cen_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cen_btActionPerformed
        
        cancel();
    }//GEN-LAST:event_cen_btActionPerformed

    private void add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btActionPerformed
        RedBorder();
        flag=true;
        
        if (cor_nam.getText().isEmpty() || cor_fee.getText().isEmpty()|| cor_dur.getText().isEmpty()) {
            flag=false;
      }
       else if (cor_nam.getText().equals("*Field is mandatory!") || cor_fee.getText().equals("*Field is mandatory!")|| cor_dur.getText().equals("*Field is mandatory!")) {
            flag=false;
    } 
            if(flag){
        try {
      
            stmt=con.prepareStatement("insert into course values(?,?,?,?)");
            stmt.setString(1,cor_Id.getText());
            stmt.setString(2,cor_nam.getText());
            stmt.setString(3,cor_dur.getText()+" "+time_cb.getSelectedItem());
            stmt.setString(4,cor_fee.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record inserted successfully");
            ano++;
            auto();
            backdata.backup("course");
            backdata.backup("automatic");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Something Went Wrong!");
              
            } catch (WriteException ex) {
                Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            else
                 JOptionPane.showMessageDialog(null, "*please fill all the mandatory fields!");
            
             if(flag){
            try {
            //System.out.println(ano);
            stmt=con.prepareStatement("update automatic set cid=?");
            stmt.setInt(1,ano-1);
            stmt.executeUpdate();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Automatic not Updated!");
             }
        }
                
    }//GEN-LAST:event_add_btActionPerformed

    private void cor_feeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cor_feeKeyTyped
        char ch=evt.getKeyChar();
        if(!(ch>='0'&& ch<='9'))
            evt.consume();
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_cor_feeKeyTyped

    private void cor_feeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_feeFocusLost
        flcourse(cor_fee);
    }//GEN-LAST:event_cor_feeFocusLost
    private void cor_feeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_feeFocusGained
        fgcourse(cor_fee);
    }//GEN-LAST:event_cor_feeFocusGained
    private void cor_namKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cor_namKeyTyped
        char ch=evt.getKeyChar();
        if(evt.getKeyChar()==' '||ch>='0'&& ch<='9'&& cor_nam.getCaretPosition()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!(ch>='a'&& ch<='z'|| ch==8||ch==' '||ch>='A'&& ch<='Z'||ch>='0'&& ch<='9')){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_cor_namKeyTyped
    private void cor_namFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_namFocusLost
        flcourse(cor_nam);
    }//GEN-LAST:event_cor_namFocusLost
    private void cor_namFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_namFocusGained
        fgcourse(cor_nam);
    }//GEN-LAST:event_cor_namFocusGained
    private void cor_durKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cor_durKeyTyped
        char ch=evt.getKeyChar();
        if(evt.getKeyChar()==' '&& cor_dur.getCaretPosition()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(!(ch>='0'&& ch<='9'|| ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_cor_durKeyTyped
    private void cor_durFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_durFocusLost
        
        flcourse(cor_dur);
    }//GEN-LAST:event_cor_durFocusLost
    private void cor_durFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_durFocusGained
        
        fgcourse(cor_dur);
    }//GEN-LAST:event_cor_durFocusGained
    private void add_btFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_add_btFocusLost
        
        add_bt.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_add_btFocusLost
    private void add_btFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_add_btFocusGained
        add_bt.setBackground(new java.awt.Color(0, 126, 126));
    }//GEN-LAST:event_add_btFocusGained

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
         stmt=con.prepareStatement(url);
         stmt.setString(1,ser_tf.getText().toUpperCase());
         rs=stmt.executeQuery();
          model=(DefaultTableModel)tabl.getModel();
          model.setRowCount(0);
          if(rs.next()){
            while(rs.next()){
                pan.setVisible(true);
                upd_bt.setVisible(true);
                del_bt.setVisible(true);
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),false});
            }
          }
          else
           JOptionPane.showMessageDialog(this,"No Recoard found");    
             
        } catch (SQLException ex) {
         Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_SearchActionPerformed

    private void cur_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cur_cbActionPerformed
         url="select * from Course where ";
         ser_tf.requestFocus();
       
         if(cur_cb.getSelectedIndex()==0)
                 url=url+"upper(CID)=?";
            else 
                 url=url+"upper(CNAME)=?";
         
    }//GEN-LAST:event_cur_cbActionPerformed
    private void upd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_btActionPerformed
         for(byte i=0;i<tabl.getRowCount();i++){
              if(model.getValueAt(i,4).equals(true)){
               byte a=(byte) JOptionPane.showConfirmDialog(this,"are you sure update recoard?");
                  if(a==0)
                  try {
                      stmt=con.prepareStatement("update course set cname=?,cdur=?,cfee=? where cid=?");
                      stmt.setString(4,model.getValueAt(i,0).toString().toUpperCase());
                      stmt.setString(1,model.getValueAt(i,1).toString().toUpperCase());
                      stmt.setString(2,model.getValueAt(i,2).toString().toUpperCase());
                      stmt.setString(3,model.getValueAt(i,3).toString().toUpperCase());
                      stmt.executeUpdate();
                      JOptionPane.showMessageDialog(this,"Recoard Updated sucessfully!");
                      backdata.backup("course");
                      backdata.backup("automatic");
                  } catch (SQLException ex) {
                      Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
                      JOptionPane.showMessageDialog(this,"Something Wrong in update_bt");
                  } catch (WriteException ex) {
                   Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
               }
              }
            }
    }//GEN-LAST:event_upd_btActionPerformed

 @SuppressWarnings("empty-statement")
    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        for(byte i=0;i<tabl.getRowCount();i++){
              if(model.getValueAt(i,4).equals(true)){
                  byte a=(byte) JOptionPane.showConfirmDialog(this,"are you sure delete recoard?");
                  if(a==0)
                  try {
                      stmt=con.prepareStatement("delete from course where cid=?");
                      stmt.setString(1,model.getValueAt(i,0).toString());
                      stmt.executeUpdate();
                      model.removeRow(i);
                      i--;
//                       JOptionPane.showMessageDialog(this,"Recoard Updated sucessfully!");
                       backdata.backup("course");
                       backdata.backup("automatic");
                  } catch (SQLException ex) {
                      Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
                      
                  } catch (WriteException ex) {
                      Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }                
    }
    }//GEN-LAST:event_del_btActionPerformed

    private void ref_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_btActionPerformed
        ser_tf.setText("");
        ser_tf.requestFocus();
        upd_bt.setVisible(false);
        del_bt.setVisible(false);
        model.setRowCount(0);
        
    }//GEN-LAST:event_ref_btActionPerformed

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked
      for(byte i=0; i<tabl.getRowCount();i++){  
          if(model.getValueAt(i,4).equals(true)){
            tabl.addRowSelectionInterval(i,i);
            tabl.setSelectionBackground(Color.yellow);
            tabl.setSelectionForeground(Color.red); 
          }
          else
              tabl.removeRowSelectionInterval(i,i);  
         
    }//GEN-LAST:event_tablMouseClicked
    }
    public void cancel(){
          cor_nam.requestFocus();
          cor_nam.setText("");
          cor_nam.setForeground(Color.BLACK);
          cor_nam.setBorder(new LineBorder(Color.BLACK));
          cor_fee.setText("");
          cor_fee.setForeground(Color.BLACK);
          cor_fee.setBorder(new LineBorder(Color.BLACK));
          cor_dur.setText("");
          cor_dur.setForeground(Color.BLACK);
          cor_dur.setBorder(new LineBorder(Color.BLACK));
      }
     public void flcourse(JTextField fl)
    {
       String str=fl.getText();
        if(str.length()==0){
            fl.setForeground(Color.red);
            fl.setText("*Field is mandatory!");
           fl.setBorder(new LineBorder(Color.RED));
             Toolkit.getDefaultToolkit().beep();
        } 
    }
    public void fgcourse(JTextField fg)
    {
        String str=fg.getText();
        if(str.equals("*Field is mandatory!")){
           fg.setForeground(Color.BLACK);
            fg.setBorder(new LineBorder(Color.black));
            fg.setText("");
             Toolkit.getDefaultToolkit().beep();
        } 
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    new CourseMdiForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton add_bt;
    private javax.swing.JButton cen_bt;
    private javax.swing.JTextField cor_Id;
    private javax.swing.JTextField cor_dur;
    private javax.swing.JTextField cor_fee;
    private javax.swing.JTextField cor_nam;
    private javax.swing.JComboBox<String> cur_cb;
    private javax.swing.JButton del_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXSearchPanel jXSearchPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JPanel pan;
    private javax.swing.JButton ref_bt;
    private org.jdesktop.swingx.JXSearchField ser_tf;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabl;
    private javax.swing.JComboBox<String> time_cb;
    private javax.swing.JButton upd_bt;
    // End of variables declaration//GEN-END:variables
}
