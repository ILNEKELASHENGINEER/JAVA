import java.util.*; 
class main{
public static void main(String []args){
  Scanner in = new Scanner(System.in);         
  int a = in.nextInt();         
  int arr[] = new int[a];         
  for(int i=0;i<a;i++){             
    arr[i] = in.nextInt();         
  }         
  int b = in.nextInt();         
  try{             
    System.out.println("Value at "+b+" = "+arr[b]);         
  }         
  catch(ArrayIndexOutOfBoundsException e){             
    System.out.println("Array index out of bound.");         
  }     
} }
/*INPUT
5
1
2
3
4
5
4 // VALUE NEED TO PRINT
OUTPUT
Value at 5 = 5

  4
  1
  2
  3
  4
  5 //VALUE NEED TO PRINT
  Array index out of bound.
  */
