import java.util.*;
class main{
    public static void main(String args[]){
        int a,b=3,c=5;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]%b==0&& arr[i]%c == 0){
                System.out.print("FizzBuzz ");
            }
            else if(arr[i]%c == 0){
                System.out.print("Buzz ");
            }
            else if(arr[i]%b == 0)
            {
                System.out.print("Fizz ");
            }
            else
            System.out.print(arr[i]+" ");
        }
    }
}

/*
input
6
1 2 3 4 5 6

output
1 2 Fizz 4 Buzz Fizz
*/
