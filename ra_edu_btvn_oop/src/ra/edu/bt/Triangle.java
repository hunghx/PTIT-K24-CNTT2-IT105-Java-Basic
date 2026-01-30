package ra.edu.bt;

import ra.edu.validate.Validator;

import java.util.Scanner;

public class Triangle {
    private double a,b,c;

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // nhập vapf
    public void inputData(Scanner in){
//        System.out.println("Nhập cạnh a: ");
        a = Validator.inputPositiveInt(in,"Nhập cạnh a: ");
//        System.out.println("Nhập cạnh b: ");
        b = Validator.inputPositiveInt(in,"Nhập cạnh b: ");
//        System.out.println("Nhập cạnh c: ");
        c = Validator.inputPositiveInt(in,"Nhập cạnh c: ");
    }
    public boolean isTriangle(){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public void displayData(){
        System.out.printf("Cạnh a: %.2f, Cạnh b: %.2f, Cạnh c: %.2f\n",a,b,c);
    }
    public double calculatePerimeter(){
        return a+b+c;
    }
    public double calculateArea(){
        // công thức Heron
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
