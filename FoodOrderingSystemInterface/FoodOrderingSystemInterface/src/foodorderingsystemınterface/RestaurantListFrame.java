/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystemınterface;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author qwe
 */
public class RestaurantListFrame extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantListFrame
     */
    public RestaurantListFrame() {
        initComponents();
        
        RestaurantTable.setAutoCreateRowSorter(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        RestaurantTable = new javax.swing.JTable();
        restaurantNameButton = new javax.swing.JRadioButton();
        kitchenTypeButton = new javax.swing.JRadioButton();
        lowPriceButton = new javax.swing.JRadioButton();
        highPriceButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cart = new javax.swing.JList<>();
        orderCartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addCartButton = new javax.swing.JButton();
        clearCartButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        totalPriceText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        RestaurantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Product Name", "Price", "Product Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RestaurantTable);

        sortButtonGroup.add(restaurantNameButton);
        restaurantNameButton.setText("By Restaurant");
        restaurantNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantNameButtonActionPerformed(evt);
            }
        });

        sortButtonGroup.add(kitchenTypeButton);
        kitchenTypeButton.setText("By Kitchen Type");
        kitchenTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenTypeButtonActionPerformed(evt);
            }
        });

        sortButtonGroup.add(lowPriceButton);
        lowPriceButton.setText("By Lowest Price");
        lowPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowPriceButtonActionPerformed(evt);
            }
        });

        sortButtonGroup.add(highPriceButton);
        highPriceButton.setText("By Highest Price");
        highPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highPriceButtonActionPerformed(evt);
            }
        });

        Cart.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Items" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Cart);

        orderCartButton.setText("Order");
        orderCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderCartButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Cart");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Restaurant List");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Sort");

        addCartButton.setText("Add");
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });

        clearCartButton.setText("Clear");
        clearCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCartButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(orderCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clearCartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(restaurantNameButton)
                        .addComponent(kitchenTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lowPriceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(highPriceButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restaurantNameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kitchenTypeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lowPriceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(highPriceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(totalPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(clearCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderCartButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCartButton)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultListModel<String> modelList = new DefaultListModel<>();
    
    static int totalPrice=0;
    
    private void orderCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderCartButtonActionPerformed
        if(totalPrice==0){
            JOptionPane.showMessageDialog(null, "Your card is empty!", "Empty Card", JOptionPane.ERROR_MESSAGE);
            
        }
        else{
        PaymentFrame paymentFrame = new PaymentFrame();
        paymentFrame.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_orderCartButtonActionPerformed

    private void restaurantNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantNameButtonActionPerformed
        ArrayList<Food> foodList= readTxt();
        Collections.sort(foodList, new sortByRestaurant());
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
    }//GEN-LAST:event_restaurantNameButtonActionPerformed

    private void lowPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowPriceButtonActionPerformed
        ArrayList<Food> foodList= readTxt();
        Collections.sort(foodList, new sortByPrice());
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
    }//GEN-LAST:event_lowPriceButtonActionPerformed

    private void clearCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCartButtonActionPerformed
        Cart.setModel(new DefaultListModel());
        if(Cart.getSelectedIndex() != -1){
            Cart.remove(Cart.getSelectedIndex());
        }
        else{
            Cart.removeAll();
            modelList.removeAllElements();
            totalPrice=0;
            totalPriceText.setText(Integer.toString(totalPrice));
        }
    }//GEN-LAST:event_clearCartButtonActionPerformed
    private ArrayList<Food> readTxt(){
        String filePath = "C:\\Users\\bulen\\Desktop\\FoodOrderingSystemInterface\\FoodOrderingSystemInterface\\src\\foodorderingsystemınterface\\Battalbey Çiğköfte.txt";
        String filePath2 ="C:\\Users\\bulen\\Desktop\\FoodOrderingSystemInterface\\FoodOrderingSystemInterface\\src\\foodorderingsystemınterface\\Kervan Kabap.txt";
        File file = new File(filePath);
        File file2 = new File(filePath2);
        String line = "";  
        String splitBy = ","; 
        ArrayList<Food> foodList = new ArrayList<Food>();
        
        //file reading
        try   
        {  
        //parsing a CSV file into BufferedReader class constructor  
        BufferedReader br = new BufferedReader(new FileReader(file));
       
        while ((line = br.readLine()) != null)   //returns a Boolean value  
        {  
        String[] Food = line.split(splitBy);		// use comma as separator 
        foodList.add(new Food(Food[0], Food[1], Integer.parseInt(Food[2]), Food[3]));
        
        }  
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }
        try   
        {  
        //parsing a CSV file into BufferedReader class constructor  
        BufferedReader br = new BufferedReader(new FileReader(file2));
       
        while ((line = br.readLine()) != null)   //returns a Boolean value  
        {  
        String[] Food = line.split(splitBy);		// use comma as separator 
        foodList.add(new Food(Food[3], Food[1], Integer.parseInt(Food[2]), Food[0]));
        
        }  
        }   
        catch (IOException e)   
        {  
        e.printStackTrace();  
        }
        return foodList;
    }
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
            ArrayList<Food> foodList= readTxt();
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
       
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        
        DefaultTableModel DTM = (DefaultTableModel)RestaurantTable.getModel();
        int selectedIndex=RestaurantTable.getSelectedRow();
        
        int tempPrice=Integer.parseInt(DTM.getValueAt(selectedIndex, 2).toString());
        totalPrice+=tempPrice;
        totalPriceText.setText(Integer.toString(totalPrice));


        
        modelList.addElement( DTM.getValueAt(selectedIndex, 1).toString()+" "+DTM.getValueAt(selectedIndex, 2).toString()+"TL" );
        Cart.setModel(modelList);
    }//GEN-LAST:event_addCartButtonActionPerformed

    private void highPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highPriceButtonActionPerformed
        ArrayList<Food> foodList= readTxt();
        Collections.sort(foodList, new sortByPrice());
        Collections.reverse(foodList);
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
    }//GEN-LAST:event_highPriceButtonActionPerformed

    private void kitchenTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenTypeButtonActionPerformed
        ArrayList<Food> foodList= readTxt();
        Collections.sort(foodList, new sortByKitchenType());
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
    }//GEN-LAST:event_kitchenTypeButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Food> foodList= readTxt();
        DefaultTableModel model = (DefaultTableModel)RestaurantTable.getModel();
        model.setRowCount(0);
        for(int i = 0; i < foodList.size(); i++)
            {
                String name=foodList.get(i).getName();
                String kitchen=foodList.get(i).getKitchenType();
                int price =foodList.get(i).getUnitPrice();
                String type =foodList.get(i).getfoodType();
                Object[] data = { name, kitchen,price,type};
                model.addRow(data);
            }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(RestaurantListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new RestaurantListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Cart;
    private javax.swing.JTable RestaurantTable;
    private javax.swing.JButton addCartButton;
    private javax.swing.JButton clearCartButton;
    private javax.swing.JRadioButton highPriceButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton kitchenTypeButton;
    private javax.swing.JRadioButton lowPriceButton;
    private javax.swing.JButton orderCartButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JRadioButton restaurantNameButton;
    private javax.swing.ButtonGroup sortButtonGroup;
    private javax.swing.JTextField totalPriceText;
    // End of variables declaration//GEN-END:variables
}
