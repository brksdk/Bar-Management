/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Berk
 */
public class createDrink {
    public void Drink()
    {
        String ben="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\Getränklist.csv";
       

    try
    {       
        FileWriter fw= new FileWriter(ben,true);
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
        pw.printf(Start.jTextField1.getText()+",");
        pw.printf(Start.jTextField2.getText()+",");
        String zet=(String)Start.jComboBox1.getSelectedItem();
        pw.printf(zet+",");
        String zet2=(String)Start.jComboBox3.getSelectedItem();
        pw.printf(zet2+",");
        String zet3=(String)Start.jComboBox4.getSelectedItem();
        pw.printf(zet3);
        pw.printf("\n");
        pw.flush();
	pw.close();
        fw.close();
 }    
    catch(Exception e) {
	   e.printStackTrace();
	  }
}
}    
