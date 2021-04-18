/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.formula.functions.Column;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Windows 10
 */
public class PLO {
    
    List<CLO> PLO1 = new ArrayList<CLO>();
    List<CLO> PLO2 = new ArrayList<CLO>();
    List<CLO> PLO3 = new ArrayList<CLO>();
    
    
    boolean writePLOInExcel(teacher t) throws FileNotFoundException, IOException
    {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(t.name);
        int r = 0;
        int c = 0;
        
        Row row = sheet.createRow(r++);
        Cell cell = row.createCell(c);
        
        cell.setCellValue(t.name);
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.cnic);
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.phoneNumber);
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.username);
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.password);
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.getCourseTitle());
        row = sheet.createRow(r++);
        cell = row.createCell(c);
        
        cell.setCellValue(t.getCourseCode());
        
       
        
//        for (CLO clo : this.PLO1) {
//            row = sheet.createRow(r++);
//            cell = row.createCell(c);
//            cell.setCellValue("1");
//            
//            row = sheet.createRow(r);
//            cell = row.createCell(++c);
//            cell.setCellValue(String.valueOf(clo.getCloNumber()));
//            
//            row = sheet.createRow(r);
//            cell = row.createCell(++c);
//            cell.setCellValue(clo.getCloDescription());
//            c = 0;
//            r++;
//            for (rubrics rub : clo.rubricList) {
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getCloNumber());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getComponentName());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getComponentMarks());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getRequirement1());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getRequirement2());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getRequirement3());
//                
//                row = sheet.createRow(r);
//                cell = row.createCell(c++);
//                cell.setCellValue(rub.getRequirement4());
//                
//            }
//            
//        }
        
        try (FileOutputStream outputStream = new FileOutputStream("CLOandPLO.xlsx")) {
            workbook.write(outputStream);
            return true;
        }
//        return false;
    }
    boolean savePLO(teacher t)
    {
        try {
            FileWriter save = new FileWriter(t.name+"txt", true);
            save.write(t.name+","+t.getCourseTitle()+","+t.getCourseCode()+","+t.cnic+","+t.phoneNumber+","+t.username+","+t.password+"\n");
        } catch (IOException ex) {
            Logger.getLogger(PLO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}



