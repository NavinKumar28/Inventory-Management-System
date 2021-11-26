/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

/**
 *
 * @author USER
 */
import java.sql.*;
public class LoginDAO {
    Connection cn=null;
    Statement st=null;
    ResultSet rs=null;
     boolean flag=false;
    public boolean  checkLogin(String uname,String pass)
    {
        try
        {
            String sql="select * from registration where username='"+uname+"' and password='"+pass+"'";
       
        
        {
            ConnectionFactory con=new ConnectionFactory();
            cn=con.getConn();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next())
            {
                flag=true;
            }
            
        }
        }
        catch(SQLException se)
        {
            se.printStackTrace();
                    
        }
        return flag;
    }
}
