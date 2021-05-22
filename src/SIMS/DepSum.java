/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMS;

/**
 *
 * @author Sujan
 */
public class DepSum {
    private String dname;
    private int count;

    public DepSum(String dname, int count) {
        this.dname = dname;
        this.count = count;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
