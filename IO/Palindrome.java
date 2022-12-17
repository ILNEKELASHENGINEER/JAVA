import java.util.*;
import java.lang.*;
class main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String revstr = "";
        int len = str.length();
        for(int i=(len-1);i>=0;--i){
            revstr = revstr+str.charAt(i);
        }
        if(str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is NOT a Palindrome");
        }
    }
}
/*
madam
madam is a Palindrome
placement
placement is NOT a Palindrome
*/
