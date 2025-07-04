/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.ItemDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ItemForm extends javax.swing.JFrame {
 private ItemController itemController=new ItemController();
 
    /**
     * Creates new form ItemForm
     */
    public ItemForm() {
        initComponents();
        loadTable();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        textItemCode = new javax.swing.JTextField();
        lblItemCode = new javax.swing.JLabel();
        lblsize = new javax.swing.JLabel();
        textsize = new javax.swing.JTextField();
        textdesc = new javax.swing.JTextField();
        lbldesc = new javax.swing.JLabel();
        textqoh = new javax.swing.JTextField();
        lblqoh = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        textprice = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblitem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(102, 102, 0));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Item");

        textItemCode.setForeground(new java.awt.Color(255, 204, 255));
        textItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textItemCodeActionPerformed(evt);
            }
        });

        lblItemCode.setBackground(new java.awt.Color(102, 255, 255));
        lblItemCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblItemCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemCode.setText("Item Code");

        lblsize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsize.setText("Pack Size");

        textsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsizeActionPerformed(evt);
            }
        });

        textdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdescActionPerformed(evt);
            }
        });

        lbldesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldesc.setText("Description");

        textqoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textqohActionPerformed(evt);
            }
        });

        lblqoh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblqoh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqoh.setText("QOH");

        lblprice.setBackground(new java.awt.Color(153, 255, 255));
        lblprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprice.setText("Unit Price");

        textprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpriceActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        tblitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblitemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblitem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbldesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsize, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textsize, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndelete)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsave)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldesc, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(textdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsize)
                    .addComponent(textsize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblqoh)
                        .addComponent(textqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnupdate)
                        .addComponent(btnsave))
                    .addComponent(btndelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textsizeActionPerformed

    private void textqohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textqohActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textqohActionPerformed

    private void textpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpriceActionPerformed

    private void textItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textItemCodeActionPerformed

    private void textdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdescActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        saveItem();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblitemMouseClicked
        // TODO add your handling code here:
        searchItem();
    }//GEN-LAST:event_tblitemMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updateItem();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        deleteItem();
    }//GEN-LAST:event_btndeleteActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblqoh;
    private javax.swing.JLabel lblsize;
    private javax.swing.JTable tblitem;
    private javax.swing.JTextField textItemCode;
    private javax.swing.JTextField textdesc;
    private javax.swing.JTextField textprice;
    private javax.swing.JTextField textqoh;
    private javax.swing.JTextField textsize;
    // End of variables declaration//GEN-END:variables

    private void saveItem() {
    ItemDto itemDto = new ItemDto(
    textItemCode.getText(),
    textdesc.getText(), 
    textsize.getText(),
    Double.parseDouble(textprice.getText()),
    Integer.parseInt(textqoh.getText()));


    System.out.println(itemDto);
        try {
            String resp=itemController.saveItem( itemDto);
            JOptionPane.showMessageDialog(this, resp);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());    
        }
}

    private void loadTable() {
       String [] columns={"Item code","Description","Pack size","Unit price","Qty On Hand"};
        DefaultTableModel dtm=new DefaultTableModel(columns,0){
            @Override
            public boolean isCellEditable(int row,int column){
               return false; 
            }
        };
       tblitem.setModel(dtm);  
        try {
            ArrayList<ItemDto>itemDtos=itemController.getAll();
            for (ItemDto itemDto: itemDtos){
                Object[] rowData={itemDto.getItemCode(),itemDto.getDescription(),itemDto.getPackSize(),itemDto.getUnitPrice(),itemDto.getQoh()};
            dtm.addRow(rowData);
            }
                
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clear() {
       textItemCode.setText("");
       textdesc.setText("");
       textprice.setText("");
       textqoh.setText("");
       textsize.setText("");
    }

    private void searchItem() {
        String itemCode=(String)tblitem.getValueAt(tblitem.getSelectedRow(),0);
        try {
            ItemDto itemDto=itemController.getItem(itemCode);
            textItemCode.setText(itemDto.getItemCode());
            textdesc.setText(itemDto.getDescription());
            textsize.setText(itemDto.getPackSize());
            textqoh.setText(Integer.toString(itemDto.getQoh()));
            textprice.setText(Double.toString(itemDto.getUnitPrice()));
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
}

    private void updateItem() {
        ItemDto itemDto = new ItemDto(
    textItemCode.getText(),
    textdesc.getText(), 
    textsize.getText(),
    Double.parseDouble(textprice.getText()),
    Integer.parseInt(textqoh.getText()));


    System.out.println(itemDto);
        try {
            String resp=itemController.updateItem( itemDto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       }

    private void deleteItem() {
       

    
        try {
            String resp=itemController.deleteItem( textItemCode.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    

}
