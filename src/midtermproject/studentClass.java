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
public class studentClass extends Basic{
    private String regNo;
    private String session;
    List<Double>obtainedMarks = new ArrayList<>();
    public studentClass() {
    }

    public studentClass(String regNo, String session) {
        this.regNo = regNo;
        this.session = session;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getSession() {
        return session;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setSession(String session) {
        this.session = session;
    }
    
    
    
}
