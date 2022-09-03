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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.nio.file.StandardCopyOption.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;
import java.nio.file.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.Timer.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import javax.swing.*;
import java.util.stream.*;
import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.Timer.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class App_Env extends javax.swing.JFrame {

    /**
     * Creates new form App_Env
     */
     Connection conn = null;
     ResultSet rs = null;
     PreparedStatement pst = null;
     Statement st = null;
     
       DefaultListModel DLM = new DefaultListModel();
//     LinkedList<Double> pricelist = new LinkedList<Double>();
     
    public App_Env() {
        initComponents();
        //this.setIconImage(new  ImageIcon(getClass().getResource("noxnox_52x52.png")).getImage());
        jToggleButton1.setBackground(Color.green);
        jLabel6.setVisible(false);
        jTabbedPane1.setTitleAt(0, "Meals");
        jTabbedPane1.setTitleAt(1, "Beverages");
        jTabbedPane1.setTitleAt(2, "Desserts");
        jTabbedPane1.setTitleAt(3, "Sales");
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton3.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton4.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton5.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton6.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton7.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton8.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton9.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton10.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton11.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton12.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton13.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton14.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton15.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton16.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton17.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton18.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton19.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton20.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton21.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton22.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton23.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton24.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton25.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton26.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton27.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton28.setHorizontalTextPosition(SwingConstants.CENTER);
        jToggleButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton30.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public void Disable(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        jButton20.setEnabled(false);
        jButton21.setEnabled(false);
        jButton22.setEnabled(false);
        jButton23.setEnabled(false);
        jButton24.setEnabled(false);
        jButton26.setEnabled(false);
        jButton27.setEnabled(false);
        jButton28.setEnabled(false);
        jToggleButton1.setEnabled(false);
        jButton30.setEnabled(false);
        jTable1.setEnabled(false);
        jTable2.setEnabled(false);
        jLabel9.setText("[account:]");
        jLabel10.setText("[no user logged-in]");
        jList1.setEnabled(false);
        jLabel15.setText("TOTAL SALES of");
        jLabel16.setText("TOTAL OVERALL SALES:");
        jLabel17.setText("[date]: 0.00");
        jLabel18.setText("0.00");
    }
    
    public void Enable(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton26.setEnabled(true);
        jTable1.setEnabled(true);
    }
    
    public void ShowData(){
        try{
           String query = "SELECT * FROM tblOrders_temp";
           pst = conn.prepareStatement(query);
           rs = pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }}
        }
    
    public void ShowDataFullSales(){
        try{
           String query = "SELECT * FROM tblOrders_perm";
           pst = conn.prepareStatement(query);
           rs = pst.executeQuery();
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           
           ShowTotal2();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }}
        }
    
    public void ShowSalesList(){
        try{
           jList1.clearSelection();
           DLM.clear();
           jList1.setModel(DLM);
           String query = "SELECT DISTINCT date FROM tblOrders_perm";
           pst = conn.prepareStatement(query);
           rs = pst.executeQuery();
          
           while(rs.next()){
               DLM.addElement(rs.getString(1));
               jList1.setModel(DLM);
           }
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }}
    }
    
    public void ShowTotal(){
        
        Double tprice = 0.0;
        
         try{
             String query = "SELECT SUM(tprice) FROM tblOrders_temp";
             pst = conn.prepareStatement(query);
             rs = pst.executeQuery();
             
             
             if (rs.next()){        
                 tprice = rs.getDouble(1); //get order_tprice;      
             }
             
             jLabel12.setText(String.valueOf(tprice));
             
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void ShowTotal2(){
        
        Double tprice = 0.0;
        
         try{
             String query = "SELECT SUM(tprice) FROM tblOrders_perm";
             pst = conn.prepareStatement(query);
             rs = pst.executeQuery();
             
             
             if (rs.next()){        
                 tprice = rs.getDouble(1); //get order_tprice;      
             }
             
             jLabel18.setText(String.valueOf(tprice));
             
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void InsertOrder(){

     try{
           
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
     
    }
    
    public void CancelItem(){   
      try{
               DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
               int rowIndex = jTable1.getSelectedRow();
               String valueRow = (jTable1.getModel().getValueAt(rowIndex, 0).toString());
               
        String query = "DELETE FROM tblOrders_temp WHERE [#]='"+valueRow+"'";
        st = conn.createStatement();
        st.executeUpdate(query);
               
               ShowData();
               ShowTotal();
               Enable();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure there is a selection. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
        }
      
      }
      
    public void CancelOrder(){
         
      try{
       String[] options = new String[] {"Yes", "Cancel"};
       int response = JOptionPane.showOptionDialog(null, "Are you sure you want to cancel order?", "Void order",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
    null, options, options[0]);
       
       switch (response){
        case -1:
            JOptionPane.showMessageDialog(null,"Cancelled","Operation",JOptionPane.INFORMATION_MESSAGE);
        break;
        
        case 0:
            String query = "DELETE FROM tblOrders_temp";
            st = conn.createStatement();
            st.executeUpdate(query);
               
            ShowData();
            jLabel2.setText("0.00");
            jLabel12.setText("0.00");
            JOptionPane.showMessageDialog(null,"Order cancelled","Void order",JOptionPane.INFORMATION_MESSAGE);
        break;
        
        case 1:
            JOptionPane.showMessageDialog(null,"Cancelled","Operation",JOptionPane.INFORMATION_MESSAGE);
        break;
       }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Cancelled. \n\nCode: " + e,"Operation",JOptionPane.INFORMATION_MESSAGE);
        }
      
      }
     
    public void PayOrder(){
         
      try{
       double amt = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of payment:"));
       
       if (amt < Double.parseDouble(jLabel12.getText())){
           JOptionPane.showMessageDialog(null,"Payment too low","Payment aborted",JOptionPane.WARNING_MESSAGE);
       }else{
       double change = amt - Double.parseDouble(jLabel12.getText());
        Date dNow = new Date();
        SimpleDateFormat ftdate = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat fttime = new SimpleDateFormat("hh:mm:ss a");
        
        jLabel5.setText("" + ftdate.format(dNow));
        jLabel6.setText("" + fttime.format(dNow));
       JOptionPane.showMessageDialog(null,"Change: " + String.valueOf(change),"Payment successful",JOptionPane.INFORMATION_MESSAGE);
       
       String query = "INSERT INTO tblOrders_perm SELECT * FROM tblOrders_temp";
        st = conn.createStatement();
        st.executeUpdate(query);
       
       //ShowFullSales();
       ShowSalesList();
       Enable();
       
        query = "DELETE FROM tblOrders_temp";
         st = conn.createStatement();
         st.executeUpdate(query);
               
        ShowData();
        jLabel2.setText("0.00");
        jLabel12.setText("0.00");
        jLabel15.setText("TOTAL SALES as of");
        jLabel16.setText("TOTAL OVERALL SALES:");
        jLabel17.setText("[date]: 0.00");
        jLabel18.setText("0.00");
       }
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Cancelled. \n\nCode: " + e,"Payment aborted",JOptionPane.INFORMATION_MESSAGE);
        }
      
      }
      
    public void CancelPayment(){
         
      try{
       JOptionPane.showMessageDialog(null,"Payment changed.","Payment aborted",JOptionPane.INFORMATION_MESSAGE);
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \n\nCode: " + e,"Error has occured",JOptionPane.INFORMATION_MESSAGE);
        }
      
      }
    
    public void ExportTXT(){
          String[] options = new String[] {"Yes", "No", "Cancel"};
        int response = JOptionPane.showOptionDialog(null, "Specify directory for saving?", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);

    switch (response){
        case 0:
     try{
     JFileChooser choosesave = new JFileChooser();
     choosesave.setCurrentDirectory(new java.io.File("."));
     choosesave.setDialogTitle("Browse path..");
     choosesave.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     choosesave.setAcceptAllFileFilterUsed(false);
     
     if (choosesave.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      //System.out.println("getCurrentDirectory(): " + choosesave.getCurrentDirectory());
      //System.out.println("getSelectedFile() : " + choosesave.getSelectedFile());
      //JOptionPane.showMessageDialog(null,"File location: " + choosesave.getSelectedFile()+"\\receipt_.txt","Output successful",JOptionPane.INFORMATION_MESSAGE);
      File file = new File(choosesave.getSelectedFile()+"\\receipt_.txt");
      if(!file.exists()){
          file.createNewFile();
      }
      FileWriter fw = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(fw);
      
      for(int i = 0; i < jTable2.getRowCount(); i++){
          for(int j = 0; j < jTable2.getColumnCount(); j++){
              bw.write(jTable2.getModel().getValueAt(i,j)+" ");
          }
          bw.write("\n____________________________________________________________________________________\n");
      }
      bw.close();
      fw.close();
      JOptionPane.showMessageDialog(null,"File location: " + choosesave.getSelectedFile()+"\\receipt_.txt","Output successful",JOptionPane.INFORMATION_MESSAGE);
      
    } else {
      System.out.println("No Selection ");
    }
     }catch(Exception e){
             // Handle the error
             JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError Code: " + e,"Error",JOptionPane.ERROR_MESSAGE);
            }
     break;
        case 1:
     try{
    File desktop = FileSystemView.getFileSystemView().getHomeDirectory();
    File file = new File(desktop+"\\receipt_.txt");
      if(!file.exists()){
          file.createNewFile();
      }
      FileWriter fw = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(fw);
      
      for(int i = 0; i < jTable2.getRowCount(); i++){
          for(int j = 0; j < jTable2.getColumnCount(); j++){
              bw.write(jTable2.getModel().getValueAt(i,j)+" ");
          }
          bw.write("\n____________________________________________________________________________________\n");
      }
      bw.close();
      fw.close();
      JOptionPane.showMessageDialog(null,"File location: " + desktop +"\\receipt_.txt","Output successful",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
             // Handle the error
              JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError Code: " + e,"Error",JOptionPane.ERROR_MESSAGE);
            }
      break;
        default:
    break;
    }
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton30 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton26 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("orx");
        setBackground(new java.awt.Color(102, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Ordered Items");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Item cancellation: select (1) from the list & press \"Remove\".");

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Remove_64x64.png"))); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Clear_64x64.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "date", "time", "item", "type", "qty", "tprice", "placedby"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Item Price");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(79, 79, 79))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Total Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Payment_64x64.png"))); // NOI18N
        jButton4.setText("Payment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Cancel_64x64.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/01_meal.png"))); // NOI18N
        jButton5.setText("Item 01");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/02_meal.png"))); // NOI18N
        jButton6.setText("Item 02");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/03_meal.png"))); // NOI18N
        jButton7.setText("Item 03");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/04_meal.png"))); // NOI18N
        jButton8.setText("Item 04");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/05_meal.png"))); // NOI18N
        jButton9.setText("Item 05");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/06_meal.png"))); // NOI18N
        jButton10.setText("Item 06");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/07_meal.png"))); // NOI18N
        jButton11.setText("Item 07");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/08_meal.png"))); // NOI18N
        jButton12.setText("Item 08");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/09_meal.png"))); // NOI18N
        jButton13.setText("Item 09");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel7);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/10_bev.png"))); // NOI18N
        jButton14.setText("Item 10");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/11_bev.png"))); // NOI18N
        jButton15.setText("Item 11");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/12_bev.png"))); // NOI18N
        jButton16.setText("Item 12");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/13_bev.png"))); // NOI18N
        jButton17.setText("Item 13");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/15_bev.png"))); // NOI18N
        jButton18.setText("Item 14");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/16_bev.png"))); // NOI18N
        jButton19.setText("Item 15");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/17_bev.png"))); // NOI18N
        jButton20.setText("Item 16");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/18_bev.png"))); // NOI18N
        jButton21.setText("Item 17");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/19_bev.png"))); // NOI18N
        jButton22.setText("Item 18");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel8);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/20_des.png"))); // NOI18N
        jButton23.setText("Item 19");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/21_des.png"))); // NOI18N
        jButton24.setText("Item 20");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel9);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "date", "time", "item", "type", "qty", "tprice", "placedby"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Select date:");

        jButton27.setBackground(new java.awt.Color(255, 255, 102));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Remove_64x64.png"))); // NOI18N
        jButton27.setText("Remove");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*Item removal: select (1) from the list & press \"Remove\".");

        jButton28.setBackground(new java.awt.Color(255, 255, 102));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Clear_64x64.png"))); // NOI18N
        jButton28.setText("Clear");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel15.setText("TOTAL SALES of");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("TOTAL OVERALL SALES:");

        jLabel17.setText("[date]: 0.00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("0.00");

        jButton30.setBackground(new java.awt.Color(255, 255, 102));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpaj_package/Export_64x64.png"))); // NOI18N
        jButton30.setText("Export");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("show");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addComponent(jToggleButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jLabel3.setText("username:");

        jLabel4.setText("password:");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton25.setBackground(new java.awt.Color(102, 255, 51));
        jButton25.setText("Log-in");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton26.setBackground(new java.awt.Color(255, 51, 51));
        jButton26.setText("Log-out");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel5.setText("[date]");

        jLabel6.setText("[time]");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("[account:]");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("[no user logged-in]");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel6))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        /*
 * ORDER EVENTS ~ 
 * ORDER EVENTS ~ 
 * ORDER EVENTS ~ 
 */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CancelItem();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CancelOrder();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PayOrder();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CancelPayment();
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
 * ITEM EVENTS ~ 
 * ITEM EVENTS ~ 
 * ITEM EVENTS ~ 
 */
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:     
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Bacon TLC Burger";
            String type = "Meals";
            double price = 95.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton5.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Bucket of Fries";
            String type = "Meals";
            double price = 80.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton6.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Caesar Salad";
            String type = "Meals";
            double price = 120.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton7.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Spiced Clubhouse";
            String type = "Meals";
            double price = 80.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton8.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Creamy Carbonara";
            String type = "Meals";
            double price = 120.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton9.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Spaghetti Balognese";
            String type = "Meals";
            double price = 140.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton10.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Pesto Fetuccini";
            String type = "Meals";
            double price = 140.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton11.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Mozzarella Lasagna";
            String type = "Meals";
            double price = 140.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton12.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Shawarma Pizza";
            String type = "Meals";
            double price = 120.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton13.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Coke in Can";
            String type = "Beverages";
            double price = 25.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton14.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Diet Coke";
            String type = "Beverages";
            double price = 25.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton15.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Sprite in Can";
            String type = "Beverages";
            double price = 25.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton16.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Royal in Can";
            String type = "Beverages";
            double price = 25.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton17.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Bottled Sparkle";
            String type = "Beverages";
            double price = 15.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton18.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Bottomless Lemonade";
            String type = "Beverages";
            double price = 45.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton19.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Coffee Americano";
            String type = "Beverages";
            double price = 35.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton20.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        try{
            int ctr = 0;
            double sum = 0;
            String name = "Bottomless Kiwi Tea";
            String type = "Beverages";
            double price = 45.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton21.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Tres Hot Choco";
            String type = "Beverages";
            double price = 80.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton22.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Blurberry Shortcake";
            String type = "Desserts";
            double price = 100.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton23.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
         try{
            int ctr = 0;
            double sum = 0;
            String name = "Oreo Mint Gelato";
            String type = "Desserts";
            double price = 80.0;
            double qty = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity (max of 10): "));
            
            if (qty >= 1 && qty <= 10){
            double tprice = price * qty;
            
            jLabel2.setText(String.valueOf(price));
        
        String query = "INSERT INTO tblOrders_temp (date, time, item, type, qty, tprice, placedby) VALUES ('"+jLabel5.getText()+"','"+jLabel6.getText()+"','"+name+"','"+type+"','"+qty+"','"+tprice+"','"+jLabel10.getText()+"')";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        ShowData();
        ShowTotal();
        jButton24.setEnabled(false);
        
            }else if (qty < 0 || qty > 10){
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }else{
                qty = Double.parseDouble(JOptionPane.showInputDialog("Enter valid quantity (max of 10): "));
            }
            
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure inputs are in their respective formats \nor all fields are populated. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
     }   
    }//GEN-LAST:event_jButton24ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Disable();
        conn = DBConnection.ConnectDB();
        Date dNow = new Date();
        SimpleDateFormat ftdate = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat fttime = new SimpleDateFormat("hh:mm:ss a");
        
        jLabel5.setText("" + ftdate.format(dNow));
        jLabel6.setText("" + fttime.format(dNow));
        
        try{
          String query = "DELETE FROM tblOrders_temp";
            st = conn.createStatement();
            st.executeUpdate(query);
               
            ShowData();
            jLabel2.setText("0.00");
            jLabel12.setText("0.00");
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }}
    }//GEN-LAST:event_formWindowOpened

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        
        String query = "SELECT * FROM tblAccounts WHERE user_name=? AND user_pass=?";
      
            try{
             pst = conn.prepareStatement(query);
             pst.setString(1, jTextField1.getText());
             pst.setString(2, jPasswordField1.getText());
             rs = pst.executeQuery();
             
             
             if (rs.next()){
                         String userfullname = rs.getString(3); //get user_fullname
                         String usertype = rs.getString(5); //get user_type
                         JOptionPane.showMessageDialog(null,"Welcome, " + userfullname,"Greetings",JOptionPane.INFORMATION_MESSAGE);
                         jLabel9.setText("" + usertype);
                         jLabel10.setText("" + userfullname);
                         jTextField1.setEnabled(false);
                         jPasswordField1.setEnabled(false);
                         jTextField1.setText("");
                         jPasswordField1.setText("");
                         jButton25.setEnabled(false);
                         
                         switch (usertype){
                             case "ADMIN":
                                 ShowSalesList();
                                 jButton27.setEnabled(true);
                                 jButton28.setEnabled(true);
                                 jButton30.setEnabled(true);
                                 jList1.setEnabled(true);
                                 jTable1.setEnabled(false);
                                 jTable2.setEnabled(true);
                                 ShowTotal2();
                                 jButton26.setEnabled(true);
                                 jToggleButton1.setEnabled(true);
                             break;
                             case "CASHIER":
                             Enable();
                             break;
                         }
                         
             }else{
                 JOptionPane.showMessageDialog(null,"Incorrect username or password!","Message",JOptionPane.WARNING_MESSAGE);
             }
             
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
            jLabel2.setText("0.00");
            jLabel12.setText("0.00");
            jLabel15.setText("TOTAL SALES of");
            jLabel16.setText("TOTAL OVERALL SALES:");
            jLabel17.setText("[date]: 0.00");
            jLabel18.setText("0.00");
            jTextField1.setEnabled(true);
            jPasswordField1.setEnabled(true);
            jButton25.setEnabled(true);
            jTable2.setModel(new DefaultTableModel());
            Disable();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
         String query = "SELECT * FROM tblOrders_perm WHERE date=?";
      
            try{
             pst = conn.prepareStatement(query);
             pst.setString(1, jList1.getSelectedValue());
             rs = pst.executeQuery();
             
             if (rs.next()){
                        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
             }
             
              Double tprice = 0.0;
           
            query = "SELECT SUM(tprice) FROM tblOrders_perm WHERE date=?";
             pst = conn.prepareStatement(query);
             pst.setString(1, jList1.getSelectedValue());
             rs = pst.executeQuery();
             
             
             if (rs.next()){        
                 tprice = rs.getDouble(1); //get order_tprice;      
             }
             
             jLabel15.setText("TOTAL SALES of " + jList1.getSelectedValue() + " :");
             jLabel17.setText(String.valueOf(tprice));
             
             ShowTotal2();
             
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    String valueRow = jList1.getSelectedValue();   
    String[] options = new String[] {"Cancel", "Format ALL known records?"};
    int response = JOptionPane.showOptionDialog(null, "Choose an option: \n\nNOTE: Clearing records are permanent and irreversible.", "Message",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
    null, options, options[0]);
        
    switch (response){
        case -1:
         JOptionPane.showMessageDialog(null,"Cancelled","Operation",JOptionPane.INFORMATION_MESSAGE);    
        break;
        case 0:
         JOptionPane.showMessageDialog(null,"Cancelled","Operation",JOptionPane.INFORMATION_MESSAGE);  
        break;
        case 1:
            try{
            String query = "DELETE FROM tblOrders_perm";
            st = conn.createStatement();
            st.executeUpdate(query);
               
            ShowDataFullSales();
            ShowSalesList();
            ShowTotal2();
            jLabel15.setText("TOTAL SALES of");
            jLabel16.setText("TOTAL OVERALL SALES:");
            jLabel17.setText("[date]: 0.00");
            jLabel18.setText("0.00");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Something went wrong. \n\nError code:" + e,"Database status",JOptionPane.ERROR_MESSAGE);
        }
        break;        
    }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        try{
               DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
               int rowIndex = jTable2.getSelectedRow();
               String valueRow = (jTable2.getModel().getValueAt(rowIndex, 0).toString());
               
        String query = "DELETE FROM tblOrders_perm WHERE [#]='"+valueRow+"'";
        st = conn.createStatement();
        st.executeUpdate(query);
        
        query = "SELECT * FROM tblOrders_perm WHERE date=?";
        pst = conn.prepareStatement(query);
             pst.setString(1, jList1.getSelectedValue());
             rs = pst.executeQuery();
             
             if (rs.next()){
                        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
             }
            
             Double tprice = 0.0;
           
            query = "SELECT SUM(tprice) FROM tblOrders_perm WHERE date=?";
             pst = conn.prepareStatement(query);
             pst.setString(1, jList1.getSelectedValue());
             rs = pst.executeQuery();
             
             
             if (rs.next()){        
                 tprice = rs.getDouble(1); //get order_tprice;      
             }
             
             jLabel15.setText("TOTAL SALES of " + jList1.getSelectedValue() + " :");
             jLabel17.setText(String.valueOf(tprice));
             
             ShowTotal2();
      }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Something went wrong. \nPlease make sure there is a selection. \n\nError code: " + e,"Error has occured",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
      ExportTXT();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected() == true){
            jList1.clearSelection();
            jList1.setEnabled(false);
            jButton27.setEnabled(false);
            jLabel15.setText("TOTAL SALES of");
            jLabel17.setText("[date]: 0.00");
            ShowDataFullSales();
            jToggleButton1.setBackground(Color.red);
            jToggleButton1.setText("hide");
        }else{
            jList1.clearSelection();
            jList1.setEnabled(true);
            jButton27.setEnabled(true);
            jToggleButton1.setBackground(Color.green);
            jToggleButton1.setText("show");
            jTable2.setModel(new DefaultTableModel());
        }
            
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(App_Env.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Env.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Env.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Env.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Env().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
