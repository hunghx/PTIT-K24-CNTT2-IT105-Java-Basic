package ra.edu;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Student student = new Student(); // cấp phat bộ nhớ cho đối tượng Student
        // Gán các thông tin của dối tượng
        student.studentId = "S001";
        student.fullName = "Nguyen Van A";
        student.email = "a@gmail.com";
//        student.phoneNumber = "0123456789";
        student.setPhoneNumber("0123456789");
        student.dateOfBirth = new Date(); // 30/1/2026
        // gọi phương thức
        student.checkIn();
        student.doHomework();
        // Object và Instance
        Student s2 = new Student("S002", "Le Thi B", "B@gmail.com","098943785");
        s2.fullName = "Tran Thi B";
        System.out.println(s2.fullName);
        System.out.println(student.fullName);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(student);


        // tất cả các lớp trong Java đều kế thừa từ lớp Object

    }
}
