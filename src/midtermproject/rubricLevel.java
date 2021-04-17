/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

/**
 *
 * @author Windows 10
 */
public class rubricLevel {
    private double level1;
    private double level2;
    private double level3;
    private double level4;

    public rubricLevel() {
    }

    public rubricLevel(double level1, double level2, double level3, double level4) {
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.level4 = level4;
    }

    public double getLevel1() {
        return level1;
    }

    public double getLevel2() {
        return level2;
    }

    public double getLevel3() {
        return level3;
    }

    public double getLevel4() {
        return level4;
    }
    
    
    
}
