package PraticeProblems; //to make this program as package
import java.util.*;
public class creditCardValidation { //to compile in online just give public class Main
  public static boolean validation(long credit_number) {
    return (sizecheck(credit_number)>= 13 && sizecheck(credit_number) <= 16 &&
        (prefixcheck(credit_number, 4) || prefixcheck(credit_number, 5) || 
            prefixcheck(credit_number, 37) || prefixcheck(credit_number, 6)) &&
        (sumOfEven(credit_number)+sumOfOdd(credit_number)) % 10 == 0);
  }
  public static int sizecheck(long c_num) {
    String num = c_num+"";
    return num.length();
  }
  public static boolean prefixcheck(long c_num, int d) {
    return getprefix(c_num, sizecheck(d)) == d;
  }
  public static long getprefix(long c_num, int k) {
    if(sizecheck(c_num)>k) {
      String num = c_num + "";
      return Long.parseLong(num.substring(0, k));
    }
    return c_num;
  }
  public static int sumOfOdd(long c_num) {
    int sum = 0;
    String num = c_num + "";
    for(int i = sizecheck(c_num)-1; i >= 0; i -= 2) {
      sum += Integer.parseInt(num.charAt(i)+"");
    }
    return sum;
  }
  public static int sumOfEven(long c_num) {
    int sum = 0;
    String num = c_num + "";
    for(int i = sizecheck(c_num)-1; i >= 0; i -= 2) {
      sum += getDigit(Integer.parseInt(num.charAt(i)+""));
    }
    return sum;
  }
  public static int getDigit(int num) {
    if(num<9)
      return num;
    return num/10 + num%10;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long credit_number;
    System.out.print("Enter credit card number: ");
    credit_number = sc.nextLong();
    sc.close();
    System.out.println(credit_number + " is "+ (validation(credit_number) ? "valid":"invalid"));
    /*if(prefixcheck(credit_number, 4)){
      System.out.print("The given credit card is visa card");
    }else if(prefixcheck(credit_number, 5)){
      System.out.print("The given credit card is master card");
    }else if(prefixcheck(credit_number, 6)){
      System.out.print("The given credit card is discover card");
    }else if(prefixcheck(credit_number, 37)){
      System.out.print("The given credit card is american express card");
    }else {
      System.out.print("The given credit card is does not belong given any given class");
    }*/
//     INCLUDE ABOVE COMMENT PROGRAM IF YOU NEED TO SEE WHAT CARD IS IT 
//     OR LEAVE JUST TO SEE VALID OR NOT
  }
}
