// HACKERRANK OUTPUT FORMATTING PROBLEM
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
            System.out.printf("%-14s %03d %n" , s1, x); 
//          System.out.printf("%-14s %03d \n" , s1, x); 
//               %-14s is used to fill the string for 14 character even the string is less than 14. and minus(-1) is used to format the string in leftside.
//               %03d is used to fill the digit for 3 place  even the int is less than 03.
//               %n or /n is used to move the cursor to next time.
            }
            System.out.println("================================");

}
}
/*
INPUT
java 100
cpp 65
python 50

OUTPUT
================================
java           100 
cpp            065 
python         050 
================================
*/
