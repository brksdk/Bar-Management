/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berk;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

/**
 *
 * @author Berk
 */
public class deleteDrink {
    
    public void drinkDelete()
    {       
String file="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\Getränklist.csv";
int stringNumber;
int rowNumber;
stringNumber=Integer.parseInt(Start.jTextField4.getText());
rowNumber=stringNumber-1;
try
{
CSVReader reader2 = new CSVReader(new FileReader(file));
List<String[]> allElements = reader2.readAll();
allElements.remove(rowNumber);
CSVWriter writer = new CSVWriter(new FileWriter(file), ',',
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
writer.writeAll(allElements);
reader2.close();
writer.close();
}
catch(Exception e) {
	   e.printStackTrace();
	  }
  
Start.jTextField4.setText(null);
    }
    
}
