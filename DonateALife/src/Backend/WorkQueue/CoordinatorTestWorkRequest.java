/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.WorkQueue;

import Backend.User.User;

/**
 *
 * @author admin
 */
public class CoordinatorTestWorkRequest extends WorkRequest{
    
    private String testResult;
   

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
