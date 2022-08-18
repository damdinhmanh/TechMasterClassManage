package Class_Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Student list
        Student student1 = new Student("001", "Nguyen Van A", 23, "bad");
        Student student2 = new Student("002", "Nguyen Van B", 29, "medium");
        Student student3 = new Student("003", "Nguyen Van C", 26, "good");
    
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //Create staff list
        Staff teacher = new Staff("Teacher");
        Staff supporter = new Staff("Class Supporter");

        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(teacher);
        staffList.add(supporter);

        //Create Class
        Class fullstackClass = new Class();
        fullstackClass.setClassName("Java FullStack");
        fullstackClass.setStudentList(studentList);

        //Create Center 
        Center center = new Center();
        center.setClassVar(fullstackClass);
        center.setStaffList(staffList);

        //Display Center infors
        System.out.printf("\n\nOriginal center infors: \n");
        center.displayCenterInfors();

        //Add student to class
        Student student4 = new Student("004", "Nguyen Van D", 25, "medium");
        center.getClassVar().addStudent(student4);

        //Update student level by input id
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n\nInput student id: ");
        String studentId = scanner.nextLine();

        System.out.printf("\nInput new level: ");
        String studentLevel = scanner.nextLine();

        center.getClassVar().updateStudentLevelById(studentId, studentLevel);

        System.out.printf("\n\nUpdated center infors: \n");
        center.displayCenterInfors();

        //Remove a student from class
        System.out.printf("\n\nInput removing student id: ");
        String removeStudentId = scanner.nextLine();
        center.getClassVar().removeStudentById(removeStudentId);
        center.displayCenterInfors();

        //close scanner
        scanner.close();
    }
}
