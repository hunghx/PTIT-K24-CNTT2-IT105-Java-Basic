package ra.edu.validate;

import ra.edu.config.Constants;

import java.util.Scanner;

public class Validator {
    public static double inputPositiveInt(Scanner sc, String title){
        do{
            System.out.println(title);
            try {
                double value = Double.parseDouble(sc.nextLine());
                if (value>0){
                    return value;
                }
                System.out.printf("%s\n", Constants.ERR_MESSAGE_POSITIVE_NUMBER);
            }catch (NumberFormatException e){
                System.out.printf("%s\n", Constants.ERR_MESSAGE_NUMBER);
            }
//            if(value <= 0){
//                // in lỗi
//                System.out.printf("%s", Constants.ERR_MESSAGE_POSITIVE_NUMBER);
//            }else {
//                return value;
//            }

        }while (true);
    }
}
