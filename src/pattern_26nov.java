public class pattern_26nov {
    public static void main(String[] args) {

        System.out.println("PROBLRM 7:");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("PROBLEM 8: ");
        for(int i=1;i<=5;i++){
            for (int j=5+1-i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("OR");
        for(int i=5;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("PROBLEM 9: ");
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("PROBLEM 10 :");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("PROBLEM 11:");

            for (int i=1;i<=5;i++){
                for (int j=5;j>=5-i;j--){
                    System.out.print("");
                }
                for (int k=i;k<=1;k++)
                    System.out.print(k);
            }
        System.out.println();


    }
}
