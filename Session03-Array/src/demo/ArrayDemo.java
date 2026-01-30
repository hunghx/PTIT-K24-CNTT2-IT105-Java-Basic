package demo;

public class ArrayDemo {
    public static void main(String[] args) {
        // khái bao mảng
        int[] arrayInt;
        int[][] array2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Object[] arrayObject; // trỏ tới vùng nhớ null
        // cấp phát bộ nhớ cho mảng
        arrayInt = new int[5];
        arrayObject = new Object[3];
        // khởi tạo mảng

        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        arrayObject[0] = "Hello";
        arrayObject[1] = 123;
        arrayObject[2] = true;

        String[] arrayStr = {"Java", "Python", "C++", "JavaScript"};
        // khai báo và khởi tạo trực tiêp

        // kiểm tra độ dài mảng
        System.out.println("Độ dài mảng arrayInt: " + arrayInt.length);

        // duyệt mảng : thuật toán tìm kiêm tuần tự
        // for i : duyệt mảng theo chỉ số
        // duyệt mảng arrayInt tìm ra số lớn nhất
        int max = arrayInt[0];
        for (int i = 1; i < arrayInt.length; i++) {
            if(arrayInt[i]> max){
                max = arrayInt[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng arrayInt: " + max);

        // foreach : duyệt mảng theo giá trị
        for (int element : arrayInt){
            System.out.println("Element: " + element);
        }


        // Kỹ thuật lập trình
        // count , sum, multi, average, min, max , flag , search
        // Đếm  số lượng phần tử trong 1 danh sách cho trước
        // Tính tổng của các phần tử trong mảng số
        // Tính min, max trong 1 danh sách
        // Khi bài toán yêu cầu kiểm tra kết quả là có hay ko mà cần xảy ra
        // điều kiện if ở trong 1 vòng lặp it nhất 1 lần



    }
}
