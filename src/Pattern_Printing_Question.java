import java.sql.SQLOutput;

public class Pattern_Printing_Question {
    public static void main(String[]args) {

        //PROBLEM :1
        System.out.println("PROBLEM    1:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //PROBLEM :2
        System.out.println("PROBLEM 2  :");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        //PROBLEM :3
        System.out.println("PROBLEM 3:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PROBLEM :4
        System.out.println("PROBLEM 4:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //PROBLEM 5:
        System.out.println("PROBLEM 5:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
        }


        //PROBLEM 6:
        System.out.println("PROBLEM 6: ");

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }


        //PROBLEM 7:

        System.out.println("PROBLEM 7:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //PROBLRM 8:
        System.out.println("PROBLEM 8:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //PROBLEM 9:.
        System.out.println("PROBLEM 9:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }


        //PROBLEM 10:
        System.out.println("PROBLEM 10");
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //         (OR)

//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//
//                if(i>=2 && j<=i-1){
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {  // Outer loop for rows
//            for (int j = 1; j <= 5; j++) {  // Inner loop for columns
//                if (i + j == 5) {  // Condition for opposite diagonal
//                    System.out.print("*");
//                } else {  // Print space for all other positions
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();  // Move to the next line
//        }

        System.out.println("PROBLEM 11:");
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+number);
                number++;
            }
            System.out.println();
        }

        System.out.println("PROBLEM 12:");
        int num=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }





    }
}














