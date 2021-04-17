/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class adminClass {
    List<teacher>teachetList = new ArrayList<teacher>();
    List<studentClass>studentList = new ArrayList<studentClass>();
    
    void addTeacher(teacher t) throws IOException
    {
        this.loadTeacher();
        
        this.teachetList.add(t);
        if (this.saveTeacher()) {
            JOptionPane.showMessageDialog(null, "Teacher added successfully", "Adding Teacher", 2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Enable to Add teacher", "Adding Teacher", 0);
        }
        
    }
    void addStudent(studentClass s)
    {
        this.studentList.add(s);
        JOptionPane.showMessageDialog(null, "Student added successfully", "Adding Student", 2);
    }
    
   boolean saveTeacher() throws IOException
   {
        try (FileWriter save = new FileWriter("Teacher.txt",false)) {
            for (teacher t : this.teachetList) {
                save.write(t.name+","+t.getCourseTitle()+","+t.getCourseCode()+","+t.cnic+","+t.phoneNumber+","+t.username+","+t.password+"\n");
            }
            
            save.flush();
            return true;
        }
        catch(IOException ex){
            return false;
        }
       
       
   }
   boolean saveStudent() throws IOException
   {
        try (FileWriter save = new FileWriter("Student.txt",false)) {
            for (studentClass t : this.studentList) {
                save.write(t.name+","+t.getRegNo()+","+t.getSession()+","+t.cnic+","+t.phoneNumber+","+t.username+","+t.password+"\n");
            }
            
            save.flush();
            save.close();
            return true;
        }
        catch(IOException ex){
            return false;
        }
       
       
   }
   
   void loadTeacher() throws IOException
   {
        FileReader fr;
        try {
            fr = new FileReader("Teacher.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = br.readLine();
                
                while (line!=null) {
                    teacher t = new teacher();
                    String []split = line.split(",");
                    t.name = split[0];
                    t.setCourseTitle(split[1]);
                    t.setCourseCode(split[2]);
                    t.cnic = split[3];
                    t.phoneNumber = split[4];
                    t.username = split[5];
                    t.password = split[6];
                    
                    this.teachetList.add(t);
                    line = br.readLine();
                }
                br.close();
                fr.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   void loadStudent() throws IOException
   {
        FileReader f;
        try {
            f = new FileReader("Student.txt");
            try (BufferedReader br = new BufferedReader(f)) {
                String line = br.readLine();
                
                while (line!=null) {
                    studentClass t = new studentClass();
                    String []split = line.split(",");
                    t.name = split[0];
                    t.setRegNo(split[1]);
                    t.setSession(split[2]);
                    t.cnic = split[3];
                    t.phoneNumber = split[4];
                    t.username = split[5];
                    t.password = split[6];
                    
                    this.studentList.add(t);
                    line = br.readLine();
                }
                f.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   
   
   
}
