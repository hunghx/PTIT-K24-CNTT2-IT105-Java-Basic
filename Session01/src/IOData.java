import java.util.Scanner;

public class IOData {
    // Reset
    public static final String RESET = "\u001B[0m";

    // Màu chữ (Foreground)
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Màu nền (Background)
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    public static void main(String[] args) {
        // Nhập dữ liệu
        Scanner input; // ko có vùng nhớ : null
        input = new Scanner(System.in); // cấp phát động
        // Nhập chuỗi
//        String name;
//        System.out.println("Nhập tên của bạn: ");
//        name = input.nextLine();
//        System.out.println("Xin chào " + name);
//        System.out.println("Nhap 1 kí tự : ");
//        char ch = input.nextLine().charAt(0); // nhập ký tự
//        System.out.println("Kí tự bạn vừa nhập là : " + ch);
//
//        // nhập khác chuỗi : boolean, byte, short, int, long, float, double
//        System.out.println("Nhập tuổi của bạn: ");
//        int age = Integer.parseInt(input.nextLine());
//        System.out.println("Tuổi của bạn là: " + age);
//
//        // Lưu ý : khi nhập số rồi nhập chuỗi thì phải đọc bỏ dòng mới còn thừa
////        input.nextLine(); // đọc bỏ dòng mới còn thừa sau khi nhập số
//        System.out.println("Nhập số điện thoại của bạn: ");
//        String phone = input.nextLine(); // đọc bỏ dòng mới
//        System.out.println("Số điện thoại của bạn là: " + phone);
//
//
        // xuất dữ liệu
        System.out.print("Helllo"); // ko xuống dòng
        System.out.print(" World\n"); // xuống dòng thủ công
        System.out.println("Hello World"); // tự động xuống dòng
        // in theo định dạng
        // Kí tự đại diện : %s (string), %c (char), %d (int, byte, short, long), %f (float, double)
        // kí tự điều khiển : \n,%n (xuống dòng), \t (tab)
        System.out.printf("In định dạng :%nTên tôi là %s, năm nay tôi %d tuổi","Hung HX", 18);
        System.out.println("✅😒😊👌😘💕╰(*°▽°*)╯(❁´◡`❁)(●'◡'●)☆*: .｡. o(≧▽≦)o .｡.:*☆(*/ω＼*)(^///^)");


        // in lôi đỏ
        System.out.printf("%sLỗi rồi bạn ơi!%s%n", RED, RESET);

        System.err.println("Lỗi rồi bạn ơi!"); // lệnh bất đồng bộ với System.out
    }
}
