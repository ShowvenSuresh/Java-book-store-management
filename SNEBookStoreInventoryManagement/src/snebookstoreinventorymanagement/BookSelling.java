/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package snebookstoreinventorymanagement;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author HP
 */
public class BookSelling extends javax.swing.JFrame {

    /**
     * Creates new form BookSelling
     */
    
    Color DefaultColor,ClickedColor,TouchColor;
    
    public BookSelling() {
         initComponents();
        DefaultColor = new Color(51,153,255);
        ClickedColor = new Color(242,242,242);
        TouchColor   = new Color(153,255,255);
        
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
        
        table();
    }
    
    public void table()
    {
        String searchText = search.getText();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/snebookstore", "root", "admin");
            Statement s = con.createStatement();

	    String query;
            if (searchText=="") 
            {
                query = "SELECT * FROM bookinfo";                                               // If search text is empty, select all records from the bookinfo table
            } else {                                                                            // If search text is not empty, select records from the bookinfo table where the book name, author, or ID match the search text
                query = "SELECT * FROM bookinfo WHERE bookName LIKE '%" + searchText + "%' OR bookAuthor LIKE '%" + searchText + "%' OR bookId LIKE '%" + searchText + "%'";
            }
            ResultSet rs = s.executeQuery(query);                                               // Execute the query

            while (rs.next())                                                                   // Get the data from the result set 
            {
                String id=rs.getString(1);
                String name=rs.getString(2);
                String author=rs.getString(3);
                String price=String.valueOf(rs.getFloat(4));
                
                String tbData[] = {id,name,author,price};                                       // Create an array with the table data
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();               // Get the table model
                
                tblModel.addRow(tbData);                                                         // Add the row to the table model

            }
        }catch(Exception ex)
                {
                    ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        bookselling = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkstock = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        saleshistory = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bookreturn3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setPreferredSize(new java.awt.Dimension(137, 397));

        bookselling.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                booksellingMouseMoved(evt);
            }
        });
        bookselling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksellingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksellingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksellingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                booksellingMousePressed(evt);
            }
        });

        jLabel1.setText("Book selling");

        javax.swing.GroupLayout booksellingLayout = new javax.swing.GroupLayout(bookselling);
        bookselling.setLayout(booksellingLayout);
        booksellingLayout.setHorizontalGroup(
            booksellingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksellingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        booksellingLayout.setVerticalGroup(
            booksellingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksellingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        checkstock.setPreferredSize(new java.awt.Dimension(137, 29));
        checkstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkstockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkstockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkstockMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkstockMousePressed(evt);
            }
        });

        jLabel2.setText("Check stock");

        javax.swing.GroupLayout checkstockLayout = new javax.swing.GroupLayout(checkstock);
        checkstock.setLayout(checkstockLayout);
        checkstockLayout.setHorizontalGroup(
            checkstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkstockLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkstockLayout.setVerticalGroup(
            checkstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkstockLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        saleshistory.setPreferredSize(new java.awt.Dimension(137, 29));
        saleshistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleshistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saleshistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saleshistoryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saleshistoryMousePressed(evt);
            }
        });

        jLabel4.setText("Sales history");

        javax.swing.GroupLayout saleshistoryLayout = new javax.swing.GroupLayout(saleshistory);
        saleshistory.setLayout(saleshistoryLayout);
        saleshistoryLayout.setHorizontalGroup(
            saleshistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleshistoryLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        saleshistoryLayout.setVerticalGroup(
            saleshistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleshistoryLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        logout.setPreferredSize(new java.awt.Dimension(137, 29));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        jLabel5.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        bookreturn3.setPreferredSize(new java.awt.Dimension(137, 29));
        bookreturn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookreturn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookreturn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookreturn3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookreturn3MousePressed(evt);
            }
        });

        jLabel10.setText("Book Return");

        javax.swing.GroupLayout bookreturn3Layout = new javax.swing.GroupLayout(bookreturn3);
        bookreturn3.setLayout(bookreturn3Layout);
        bookreturn3Layout.setHorizontalGroup(
            bookreturn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookreturn3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookreturn3Layout.setVerticalGroup(
            bookreturn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookreturn3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookselling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(saleshistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookreturn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(bookselling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookreturn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleshistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEN BOOK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Author", "Book Price", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel7.setText("Confirm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel6.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void booksellingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksellingMouseMoved

    }//GEN-LAST:event_booksellingMouseMoved

    private void booksellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksellingMouseClicked
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_booksellingMouseClicked

    private void booksellingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksellingMouseEntered
        // TODO add your handling code here:
        bookselling.setBackground(TouchColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_booksellingMouseEntered

    private void booksellingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksellingMouseExited
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_booksellingMouseExited

    private void booksellingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksellingMousePressed
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);

        BookSelling bs=new BookSelling();
        bs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_booksellingMousePressed

    private void checkstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkstockMouseClicked
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(ClickedColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_checkstockMouseClicked

    private void checkstockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkstockMouseEntered
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(TouchColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_checkstockMouseEntered

    private void checkstockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkstockMouseExited
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_checkstockMouseExited

    private void checkstockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkstockMousePressed
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(ClickedColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);

        CheckStock cs=new CheckStock();
        cs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkstockMousePressed

    private void saleshistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleshistoryMouseClicked
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(ClickedColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_saleshistoryMouseClicked

    private void saleshistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleshistoryMouseEntered
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(TouchColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_saleshistoryMouseEntered

    private void saleshistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleshistoryMouseExited
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_saleshistoryMouseExited

    private void saleshistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleshistoryMousePressed
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(ClickedColor);
        logout.setBackground(DefaultColor);

        SalesHistory sh=new SalesHistory();
        sh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_saleshistoryMousePressed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(ClickedColor);
        LoginPg1 lp1= new LoginPg1();
        lp1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(TouchColor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(ClickedColor);
    }//GEN-LAST:event_logoutMousePressed

    private void bookreturn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookreturn3MouseClicked
        // TODO add your handling code here:
        bookselling.setBackground(DefaultColor);
        bookreturn3.setBackground(ClickedColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);

        BookReturn br=new BookReturn();
        br.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookreturn3MouseClicked

    private void bookreturn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookreturn3MouseEntered
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(TouchColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_bookreturn3MouseEntered

    private void bookreturn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookreturn3MouseExited
        // TODO add your handling code here:
        bookselling.setBackground(ClickedColor);
        bookreturn3.setBackground(DefaultColor);
        checkstock.setBackground(DefaultColor);
        saleshistory.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_bookreturn3MouseExited

    private void bookreturn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookreturn3MousePressed

    }//GEN-LAST:event_bookreturn3MousePressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();            // Get the table model of jTable1
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);         // Create a TableRowSorter with the table model
        jTable1.setRowSorter(obj);                                              // Set the TableRowSorter to jTable1
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));              // Apply a row filter based on the text in the search JTextField
    }//GEN-LAST:event_searchKeyReleased

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
    TableModel model1 = jTable1.getModel();
    int indexs[] = jTable1.getSelectedRows();

    salesquantity frm2 = new salesquantity();                                   // Create an instance of the salesquantity frame
    DefaultTableModel model2 = (DefaultTableModel) frm2.jTable1.getModel();     // Get the table model of frm2


    int rowCount = model1.getRowCount();                                        // Get the row count of jTable1
    boolean atLeastOneSelected = false;


    for (int i = 0; i < rowCount; i++)                                          // Iterate through each row in jTable1
    {
        Object isSelectedObj = model1.getValueAt(i, 4);                         // If at least one row is selected, set the flag to true
        if (isSelectedObj instanceof Boolean && (Boolean) isSelectedObj)        
        {
        atLeastOneSelected = true;                                              // Create an array to store the data of the selected row
        Object[] row = new Object[4];                                           // Populate the array with data from the selected row
        row[0] = model1.getValueAt(i, 0);
        row[1] = model1.getValueAt(i, 1);
        row[2] = model1.getValueAt(i, 2);
        row[3] = model1.getValueAt(i, 3);

        model2.addRow(row);
        }
    }
    if(atLeastOneSelected)
    {
    frm2.setVisible(true);
    this.setVisible(false);
    }else
    {
        JOptionPane.showMessageDialog(null,"Please select at least one book","Error",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jPanel3MousePressed

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
            java.util.logging.Logger.getLogger(BookSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookreturn3;
    private javax.swing.JPanel bookselling;
    private javax.swing.JPanel checkstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel saleshistory;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
