/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Berk
 */
public class customerList {
    
    public void Listing() {
  int k=1;
  String file = "C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\kunden.csv";
  Start.jTextArea1.setText(null);
  Start.jTextArea1.append("ID    Vorname        Nachname       Geburtsdatum   Geschlecht     Land           Stadt          Bezirk         Strasse        Hausnummer     Turnummer      PLZ\n\n");
  BufferedReader reader = null;
  String line = "";
  try {
   reader = new BufferedReader(new FileReader(file));
   while((line = reader.readLine()) != null) {
       
    Start.jTextArea1.append(String.format("%-3s   ",k));
    k++;
    String[] row = line.split(",");
    for(String index : row) {
     
     Start.jTextArea1.append(String.format("%-15s",index));
    }
    Start.jTextArea1.append("\n");
    
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
  finally {
   try {
    reader.close();
   }
   catch (IOException e) {
    e.printStackTrace();
   } 
  }
}
}
