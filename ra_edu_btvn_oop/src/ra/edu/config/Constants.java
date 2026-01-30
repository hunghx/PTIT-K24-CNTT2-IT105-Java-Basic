package ra.edu.config;

public class Constants {
    // Mã màu
    // thông báo : thành công và lỗi
    // Biến hằng để tính toán

    // Reset (trở về mặc định)
    public static final String RESET  = "\u001B[0m";

    // Màu chữ (Foreground)
    public static final String BLACK  = "\u001B[30m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    // Màu nền (Background)
    public static final String BG_BLACK  = "\u001B[40m";
    public static final String BG_RED    = "\u001B[41m";
    public static final String BG_GREEN  = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE   = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN   = "\u001B[46m";
    public static final String BG_WHITE  = "\u001B[47m";



    // thông báo
    public static final String ERR_MESSAGE_POSITIVE_NUMBER = RED + "Lỗi: Vui lòng nhập số dương!" + RESET;
    public static final String ERR_MESSAGE_NUMBER = RED + "Lỗi: Không phải là số!" + RESET;
    public static final String ERR_MESSAGE_TRIANGLE_INVALID = RED + "Lỗi: Ba cạnh không hợp lệ để tạo thành tam giác!" + RESET;
}
