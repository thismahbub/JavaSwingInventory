package project.ui;

import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {
 
    public MainUI() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        saleReportiButton = new javax.swing.JButton();
        stockReportButton = new javax.swing.JButton();
        dailyReportButton = new javax.swing.JButton();
        weeklyReportButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        saleuiButton = new javax.swing.JButton();
        customeruiButton = new javax.swing.JButton();
        systemExit1 = new javax.swing.JButton();
        categoryuiButton = new javax.swing.JButton();
        supplieruiButton = new javax.swing.JButton();
        purchaseuiButton = new javax.swing.JButton();
        productui = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mobile Accessories Shop Management System");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/others/icon.png"));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 14), new java.awt.Color(3, 101, 36))); // NOI18N

        saleReportiButton.setText("Sales");
        saleReportiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleReportiButtonActionPerformed(evt);
            }
        });

        stockReportButton.setText("Stock");
        stockReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockReportButtonActionPerformed(evt);
            }
        });

        dailyReportButton.setText("Daily Income");
        dailyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyReportButtonActionPerformed(evt);
            }
        });

        weeklyReportButton.setText("Status");
        weeklyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weeklyReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(stockReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(saleReportiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(dailyReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saleReportiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stockReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(dailyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weeklyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel1.setBounds(130, 170, 120, 250);
        desktopPane.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interface Buttun", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 14), new java.awt.Color(3, 101, 36))); // NOI18N

        saleuiButton.setText("Sale");
        saleuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleuiButtonActionPerformed(evt);
            }
        });

        customeruiButton.setText("Customer");
        customeruiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeruiButtonActionPerformed(evt);
            }
        });

        systemExit1.setText("Exit");
        systemExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemExit1ActionPerformed(evt);
            }
        });

        categoryuiButton.setText("Category");
        categoryuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryuiButtonActionPerformed(evt);
            }
        });

        supplieruiButton.setText("Supplier");
        supplieruiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieruiButtonActionPerformed(evt);
            }
        });

        purchaseuiButton.setText("Purchase");
        purchaseuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseuiButtonActionPerformed(evt);
            }
        });

        productui.setText("Product");
        productui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productuiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saleuiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(systemExit1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(productui, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(purchaseuiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(supplieruiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(categoryuiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(customeruiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(saleuiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customeruiButton)
                .addGap(5, 5, 5)
                .addComponent(categoryuiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplieruiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseuiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(systemExit1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBounds(10, 170, 120, 250);
        desktopPane.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fileMenu.setText("File");

        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setText("Save As ...");
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setMnemonic('a');
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
        
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About about =new About();
        about.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saleReportiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleReportiButtonActionPerformed
        long salesId = Long.parseLong(JOptionPane.showInputDialog("Enter Sales ID"));
        HashMap hashMap = new HashMap();
        hashMap.put("salesid",salesId);
        MyiReportViewer myReportViewer = new MyiReportViewer("reports/sales.jasper", hashMap);

        myReportViewer.setSize(desktopPane.getWidth(),desktopPane.getHeight());
        desktopPane.add(myReportViewer);
        myReportViewer.setVisible(true);
    }//GEN-LAST:event_saleReportiButtonActionPerformed

    private void stockReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockReportButtonActionPerformed
        MyiReportViewer myReportViewer = new MyiReportViewer("reports/stock.jasper");

        myReportViewer.setSize(desktopPane.getWidth(),desktopPane.getHeight());
        desktopPane.add(myReportViewer);
        myReportViewer.setVisible(true);
    }//GEN-LAST:event_stockReportButtonActionPerformed

    private void dailyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyReportButtonActionPerformed
        MyiReportViewer myReportViewer = new MyiReportViewer("reports/dailyIncome.jasper");

        myReportViewer.setSize(desktopPane.getWidth(),desktopPane.getHeight());
        desktopPane.add(myReportViewer);
        myReportViewer.setVisible(true);
    }//GEN-LAST:event_dailyReportButtonActionPerformed

    private void weeklyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyReportButtonActionPerformed
        MyiReportViewer myReportViewer = new MyiReportViewer("reports/statusReport.jasper");

        myReportViewer.setSize(desktopPane.getWidth(),desktopPane.getHeight());
        desktopPane.add(myReportViewer);
        myReportViewer.setVisible(true);
    }//GEN-LAST:event_weeklyReportButtonActionPerformed

    private void saleuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleuiButtonActionPerformed
       SalesUI salesUI = new SalesUI();
       salesUI.setBounds(300, 100,600,470);
       desktopPane.add(salesUI);
       salesUI.setVisible(true);
    }//GEN-LAST:event_saleuiButtonActionPerformed

    private void customeruiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeruiButtonActionPerformed
       CustomerUI customerUI = new CustomerUI();
       customerUI.setBounds(300, 150,447,305);
       desktopPane.add(customerUI);
       customerUI.setVisible(true);
    }//GEN-LAST:event_customeruiButtonActionPerformed

    private void systemExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemExit1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_systemExit1ActionPerformed

    private void categoryuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryuiButtonActionPerformed
        CategoryUI categoryUI = new CategoryUI();
        categoryUI.setBounds(300, 200,452,200);
        desktopPane.add(categoryUI);
        categoryUI.setVisible(true);
    }//GEN-LAST:event_categoryuiButtonActionPerformed

    private void supplieruiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieruiButtonActionPerformed
        SupplierUI supplierUI = new SupplierUI();
        supplierUI.setBounds(300, 150,430,320);
        desktopPane.add(supplierUI);
        supplierUI.setVisible(true);
    }//GEN-LAST:event_supplieruiButtonActionPerformed

    private void purchaseuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseuiButtonActionPerformed
        PurchaseUI purchaseUI = new PurchaseUI();
        purchaseUI.setBounds(300, 100,615,470);
        desktopPane.add(purchaseUI);
        purchaseUI.setVisible(true);
    }//GEN-LAST:event_purchaseuiButtonActionPerformed

    private void productuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productuiActionPerformed
        ProductUI productUI = new ProductUI();
        productUI.setBounds(300, 150,470,250);
        desktopPane.add(productUI);
        productUI.setVisible(true);
    }//GEN-LAST:event_productuiActionPerformed

    public static void main(String args[]) {
        new SplashScreen(5000);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoryuiButton;
    private javax.swing.JButton customeruiButton;
    private javax.swing.JButton dailyReportButton;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton productui;
    private javax.swing.JButton purchaseuiButton;
    private javax.swing.JButton saleReportiButton;
    private javax.swing.JButton saleuiButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton stockReportButton;
    private javax.swing.JButton supplieruiButton;
    private javax.swing.JButton systemExit1;
    private javax.swing.JButton weeklyReportButton;
    // End of variables declaration//GEN-END:variables

}