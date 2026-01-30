package ra.demo;

import ra.edu.Student;

public class Main extends Student{
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.studentId = "Sv001"; //
        s1.fullName = "Nguyen Van A";

    }

    public void printEmail(){
        System.out.println(this.email);
        this.email = "XYZ@gmail.com";
    }
}
