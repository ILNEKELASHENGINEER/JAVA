import java.util.*;
class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        int flag=0;
        for(int j=1;j<=a;j++){
            flag=-1;
            for(int i=0;i<a;i++){
                if(arr[i]==j){
                    flag=0;
                    break;
                }
            }
        if(flag==-1){
            System.out.println(j);
            break;
          }
        }
    }
}

/*
input
5
6 4 3 2 1

output
5 (missing element)
*/
