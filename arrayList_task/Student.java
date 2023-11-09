package arrayList_task;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> studentNames= new ArrayList<>();
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);

    }
    static void addStudents(ArrayList<String> studentName ){
        studentName.add("Mark");
        studentName.add("Andrew");
        studentName.add("Beth");
    }
    static void displayStudents(ArrayList<String> studentName){
        for(String student: studentName){
            System.out.println("Student name : "+student);
        }
    }
}
