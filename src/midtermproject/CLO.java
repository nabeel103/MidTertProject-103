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
public class CLO {
    
    private int cloNumber;
    private String cloDescription;
    List<rubrics>rubricList = new ArrayList<rubrics>();

    public void setCloNumber(int cloNumber) {
        this.cloNumber = cloNumber;
    }

    public void setCloDescription(String cloDescription) {
        this.cloDescription = cloDescription;
    }

    public String getCloDescription() {
        return cloDescription;
    }

    public int getCloNumber() {
        return cloNumber;
    }
    
    
    
}
