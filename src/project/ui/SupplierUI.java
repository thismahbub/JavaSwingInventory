package project.ui;

import javax.swing.JOptionPane;
import project.beans.Supplier;
import project.controllers.MyEntityManager;


public class SupplierUI extends javax.swing.JInternalFrame{

    public SupplierUI()
    {
        super("Supplier User Interface",true,true,true,true);
        initComponents();
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        supplierIDTextField = new javax.swing.JTextField();
        supplierNameTextField = new javax.swing.JTextField();
        supplierPhoneTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierAddressTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        findButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idLabel.setText("SupplierID");

        nameLabel.setText("Name");

        phoneLabel.setText("Phone");

        supplierIDTextField.setEditable(false);

        addressLabel.setText("Address");

        supplierAddressTextArea.setColumns(20);
        supplierAddressTextArea.setRows(5);
        jScrollPane1.setViewportView(supplierAddressTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(nameLabel)
                    .addComponent(phoneLabel)
                    .addComponent(addressLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(supplierPhoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(supplierNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(supplierIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(supplierIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(supplierNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(supplierPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        supplier = new Supplier();

        supplier.setSupplierId(Integer.parseInt(supplierIDTextField.getText()));
        supplier.setAddress(supplierAddressTextArea.getText());
        supplier.setName(supplierNameTextField.getText());
        supplier.setPhone(Integer.parseInt(supplierPhoneTextField.getText()));

        if(myentitymanager.add(supplier))
        {
            JOptionPane.showMessageDialog(this, "Saved Successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Can not Saved");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        int suplierID = Integer.parseInt(JOptionPane.showInputDialog("Enter Supplier ID"));
        
        supplier = (Supplier) myentitymanager.find(Supplier.class,suplierID);

        if(supplier!=null)
        {
            supplierIDTextField.setText(""+supplier.getSupplierId());
            supplierNameTextField.setText(supplier.getName());
            supplierAddressTextArea.setText(supplier.getAddress());
            supplierPhoneTextField.setText(""+supplier.getPhone());
        }
         else
        {
            JOptionPane.showMessageDialog(this, "No Such record fornd");
            clear();
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        supplier.setSupplierId(Integer.parseInt(supplierIDTextField.getText()));
        supplier.setAddress(supplierAddressTextArea.getText());
        supplier.setName(supplierNameTextField.getText());
        supplier.setPhone(Integer.parseInt(supplierPhoneTextField.getText()));

        if(myentitymanager.update(supplier))
        {
            JOptionPane.showMessageDialog(this, "Saved Successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Can not Saved");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(myentitymanager.delete(supplier))
        {
            JOptionPane.showMessageDialog(this, "Deleted Successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Can not Delete");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public void clear()
    {
        supplierIDTextField.setText(""+myentitymanager.getNewSupplierId());
        supplierAddressTextArea.setText("");
        supplierNameTextField.setText("");
        supplierPhoneTextField.setText("");

        supplierIDTextField.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextArea supplierAddressTextArea;
    private javax.swing.JTextField supplierIDTextField;
    private javax.swing.JTextField supplierNameTextField;
    private javax.swing.JTextField supplierPhoneTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


    MyEntityManager myentitymanager = new MyEntityManager();
    Supplier supplier;

}
