/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumefilter;

/**
 *
 * @author Babar Hussain
 */
public class FolderItem {
    int resumeCount;
    String location;

    public FolderItem(int resumeCount, String location) {
        this.resumeCount = resumeCount;
        this.location = location;
    }

    public int getResumeCount() {
        return resumeCount;
    }

    public void setResumeCount(int resumeCount) {
        this.resumeCount = resumeCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
//        return location + " (" + resumeCount+  ")";
        return location;
    }
    
    
    
    
}
