public class Table {
    public static void main(String[] args) {
      // Tiêu đề cột
        System.out.println(IOData.YELLOW);
        System.out.println("+-----+--------------+--------------+------------+------------+");
        System.out.printf("| %-3s | %-12s | %-12s | %-10s | %-10s |%n", "ID", "Name", "CountryCode", "District", "Population");
        // in dữ liệu
        System.out.println("+-----+--------------+--------------+------------+------------+");
        System.out.printf("| %-3s | %-12s | %-12s | %-10s | %-10s |%n", "1", "Hà Nội", "VN", "Hà Nội", "8000000");
        System.out.printf("| %-3s | %-12s | %-12s | %-10s | %-10s |%n", "2", "Hà Nội", "VN", "Hà Nội", "999999");
        System.out.printf("| %-3s | %-12s | %-12s | %-10s | %-10s |%n", "3", "Hà Nội", "VN", "Hà Nội", "700000");
        System.out.printf("| %-3s | %-12s | %-12s | %-10s | %-10s |%n", "4", "Hà Nội", "VN", "Hà Nội", "10000");
        System.out.println("+-----+--------------+--------------+------------+------------+");
        System.out.println(IOData.RESET);

        // in menu nhiều dòng
        System.out.println("""
                +---------------------MENU----------------------+
                | 1. Thêm mới thành phố                         |
                | 2. Cập nhật thông tin thành phố               |
                | 3. Xóa thành phố                              |
                | 4. Hiển thị danh sách thành phố               |
                | 5. Tìm kiếm thành phố theo tên                |
                | 6. Thoát chương trình                         |
                +-----------------------------------------------+
                """);

    }
}
