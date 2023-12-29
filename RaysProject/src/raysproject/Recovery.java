package raysproject;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Recovery {
    public static void recmethod(String str) throws IOException, BiffException, SQLException{
        Connection con=ConnDb.conLink();
        
        PreparedStatement stmt=null;
        
        if(str.equalsIgnoreCase("registration")){
            stmt=con.prepareStatement("select * from registration");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
              stmt=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
         }
         
        else if(str.equalsIgnoreCase("certificate")){
              stmt=con.prepareStatement("select * from certificate");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
                 stmt=con.prepareStatement("insert into certificate values(?,?,?,?,?,?,?,?)");
         }
         
        else if(str.equalsIgnoreCase("admission")){
               stmt=con.prepareStatement("select * from admission");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
                stmt=con.prepareStatement("insert into admission values(?,?,?,?,?,?)");
         }
         
        else if(str.equalsIgnoreCase("Book_details")){
              stmt=con.prepareStatement("select * from book_details");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
                 stmt=con.prepareStatement("insert into book_details values(?,?,?,?,?,?,?,?)");
         }
         
        else if(str.equalsIgnoreCase("branch_details")){
                stmt=con.prepareStatement("select * from banch_details");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
                stmt=con.prepareStatement("insert into branch_details values(?,?,?,?,?,?,?,?)");
          }
          
        else if(str.equalsIgnoreCase("Course")){
              stmt=con.prepareStatement("select * from course");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
               stmt=con.prepareStatement("insert into course values(?,?,?,?)");
         }
           else if(str.equalsIgnoreCase("Money_receipt")){
        stmt=con.prepareStatement("select * from money_receipt");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
           stmt=con.prepareStatement("insert into money_receipt values(?,?,?,?,?,?,?,?,?,?,?)");
         }
        
        else if(str.equalsIgnoreCase("signup")){
            stmt=con.prepareStatement("select * from signup");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
            stmt=con.prepareStatement("insert into signup values(?,?,?,?,?,?)");
         }
        else if(str.equalsIgnoreCase("Automatic")){
           stmt=con.prepareStatement("select * from automatic");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(null,"Record is Available!");
            else
            stmt=con.prepareStatement("insert into Automatic values(?,?,?,?,?)");
         }
         
         try {
            FileInputStream fs=new FileInputStream("RaysBackup\\"+str+".xls");
            Workbook wb=Workbook.getWorkbook(fs);
            Sheet sh=wb.getSheet(0);
            for(byte i=1;i<sh.getRows();i++){
                for(byte j=0;j<sh.getColumns();j++){
                    if(str.equalsIgnoreCase("registration") && (j==15 || j==16))
                        stmt.setBlob(j+1,new ByteArrayInputStream(sh.getCell(j, i).getContents().getBytes()));
                    else
                        stmt.setString(j+1,sh.getCell(j, i).getContents());
                }
                stmt.executeUpdate();
            }
                JOptionPane.showMessageDialog(null,"Data Recovery Sucessfull");
             } catch (FileNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Something Went Wrong!");
        }
    }
    
}
