/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class teacher extends Basic{
    private String courseTitle;
    private String courseCode;
    
    public teacher(String CourseTitle,String Coursecode)
    {
        setCourseTitle(CourseTitle);
        setCourseCode(Coursecode);
    }

    public teacher() {
    }
    

    public void setCourseCode(String courseCode) {
        boolean flag = true;
        for (int i = 0; i < courseCode.length(); i++) {
            if (!((courseCode.charAt(i) >= '0' && courseCode.charAt(i) <= '9') || (courseCode.charAt(i) >= 'a' && courseCode.charAt(i) <= 'z') || (courseCode.charAt(i) >= 'A' && courseCode.charAt(i) <= 'Z'))) {
                flag = false;
            }
        }
        if (flag) {
            this.courseCode = courseCode;
        }
        else{
            JOptionPane.showMessageDialog(null, "Course code must not equal to "+courseCode,"Invalid Course Code" , 0);
        }
        
    }

    public void setCourseTitle(String courseTitle) {
         boolean flag = true;
        for (int i = 0; i < courseTitle.length(); i++) {
            if (!((courseTitle.charAt(i) >= 'a' && courseTitle.charAt(i) <= 'z') || (courseTitle.charAt(i) >= 'A' && courseTitle.charAt(i) <= 'Z') || courseTitle.charAt(i) == ' ')) {
                flag = false;
            }
        }
        if (flag) {
            this.courseTitle = courseTitle;
        }
        else{
            JOptionPane.showMessageDialog(null, "Course name must not equal to "+courseTitle,"Invalid Course Title" , 0);
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
    
    
    
    
    
    
    
}
