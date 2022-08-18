package Class_Management;

import java.util.ArrayList;

public class Class {
    private String className;
    private ArrayList<Student> studentList;

    public void setClassName(String className) {
        this.className = className;
    }
    
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getClassName() {
        return className;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void updateStudentLevelById(String inputId, String newLevel) {
        for (Student student : studentList) {
            if (student.getId().equals(inputId)) {
                student.setLevel(newLevel);
            }
        }
    }

    
    public void removeStudentById(String inputId) {
        for (int idx = 0; idx < studentList.size(); idx++) {
            if (studentList.get(idx).getId().equals(inputId)) {
                studentList.remove(idx);
                break;
            }
        }
    }
}
