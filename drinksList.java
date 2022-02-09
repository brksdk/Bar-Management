package berk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Berk
 */
public class drinksList
  {
    int a=1;
    public void drinkList() {     
  String file = "C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\Getränklist.csv";
  Start.jTextArea3.setText(null);
  Start.jTextArea3.append("ID         Drink             Preis(Euro)       Hauptzutat        WeitereZutat      Aromas\n\n");
  BufferedReader reader = null;
  String line = "";
  try {
   reader = new BufferedReader(new FileReader(file));
   while((line = reader.readLine()) != null) {
    Start.jTextArea3.append(String.format("%-3s        ",a));
    String[] row = line.split(",");
    for(String index : row) {
       
     Start.jTextArea3.append(String.format("%-18s",index));
    }
    Start.jTextArea3.append("\n");
    a++;
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
