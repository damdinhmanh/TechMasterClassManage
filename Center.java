package Class_Management;

import java.util.ArrayList;

public class Center {
    private ArrayList<Staff> staffList;
    private Class classVar;

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public void setClassVar(Class classVar) {
        this.classVar = classVar;
    }

    public void displayCenterInfors() {
        System.out.println("Class Name: " + classVar.getClassName() + ", " +  staffList.toString() + ", " + classVar.getStudentList().toString());
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public Class getClassVar() {
        return classVar;
    }
}
