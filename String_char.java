import java.util.*;
import java.io.*;
public class String_char {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int count =0;
        System.out.print("Enter the string : ");
        String str = in.nextLine();
        System.out.print("Enter the char/element to search in given string : ");
        char c = in.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                System.out.println("The element is present @ "+(i+1));
                count++;
            }
        }
        if(count==0){
            System.out.println("The element is not present at given string");  
        }
    }
}
