import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Minimum element in array = "+arr[0]);
        System.out.println("Maximum element in array = "+arr[a-1]);
    }
}
