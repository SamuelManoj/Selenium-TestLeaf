package week3.day1.assignments.MethodOverload;

import week3.day1.assignments.MethodOverload.Students;

public class Execution {
    public static void main(String[] args) {
        Students students = new Students();
        students.getStudentInfo();
        students.getStudentInfo(10);
        students.getStudentInfo(10, "Samuel");
        students.getStudentInfo("text@gmail.com", 88854);
    }
}
