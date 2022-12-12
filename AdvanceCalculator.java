import java.util.Scanner;
import java.lang.*;
import java.io.*;

interface AdvCalculator {
	public int crosssum(int a);
	public boolean checkPrime(int a);
	public int factorial(int a);
} 
class Calculator implements AdvCalculator{
    public int crosssum(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
    public boolean checkPrime(int a){
        int c=0;
        for(int i=2;i<a;i++){
            if(a%i==0)
            c++;
        }
    if(c==0)
    return true;
        else return false;
    }
    public int factorial(int a){
        int f=1;
        while(a!=1){
            f*=a;
            a=a-1;
        }
        return f;
    }
/*4Say cheese*/
}
class Test {

	   public static void main(String[] args) {
		   Scanner myObj = new Scanner(System.in);
		   int n = myObj.nextInt();
	     Calculator cal = new Calculator();
	
	     System.out.println(cal.checkPrime(n)?"Prime number":"Not prime number");
	     int fact=cal.factorial(n);
	     System.out.println(fact);
	     System.out.println(cal.crosssum(fact));

	   }
	}
