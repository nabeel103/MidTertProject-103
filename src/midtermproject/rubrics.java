/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class rubrics {
    
    private int cloNumber;
    private String componentName;
    private double componentMarks;
    
    private String requirement1;
    private String requirement2;
    private String requirement3;
    private String requirement4;
    List<rubricLevel> rubricLevelList = new ArrayList<>();
    
    public rubrics() {
    }

//    public rubrics(String componentName, double componentMarks, String requirement1, String requirement2, String requirement3, String requirement4) {
//        this.componentName = componentName;
//        this.componentMarks = componentMarks;
//        this.requirement1 = requirement1;
//        this.requirement2 = requirement2;
//        this.requirement3 = requirement3;
//        this.requirement4 = requirement4;
//    }

    public rubrics(int cloNumber, String componentName, double componentMarks, String requirement1, String requirement2, String requirement3, String requirement4) {
        this.cloNumber = cloNumber;
        this.componentName = componentName;
        this.componentMarks = componentMarks;
        this.requirement1 = requirement1;
        this.requirement2 = requirement2;
        this.requirement3 = requirement3;
        this.requirement4 = requirement4;
    }
    

    public double getComponentMarks() {
        return componentMarks;
    }

    public String getComponentName() {
        return componentName;
    }

    public String getRequirement1() {
        return requirement1;
    }

    public String getRequirement2() {
        return requirement2;
    }

    public String getRequirement3() {
        return requirement3;
    }

    public String getRequirement4() {
        return requirement4;
    }

    public int getCloNumber() {
        return cloNumber;
    }
    
    
}
