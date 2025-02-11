package snebookstoreinventorymanagement;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Addbook extends javax.swing.JFrame {

   Color DefaultColor;
    public Addbook() {
        initComponents();
        DefaultColor = new Color(51,153,255);
       
        addnewbook.setBackground(DefaultColor);
        editbook.setBackground(DefaultColor);
        deletebook.setBackground(DefaultColor);
        inventory.setBackground(DefaultColor);
        restock.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        addnewbook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deletebook = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editbook = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inventory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        restock = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bookname = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        genre = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        Description = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 472));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(803, 59));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEN BOOKSTORE ADD BOOK");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel3)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        kGradientPanel2.setPreferredSize(new java.awt.Dimension(137, 397));

        addnewbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnewbookMouseClicked(evt);
            }
        });

        jLabel1.setText("Add New Book");

        javax.swing.GroupLayout addnewbookLayout = new javax.swing.GroupLayout(addnewbook);
        addnewbook.setLayout(addnewbookLayout);
        addnewbookLayout.setHorizontalGroup(
            addnewbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnewbookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        addnewbookLayout.setVerticalGroup(
            addnewbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnewbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deletebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebookMouseClicked(evt);
            }
        });

        jLabel2.setText("Delete Book");

        javax.swing.GroupLayout deletebookLayout = new javax.swing.GroupLayout(deletebook);
        deletebook.setLayout(deletebookLayout);
        deletebookLayout.setHorizontalGroup(
            deletebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebookLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deletebookLayout.setVerticalGroup(
            deletebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbookMouseClicked(evt);
            }
        });

        jLabel4.setText("Edit Book");

        javax.swing.GroupLayout editbookLayout = new javax.swing.GroupLayout(editbook);
        editbook.setLayout(editbookLayout);
        editbookLayout.setHorizontalGroup(
            editbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbookLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editbookLayout.setVerticalGroup(
            editbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryMouseClicked(evt);
            }
        });

        jLabel5.setText("Inventory");

        javax.swing.GroupLayout inventoryLayout = new javax.swing.GroupLayout(inventory);
        inventory.setLayout(inventoryLayout);
        inventoryLayout.setHorizontalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inventoryLayout.setVerticalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        restock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restockMouseClicked(evt);
            }
        });

        jLabel6.setText("Restock ");

        javax.swing.GroupLayout restockLayout = new javax.swing.GroupLayout(restock);
        restock.setLayout(restockLayout);
        restockLayout.setHorizontalGroup(
            restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restockLayout.setVerticalGroup(
            restockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel7.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addnewbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deletebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(addnewbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Book Name");

        jLabel9.setText("Author");

        jLabel10.setText("Price(RM)");

        jLabel11.setText("Genre");

        jLabel12.setText("Quantity");

        jLabel13.setText("Description");

        bookname.setForeground(new java.awt.Color(204, 204, 204));
        bookname.setText("Enter Book Name");
        bookname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                booknameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                booknameFocusLost(evt);
            }
        });
        bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameActionPerformed(evt);
            }
        });

        Price.setForeground(new java.awt.Color(204, 204, 204));
        Price.setText("Enter Price");
        Price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PriceFocusLost(evt);
            }
        });
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        author.setForeground(new java.awt.Color(204, 204, 204));
        author.setText("Enter Author");
        author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                authorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                authorFocusLost(evt);
            }
        });

        genre.setForeground(new java.awt.Color(204, 204, 204));
        genre.setText("Enter Genre");
        genre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genreFocusLost(evt);
            }
        });

        quantity.setForeground(new java.awt.Color(204, 204, 204));
        quantity.setText("Enter Quantity");
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });

        Description.setForeground(new java.awt.Color(204, 204, 204));
        Description.setText("Enter Description");
        Description.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DescriptionFocusLost(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Clear)
                                .addGap(125, 125, 125)
                                .addComponent(Save))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bookname, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(Price)
                                .addComponent(author)
                                .addComponent(genre)
                                .addComponent(quantity)
                                .addComponent(Description)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Clear))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescriptionFocusLost
        // TODO add your handling code here:
        if(Description.getText().equals(""))
        {
            Description.setText("Enter Description");
            Description.setForeground(new Color(204,204,204));

        }
    }//GEN-LAST:event_DescriptionFocusLost

    private void DescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescriptionFocusGained
        // TODO add your handling code here:
        if(Description.getText().equals("Enter Description"))
        {
            Description.setText("");
            Description.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_DescriptionFocusGained

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
        // TODO add your handling code here:
        if(quantity.getText().equals(""))
        {
            quantity.setText("Enter Quantity");
            quantity.setForeground(new Color(204,204,204));

        }
    }//GEN-LAST:event_quantityFocusLost

    private void quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusGained
        // TODO add your handling code here:
        if(quantity.getText().equals("Enter Quantity"))
        {
            quantity.setText("");
            quantity.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_quantityFocusGained

    private void genreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFocusLost
        // TODO add your handling code here:
        if(genre.getText().equals(""))
        {
            genre.setText("Enter Genre");
            genre.setForeground(new Color(204,204,204));

        }
    }//GEN-LAST:event_genreFocusLost

    private void genreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFocusGained
        // TODO add your handling code here:
        if(genre.getText().equals("Enter Genre"))
        {
            genre.setText("");
            genre.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_genreFocusGained

    private void authorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFocusLost
        // TODO add your handling code here:
        if(author.getText().equals(""))
        {
            author.setText("Enter Author");
            author.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_authorFocusLost

    private void authorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFocusGained
        // TODO add your handling code here:
        if(author.getText().equals("Enter Author"))
        {
            author.setText("");
            author.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_authorFocusGained

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PriceFocusLost
        // TODO add your handling code here:
        if(Price.getText().equals(""))
        {
            Price.setText("Enter Price");
            Price.setForeground(new Color(204,204,204));

        }
    }//GEN-LAST:event_PriceFocusLost

    private void PriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PriceFocusGained
        // TODO add your handling code here:
        if(Price.getText().equals("Enter Price"))
        {
            Price.setText("");
            Price.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_PriceFocusGained

    private void booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknameActionPerformed

    private void booknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_booknameFocusLost
      // TODO add your handling code here:
        if(bookname.getText().equals(""))
        {
            bookname.setText("Enter Book Name");
            bookname.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_booknameFocusLost

    private void booknameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_booknameFocusGained
      // TODO add your handling code here:
        if(bookname.getText().equals("Enter Book Name"))
        {
            bookname.setText("");
            bookname.setForeground(new Color(0,0,0));
        }

    }//GEN-LAST:event_booknameFocusGained

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Description.setText("Enter Description");
        Description.setForeground(new Color(204,204,204));
        Price.setText("Enter Price");
        Price.setForeground(new Color(204,204,204));
        bookname.setText("Enter Book Name");
        bookname.setForeground(new Color(204,204,204));
        author.setText("Enter Author");
        author.setForeground(new Color(204,204,204));
        genre.setText("Enter Genre");
        genre.setForeground(new Color(204,204,204));
        quantity.setText("Enter Quantity");
        quantity.setForeground(new Color(204,204,204));
        
        
    }//GEN-LAST:event_ClearActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
     // getting user input
      String name = bookname.getText();
      String authors = author.getText();
      String genres = genre.getText();
      String descript = Description.getText();
      String price = Price.getText();
      String Quantity = quantity.getText();
      
      String sql = "INSERT INTO bookInfo (bookName, bookAuthor, sPrice, genre, quantity, descript) VALUES ('"+name+"', '"+authors+"', "+price+", '"+genres+"', "+Quantity+", '"+descript+"')";
      InventoryManager im = new InventoryManager();
      im.addDeleteEditBook(sql);
      JOptionPane.showMessageDialog(null, "Book sucessfully added", "INFO", JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_SaveActionPerformed

    private void addnewbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewbookMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addnewbookMouseClicked

    private void deletebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebookMouseClicked
        DeleteBook delete=new DeleteBook();
        delete.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_deletebookMouseClicked

    private void editbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbookMouseClicked
        // TODO add your handling code here:
       EditBook edit=new EditBook();
       edit.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_editbookMouseClicked

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
        // TODO add your handling code here:
        Inventory inven=new Inventory();
        inven.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_inventoryMouseClicked

    private void restockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restockMouseClicked
        // TODO add your handling code here:
        Restock restock=new Restock();
        restock.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_restockMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
       LoginPg1 lp1= new LoginPg1();
       lp1.setVisible(true);
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Save;
    private javax.swing.JPanel addnewbook;
    private javax.swing.JTextField author;
    private javax.swing.JTextField bookname;
    private javax.swing.JPanel deletebook;
    private javax.swing.JPanel editbook;
    private javax.swing.JTextField genre;
    private javax.swing.JPanel inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel logout;
    private javax.swing.JTextField quantity;
    private javax.swing.JPanel restock;
    // End of variables declaration//GEN-END:variables
}
