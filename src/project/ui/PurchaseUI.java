
package project.ui;

import java.util.Vector;
import javax.swing.JOptionPane;
import project.beans.Product;
import project.beans.Purchase;
import project.beans.PurchaseDetail;
import project.beans.PurchaseDetailPK;
import project.beans.Stock;
import project.beans.Supplier;
import project.controllers.MyEntityManager;


public class PurchaseUI extends javax.swing.JInternalFrame{

    public PurchaseUI()
    {
        super("Purchase User Interface",true,true,true,true);
        initComponents();
        addSupplierToIdCombo();
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salesNoLabel = new javax.swing.JLabel();
        salesDateLabel = new javax.swing.JLabel();
        customerNoLabel = new javax.swing.JLabel();
        purchaseIDTextField = new javax.swing.JTextField();
        supplierIDComboBox = new javax.swing.JComboBox();
        puchaseDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        findButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        productNameField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        grandTotalField = new javax.swing.JTextField();
        paymentField = new javax.swing.JTextField();
        changeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        columns.add("Product ID");
        columns.add("Name");
        columns.add("Quantity");
        jTable1 = new javax.swing.JTable(rows,columns);
        removeButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        productIdField = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        salesNoLabel.setText("Purchase ID");

        salesDateLabel.setText("Purchase Date");

        customerNoLabel.setText("Supplier ID");

        purchaseIDTextField.setEditable(false);

        supplierIDComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel1.setText("<html><h1><u>Purchase Form</u></h1></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesNoLabel)
                    .addComponent(salesDateLabel)
                    .addComponent(customerNoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(purchaseIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(puchaseDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesNoLabel)
                    .addComponent(purchaseIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesDateLabel)
                    .addComponent(puchaseDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNoLabel)
                    .addComponent(supplierIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        jPanel2.add(findButton);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveButton);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton);

        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(closeButton);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        productNameField.setEditable(false);

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

        jTable1.setModel(jTable1.getModel());
        jScrollPane2.setViewportView(jTable1);

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

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        productIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productIdFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeAllButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grandTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grandTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(removeButton)
                            .addComponent(removeAllButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
}//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    dispose();
}//GEN-LAST:event_closeButtonActionPerformed

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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Vector<String> singleRow = new Vector<String>();

        singleRow.add(productIdField.getText());
        singleRow.add(productNameField.getText());
        singleRow.add(quantityField.getText());
        singleRow.add(""+product.getPrice());

        double totalPrice = Integer.parseInt(quantityField.getText())*product.getPrice();
        singleRow.add(""+totalPrice);


        grandTotal = grandTotal + totalPrice;

        grandTotalField.setText(""+grandTotal);

        rows.add(singleRow);
        jTable1.revalidate();
        jTable1.repaint();

        productIdField.setText("");
        productNameField.setText("");
        quantityField.setText("");

        productIdField.requestFocus();
}//GEN-LAST:event_addButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        int purchaseVariable= Integer.parseInt(JOptionPane.showInputDialog("Enter the Purchase ID"));

        purchase =(Purchase) myEntityManager.find(Purchase.class,purchaseVariable);
        if(purchase != null) {
            purchaseIDTextField.setText(""+purchase.getPurchaseId());
            purchase.setDate(puchaseDateChooser.getDate());
            supplierIDComboBox.setSelectedItem(Integer.parseInt(""+purchase.getSupplierId().getSupplierId()));

            Vector<PurchaseDetail> purchaseDetails = (Vector)purchase.getPurchaseDetailCollection();

            for(int i=0;i<purchaseDetails.size();i++)
            {
                PurchaseDetail purchaseDetail = purchaseDetails.get(i);

                Vector<String> temp = new Vector<String>();

                temp.add(""+purchaseDetail.getProduct().getProductId());
                temp.add(purchaseDetail.getProduct().getName());
                temp.add(""+purchaseDetail.getQuantity());
                temp.add(""+purchaseDetail.getPrice());
                temp.add(""+(purchaseDetail.getPrice()*purchaseDetail.getQuantity()));

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
        purchase = new Purchase();
        purchase.setDate(puchaseDateChooser.getDate());
        purchase.setPurchaseId(Integer.parseInt(purchaseIDTextField.getText()));
        purchase.setSupplierId(new Supplier(Integer.parseInt(supplierIDComboBox.getSelectedItem().toString())));
        
        Vector<PurchaseDetail> purchaseDetails = new Vector<PurchaseDetail>();

        for(int i=0; i<rows.size();i++)
        {
            Vector row = rows.get(i);

            PurchaseDetail purchaseDetail = new PurchaseDetail();

            purchaseDetail.setPurchase(purchase);
            
            PurchaseDetailPK purchaseDetailPK = new PurchaseDetailPK(purchase.getPurchaseId(),Integer.parseInt(row.get(0).toString()));
            purchaseDetail.setPurchaseDetailPK(purchaseDetailPK);
            purchaseDetail.setQuantity(Integer.parseInt(row.get(2).toString()));
            purchaseDetail.setPrice(Integer.parseInt(row.get(3).toString()));
            purchaseDetail.setProduct(new Product(purchaseDetailPK.getProductId()));
            purchaseDetails.add(purchaseDetail);
        }

        purchase.setPurchaseDetailCollection(purchaseDetails);
        if(myEntityManager.add(purchase))
        {
            JOptionPane.showMessageDialog(this,"Purchase saved successfully");
            for(int i=0;i<purchaseDetails.size();i++)
            {
                Stock stock = myEntityManager.getEm().find(Stock.class,purchaseDetails.get(i).getPurchaseDetailPK().getProductId());
                stock.setQuantity(stock.getQuantity()+purchaseDetails.get(i).getQuantity());
                myEntityManager.update(stock);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Cannot save records");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        purchase = new Purchase();
        purchase.setPurchaseId(Integer.parseInt(purchaseIDTextField.getText()));
        purchase.setDate(puchaseDateChooser.getDate());
        purchase.setSupplierId(new Supplier(Integer.parseInt(supplierIDComboBox.getSelectedItem().toString())));

        if(myEntityManager.update(purchase)==true)
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
        if(myEntityManager.delete(purchase))
        {
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Can not Delete the Record");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void productIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdFieldFocusLost
        int productId = Integer.parseInt(productIdField.getText());
        product =(Product) myEntityManager.find(Product.class,productId);
        if(product!= null)
        {
            productNameField.setText(product.getName());
        }
        else{
            JOptionPane.showMessageDialog(this,"Please enter a correct ID");
        }
    }//GEN-LAST:event_productIdFieldFocusLost


    public void clear()
    {
        puchaseDateChooser.setDate(null);
        purchaseIDTextField.setText(""+myEntityManager.getNewPurchaseId());
        supplierIDComboBox.setSelectedItem("");
        purchaseIDTextField.requestFocus();
        grandTotalField.setText("");
    }

    public void addSupplierToIdCombo()
    {
        Vector<Supplier> supplierList = (Vector<Supplier>)myEntityManager.getEm().createNamedQuery("Supplier.findAll").getResultList();

        for(int i=0;i<supplierList.size();i++)
        {
            supplierIDComboBox.addItem(supplierList.get(i).getSupplierId());
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField changeField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel customerNoLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTextField grandTotalField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField paymentField;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productNameField;
    private com.toedter.calendar.JDateChooser puchaseDateChooser;
    private javax.swing.JTextField purchaseIDTextField;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel salesDateLabel;
    private javax.swing.JLabel salesNoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox supplierIDComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


    private Purchase purchase;
    private Product product;

    Vector<Vector<String>> rows = new Vector<Vector<String>>();
    Vector<String> columns = new Vector<String>();

    MyEntityManager myEntityManager = new MyEntityManager();

    private double grandTotal = 0;
}
