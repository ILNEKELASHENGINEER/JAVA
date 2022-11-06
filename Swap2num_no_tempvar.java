import java.util.*;
class Main{
  public static void main(String []args){
    int a,b;
    Scanner in = new Scanner(System.in);
    /* using (+) and (-) operator */
    System.out.print("Enter a = ");
    a=in.nextInt();
    System.out.print("Enter b = ");
    b=in.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    // OR YOU CAN GIVE AND OPERATOR (AND GATE) FOR SWAPPING....GIVES SAME OUTPUT
    /*
    a=a+b;
    b=a-b;
    a=a-b;
    */
    System.out.println("After Swapping the numbers");
    System.out.println("a = "+a+" "+"b = "+b);
  }}

/*
OUTPUT
Enter a = 10
Enter b = 5
After Swapping the numbers
a = 5 b = 10
*/
    
    
    
