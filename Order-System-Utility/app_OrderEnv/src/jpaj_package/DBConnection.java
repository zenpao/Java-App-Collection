/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaj_package;

/**
 *
 * @author Zen
 */

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.util.stream.*;
import java.sql.*;

public class DBConnection {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sqliteorder.sqlite");
             JOptionPane.showMessageDialog(null,"Connected","Database status",JOptionPane.INFORMATION_MESSAGE);
             return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
