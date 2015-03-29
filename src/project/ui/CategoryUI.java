
package project.ui;

import javax.swing.JOptionPane;
import project.beans.Category;
import project.controllers.MyEntityManager;


public class CategoryUI extends javax.swing.JInternalFrame{

    public CategoryUI() {
        super("Category User Interface",true,true,true,true);
        initComponents();
        clear();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        categoryIDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        categoryNameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        findButton1 = new javax.swing.JButton();
        caregorySaveButton = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Category ID");

        categoryIDField.setEditable(false);

        jLabel2.setText("Category Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryNameField)
                    .addComponent(categoryIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(categoryIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        findButton1.setText("Find");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });

        caregorySaveButton.setText("Save");
        caregorySaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caregorySaveButtonActionPerformed(evt);
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
                .addComponent(caregorySaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton1)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findButton1)
                    .addComponent(caregorySaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
    int categoryIDs = Integer.parseInt(JOptionPane.showInputDialog("Enter the CategoryUI ID"));
    

        category = (Category) myEntityManager.find(Category.class,categoryIDs);
        if(category!= null)
        {
            categoryIDField.setText(""+category.getCategoryId());
            categoryNameField.setText(category.getName());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No such record Found");
            clear();
        }

}//GEN-LAST:event_findButton1ActionPerformed

    private void caregorySaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caregorySaveButtonActionPerformed
        category = new Category();
        category.setCategoryId(Integer.parseInt(categoryIDField.getText()));
        category.setName(categoryNameField.getText());

        if(myEntityManager.add(category)==true) {
            JOptionPane.showMessageDialog(this,"Saved Successfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(this,"Cann't Save !!!");
            caregorySaveButton.setEnabled(false);
        }
}//GEN-LAST:event_caregorySaveButtonActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        category.setCategoryId(Integer.parseInt(categoryIDField.getText()));
        category.setName(categoryNameField.getText());

        if(myEntityManager.update(category)) {
            JOptionPane.showMessageDialog(this,"Update Successfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(this,"An Error Occured Cann't Update");
        }
}//GEN-LAST:event_updateButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed

        if (myEntityManager.delete(category))
        {
            JOptionPane.showMessageDialog(this,"deleted Successfully");
        }
        else
        {
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
    private javax.swing.JButton caregorySaveButton;
    private javax.swing.JTextField categoryIDField;
    private javax.swing.JTextField categoryNameField;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton findButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables

    public void clear()
    {
        categoryIDField.setText(""+myEntityManager.getNewCategoryId());
        categoryNameField.setText("");
    }
    
    private Category category;

    MyEntityManager myEntityManager = new MyEntityManager();
}
