import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a,b,top = -1;
        a=in.nextInt();
        int arr[]=new int[a];
        // a=in.nextInt();
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        b = in.nextInt();
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<a;i++){
            top++;
            stk.push(arr[i]);
        }
        System.out.println(stk.peek());
        stk.pop();
        System.out.println("Top Element:"+stk.peek());
            if(stk.search(b)>0)
            System.out.println("Element is found at position:"+stk.search(b));
            else{
                System.out.println("Element not found");
            }
        }
    }
/*
5
1
2
3
4
5
4
OUTPUT
5
Top Element:4
Element is found at position:1

5
120
240
360
480
864
218

864
Top element:480
Element not found
*/
