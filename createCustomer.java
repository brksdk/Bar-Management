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
public class createCustomer {
    public void Create()
    {
         String ben="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\kunden.csv";
       

try
{       FileWriter fw= new FileWriter(ben,true);
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
	pw.printf(Start.jtvorname.getText()+",");
        pw.printf(Start.jtnachname.getText()+",");
        pw.printf(Start.jtdatum.getText()+",");
        String sex=(String)Start.jComboBox2.getSelectedItem();
        pw.printf(sex+",");
        pw.printf(Start.jtland.getText()+",");
        pw.printf(Start.jtstadt.getText()+",");
        pw.printf(Start.jtbezirk.getText()+",");
        pw.printf(Start.jtstrasse.getText()+",");
        pw.printf(Start.jthaus.getText()+",");
        pw.printf(Start.jttur.getText()+",");
        pw.printf(Start.jtplz.getText());
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

