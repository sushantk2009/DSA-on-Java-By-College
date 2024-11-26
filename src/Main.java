import java.awt.font.FontRenderContext;

public class Main {
    public static void main(String[] args) {
        //Jump Statement
//        for(int i=1;i<=10;i++){
//            if (i==3)break;
//            System.out.println(i+" ");
//        }


        //Not multiple of 3
//        for(int i=1;i<=100;i++){
//            if (i%3==0)
//                continue;;
//            System.out.println(i+" ");
//        }


//        //PRINT 1 TO 10 USING FOR LOOP
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }


        //WHILE LOOP
        //print 1 to 10 using while loop
//        int i=1;
//        while(i<=10) {
//            System.out.println(i+" ");
//            i++;
//        }



        //1 to 10 using do while loop
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=10);


        //Infinite loop
//        for(;;){
//        System.out.println("hii");
//        }


        //Infinite loop without test condition
//        for (int i=0; ;i++){
//            System.out.println("Sushant");
//        }
        //NESTED FOR LOOP
//        for(int i=1;i<=5;i++) {
//            for (int j = 1; j <= 3; j++)
//                System.out.print("$");
//        }

        //PROBLEM 1
        //print 5 rows ,3 col

        System.out.println("PROBLEM 1:");
        for (int i=1;i<=5;i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("$");
            System.out.println(" ");
        }


                //PROBLEM 2
        System.out.println("PROBLEM 3:");
            for(int i=1;i<=5;i++){
                for (int j=1;j<=i;j++)
                    System.out.print("$");
                System.out.println("");
            }


        //PROBLRM 3
        System.out.println("PROBLEM 3:");
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println(" ");
        }

        //PROBLEM 4
        System.out.println("PROBLEM 4:");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++)
                    System.out.print(i);
                System.out.println(" ");
            }

         //PROBLEM 5
        System.out.println("PROBLEM 5:");
        for (int i=5;i>=1;i--){
            for (int j=i;j>=1;j--)
                System.out.print("$");
            System.out.println(" ");
        }

        //PROBLEM 6
        System.out.println("PROBLRM 6: ");
        for(int i=5;i>=1;i--){
            for (int j=1;j<=i;j++) {
                System.out.print(j);

            }
                System.out.println(" ");
        }


        //PROBLEM 7
//        System.out.println("PROBLEM 7:");
//        for (int i=1;i<=5;i++){
//            for (int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            System.out.println();
//        }
        //PROBLEM 8

        System.out.println("PROBLEM 8:");
        for (int i=1;i<=4;i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--){
                System.out.print("*");
            }
            for(int l=3;    l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}