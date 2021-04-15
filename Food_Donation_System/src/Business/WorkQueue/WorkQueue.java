/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public void removeRequest(OrderWorkRequest request){
        workRequestList.remove(request);
    }
    
    public void clearAllRequest(){
        workRequestList.clear();
    }
    
    public void addRequest(WorkRequest request){
        workRequestList.add(request);
    }
}