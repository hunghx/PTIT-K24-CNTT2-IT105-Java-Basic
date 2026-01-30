package ra.edu;

import java.util.Date;

public class Student { // bản thiết kế
    // Thuộc tính
    String studentId;
    public String fullName;
    Date dateOfBirth; // kiểu cũ
    protected String email;
    private String phoneNumber;

    // Phương thức
    // Phương thức khởi tạo : constructor là 1 phương thức đặc biệt dùng để khởi tạo đối tượng
    public Student(){
        // dùng để thiết lập các giá trị ban đầu cho các thuôc tính
        studentId = "S001";
        fullName = "Nguyen Van A";
        email = "a@gmail.com";
        phoneNumber = "0123456789";
        dateOfBirth = new Date(); // ngày hiện tại
    }
    public Student(String studentId, String fullName, String email, String phoneNumber){
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        dateOfBirth = new Date(); // ngày hiện tại
    }

    void checkIn(){
        System.out.println("Student " + fullName + " checked in at " + new Date());
    }
    void doHomework(){
        System.out.println("Student " + fullName + " is doing homework.");
    }

    // Getter và setter

    public String getPhoneNumber() {

        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank() || !phoneNumber.matches("^[0-9]{10}$")) {
            System.err.println("Số điện thoại không hợp lệ!");
            return;
        }
        this.phoneNumber = phoneNumber;
    }
}
