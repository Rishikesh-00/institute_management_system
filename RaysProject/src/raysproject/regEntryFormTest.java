
package raysproject;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class regEntryFormTest extends javax.swing.JFrame {
//entry form variable
    boolean flag=true,chk=true;
    ButtonGroup bg;
    Connection con;
    PreparedStatement smt;
    ResultSet rs;
    int year,reg_no;
     ImageIcon img;
    String str,url;
    File f1,f2;
    public regEntryFormTest() throws SQLException {
        initComponents();
        Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icon/raysnew.png"));
        this.setIconImage(icon);
//        tab.setBackgroundAt(0, Color.RED);
//        tab.setForegroundAt(1, Color.red);
            //******************autogenerate for reg_no************************
        con=ConnDb.conLink();
        smt=con.prepareStatement("select reg_no from automatic");
        rs=smt.executeQuery();
        rs.next();
        reg_no=rs.getInt(1)+1;
        //+++++++++get current year of system++++++++++++++++
        Calendar cal=Calendar.getInstance();
         year = (cal.get(Calendar.YEAR))%100;
         autogen(); 
        ///**********************************************
        ser_cb.setVisible(false);
        ser_tf.setVisible(true);
        reg_cb.setSelectedIndex(2);
        url="select * from registration where upper(cont_no)=?";
        con_lb.setForeground(Color.red);
        this.setTitle("Registration-Form");
        this.setLocationRelativeTo(null);
        dat.setDate(new java.sql.Date(System.currentTimeMillis()));
        nam_tf.requestFocus();
        blo_cb.setSelectedIndex(2);
        sta_cb.setSelectedIndex(0);
        bg=new ButtonGroup();
        mal_rb.setSelected(true);
        bg.add(mal_rb);
        bg.add(fem_rb);
        bg.add(bin_rb);
        this.getRootPane().setDefaultButton(sub_bt);
//       redit.setVisible(false);
//       dedit.setVisible(false);
//adding program from course table on program
        smt=con.prepareStatement("select cname from course");
        rs=smt.executeQuery();
        while(rs.next())
            pro_cb.addItem(rs.getString(1));
    }
    public void autogen(){
        boolean flag=true;
       if(reg_no<10)
           str="REPL/"+"BR01/"+year+"/R000"+reg_no;
       else if(reg_no<100)
           str="REPL/"+"BR01/"+year+"/R00"+reg_no;
       else if(reg_no<1000)
           str="REPL/"+"BR01/"+year+"/R0"+reg_no;
       else if(reg_no<10000)
           str="REPL/"+"BR01/"+year+"/R"+reg_no;
       else{
           JOptionPane.showMessageDialog(null,"More than 9999 student not allowed");
           flag=false;
       }
       if(flag){
             reg_tf.setText(str); 
         }  
       else{
           sub_bt.setVisible(false);
       }
    }
    public void reset(){
        dob_lb.setText("");
        nam_tf.requestFocus();
        lb.setText("");
        con_lb.setText("");
        nam_tf.setText("");
        nam_tf.setForeground(Color.BLACK);
        fat_tf.setText("");
        fat_tf.setForeground(Color.BLACK);
        mot_tf.setText("");
        mot_tf.setForeground(Color.BLACK);
        dob.setDate(null);
        dob.setForeground(Color.BLACK);
        ema_tf.setText("");
        ema_tf.setForeground(Color.BLACK);
        con_tf.setText("");
        con_tf.setForeground(Color.BLACK);
        col_tf.setText("");
        col_tf.setForeground(Color.BLACK);
        per_ta.setText("");
        per_ta.setForeground(Color.BLACK);
        dis_tf.setText("");
        dis_tf.setForeground(Color.BLACK);
        nam_tf.setBorder(new LineBorder(Color.black));
        fat_tf.setBorder(new LineBorder(Color.black));
        mot_tf.setBorder(new LineBorder(Color.black));
        dob.setBorder(new LineBorder(Color.black));
        ema_tf.setBorder(new LineBorder(Color.black));
        con_tf.setBorder(new LineBorder(Color.black));
        col_tf.setBorder(new LineBorder(Color.black));
        per_ta.setBorder(new LineBorder(Color.black));
        cor_ta.setBorder(new LineBorder(Color.BLACK));
        dis_tf.setBorder(new LineBorder(Color.black));
        cor_ta.setText("");
        sta_cb.setSelectedIndex(0);
        blo_cb.setSelectedIndex(2);
        pro_cb.setSelectedIndex(0);
        pro_cb.setBorder(new LineBorder(Color.black));
        mal_rb.setSelected(true);
        ph.setIcon(null);
        aad_ph.setIcon(null);
        add_rb.setSelected(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        reg_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ph = new javax.swing.JLabel();
        mot_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fat_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        ema_tf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        con_tf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        blo_cb = new javax.swing.JComboBox<>();
        pho_bt = new javax.swing.JButton();
        aad_bt = new javax.swing.JButton();
        bin_rb = new javax.swing.JRadioButton();
        fem_rb = new javax.swing.JRadioButton();
        mal_rb = new javax.swing.JRadioButton();
        gen_rb = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        col_tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        per_ta = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        add_rb = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cor_ta = new javax.swing.JTextArea();
        aad_ph = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dis_tf = new javax.swing.JTextField();
        sta_cb = new javax.swing.JComboBox<>();
        sub_bt = new javax.swing.JButton();
        res_bt = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        pro_cb = new javax.swing.JComboBox<>();
        con_lb = new javax.swing.JLabel();
        nam_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        dob_lb = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        dat = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        reg_cb = new javax.swing.JComboBox<>();
        ser_bt = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        ser_cb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ser_tf = new org.jdesktop.swingx.JXSearchField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tab.setBackground(new java.awt.Color(0, 0, 204));
        tab.setForeground(new java.awt.Color(255, 102, 102));
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabFocusGained(evt);
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(49, 183, 194));
        kGradientPanel1.setkStartColor(new java.awt.Color(123, 195, 147));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(56, 78, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION FORM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 980, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Date :");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 57, 92, 24));

        reg_tf.setEditable(false);
        reg_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        kGradientPanel1.add(reg_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 58, 217, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Registration No.");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 57, 107, 24));

        jPanel8.setBackground(new java.awt.Color(230, 230, 250));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ph.setBackground(new java.awt.Color(255, 51, 51));
        ph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ph.setToolTipText("Attach Your Photo");
        ph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 103, 100));

        mot_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mot_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mot_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mot_tfFocusLost(evt);
            }
        });
        mot_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mot_tfKeyTyped(evt);
            }
        });
        jPanel8.add(mot_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 52, 241, 24));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Name ");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 24));

        fat_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fat_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fat_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fat_tfFocusLost(evt);
            }
        });
        fat_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fat_tfKeyTyped(evt);
            }
        });
        jPanel8.add(fat_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 197, 24));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Father's Name");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, 24));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Mother's Name");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 24));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("D.O.B");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 106, 24));

        dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobFocusLost(evt);
            }
        });
        jPanel8.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 198, 26));

        ema_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ema_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ema_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ema_tfFocusLost(evt);
            }
        });
        ema_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ema_tfKeyTyped(evt);
            }
        });
        jPanel8.add(ema_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 241, 24));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Email Id");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 22));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Contact No.");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 106, 22));

        con_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                con_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                con_tfFocusLost(evt);
            }
        });
        con_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                con_tfKeyTyped(evt);
            }
        });
        jPanel8.add(con_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 198, 24));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Program");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 145, 22));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Blood Group");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 95, 22));

        blo_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A","B","AB","O","A-","B-","AB-","O-"}));
        blo_cb.setNextFocusableComponent(col_tf);
        jPanel8.add(blo_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 198, -1));

        pho_bt.setBackground(new java.awt.Color(0, 116, 226));
        pho_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pho_bt.setForeground(new java.awt.Color(255, 255, 255));
        pho_bt.setText("UPLOAD");
        pho_bt.setNextFocusableComponent(sub_bt);
        pho_bt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pho_btFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pho_btFocusLost(evt);
            }
        });
        pho_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pho_btActionPerformed(evt);
            }
        });
        jPanel8.add(pho_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 103, -1));

        aad_bt.setBackground(new java.awt.Color(0, 116, 226));
        aad_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aad_bt.setForeground(new java.awt.Color(255, 255, 255));
        aad_bt.setText("UPLOAD");
        aad_bt.setNextFocusableComponent(pho_bt);
        aad_bt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aad_btFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aad_btFocusLost(evt);
            }
        });
        aad_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aad_btActionPerformed(evt);
            }
        });
        jPanel8.add(aad_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        bin_rb.setBackground(new java.awt.Color(230, 230, 250));
        bin_rb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bin_rb.setText("Binary");
        jPanel8.add(bin_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 73, -1));

        fem_rb.setBackground(new java.awt.Color(230, 230, 250));
        fem_rb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fem_rb.setText("Female");
        jPanel8.add(fem_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 71, -1));

        mal_rb.setBackground(new java.awt.Color(230, 230, 250));
        mal_rb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mal_rb.setText("Male");
        jPanel8.add(mal_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 60, -1));

        gen_rb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gen_rb.setText("Gender");
        jPanel8.add(gen_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 56, 22));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("College Name");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 137, 22));

        col_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        col_tf.setNextFocusableComponent(per_ta);
        col_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                col_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                col_tfFocusLost(evt);
            }
        });
        col_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                col_tfKeyTyped(evt);
            }
        });
        jPanel8.add(col_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 241, 24));

        per_ta.setColumns(20);
        per_ta.setLineWrap(true);
        per_ta.setRows(5);
        per_ta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                per_taFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                per_taFocusLost(evt);
            }
        });
        per_ta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                per_taKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(per_ta);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 241, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Permanent address");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 131, 22));

        add_rb.setBackground(new java.awt.Color(230, 230, 250));
        add_rb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_rb.setText("click (if permanent address is same as corresponding address)");
        add_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_rbActionPerformed(evt);
            }
        });
        jPanel8.add(add_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 388, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Correspondance address");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 116, 226));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 692, 101, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 692, 101, -1));

        cor_ta.setColumns(20);
        cor_ta.setLineWrap(true);
        cor_ta.setRows(5);
        cor_ta.setWrapStyleWord(true);
        cor_ta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cor_taFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cor_taFocusLost(evt);
            }
        });
        cor_ta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cor_taKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(cor_ta);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 244, -1));

        aad_ph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aad_ph.setToolTipText("Upload Aadhar Photo");
        aad_ph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.add(aad_ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 330, 151));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("District");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 78, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("State");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 78, 25));

        dis_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dis_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dis_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dis_tfFocusLost(evt);
            }
        });
        dis_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dis_tfKeyTyped(evt);
            }
        });
        jPanel8.add(dis_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 198, 24));

        sta_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Bihar","Andhra Pradesh","Arunachal Pradesh","Assam","Chhattisgarh","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Telangana","Uttar Pradesh","Uttarakhand","West Bengal","Andaman & Nicobar","Chandigarh","Dadra & Nagar Haveli","Daman & Diu","Lakshadweep","Puducherry"}));
        sta_cb.setNextFocusableComponent(aad_bt);
        jPanel8.add(sta_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 198, -1));

        sub_bt.setBackground(new java.awt.Color(0, 116, 226));
        sub_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sub_bt.setForeground(new java.awt.Color(255, 255, 255));
        sub_bt.setText("SUBMIT");
        sub_bt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sub_btFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sub_btFocusLost(evt);
            }
        });
        sub_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btActionPerformed(evt);
            }
        });
        jPanel8.add(sub_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        res_bt.setBackground(new java.awt.Color(204, 0, 51));
        res_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        res_bt.setForeground(new java.awt.Color(255, 255, 255));
        res_bt.setText("RESET");
        res_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res_btActionPerformed(evt);
            }
        });
        jPanel8.add(res_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 80, -1));
        jPanel8.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 116, 240, 10));
        jPanel8.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 116, 240, 10));

        pro_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Choose anyOne" }));
        pro_cb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pro_cbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pro_cbFocusLost(evt);
            }
        });
        jPanel8.add(pro_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 240, -1));
        jPanel8.add(con_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 200, -1));

        nam_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nam_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nam_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nam_tfFocusLost(evt);
            }
        });
        nam_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nam_tfKeyTyped(evt);
            }
        });
        jPanel8.add(nam_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 22, 241, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("*");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 40, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("*");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 20, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("*");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 40, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("*");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 40, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("*");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 40, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("*");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 40, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("*");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 40, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("*");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 20, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("*");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 20, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("*");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 20, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("*");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 20, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("*");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 10, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Upload photo");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 100, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("*");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 20, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Upload Aadhar photo");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 300, -1));

        dob_lb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.add(dob_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 200, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("*");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, 20));

        kGradientPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 935, 480));

        dat.setEnabled(false);
        dat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                datFocusLost(evt);
            }
        });
        kGradientPanel1.add(dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 198, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        tab.addTab("Registration Entry Form", jPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(53, 118, 164));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reg_cb.setBackground(new java.awt.Color(255, 248, 246));
        reg_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration number","Student Name","Contact Number","Blood Group","Program","College" }));
        reg_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_cbActionPerformed(evt);
            }
        });
        kGradientPanel2.add(reg_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 87, 201, 31));

        ser_bt.setBackground(new java.awt.Color(0, 116, 226));
        ser_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ser_bt.setForeground(new java.awt.Color(255, 255, 255));
        ser_bt.setText("SEARCH");
        ser_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_btActionPerformed(evt);
            }
        });
        kGradientPanel2.add(ser_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 87, 100, 31));

        jPanel12.setBackground(new java.awt.Color(59, 113, 151));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("REGISTRATION SERVICE FORM");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 980, -1));

        ser_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ser_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_cbActionPerformed(evt);
            }
        });
        kGradientPanel2.add(ser_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 240, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registratin No", "Student Name", "Father Name", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 960, -1));
        kGradientPanel2.add(ser_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 240, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tab.addTab("Registration Service Form", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mot_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mot_tfFocusGained
        // TODO add your handling code here:
        regfg(mot_tf);
    }//GEN-LAST:event_mot_tfFocusGained

    private void mot_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mot_tfFocusLost
        regfl(mot_tf);
    }//GEN-LAST:event_mot_tfFocusLost

    private void mot_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mot_tfKeyTyped
        // TODO add your handling code here:

        regkt(evt,mot_tf);
    }//GEN-LAST:event_mot_tfKeyTyped

    private void fat_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fat_tfFocusGained
        regfg(fat_tf);
    }//GEN-LAST:event_fat_tfFocusGained

    private void fat_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fat_tfFocusLost
        regfl(fat_tf);
    }//GEN-LAST:event_fat_tfFocusLost

    private void fat_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fat_tfKeyTyped
        regkt(evt,fat_tf);
    }//GEN-LAST:event_fat_tfKeyTyped

    private void dobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusLost
        // TODO add your handling code here
        Date str=(Date) dob.getDate();
        if(str.equals(null)) {
            dob.setBorder(BorderFactory.createLineBorder(Color.red));
            //  dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_dobFocusLost

    private void ema_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ema_tfFocusGained
        // TODO add your handling code here:
        ema_tf.setBorder(new LineBorder(Color.black));
        lb.setText("");
    }//GEN-LAST:event_ema_tfFocusGained

    private void ema_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ema_tfFocusLost
        // TODO add your handling code here:
        lb.setForeground(Color.red);

        String str = ema_tf.getText();

        if (str.length()>0)
        {
            if (str.endsWith(".in") || str.endsWith(".com"))
            {
                if(str.contains("@"))
                {
                    byte index1=(byte) str.indexOf("@");
                    byte index2=(byte) str.indexOf(".");
                    if (index2==(index1+1))
                    {
                        ema_tf.setBorder(new LineBorder(Color.red));
                        Toolkit.getDefaultToolkit().beep();
                        lb.setText("*Please enter a valid email Id!");
                    }
                    else
                    lb.setText("");

                }
                else
                {
                    ema_tf.setBorder(new LineBorder(Color.red));
                    Toolkit.getDefaultToolkit().beep();
                    lb.setText("*Please enter a valid email Id!");
                }
            }
            else{
                ema_tf.setBorder(new LineBorder(Color.red));
                Toolkit.getDefaultToolkit().beep();
                lb.setText("*Please enter a valid email Id!");
            }
        }
        else
        lb.setText("");
    }//GEN-LAST:event_ema_tfFocusLost

    private void ema_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ema_tfKeyTyped
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
        if((evt.getKeyChar()==' ')&& dis_tf.getCaretPosition()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(!(ch>=65&& ch<=90 || ch>=97 && ch<=122 ||ch>='0' && ch<='9'|| ch=='@'||ch=='.'))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_ema_tfKeyTyped

    private void con_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_con_tfFocusGained
        // TODO add your handling code here:
        regfg(con_tf);
    }//GEN-LAST:event_con_tfFocusGained

    private void con_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_con_tfFocusLost
        regfl(con_tf);

    }//GEN-LAST:event_con_tfFocusLost

    private void con_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_con_tfKeyTyped

        char ch=evt.getKeyChar();
        if(con_tf.getText().length()>=10)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(!(ch>='0'&& ch<='9'|| ch==8))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_con_tfKeyTyped

    private void pho_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pho_btActionPerformed
        // TODO add your handling code here:
        JFileChooser ch=new JFileChooser();
        ch.showOpenDialog(this);
        f1 = ch.getSelectedFile();
        img=new ImageIcon(new ImageIcon(""+f1).getImage().getScaledInstance(ph.getWidth(), ph.getHeight(),Image.SCALE_SMOOTH));
        ph.setIcon(img);
    }//GEN-LAST:event_pho_btActionPerformed

    private void aad_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aad_btActionPerformed
        // TODO add your handling code here:
        JFileChooser ch=new JFileChooser();
        ch.showOpenDialog(this);
        f2 = ch.getSelectedFile();
        ImageIcon img=new ImageIcon(new ImageIcon(""+f2).getImage().getScaledInstance(ph.getWidth(), ph.getHeight(),Image.SCALE_DEFAULT));
        aad_ph.setIcon(img);
    }//GEN-LAST:event_aad_btActionPerformed

    private void col_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_col_tfFocusGained
        regfg(col_tf);
    }//GEN-LAST:event_col_tfFocusGained

    private void col_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_col_tfFocusLost
        // TODO add your handling code here:

        regfl(col_tf);
    }//GEN-LAST:event_col_tfFocusLost

    private void col_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_col_tfKeyTyped
        regkt(evt,col_tf);
    }//GEN-LAST:event_col_tfKeyTyped

    private void per_taFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per_taFocusGained
        // TODO add your handling code here:
        tafg(per_ta);
    }//GEN-LAST:event_per_taFocusGained

    private void per_taFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per_taFocusLost

        tafl(per_ta);  
    }//GEN-LAST:event_per_taFocusLost

    private void per_taKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_per_taKeyTyped
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
        if((evt.getKeyChar()==' '||evt.getKeyChar()=='.'||evt.getKeyChar()==9) && per_ta.getCaretPosition()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_per_taKeyTyped

    private void add_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_rbActionPerformed

        if(add_rb.isSelected() ){
            cor_ta.setForeground(Color.BLACK);
            cor_ta.setBorder(new LineBorder(Color.black));
            cor_ta.setEditable(false);
            if( per_ta.getText().length()>0&& (!per_ta.getText().equals("*Field is mandatory!"))){

                cor_ta.setText(""+per_ta.getText().trim());
            }
        }
        else {
            cor_ta.setEditable(true);
            cor_ta.setText("");
        }

    }//GEN-LAST:event_add_rbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cor_taKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cor_taKeyTyped
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
        if(!(ch>=65&& ch<=90 || ch>=97 && ch<=122 || ch==' '||ch>='0'&& ch<='9'||ch=='.'||ch==8)||ch=='-')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_cor_taKeyTyped

    private void dis_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dis_tfFocusGained
        // TODO add your handling code here:
        regfg(dis_tf);
    }//GEN-LAST:event_dis_tfFocusGained

    private void dis_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dis_tfFocusLost
        regfl(dis_tf);
    }//GEN-LAST:event_dis_tfFocusLost

    private void dis_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dis_tfKeyTyped
        regkt(evt,dis_tf);
    }//GEN-LAST:event_dis_tfKeyTyped

    private void sub_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btActionPerformed
//        if(dob.getDate()==null){
//            dob_lb.setForeground(Color.red);
//            dob_lb.setText("*Field is mandatory!");
//        }
        valchk();
        chk=true;
     if(nam_tf.getText().equals("*Field is mandatory!")||fat_tf.getText().equals("*Field is mandatory!")||mot_tf.getText().equals("*Field is mandatory!")||con_tf.getText().equals("*Field is mandatory!")||col_tf.getText().equals("*Field is mandatory!")||cor_ta.getText().equals("*Field is mandatory!")||mot_tf.getText().equals("*Field is mandatory!")||con_tf.getText().equals("*Field is mandatory!")||col_tf.getText().equals("*Field is mandatory!")||per_ta.getText().equals("*Field is mandatory!")||dis_tf.getText().equals("*Field is mandatory!")||pro_cb.getSelectedIndex()==0||dob.getDate()==null||f1==null)
         chk=false;
     else if(nam_tf.getText().isEmpty()||fat_tf.getText().isEmpty()||mot_tf.getText().isEmpty()||con_tf.getText().isEmpty()||col_tf.getText().isEmpty()||per_ta.getText().isEmpty()||dis_tf.getText().isEmpty()||cor_ta.getText().isEmpty()||con_tf.getText().length()<10){
         chk=false;   
     }
     
    if(chk){
           try {
            String gen;
            smt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            smt.setString(1, reg_tf.getText().toUpperCase());
            Calendar c=dat.getCalendar();
            String dt=""+c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR);
            smt.setString(2, dt);
            smt.setString(3, nam_tf.getText().toUpperCase());
            smt.setString(4, fat_tf.getText().toUpperCase());
            smt.setString(5, mot_tf.getText().toUpperCase());
            Calendar d=dob.getCalendar();
            String dtt=d.get(Calendar.DATE)+"-"+(d.get(Calendar.MONTH)+1)+"-"+d.get(Calendar.YEAR);
            smt.setString(6,dtt);
            smt.setString(7, ema_tf.getText().toUpperCase());
            smt.setString(8,con_tf.getText().toUpperCase());
            smt.setString(9, ""+pro_cb.getSelectedItem());
            smt.setString(10,""+ blo_cb.getSelectedItem());
            smt.setString(11, col_tf.getText().toUpperCase());
            if(mal_rb.isSelected())
            gen="Male";
            else if(fem_rb.isSelected())
            gen="Female";
            else
            gen="Binary";
            smt.setString(12,gen.toUpperCase());
            smt.setString(13, per_ta.getText().toUpperCase());
            smt.setString(14, dis_tf.getText().toUpperCase());
            smt.setString(15, ""+sta_cb.getSelectedItem());
            FileInputStream fin;
            if(f1==null)
                JOptionPane.showMessageDialog(this,"Photo required");
            else
            {
                 fin=new FileInputStream(f1);
                 smt.setBinaryStream(16,fin,fin.available());
            }
            if(f2==null)
                smt.setBinaryStream(17,null);
            else
            {
                fin=new FileInputStream(f2);
                smt.setBinaryStream(17,fin,fin.available());
            }
            smt.setString(18, cor_ta.getText());
            smt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Inserted Successfully!");
            reg_no++;
            autogen();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Something went Wrong!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrationEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else
        JOptionPane.showMessageDialog(this, "Please fill all the mandatory fields!");
    }//GEN-LAST:event_sub_btActionPerformed

    private void res_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res_btActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_res_btActionPerformed

    private void pro_cbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_cbFocusGained
       cbfg(pro_cb);
    }//GEN-LAST:event_pro_cbFocusGained

    private void pro_cbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pro_cbFocusLost
        // TODO add your handling code here:
//        if(pro_cb.getSelectedIndex()==0) {
//            pro_cb.setBorder(new LineBorder(Color.red));
//        }
        cbfl(pro_cb);
    }//GEN-LAST:event_pro_cbFocusLost

    private void datFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datFocusLost
        // TODO add your handling code here:
        boolean dt=dat.getDateFormatString().equals("DD/MM/YYY");
        if(dt)
        dat.setBorder(BorderFactory.createBevelBorder(4));
    }//GEN-LAST:event_datFocusLost

    
    private void nam_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nam_tfFocusGained
        regfg(nam_tf);

    }//GEN-LAST:event_nam_tfFocusGained

    private void nam_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nam_tfFocusLost
        regfl(nam_tf);
    }//GEN-LAST:event_nam_tfFocusLost

    private void nam_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nam_tfKeyTyped
        regkt(evt,nam_tf);
    }//GEN-LAST:event_nam_tfKeyTyped

    private void tabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tabFocusGained

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        tab.setBackground(Color.red);
    }//GEN-LAST:event_tabMouseClicked

    private void reg_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_cbActionPerformed
        
        url="select * from registration where ";
        if(reg_cb.getSelectedIndex()==3)
        {
            ser_tf.setVisible(false);
            ser_cb.setVisible(true);
            ser_cb.requestFocus();
            url=url+"upper(BLOOD_GRP)=?";
        }   
        else if(reg_cb.getSelectedIndex()==4)
        {
            ser_tf.setVisible(false);
            ser_cb.setVisible(true);
            ser_cb.requestFocus();
            url=url+"upper(PROG)=?";
        }
        else
        {
            ser_tf.requestFocus();
            ser_tf.setVisible(true);
            ser_cb.setVisible(false);
            if(reg_cb.getSelectedIndex()==0)
                 url=url+"upper(REG_NO)=?";
            else if(reg_cb.getSelectedIndex()==1)
                 url=url+"upper(SNAME)=?";
            else if(reg_cb.getSelectedIndex()==2)
                 url=url+"upper(CONT_NO)=?";
            else
                 url=url+"upper(CLG_NAME)=?";
        }
    }//GEN-LAST:event_reg_cbActionPerformed

    private void pho_btFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pho_btFocusGained
        // TODO add your handling code here:
        pho_bt.setBackground(new java.awt.Color(42,180,118));
    }//GEN-LAST:event_pho_btFocusGained

    private void pho_btFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pho_btFocusLost
        // TODO add your handling code here:
        pho_bt.setBackground(new java.awt.Color(0,116,226));
    }//GEN-LAST:event_pho_btFocusLost

    private void aad_btFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aad_btFocusLost
        // TODO add your handling code here:
        aad_bt.setBackground(new java.awt.Color(0,116,226));
    }//GEN-LAST:event_aad_btFocusLost

    private void aad_btFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aad_btFocusGained
        // TODO add your handling code here:
         aad_bt.setBackground(new java.awt.Color(42,180,118));
    }//GEN-LAST:event_aad_btFocusGained

    private void sub_btFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sub_btFocusGained
        // TODO add your handling code here:
         sub_bt.setBackground(new java.awt.Color(42,180,118));
    }//GEN-LAST:event_sub_btFocusGained

    private void sub_btFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sub_btFocusLost
        // TODO add your handling code here:
        sub_bt.setBackground(new java.awt.Color(0,116,226));
    }//GEN-LAST:event_sub_btFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(chk){
            try {
                   // TODO add your handling code here:
                smt=con.prepareStatement("update automatic set reg_no=?");
                   smt.setInt(1, reg_no-1);
                smt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationEntryForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_formWindowClosing

    private void cor_taFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_taFocusGained
        // TODO add your handling code here:
         tafg(cor_ta);
    }//GEN-LAST:event_cor_taFocusGained

    private void cor_taFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cor_taFocusLost
        // TODO add your handling code here:
        tafl(cor_ta);
    }//GEN-LAST:event_cor_taFocusLost

    private void dobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusGained
        // TODO add your handling code here:
        dob_lb.setText("");
    }//GEN-LAST:event_dobFocusGained

    private void ser_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_btActionPerformed
            System.out.println(url);
        try {
            smt=con.prepareStatement(url);
            if(ser_cb.isVisible())
                smt.setString(1,ser_cb.getSelectedItem().toString().toUpperCase());
            else
                smt.setString(1,ser_tf.getText().toUpperCase());
            rs=smt.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            while(rs.next())
                model.addRow(new Object[]{rs.getString(1),rs.getString(3),rs.getString(4),false});
                
        } catch (SQLException ex) {
            Logger.getLogger(regEntryFormTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ser_btActionPerformed

    
    private void ser_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ser_cbActionPerformed
//    public void final_check(){
//        nam_tfFocusLost(java.awt.event.FocusEvent evt);
//    }
    /**
     * @param args the command line arguments
     */
     public void regkt(KeyEvent e,JTextField c)
    {
        char ch=e.getKeyChar();
        if((e.getKeyChar()==' '||e.getKeyChar()=='.')&& c.getCaretPosition()==0)
        {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(!(ch>=65&& ch<=90 || ch>=97 && ch<=122 || ch==' '||ch=='.'||ch==8))
        {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    public void valchk(){
        regfl(nam_tf);
        regfl(fat_tf);
        regfl(mot_tf);
        regfl(col_tf);
        regfl(dis_tf);
        regfl(con_tf);
        tafl(cor_ta);
        tafl(per_ta);
        cbfl(pro_cb);
    }
    public void regfg(JTextField fg){
          String str=fg.getText();
        if(str.equals("*Field is mandatory!")||str.isEmpty())
        {
            fg.setForeground(Color.black);
            fg.setText("");
            fg.setBorder(new LineBorder(Color.black));
        }
        else if(fg.equals(con_tf)){
             fg.setForeground(Color.black);
            fg.setBorder(new LineBorder(Color.black));
            con_lb.setText("");
          }
    }
    public void regfl(JTextField fl){
        
        if(fl.getText().length()==0)
        {
            fl.setForeground(Color.red);
            fl.setText("*Field is mandatory!");
            fl.setBorder(new LineBorder(Color.red));
            Toolkit.getDefaultToolkit().beep();
        }
        else if(fl.equals(con_tf)){
            if(fl.getText().length()<10){
             con_lb.setText("*contact no. must be 10 digits!");
             con_tf.setBorder(new LineBorder(Color.red));
            }   
          }
    }
    public void tafg(JTextArea tfg){
         String str=tfg.getText();
        if(str.equals("*Field is mandatory!")||str.isEmpty())
        {
            tfg.setForeground(Color.black);
            tfg.setText("");
            tfg.setBorder(new LineBorder(Color.black));
        } 
       
    }
    public void tafl(JTextArea tfl){
        String str=tfl.getText();
        if(str.trim().length()==0)
        {
            tfl.setForeground(Color.red);
            tfl.setText("*Field is mandatory!");
            tfl.setBorder(new LineBorder(Color.red));
            Toolkit.getDefaultToolkit().beep();
        }
    }
    public void cbfl(JComboBox cbl){
        if(cbl.getSelectedIndex()==0) {
            cbl.setBorder(new LineBorder(Color.red));
        }
    }
    public void cbfg(JComboBox cbfg){
        cbfg.setBorder(new LineBorder(Color.black));
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
            java.util.logging.Logger.getLogger(regEntryFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regEntryFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regEntryFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regEntryFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new regEntryFormTest().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(regEntryFormTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aad_bt;
    private javax.swing.JLabel aad_ph;
    private javax.swing.JRadioButton add_rb;
    private javax.swing.JRadioButton bin_rb;
    private javax.swing.JComboBox<String> blo_cb;
    private javax.swing.JTextField col_tf;
    private javax.swing.JLabel con_lb;
    private javax.swing.JTextField con_tf;
    private javax.swing.JTextArea cor_ta;
    private com.toedter.calendar.JDateChooser dat;
    private javax.swing.JTextField dis_tf;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel dob_lb;
    private javax.swing.JTextField ema_tf;
    private javax.swing.JTextField fat_tf;
    private javax.swing.JRadioButton fem_rb;
    private javax.swing.JLabel gen_rb;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JRadioButton mal_rb;
    private javax.swing.JTextField mot_tf;
    private javax.swing.JTextField nam_tf;
    private javax.swing.JTextArea per_ta;
    private javax.swing.JLabel ph;
    private javax.swing.JButton pho_bt;
    private javax.swing.JComboBox<String> pro_cb;
    private javax.swing.JComboBox<String> reg_cb;
    private javax.swing.JTextField reg_tf;
    private javax.swing.JButton res_bt;
    private javax.swing.JButton ser_bt;
    private javax.swing.JComboBox<String> ser_cb;
    private org.jdesktop.swingx.JXSearchField ser_tf;
    private javax.swing.JComboBox<String> sta_cb;
    private javax.swing.JButton sub_bt;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
