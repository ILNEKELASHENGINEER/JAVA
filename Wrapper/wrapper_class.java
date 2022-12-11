import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        Integer m = Integer.valueOf(a);
        Double n = Double.valueOf(b);
        if(m instanceof Integer){
            System.out.println("An object of Integer is created");
        }
        if(n instanceof Double){
            System.out.println("An object of Double is created");
        }
        
    }
}
/*
INPUT
5
5.65
OUTPUT
An object of Integer is created
An object of Double is created
*/
