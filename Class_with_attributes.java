import java.io.*;
import java.util.*;
class Student{
  int roll;
int m1,m2,m3;
}
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Student s[]= new Student[n];
        for(int i=0;i<n;i++){
            s[i]=new Student();
            s[i].roll=in.nextInt();
            s[i].m1 = in.nextInt();
            s[i].m2=in.nextInt();
            s[i].m3 = in.nextInt();
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s[i].m1+s[i].m2+s[i].m3;
        }
        int maxi=arr[0],t=0;
        for(int i=0;i<n;i++){
            if(maxi<=arr[i]){
                maxi=arr[i];
                t=i;
            }
        }
        // System.out.println(maxi)
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int max=s[0].m1,o=0;
      for(int i=0;i<n;i++)
      { //o=i+1;
        if(max<=s[i].m1){
            max=s[i].m1;
            o=i;
        // System.out.print(s[i].roll); 
        }
      }System.out.println((o+1)+" "+max);
      int hell=s[0].m2,y=0;
      for(int i=0;i<n;i++){
          if(hell<=s[i].m2){
              hell=s[i].m2;
              y=i;
          }
      }
      System.out.println((y+1)+" "+hell);
      int kon=s[0].m3,z=0;
      for(int i=0;i<n;i++){
          if(kon<=s[i].m3){
              kon = s[i].m3;
              z=i;
          }
      }System.out.println((z+1)+" "+kon);
      System.out.println((t+1)+" "+maxi);
}
}

/*
INPUT
5
1 98 85 76
2 85 74 65
3 85 96 75
4 52 65 79
5 52 75 65

OUTPUT
259
224
256
196
192
1 98
1 96
4 79
1 259
