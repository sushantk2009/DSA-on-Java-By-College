import java.util.Scanner;

public class hacker_rank_1 {
    public static void main(String[] args) {
//        //PROBLEM 1:
//        int x,y,z;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter X : ");
//        x=sc.nextInt();
//        System.out.println("Enter Y : ");
//        y=sc.nextInt();
//        System.out.println("Enter Z : ");
//        z=sc.nextInt();
//        if (x>=0 && x<=100 && y>=0 && y<=100 && z>=0 && z<=100){
//            if (x>y){
//                if(x>z)
//                    System.out.println("The Largest Number is : "+x);
//                else
//                    System.out.println("The Largest Number is : "+z);
//            }
//            else {
//                if (y>z)
//                    System.out.println("The Largest Number is : "+y);
//                else
//                    System.out.println("The Largest Number is : "+z);
//            }
//        }
        //PROBLEM : 2
        char startchar='A';
        char endchar='C';
        for (char i=endchar;i>=startchar;i--){
            for(char j=i;j<=endchar;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //PROBLAM : 3


    }
}
