package project.ui;

import java.util.Vector;
import javax.swing.JOptionPane;
import project.beans.Customer;
import project.beans.Product;
import project.beans.Sales;
import project.beans.SalesDetail;
import project.beans.SalesDetailPK;
import project.beans.Stock;
import project.controllers.MyEntityManager;


public class SalesUI extends javax.swing.JInternalFrame{

    public SalesUI()
    {
        super("Sales User interface",true,true,true,true);
        initComponents();
        addCustomerToIdCombo();
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salesIDField = new javax.swing.JTextField();
        customerIDCombo = new javax.swing.JComboBox();
        salesDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        productNameField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        addTableButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        columns.add("Product Code");
        columns.add("Name");
        columns.add("Quantity");
        columns.add("Price");
        columns.add("Total Price");
        jTable1 = new javax.swing.JTable(rows,columns);
        grandTotalField = new javax.swing.JTextField();
        paymentField = new javax.swing.JTextField();
        changeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        productIdField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        findButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Sales No.");

        jLabel2.setText("Sales Date");

        jLabel3.setText("Customer ID");

        salesIDField.setEditable(false);

        customerIDCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel7.setText("<html><h1><u>Sales Form</u></h1></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesIDField)
                    .addComponent(customerIDCombo, 0, 169, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(salesIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salesDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        productNameField.setEditable(false);
        productNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameFieldFocusLost(evt);
            }
        });

        addTableButton.setText("Add");
        addTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableButtonActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(jTable1.getModel());
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        grandTotalField.setEnabled(false);

        paymentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentFieldKeyReleased(evt);
            }
        });

        changeField.setEnabled(false);

        jLabel4.setText("Grand Total =");

        jLabel5.setText("Paymant =");

        jLabel6.setText("Change =");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        removeAllButton.setText("Remove All");
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(addTableButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(removeButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeAllButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grandTotalField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(339, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTableButton)
                    .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grandTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(removeButton)
                    .addComponent(removeAllButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        jPanel3.add(findButton);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveButton);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteButton);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton);

        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(closeButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        int salesVariable= Integer.parseInt(JOptionPane.showInputDialog("Enter the Sale ID"));

        sales =(Sales) myEntityManager.find(Sales.class,salesVariable);
        if(sales != null) {
            salesIDField.setText(""+sales.getSalesId());
            salesDateChooser.setDate(sales.getDate());
            customerIDCombo.setSelectedItem(Integer.parseInt(""+sales.getCustomerId().getCustomerId()));

            Vector<SalesDetail> salesDetails = (Vector)sales.getSalesDetailCollection();

            for(int i=0;i<salesDetails.size();i++)
            {
                SalesDetail salesDetail = salesDetails.get(i);

                Vector<String> temp = new Vector<String>();

                temp.add(""+salesDetail.getProduct().getProductId());
                temp.add(salesDetail.getProduct().getName());
                temp.add(""+salesDetail.getQuantity());
                temp.add(""+salesDetail.getPrice());
                temp.add(""+(salesDetail.getPrice()*salesDetail.getQuantity()));

                rows.add(temp);

            }

            jTable1.revalidate();
            jTable1.repaint();
            
        } else {
            JOptionPane.showMessageDialog(this,"No such record Found");
            clear();
        }
}//GEN-LAST:event_findButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        sales = new Sales();
        sales.setDate(salesDateChooser.getDate());
        sales.setSalesId(Integer.parseInt(salesIDField.getText()));
        sales.setCustomerId(new Customer(Integer.parseInt(customerIDCombo.getSelectedItem().toString())));

        Vector<SalesDetail> salesDetails = new Vector<SalesDetail>();

        for(int i=0; i<rows.size();i++)
        {
            Vector row = rows.get(i);

            SalesDetail salesDetail = new SalesDetail();

            salesDetail.setSales(sales);
            
            SalesDetailPK salesDetailPK = new SalesDetailPK(sales.getSalesId(),Integer.parseInt(row.get(0).toString()));
            salesDetail.setSalesDetailPK(salesDetailPK);
            salesDetail.setQuantity(Integer.parseInt(row.get(2).toString()));
            salesDetail.setPrice(Integer.parseInt(row.get(3).toString()));
            salesDetail.setProduct(new Product(salesDetailPK.getProductId()));
            salesDetails.add(salesDetail);
        }

        sales.setSalesDetailCollection(salesDetails);
        if(myEntityManager.add(sales))
        {
            JOptionPane.showMessageDialog(this,"Sales saved successfully");
            for(int i=0;i<salesDetails.size();i++)
            {
                Stock stock = myEntityManager.getEm().find(Stock.class,salesDetails.get(i).getSalesDetailPK().getProductId());
                stock.setQuantity(stock.getQuantity()-salesDetails.get(i).getQuantity());
                myEntityManager.update(stock);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Cannot save records");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        sales = new Sales();
        sales.setSalesId(Integer.parseInt(salesIDField.getText()));
        sales.setDate(salesDateChooser.getDate());
        sales.setCustomerId(new Customer(Integer.parseInt(customerIDCombo.getSelectedItem().toString())));

        if(myEntityManager.update(sales)==true)
        {
            JOptionPane.showMessageDialog(this,"Update Successfully");
                clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"An Error Occured Cann't Update");
        }
}//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(myEntityManager.delete(sales))
        {
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Can not Delete the Record");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
}//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    dispose();
}//GEN-LAST:event_closeButtonActionPerformed

    private void addTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTableButtonActionPerformed
        Vector<String> addeds = new Vector<String>();

        addeds.add(""+product.getProductId());
        addeds.add(product.getName());
        addeds.add(quantityField.getText());
        addeds.add(""+product.getPrice());

        double totalPrice = Integer.parseInt(quantityField.getText())*product.getPrice();
        addeds.add(""+totalPrice);

        grandTotal = grandTotal + totalPrice;
        grandTotalField.setText(""+grandTotal);

        rows.add(addeds);

        jTable1.revalidate();
        jTable1.repaint();

        productIdField.setText("");
        productNameField.setText("");
        quantityField.setText("");

        productIdField.requestFocus();
    }//GEN-LAST:event_addTableButtonActionPerformed

    private void paymentFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentFieldKeyReleased

        double payment = Double.parseDouble(paymentField.getText());

        double charge = Double.parseDouble(paymentField.getText())- Double.parseDouble(grandTotalField.getText());

        changeField.setText(""+charge);
    }//GEN-LAST:event_paymentFieldKeyReleased

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if(selectedRow >= 0) {
            rows.remove(selectedRow);
            jTable1.revalidate();
            jTable1.repaint();
        }
}//GEN-LAST:event_removeButtonActionPerformed

    private void removeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllButtonActionPerformed
        rows.removeAllElements();
        jTable1.revalidate();
        jTable1.repaint();
}//GEN-LAST:event_removeAllButtonActionPerformed

    private void productNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameFieldFocusLost
        int productId = Integer.parseInt(productIdField.getText());
        product =(Product) myEntityManager.find(Product.class,productId);
        if(product!= null)
        {
            productNameField.setText(product.getName());
        }
        else{
            JOptionPane.showMessageDialog(this,"No such record found.\nPlease enter a correct ID");
        }
    }//GEN-LAST:event_productNameFieldFocusLost

        public void clear()
    {
        salesIDField.setText(""+myEntityManager.getNewSalesId());
        salesDateChooser.setDate(null);
        customerIDCombo.setSelectedItem("");
        productIdField.requestFocus();
        grandTotalField.setText("");
    }

    public void addCustomerToIdCombo()
    {
        Vector<Customer> supplierList = (Vector<Customer>)myEntityManager.getEm().createNamedQuery("Customer.findAll").getResultList();

        for(int i=0;i<supplierList.size();i++)
        {
            customerIDCombo.addItem(supplierList.get(i).getCustomerId());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTableButton;
    private javax.swing.JTextField changeField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox customerIDCombo;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTextField grandTotalField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField paymentField;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private com.toedter.calendar.JDateChooser salesDateChooser;
    private javax.swing.JTextField salesIDField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    
    private Sales sales;
    private Product product;

    Vector<Vector<String>> rows = new Vector<Vector<String>>();
    Vector<String> columns = new Vector<String>();

    private MyEntityManager myEntityManager = new MyEntityManager();

    private double grandTotal = 0;
}
