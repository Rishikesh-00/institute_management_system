
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class MONEYRECEIPT extends javax.swing.JFrame {
    String str,dt,a,b,reg_no,url;
    DefaultTableModel model;
    Calendar c1,c;
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    Label l;
    int ctr = 0,dot=0;
    int ano;
    boolean flag;
    public MONEYRECEIPT() throws SQLException {     
        initComponents();
        pan.setVisible(false);
        cur_cb1.setSelectedIndex(0);
        url="select * from money_receipt where upper(recpt_no)=?";
//        tabl.setVisible(false);
        CAS.setEnabled(false);
        UPI.setEnabled(false);
        CHE.setEnabled(false);
        DD.setEnabled(false);       
        Calendar dd=Calendar.getInstance();
        ins_dat.setMinSelectableDate(dd.getTime());
        //word_lb.setVisible(false);
        con=ConnDb.conLink();
       // upi.setSelected(true);
        setTitle("MoneyReceipt");
          Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icon/repl_logo_(1)-small.png"));
        this.setIconImage(icon);
        ins_dat.setDate(new java.sql.Date(System.currentTimeMillis()));
        cur_dat.setDate(new java.sql.Date(System.currentTimeMillis()));
        this.getRootPane().setDefaultButton(sub_bt);
        this.setLocationRelativeTo(null);
        for_tf.requestFocus();
        //*************autogenerate for recpt_no*************
       stmt=con.prepareStatement("select  recpt_no,ch from automatic");
       rs=stmt.executeQuery();
       rs.next();
       ano=rs.getInt(1)+1;
       //*************get current year of system*************
       Calendar c=cur_dat.getCalendar();
       dt=""+c.get(Calendar.YEAR)%100;
       stmt=con.prepareStatement("select max(recpt_no) from money_receipt");
       rs=stmt.executeQuery();
       if(rs.next())
           if(Integer.parseInt(dt)>(rs.getInt(1)/100000))
                ano=1;
       auto();
    }
       void auto() throws SQLException{
        stmt=con.prepareStatement("select recpt_no from money_receipt");
        rs=stmt.executeQuery();
       // String s=stmt;
        if(ano<10)
           str=dt+"0000"+ano;
        else if(ano<100)
           str=dt+"000"+ano;
        else if(ano<1000)
           str=dt+"00"+ano;
        else if(ano<10000)
           str=dt+"0"+ano;
        else if(ano<100000)
           str=dt+""+ano;
        else{
           auto();
       }
        rec_no.setText(str);
       }
        void RedBorder(){
            flreceipt(amo_tf);
            flreceipt(rec_tf);
            flreceipt(for_tf);
//            flreceipt(CAS);
//            flreceipt(UPI);
//            flreceipt(CHE);
//            flreceipt(DD);
           
        }
        public void empty(){
            flag =true;
            if(CAS.getText().isEmpty())
                flag=false;
             else if(UPI.getText().isEmpty())
                 flag=false;
             else if(CHE.getText().isEmpty())
                 flag=false;
             else if(DD.getText().isEmpty())
                 flag=false;
        }
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rec_tf = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        due_tf = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        sub_bt = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        for_tf = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        res_bt = new javax.swing.JButton();
        per_dues = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        tot_tf = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        nam_tf = new javax.swing.JTextField();
        cor_tf = new javax.swing.JTextField();
        amo_tf = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        cas = new javax.swing.JCheckBox();
        upi = new javax.swing.JCheckBox();
        che = new javax.swing.JCheckBox();
        dd = new javax.swing.JCheckBox();
        ins_dat = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        word_tf = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fee_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        disc_tf = new javax.swing.JTextField();
        UPI = new javax.swing.JTextField();
        CAS = new javax.swing.JTextField();
        CHE = new javax.swing.JTextField();
        DD = new javax.swing.JTextField();
        cur_dat = new com.toedter.calendar.JDateChooser();
        rec_no = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ref_bt = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        upd_bt = new javax.swing.JButton();
        cur_cb1 = new javax.swing.JComboBox<>();
        ser_tf = new org.jdesktop.swingx.JXSearchField();
        pan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(49, 183, 194));
        kGradientPanel1.setkStartColor(new java.awt.Color(123, 195, 147));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(56, 78, 120));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MONEY RECEIPT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel13)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Receipt No");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 29));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Date");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 50, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rec_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rec_tf.setNextFocusableComponent(sub_bt);
        rec_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rec_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rec_tfFocusLost(evt);
            }
        });
        rec_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rec_tfKeyTyped(evt);
            }
        });
        jPanel6.add(rec_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 230, 30));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel68.setText("Installment Date");
        jPanel6.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, 29));

        due_tf.setEditable(false);
        due_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(due_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 31));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel62.setText("Payable Amount");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 29));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel64.setText("Amount In Word");
        jPanel6.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 137, 29));

        sub_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sub_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/submit (1).png"))); // NOI18N
        sub_bt.setText("SUBMIT");
        sub_bt.setBorder(null);
        sub_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sub_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_btActionPerformed(evt);
            }
        });
        jPanel6.add(sub_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 130, 40));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel59.setText("Form No.");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 29));

        for_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        for_tf.setNextFocusableComponent(CAS);
        for_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                for_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                for_tfFocusLost(evt);
            }
        });
        for_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for_tfActionPerformed(evt);
            }
        });
        for_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                for_tfKeyTyped(evt);
            }
        });
        jPanel6.add(for_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 230, 31));
        jPanel6.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 167, 800, -1));

        res_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        res_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh (1).png"))); // NOI18N
        res_bt.setText("REFRESH");
        res_bt.setBorder(null);
        res_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        res_bt.setNextFocusableComponent(amo_tf);
        res_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                res_btActionPerformed(evt);
            }
        });
        jPanel6.add(res_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 120, 40));

        per_dues.setEditable(false);
        per_dues.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(per_dues, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 230, 31));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel63.setText("Pre Dues Amount");
        jPanel6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 130, 29));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel60.setText("Name");
        jPanel6.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 29));

        tot_tf.setEditable(false);
        tot_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(tot_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, 31));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel69.setText("Recived From");
        jPanel6.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel65.setText("Dues Amount");
        jPanel6.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, 29));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel67.setText("Paid amount");
        jPanel6.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, 29));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel61.setText("Course Applied");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 137, 29));

        nam_tf.setEditable(false);
        nam_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(nam_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 31));

        cor_tf.setEditable(false);
        cor_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(cor_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 230, 31));

        amo_tf.setEditable(false);
        amo_tf.setText("0");
        amo_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(amo_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 230, 30));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel66.setText("Payment Mode");
        jPanel6.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 20));

        cas.setText("Cash");
        cas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cas.setNextFocusableComponent(rec_tf);
        cas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casActionPerformed(evt);
            }
        });
        jPanel6.add(cas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        upi.setText("UPI");
        upi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upiActionPerformed(evt);
            }
        });
        jPanel6.add(upi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 177, 50, 30));

        che.setText("Cheque");
        che.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        che.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        che.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheActionPerformed(evt);
            }
        });
        jPanel6.add(che, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 217, 70, 30));

        dd.setText("DD");
        dd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });
        jPanel6.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 217, 50, 30));

        ins_dat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ins_dat.setMaxSelectableDate(new java.util.Date(253370748691000L));
        ins_dat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ins_datFocusLost(evt);
            }
        });
        jPanel6.add(ins_dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("*");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 214, 20, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("*");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 20, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("*");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 20, -1));
        jPanel6.add(word_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Fee");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        fee_tf.setEditable(false);
        fee_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fee_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_tfActionPerformed(evt);
            }
        });
        jPanel6.add(fee_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Discount");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, 30));

        disc_tf.setEditable(false);
        disc_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(disc_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 230, 30));

        UPI.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UPI.setText("0");
        UPI.setNextFocusableComponent(rec_tf);
        UPI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPIFocusGained(evt);
            }
        });
        UPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UPIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UPIKeyTyped(evt);
            }
        });
        jPanel6.add(UPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 60, 30));

        CAS.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CAS.setText("0");
        CAS.setNextFocusableComponent(rec_tf);
        CAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CASFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CASFocusLost(evt);
            }
        });
        CAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CASKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CASKeyTyped(evt);
            }
        });
        jPanel6.add(CAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 60, 30));

        CHE.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CHE.setText("0");
        CHE.setNextFocusableComponent(rec_tf);
        CHE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CHEFocusGained(evt);
            }
        });
        CHE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CHEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CHEKeyTyped(evt);
            }
        });
        jPanel6.add(CHE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 60, 30));

        DD.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DD.setText("0");
        DD.setNextFocusableComponent(rec_tf);
        DD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DDFocusGained(evt);
            }
        });
        DD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DDKeyTyped(evt);
            }
        });
        jPanel6.add(DD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 60, 30));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 800, 370));

        cur_dat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cur_dat.setDateFormatString("d,MMM,y");
        cur_dat.setFocusCycleRoot(true);
        kGradientPanel1.add(cur_dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 160, 30));

        rec_no.setEditable(false);
        rec_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rec_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(rec_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 190, 30));

        tab.addTab("MoneyEntryForm", kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(49, 183, 194));
        kGradientPanel2.setkStartColor(new java.awt.Color(123, 195, 147));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(56, 78, 120));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(" Receipt ServiceForm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        kGradientPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        ref_bt.setBackground(new java.awt.Color(102, 255, 255));
        ref_bt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ref_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh (1).png"))); // NOI18N
        ref_bt.setText("Refresh");
        ref_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ref_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_btActionPerformed(evt);
            }
        });
        kGradientPanel2.add(ref_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 100, 30));

        Search.setBackground(new java.awt.Color(0, 153, 255));
        Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon-png-9964 (1).png"))); // NOI18N
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 100, 31));

        upd_bt.setBackground(new java.awt.Color(0, 204, 204));
        upd_bt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        upd_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/update (1).png"))); // NOI18N
        upd_bt.setText("UPDATE");
        upd_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_btActionPerformed(evt);
            }
        });
        kGradientPanel2.add(upd_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 100, 30));

        cur_cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receipt No","Form No." }));
        cur_cb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cur_cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cur_cb1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(cur_cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 192, 31));

        ser_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ser_tfKeyTyped(evt);
            }
        });
        kGradientPanel2.add(ser_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 30));

        pan.setBackground(new java.awt.Color(255, 255, 255));
        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recpt_No", "Rdate", "AForm_No", "Cas", "Upi", "Cheque", "DD", "Dues Amt", "Ins_Date", "Rece_ From", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
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

        pan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 310));

        kGradientPanel2.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 870, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tab.addTab("ServiceForm", jPanel1);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 880, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void res_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_res_btActionPerformed
      reset();  
      sub_bt.setEnabled(true);
    }//GEN-LAST:event_res_btActionPerformed

    private void rec_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rec_tfFocusLost
       
        flreceipt(rec_tf);
    }//GEN-LAST:event_rec_tfFocusLost

    private void rec_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rec_tfFocusGained

        fgreceipt(rec_tf);
    }//GEN-LAST:event_rec_tfFocusGained

    private void rec_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rec_tfKeyTyped
       
         char ch=evt.getKeyChar();
         if(evt.getKeyChar()==' '&& rec_tf.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(!(ch>='a'&& ch<='z'|| ch==8||ch==' '||ch>='A'&& ch<='Z'||ch=='.')){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(((ch>=65 && ch<=90)|| (ch>=97 && ch<=122))||ch==8) {
            dot=0;
            ctr=0;
            if(ch==' ')
                 dot=0;
            else if(ch=='.')
             ctr=0;
            
        }
        else if(((evt.getKeyChar()==' ')&& ctr==0))
            ctr=1;
         else if(evt.getKeyChar()=='.'&&dot==0)
            dot=1;
        else {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_rec_tfKeyTyped

    private void ins_datFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ins_datFocusLost
        dt=ins_dat.getDateFormatString();
        if(dt.isEmpty()){
        ins_dat.setBorder(new LineBorder(Color.red));
        ins_dat.setForeground(Color.red);
        }
    }//GEN-LAST:event_ins_datFocusLost

    private void sub_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_btActionPerformed
  
        RedBorder();       
        flag=true;
        if (amo_tf.getText().isEmpty() || rec_tf.getText().isEmpty()|| for_tf.getText().isEmpty()|| for_tf.getText().length()==0) {
            flag=false;
        }
          else if (amo_tf.getText().equals("*Field is mandatory!") || rec_tf.getText().equals("*Field is mandatory!")|| for_tf.getText().equals("*Field is mandatory!")) {
              flag=false;
         }
            byte r=(byte) JOptionPane.showConfirmDialog(null,"DO U WANT TO SUBMIT THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
         if(r==0){
            if(flag){
             try {
            
                    stmt=con.prepareStatement("insert into money_receipt values(?,?,?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1,rec_no.getText().toUpperCase());
                    SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yy");
                    String dt=f.format(cur_dat.getDate());
                    stmt.setString(2,dt);
                    stmt.setString(3,for_tf.getText().toUpperCase());
                    stmt.setString(4,CAS.getText().toUpperCase());
                    stmt.setString(5,UPI.getText().toUpperCase());
                    stmt.setString(6,CHE.getText().toUpperCase());
                    stmt.setString(7,DD.getText().toUpperCase());
                    stmt.setString(8,due_tf.getText().toUpperCase());                  
                    SimpleDateFormat g=new SimpleDateFormat("dd-MMM-yy");
                    String dtt=g.format(ins_dat.getDate());
                    stmt.setString(9,dtt);
                    stmt.setString(10,rec_tf.getText().toUpperCase());
                    stmt.setString(11, reg_no);
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Payment Successful!");
                    ano++;
                    sub_bt.setEnabled(false);
                    backdata.backup("money_receipt");
                    backdata.backup("automatic");
                     //*********************Update automatic receipt no****************
                    stmt=con.prepareStatement("update automatic set  recpt_no=?");
                    stmt.setInt(1, ano-1);
                    stmt.executeUpdate();
                     String data[]={rec_no.getText(),dt,for_tf.getText(),cor_tf.getText(),nam_tf.getText(),per_dues.getText(),fee_tf.getText(),disc_tf.getText(),tot_tf.getText(),dtt,CAS.getText(),UPI.getText(),CHE.getText(),DD.getText(),due_tf.getText(),rec_tf.getText(),word_tf.getText(),amo_tf.getText()};
 
                   new ReceiptInvoice(data).setVisible(true);

                    auto();
  
                }    catch (SQLException ex) {
         
            }   catch (WriteException ex) {
                    Logger.getLogger(MONEYRECEIPT.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
              else
                JOptionPane.showMessageDialog(null, "*please fill all the mandatory fields!");
         }                
    }//GEN-LAST:event_sub_btActionPerformed

    private void for_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_for_tfFocusGained
 
        fgreceipt(for_tf);
    }//GEN-LAST:event_for_tfFocusGained

    private void for_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_for_tfFocusLost
       if(!(for_tf.getText().isEmpty()))
        try {
            stmt=con.prepareStatement("select reg_no,cou_apply,fee,dis from admission where adm_no=?");
            stmt.setString(1,for_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                reg_no=rs.getString(1);
                cor_tf.setText(rs.getString(2).toUpperCase());
                fee_tf.setText(rs.getString(3));
                disc_tf.setText(rs.getString(4));
                stmt=con.prepareStatement("select sname from registration where reg_no=?");
                stmt.setString(1,rs.getString(1));
                ResultSet rs1=stmt.executeQuery();
                if(rs1.next())
                      nam_tf.setText(rs1.getString(1).toUpperCase());
                stmt=con.prepareStatement("select dues_amt,aform_no from money_receipt where aform_no=(select max(aform_no) from money_receipt where reg_no=?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                stmt.setString(1,rs.getString(1));
                rs1=stmt.executeQuery();
//                System.out.println(rs1.last());
                if(rs1.last())
                {
                    per_dues.setText(rs1.getString(1));
                    if(for_tf.getText().equalsIgnoreCase(rs1.getString(2)))
                     tot_tf.setText(per_dues.getText());
                    else
                     tot_tf.setText(""+(Integer.parseInt(fee_tf.getText())-Integer.parseInt(disc_tf.getText())+Integer.parseInt(per_dues.getText()))); 
//                    
                } 
                else
                {
                    per_dues.setText("0");
                    tot_tf.setText(""+(Integer.parseInt(fee_tf.getText())-Integer.parseInt(disc_tf.getText())+Integer.parseInt(per_dues.getText()))); 
                }    
               
            }
            else
               JOptionPane.showMessageDialog(this,"No record found");
        } catch (SQLException ex) {
            System.out.println("Unsuccess");
           }
         flreceipt(for_tf);
    }//GEN-LAST:event_for_tfFocusLost
    
    private void for_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_for_tfKeyTyped
         char ch=evt.getKeyChar();
          if(evt.getKeyChar()=='0'&& for_tf.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(for_tf.getText().length()>=6)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(!(ch>='a'&& ch<='z'|| ch==8||ch>='A'&& ch<='Z'||ch>='0'&& ch<='9'))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
         if(for_tf.getText().length()==0){
            nam_tf.setText("");
            cor_tf.setText("");
            per_dues.setText("");
            tot_tf.setText("");
         }
    }//GEN-LAST:event_for_tfKeyTyped

    private void casActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casActionPerformed
        // TODO add your handling code here
        if(cas.isSelected()) 
        CAS.setEnabled(true);
        else{
            CAS.setText("");
            CAS.setEnabled(false);
        }
         CAS.requestFocus();
            
    }//GEN-LAST:event_casActionPerformed

    private void upiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upiActionPerformed
        if(upi.isSelected())
        UPI.setEnabled(true);
        else{
            UPI.setText("");
            UPI.setEnabled(false);
        }
          UPI.requestFocus();
    }//GEN-LAST:event_upiActionPerformed

    private void cheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheActionPerformed
        if(che.isSelected())
        CHE.setEnabled(true);
        else{
            CHE.setText("");
            CHE.setEnabled(false);
        }
        CHE.requestFocus();
            
    }//GEN-LAST:event_cheActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed
        if(dd.isSelected())
        DD.setEnabled(true);
        else{
             DD.setText("");
            DD.setEnabled(false);
        }
          DD.requestFocus();
    }//GEN-LAST:event_ddActionPerformed

    private void CASKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CASKeyTyped
         char ch=evt.getKeyChar();
         if(evt.getKeyChar()=='0'&& CAS.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(!(ch>='0'&& ch<='9'|| ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(CAS.getText().length()==0){
            CAS.setText("");
        }
    }//GEN-LAST:event_CASKeyTyped

    private void UPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UPIKeyTyped
         char ch=evt.getKeyChar();
         if(evt.getKeyChar()=='0'&& UPI.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(!(ch>='0'&& ch<='9'|| ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(UPI.getText().length()==0){
            UPI.setText("");
        }
    }//GEN-LAST:event_UPIKeyTyped

    private void CHEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CHEKeyTyped
       char ch=evt.getKeyChar();
         if(evt.getKeyChar()=='0'&& CHE.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(!(ch>='0'&& ch<='9'|| ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(CHE.getText().length()==0){
            CHE.setText("");
        }
    }//GEN-LAST:event_CHEKeyTyped

    private void DDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DDKeyTyped

          
          char ch=evt.getKeyChar();
         if(evt.getKeyChar()=='0'&& DD.getCaretPosition()==0)
         {
             evt.consume();
             Toolkit.getDefaultToolkit().beep();
         }
        if(!(ch>='0'&& ch<='9'|| ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(DD.getText().length()==0){
           DD.setText("");
        }
    }//GEN-LAST:event_DDKeyTyped

    private void CASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CASFocusGained
        fgreceipt(CAS);
           
    }//GEN-LAST:event_CASFocusGained

    private void UPIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPIFocusGained
        fgreceipt(UPI);
           
    }//GEN-LAST:event_UPIFocusGained

    private void CHEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CHEFocusGained
         fgreceipt(CHE);
           
    }//GEN-LAST:event_CHEFocusGained

    private void DDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DDFocusGained
         fgreceipt(DD);
    }//GEN-LAST:event_DDFocusGained

    private void CASFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CASFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_CASFocusLost
    public void cal(String s){
        if(s.length()!=0)
        {  
            amo_tf.setText(""+(Integer.parseInt(CAS.getText())+Integer.parseInt(CHE.getText())+Integer.parseInt(DD.getText())+Integer.parseInt(UPI.getText())));
            due_tf.setText(""+(Integer.parseInt(tot_tf.getText())-Integer.parseInt(amo_tf.getText())));
            word();
        }    
    }
    private void CASKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CASKeyReleased

        if(CAS.getText().length()==0) 
             CAS.setText("0");
        else if(CAS.getText().charAt(0)=='0')
            CAS.setText(CAS.getText().substring(1));
         cal(CAS.getText());    
    }//GEN-LAST:event_CASKeyReleased

    private void UPIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UPIKeyReleased
       if(UPI.getText().length()==0) 
             UPI.setText("0");
        else if(UPI.getText().charAt(0)=='0')
            UPI.setText(UPI.getText().substring(1));
         cal(UPI.getText());
    }//GEN-LAST:event_UPIKeyReleased

    private void CHEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CHEKeyReleased
       if(CHE.getText().length()==0) 
             CHE.setText("0");
        else if(CHE.getText().charAt(0)=='0')
            CHE.setText(CHE.getText().substring(1));
         cal(CHE.getText());
    }//GEN-LAST:event_CHEKeyReleased

    private void DDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DDKeyReleased
       if(DD.getText().length()==0) 
             DD.setText("0");
        else if(DD.getText().charAt(0)=='0')
            DD.setText(DD.getText().substring(1));
         cal(DD.getText());
    }//GEN-LAST:event_DDKeyReleased

    private void for_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_for_tfActionPerformed
        
    }//GEN-LAST:event_for_tfActionPerformed

    private void fee_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_tfActionPerformed
    }//GEN-LAST:event_fee_tfActionPerformed

    private void ref_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_btActionPerformed

        ser_tf.setText("");
        ser_tf.requestFocus();
        upd_bt.setVisible(false);
      
        // cur_cb.setSelectedIndex(0);
        model.setRowCount(0);

    }//GEN-LAST:event_ref_btActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
     try {
         stmt=con.prepareStatement(url);
         stmt.setString(1,ser_tf.getText().toUpperCase());
         rs=stmt.executeQuery();
          model=(DefaultTableModel)tabl.getModel();
          model.setRowCount(0);
            while(rs.next()){
                pan.setVisible(true);
                upd_bt.setVisible(true);
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),false});
             }
        } catch (SQLException ex) {
         System.out.println("Error 404 Not Found!");
     }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void upd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_btActionPerformed
            for(byte i=0;i<tabl.getRowCount();i++){
              if(model.getValueAt(i,10).equals(true)){
               byte a=(byte) JOptionPane.showConfirmDialog(this,"are you sure update recoard?");
                  if(a==0)
                  try {
                      stmt=con.prepareStatement("update money_receipt set rdate=?,aform_no=?,cash=?,upi=?,cheque=?,dd=?,dues_amt=?,ins_date=?,rec_from=? where recpt_no=?");
                      stmt.setString(10,model.getValueAt(i,0).toString().toUpperCase());
                      stmt.setString(1,model.getValueAt(i,1).toString().toUpperCase());
                      stmt.setString(2,model.getValueAt(i,2).toString().toUpperCase());
                      stmt.setString(3,model.getValueAt(i,3).toString().toUpperCase());
                      stmt.setString(4,model.getValueAt(i,4).toString().toUpperCase());
                      stmt.setString(5,model.getValueAt(i,5).toString().toUpperCase());
                      stmt.setString(6,model.getValueAt(i,6).toString().toUpperCase());
                      stmt.setString(7,model.getValueAt(i,7).toString().toUpperCase());
                      stmt.setString(8,model.getValueAt(i,8).toString().toUpperCase());
                      stmt.setString(9,model.getValueAt(i,9).toString().toUpperCase());
                      stmt.executeUpdate();
                      JOptionPane.showMessageDialog(this,"Recoard Updated sucessfully!");
                      backdata.backup("money_receipt");
                      backdata.backup("automatic");
                  } catch (SQLException ex) {
                      Logger.getLogger(CourseMdiForm.class.getName()).log(Level.SEVERE, null, ex);
                      JOptionPane.showMessageDialog(this,"Something Wrong in update_bt");
                  } catch (WriteException ex) {
                   Logger.getLogger(MONEYRECEIPT.class.getName()).log(Level.SEVERE, null, ex);
               }
              }
              
            }
    }//GEN-LAST:event_upd_btActionPerformed

    private void tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablMouseClicked
        for(byte i=0; i<tabl.getRowCount();i++){  
          if(model.getValueAt(i,10).equals(true)){
            tabl.addRowSelectionInterval(i,i);
            tabl.setSelectionBackground(Color.yellow);
            tabl.setSelectionForeground(Color.red); 
          }
          else
              tabl.removeRowSelectionInterval(i,i); 
        
         
    }   
        
    }//GEN-LAST:event_tablMouseClicked
    
    private void cur_cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cur_cb1ActionPerformed
        url="select * from Money_Receipt where ";
         ser_tf.requestFocus();
       
         if(cur_cb1.getSelectedIndex()==0)
                 url=url+"upper(RECPT_NO)=?";
            else 
                 url=url+"upper(AFORM_NO)=?";
    }//GEN-LAST:event_cur_cb1ActionPerformed

    private void ser_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_tfKeyTyped
         char ch=evt.getKeyChar();
        if(cur_cb1.getSelectedIndex()==0){         
             if(ser_tf.getText().length()==7)
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            if(!(ch==8 ||ch>='0'&& ch<='9'))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
        else if(cur_cb1.getSelectedIndex()==1){ 
            if(ser_tf.getText().length()==6)
            {
                 evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            else if(!(ch>='A'&& ch<='Z'||ch>='a'&&ch<='z'||ch==8 ||ch>='0'&& ch<='9'||ch==' '))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
         else if(ch==8||((ch>='a' && ch<='z' )|| (ch>='A'&& ch<='Z' )|| ch>='0'&& ch<='9'))
            ctr=0;
        else if(evt.getKeyChar()==' ' && ctr==0)
            ctr=1;
        else{
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        }
    }//GEN-LAST:event_ser_tfKeyTyped

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        // TODO add your handling code here:
         if(tab.getSelectedIndex()==0)
           this.getRootPane().setDefaultButton(sub_bt);
       else
           this.getRootPane().setDefaultButton(Search);
    }//GEN-LAST:event_tabMouseClicked

    /**
     * @param args the command line arguments
     */
    public void flreceipt(JTextField fl)
    {
        String str=fl.getText();
        if(str.length()==0){
            fl.setForeground(Color.red);
            fl.setText("*Field is mandatory!");
            fl.setBorder(new LineBorder(Color.RED));
            Toolkit.getDefaultToolkit().beep();
        } 
    }
    
    public void fgreceipt(JTextField fg)
    {
      String str=fg.getText();
        if(str.equals("*Field is mandatory!")||str.isEmpty()){
            fg.setForeground(Color.BLACK);
            fg.setBorder(new LineBorder(Color.black));
            fg.setText("");
            Toolkit.getDefaultToolkit().beep();
        }  
    }
   public void reset(){
      for_tf.requestFocus();
      amo_tf.setText("");
      amo_tf.setForeground(Color.black);
      amo_tf.setBorder(new LineBorder(Color.BLACK));
      rec_tf.setText("");
      rec_tf.setForeground(Color.BLACK);
      rec_tf.setBorder(new LineBorder(Color.BLACK));
      cur_dat.setDate(new java.sql.Date(System.currentTimeMillis()));
      ins_dat.setDate(new java.sql.Date(System.currentTimeMillis()));
      cas.setSelected(false);
      CAS.setText("0");
      dd.setSelected(false);
      DD.setText("0");
      che.setSelected(false);
      CHE.setText("0");
      UPI.setText("0");
      upi.setSelected(false);
      for_tf.setText("");
      for_tf.setForeground(Color.black);
      for_tf.setBorder(new LineBorder(Color.BLACK));
      cor_tf.setText("");
      nam_tf.setText("");
      per_dues.setText("");
      tot_tf.setText("");
      due_tf.setText("");
      word_tf.setText("");
      fee_tf.setText("");
      disc_tf.setText("");
      CAS.setEnabled(false);
      UPI.setEnabled(false);
      CHE.setEnabled(false);
      DD.setEnabled(false); 
      fgreceipt(CAS);
      fgreceipt(UPI);
      fgreceipt(CHE);
      fgreceipt(DD);
      
    }
    public void word(){
    String txt=amo_tf.getText();
    int num = 0;
    try {
    num = Integer.parseInt(txt);
    if (num == 0) {
        word_tf.setText("zero");
    } else {
    word_tf.setText("" + number_Word(num));
    }
    } catch (Exception e) {
    amo_tf.setText("Please Enter valid Number");
    }
    }  private static String number_Word(int num) {
    String words = "";
    String unitarr[] = { "zero", "one", "two", "three", "four", "five", "six", 
    "seven", "eight", "nine", "ten", "eleven", "twelve",
    "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
    "eighteen", "nineteen" };
    String tensarr[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
    "sixty", "seventy", "eighty", "ninety" };  
    if (num == 0) {
    return "zero";
    }
    if (num < 0) { 
    String numberStr = "" + num; 
    numberStr = numberStr.substring(1); 
     return "minus " + number_Word(Integer.parseInt(numberStr)); 
    } 
     if ((num / 1000) > 0) {
    words += number_Word(num / 1000) + " thousand ";
    num %= 1000;
    }
     if ((num / 100) > 0) {
    words += number_Word(num / 100) + " hundred ";
    num %= 100;
    }  if (num > 0) {
    if (num < 20) { 
     words += unitarr[num];
    } else { 
    words += tensarr[num / 10]; 
    if ((num % 10) > 0) {
    words += "-" + unitarr[num % 10];
    } 
    }
    }
    return words;
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
            java.util.logging.Logger.getLogger(MONEYRECEIPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MONEYRECEIPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MONEYRECEIPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MONEYRECEIPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MONEYRECEIPT().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MONEYRECEIPT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAS;
    private javax.swing.JTextField CHE;
    private javax.swing.JTextField DD;
    private javax.swing.JButton Search;
    private javax.swing.JTextField UPI;
    private javax.swing.JTextField amo_tf;
    private javax.swing.JCheckBox cas;
    private javax.swing.JCheckBox che;
    private javax.swing.JTextField cor_tf;
    private javax.swing.JComboBox<String> cur_cb1;
    private com.toedter.calendar.JDateChooser cur_dat;
    private javax.swing.JCheckBox dd;
    private javax.swing.JTextField disc_tf;
    private javax.swing.JTextField due_tf;
    private javax.swing.JTextField fee_tf;
    private javax.swing.JTextField for_tf;
    private com.toedter.calendar.JDateChooser ins_dat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField nam_tf;
    private javax.swing.JPanel pan;
    private javax.swing.JTextField per_dues;
    private javax.swing.JTextField rec_no;
    private javax.swing.JTextField rec_tf;
    private javax.swing.JButton ref_bt;
    private javax.swing.JButton res_bt;
    private org.jdesktop.swingx.JXSearchField ser_tf;
    private javax.swing.JButton sub_bt;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabl;
    private javax.swing.JTextField tot_tf;
    private javax.swing.JButton upd_bt;
    private javax.swing.JCheckBox upi;
    private javax.swing.JLabel word_tf;
    // End of variables declaration//GEN-END:variables
}
