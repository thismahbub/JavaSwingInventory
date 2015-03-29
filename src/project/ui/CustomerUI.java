
package project.ui;

import javax.swing.JOptionPane;
import project.beans.Customer;
import project.controllers.MyEntityManager;


public class CustomerUI extends javax.swing.JInternalFrame{
    

    public CustomerUI() {
        super("Customer User Interface",true,true,true,true);
        initComponents();
        clear();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        customerNameField = new javax.swing.JTextField();
        customerPhoneField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerAddressField = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        findButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idLabel.setText("Customer ID");

        nameLabel.setText("Name");

        mobileLabel.setText("Phone");

        jLabel4.setText("Address");

        customerIDField.setEditable(false);

        customerAddressField.setColumns(20);
        customerAddressField.setRows(5);
        jScrollPane1.setViewportView(customerAddressField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(mobileLabel)
                    .addComponent(nameLabel)
                    .addComponent(idLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerPhoneField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerIDField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        int customerIDs = Integer.parseInt(JOptionPane.showInputDialog("Enter the Category ID"));
        

        customer = (Customer) myEntityManager.find(Customer.class,customerIDs);
        if(customer!= null)
        {
            customerIDField.setText(""+customer.getCustomerId());
            customerNameField.setText(customer.getName());
            customerPhoneField.setText(""+customer.getPhone());
            customerAddressField.setText(customer.getAddress());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No such record Found");
            clear();
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        customer = new Customer();

        customer.setCustomerId(Integer.parseInt(customerIDField.getText()));
        customer.setName(customerNameField.getText());
        customer.setPhone(Integer.parseInt(customerPhoneField.getText()));
        customer.setAddress(customerAddressField.getText());

        if(myEntityManager.add(customer))
        {
            JOptionPane.showMessageDialog(this,"saved successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Cannot save !!!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        customer.setCustomerId(Integer.parseInt(customerIDField.getText()));
        customer.setName(customerNameField.getText());
        customer.setPhone(Integer.parseInt(customerPhoneField.getText()));
        customer.setAddress(customerAddressField.getText());

        if(myEntityManager.update(customer))
        {
            JOptionPane.showMessageDialog(this,"Update successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Cannot Update !!!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(myEntityManager.delete(customer))
        {
            JOptionPane.showMessageDialog(this,"Deleted successfully");
            clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Cannot delete");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    public void clear()
    {
        customerIDField.setText(""+myEntityManager.getNewCustomerId());
        customerNameField.setText("");
        customerPhoneField.setText("");
        customerAddressField.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea customerAddressField;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JTextField customerPhoneField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private Customer customer;
    
    MyEntityManager myEntityManager = new MyEntityManager();
}
