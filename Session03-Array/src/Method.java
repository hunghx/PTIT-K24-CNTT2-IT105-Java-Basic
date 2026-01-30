import java.util.Scanner;

public class Method {
    // Phương thức : hàm, thủ tục
    // Tính tổng 2 số thực và trả về kết quả
    public double sum1(double a, double b){
        return a+b;
    }
    public static int sum2(int a, int b){
        return a+b;
    }
    // gọi phương thưc
    public static void main(String[] args) { // vùng nhớ tĩnh
        Scanner input = new Scanner(System.in); // cấp phát động
        input.nextInt();
//        double rs =  sum(1,2);
//        System.out.println("Kết quả: " + rs);
        Method method = new Method(); // phải cấp phát động
        double rs = method.sum1(1,2);
        System.out.println("Kết quả: " + rs);

        int kq = sum2(3,4);
        System.out.println("Kết quả: " + kq);

        // Kiểm tra số nguyen to
        int n = 29;
        boolean flag = true; // giả sử là số nguyên tố
        if(n < 2){
            flag = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không phải số nguyên tố");
            }

        }
    }
}
