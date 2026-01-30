package ra.edu.bt;

import ra.edu.config.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Yeu cầu nhập 3 cạnh của 1 tam giác :
        // kiểm tra tinhs hợp lệ của 3 cạnh :
        - ko được nhập số âm hoặc bằng 0
        - tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại
        Nếu hợp lệ thì tính chu vi và diện tích tam giác và in ra
        Nếu ko hợp lệ thì in ra thông báo lỗi
         */
        // tạo máy nhập
        Scanner sc = new Scanner(System.in);

        // tạo đối tượng
        Triangle tri = new Triangle();
        do{
            System.out.println("Nhập 3 cạnh của tam giác:\n");
            tri.inputData(sc);
            if (tri.isTriangle()){
                break;
            }
            System.out.printf("%s\n", Constants.ERR_MESSAGE_TRIANGLE_INVALID);
        }while (true);

        // tính chu vi và diện tích
        double perimeter = tri.calculatePerimeter();
        double area = tri.calculateArea();
        // in kết quả
        tri.displayData();
        System.out.printf("Chu vi tam giác: %.2f\n",perimeter);
        System.out.printf("Diện tích tam giác: %.2f\n",area);
        sc.close();

    }
}
