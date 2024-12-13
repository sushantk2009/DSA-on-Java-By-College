//Pass by value

public class functions_03 {
    public static void fun(int a, int b) {
     a=3;
     b=4;
    }
public static void main(String[]args){
    int x=1;
    int y=2;
    System.out.println(x+" "+y);
    fun(x,y);
    System.out.println(x+" "+y);


}


}
