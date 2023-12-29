package raysproject;

import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class backdata {
     static Label l;
     public static void backup(String s) throws SQLException, WriteException{
         PreparedStatement stmt;
         Connection con=ConnDb.conLink();
         ResultSet rs;
         Blob b;
//         backup of certificate
                File f1=new File("RaysBackup");
                File f2=new File("RaysBackup\\"+s+".xls");
                f1.mkdirs();
                f2.setWritable(true);
                WritableWorkbook myxl;
        try {
            myxl = Workbook.createWorkbook(f2);
               WritableSheet mysheet=myxl.createSheet("mysheet", 0);
                if(s.equals("automatic"))
                    stmt=con.prepareStatement("select * from automatic");
                else
                    stmt=con.prepareStatement("select * from "+s);
                    rs=stmt.executeQuery();
                    byte i,j=0;
                    ResultSetMetaData rsmd=rs.getMetaData();
                    for(i=0;i<rsmd.getColumnCount();i++){
                    l=new Label(i,0,rsmd.getColumnName(i+1)); 
                    mysheet.addCell(l);
                    }
                    while(rs.next())
                     {
                         ++j;
//                         System.out.println(rsmd.getColumnCount());
                        for(i=0;i<rsmd.getColumnCount();i++){
//                            System.out.println(rsmd.getColumnName(i+1));
                            if(rsmd.getColumnName(i+1).equalsIgnoreCase("sphoto"))
                            {
                                 b=rs.getBlob(16);
                                 if(b!=null){
                                  byte []pic=b.getBytes(1,(int)b.length());
                                  l=new Label(i,j,""+pic);
                                }
                            }
                            else if(rsmd.getColumnName(i+1).equalsIgnoreCase("aadhar"))
                            {
                                 b=rs.getBlob(17);
                                 if(b!=null){
                                  byte []pic=b.getBytes(1,(int)b.length());
                                  l=new Label(i,j,""+pic);
                                }
                                else
                                     l=new Label(i,j,"");
                            }    
                            else
                                l=new Label(i,j,rs.getString(i+1));
                            mysheet.addCell(l);
//                              System.out.println("htdr");
                        }
                    }
                    myxl.write();
                    myxl.close();
                    f2.setReadOnly();
                    System.out.println("backup complete!");
        } catch (IOException ex) {
            Logger.getLogger(regEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
}
