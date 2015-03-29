
package project.ui;

import java.util.Vector;
import javax.swing.JOptionPane;
import project.beans.Category;
import project.beans.Product;
import project.controllers.MyEntityManager;

public class ProductUI extends javax.swing.JInternalFrame {

    public ProductUI() {
        super("Product User Interface",true,true,true,true);
        initComponents();
        addCategoryToIdCombo();
        clear();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productPriceTextField = new javax.swing.JTextField();
        categoryIDComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        findButton1 = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Category ID");

        jLabel2.setText("Product Name");

        jLabel3.setText("Product ID");

        productId.setEditable(false);

        jLabel4.setText("Price");

        categoryIDComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productId, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(productPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(categoryIDComboBox, 0, 243, Short.MAX_VALUE))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(367, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(331, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(productPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(categoryIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        findButton1.setText("Find");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        updateButton1.setText("Update");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setText("Delete");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        clearButton1.setText("Clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton1)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findButton1)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton1)
                    .addComponent(deleteButton1)
                    .addComponent(clearButton1)
                    .addComponent(exitButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        int productIDs = Integer.parseInt(JOptionPane.showInputDialog("Enter the productIDs ID"));
        MyEntityManager myEntityManager = new MyEntityManager();

        product = (Product) myEntityManager.find(Product.class,productIDs);
        if(category!= null) {
            productId.setText(""+product.getProductId());
            productName.setText(product.getName());
            productPriceTextField.setText(""+product.getPrice());
            categoryIDComboBox.setSelectedItem(Integer.parseInt(""+product.getCategoryId().getCategoryId()));
            
        } else {
            JOptionPane.showMessageDialog(this,"No such record Found");
            clear();
        }
    }//GEN-LAST:event_findButton1ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        product = new Product();
        product.setProductId(Integer.parseInt(productId.getText()));
        product.setName(productName.getText());
        product.setPrice(Integer.parseInt(productPriceTextField.getText()));
        product.setCategoryId(new Category(Integer.parseInt(categoryIDComboBox.getSelectedItem().toString())));

        if(myEntityManager.add(product))
        {
            JOptionPane.showMessageDialog(this,"Saved Successfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(this,"Cann't Save !!!");
            SaveButton.setEnabled(false);
        }
}//GEN-LAST:event_SaveButtonActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        product.setProductId(Integer.parseInt(productId.getText()));
        product.setName(productName.getText());
        product.setPrice(Integer.parseInt(productPriceTextField.getText()));
        product.setCategoryId(new Category(Integer.parseInt(categoryIDComboBox.getSelectedItem().toString())));

        if(myEntityManager.update(product))
        {
            JOptionPane.showMessageDialog(this,"Saved Successfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(this,"Cann't Save !!!");
            SaveButton.setEnabled(false);
        }
}//GEN-LAST:event_updateButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed

        if (myEntityManager.delete(category)) {
            JOptionPane.showMessageDialog(this,"deleted Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Cannot delete! An error occurred !!!");
        }
}//GEN-LAST:event_deleteButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        clear();
}//GEN-LAST:event_clearButton1ActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        dispose();
}//GEN-LAST:event_exitButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox categoryIDComboBox;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton findButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField productId;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPriceTextField;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables


    public void addCategoryToIdCombo()
    {
        Vector<Category> categoryList = (Vector<Category>)myEntityManager.getEm().createNamedQuery("Category.findAll").getResultList();

        for(int i=0;i<categoryList.size();i++)
        {
            categoryIDComboBox.addItem(categoryList.get(i).getCategoryId());
        }
    }

    public void clear()
    {
        productId.setText(""+myEntityManager.getNewProductId());
        productName.setText("");
        productPriceTextField.setText("");
        categoryIDComboBox.setSelectedItem("");
    }

    private Product product;
    private Category category;

    MyEntityManager myEntityManager = new MyEntityManager();
}
