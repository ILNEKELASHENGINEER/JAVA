import java.util.*;
class main{
    public static void main(String args[]){
        int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        demo s = new demo();
        s.get(10,20);
        s.fun(a,b);
    }
}
class demo{
    void get(int x,int y){
        System.out.println("Value of X: "+x);
        System.out.println("Value of Y: "+y);
    }
    void fun(int x,int y){
        System.out.println("Value of X: "+x);
        System.out.println("Value of Y: "+y);
    }
}
