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
public class deleteCustomer {
    
    public void deleteCst()
    {
        String file="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\kunden.csv";
int stringNumber;
int rowNumber;
stringNumber=Integer.parseInt(Start.jTextField3.getText());
rowNumber=stringNumber-1;
try
{
CSVReader reader3 = new CSVReader(new FileReader(file));
List<String[]> allElements = reader3.readAll();
allElements.remove(rowNumber);
CSVWriter writer = new CSVWriter(new FileWriter(file), ',',
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
writer.writeAll(allElements);
reader3.close();
writer.close();
}
catch(Exception e) {
	   e.printStackTrace();
	  }
  
Start.jTextField3.setText(null);
    }
    
}
