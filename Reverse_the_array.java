import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner x = new Scanner (System.in);
      System.out.print("Enter the array size = ");
        int a = x.nextInt();
        int arr[] = new int[a];
      System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=x.nextInt();
        }
      System.out.println("Reversed array elements");
        for(int i=a-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
/*
INPUT
Enter the array size = 5
Enter the array elements
1
2
3
4
5

OUTPUT
Reversed array elements
5
4
3
2
1
*/
