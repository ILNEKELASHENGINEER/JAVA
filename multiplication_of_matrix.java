import java.io.*;
import java.util.*;
class Main {
    public static void main(String [] args) {
        int n,i,j,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        for( i=0;i<n;i++){
    for(j=0;j<n;j++){
        mat1[i][j]=sc.nextInt();
    }
}
for( i=0;i<n;i++){
    for(j=0;j<n;j++){
        mat2[i][j]=sc.nextInt();
    }
}
int arr[][]= new int[n][n];
for( i=0;i<n;i++){
    for( j=0;j<n;j++){
        for(k=0;k<n;k++){
            arr[i][j]+=mat1[i][k]*mat2[k][j];
        }
    }
}
for( i=0;i<n;i++){
    for(j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
   }
}

