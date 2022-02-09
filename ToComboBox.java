/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berk;
import java.io.*;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import javax.swing.DefaultComboBoxModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Berk
 */
public class ToComboBox  {
    public void tcb()throws CsvException
    {
    String file="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\combobox.csv";
    String data="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\kunden.csv";
    String line="";
    String line2="";
   
    try
    { 
        FileWriter fw= new FileWriter(file,true);
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
    BufferedReader br=new BufferedReader(new FileReader(data));
    while((line=br.readLine())!=null)
            {   
              
                String[] record=line.split(",");           
                pw.printf(String.format("%s,", record[0]));
                 
            }
        pw.println();
        pw.flush();
	pw.close();
        fw.close();
        br.close();
        
        BufferedReader br2=new BufferedReader(new FileReader(file));
        while((line2=br2.readLine())!=null)
        {    
             String[] record2=line2.split(",");
             DefaultComboBoxModel model=new DefaultComboBoxModel(record2);
             Start.comboCustomer.setModel(model);
        }
    CSVReader reader2 = new CSVReader(new FileReader(file));
    List<String[]> allElements = reader2.readAll();
    allElements.remove(0);
    CSVWriter writer = new CSVWriter(new FileWriter(file), ',',
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
writer.writeAll(allElements);
br2.close();
writer.close();
    }
    catch(FileNotFoundException e1)
    {
        e1.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    }
    
    
    public void drinkCombo()throws CsvException
    {
            String file2="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\combobox.csv";
    String data2="C:\\Users\\Berk\\Documents\\NetBeansProjects\\Hausubung\\src\\main\\java\\berk\\Getränklist.csv";
    String line3="";
    String line4="";
   
    try
    { 
        FileWriter fw= new FileWriter(file2,true);
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
    BufferedReader br=new BufferedReader(new FileReader(data2));
    while((line3=br.readLine())!=null)
            {   
              
                String[] record=line3.split(",");           
                pw.printf(String.format("%s,", record[0]));
                 
            }
        pw.println();
        pw.flush();
	pw.close();
        fw.close();
        br.close();
        
        BufferedReader br2=new BufferedReader(new FileReader(file2));
        while((line4=br2.readLine())!=null)
        {    
             String[] record2=line4.split(",");
             DefaultComboBoxModel model=new DefaultComboBoxModel(record2);
             Start.ComboDrink.setModel(model);
        }
    CSVReader reader2 = new CSVReader(new FileReader(file2));
    List<String[]> allElements = reader2.readAll();
    allElements.remove(0);
    CSVWriter writer = new CSVWriter(new FileWriter(file2), ',',
                                         CSVWriter.NO_QUOTE_CHARACTER,
                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                         CSVWriter.DEFAULT_LINE_END);
writer.writeAll(allElements);
br2.close();
writer.close();
    }
    catch(FileNotFoundException e1)
    {
        e1.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    }
    
}
