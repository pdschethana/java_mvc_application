/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.db.DBConnection;
import java.sql.SQLException;
import edu.ijse.mvc.view.ItemForm;
import edu.ijse.mvc.view.OrderForm;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        new ItemForm().setVisible(true);
        new OrderForm().setVisible(true);
    
    
            }
}
        
         
    

