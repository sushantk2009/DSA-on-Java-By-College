public class Pattern_Printing_Question {
    public static void main(String[]args){

//        //PROBLEM :1
//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        //PROBLEM :2
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
