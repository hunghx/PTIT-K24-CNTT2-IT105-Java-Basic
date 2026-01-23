public class Main {
    public static void main(String[] args) {
        // Khai báo biến nguyên thủy
        boolean isJavaFun = true; // đúng hoặc sai
        char ch = 'A'; // ký tự đơn
        byte b = 100; // số nguyên nhỏ
        short s = 1000;
        int i = 1000000;
        long l = 1000000000000L;
        // số thực
        float f = 1.5f;
        double d = 19.99999;
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Character: " + ch);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);


        // ++ và -- (tiền tố và hậu tố)

        int number = 10;
        System.out.println("Result = " + (++number*2-number---number++*2)); // -9
        System.out.println("Final number = " + number);//11
        // tên biến : _ và $
        int $a = 10; // PHP
        int _b = 20; // JavaScript


    }
}