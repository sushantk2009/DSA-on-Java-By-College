public class Main {
    public static void main(String[] args) {
        //Jump Statement
//        for(int i=1;i<=10;i++){
//            if (i==3)break;
//            System.out.println(i+" ");
//        }



        //Not multiple of 3
        for(int i=1;i<=100;i++){
            if (i%3==0)
                continue;;
            System.out.println(i+" ");
        }

    }
}