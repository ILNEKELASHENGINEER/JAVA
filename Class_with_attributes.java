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
*/

//ABOVE PROGRAM IS FOR BEGINNER FRIENDLY AND HIGHLY LOGICAL SYNTAX.


// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    OR     ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//


//BELOW PROGRAM IS SIMPLIFIED OF ABOVE PROGRAM AND TIME COMPLEXITY IS REDUCED IN BELOW PROGRAM.

import java.io.*;
import java.util.*;
class Student{
int rollno,m1,m2,m3,sum;
}
class Main
{
    public static void main(String args[])
    {
        int n,r1=0,r2=0,r3=0,r4=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Student[] a=new Student[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Student();
            a[i].rollno=s.nextInt();
            a[i].m1=s.nextInt();
            a[i].m2=s.nextInt();
            a[i].m3=s.nextInt();
            a[i].sum=a[i].m1+a[i].m2+a[i].m3;
            System.out.println(a[i].sum);
        }
        int hm1=a[0].m1;
        int hm2=a[0].m2;
        int hm3=a[0].m3;
        int hs=a[0].m1+a[0].m2+a[0].m3;
        for(int i=0;i<n;i++)
        {
            if(hm1<=a[i].m1)
            {
                hm1=a[i].m1;
                r1=a[i].rollno;
            }
            if(hm2<=a[i].m2)
            {
                hm2=a[i].m2;
                r2=a[i].rollno;
            }
            if(hm3<=a[i].m3)
            {
                hm3=a[i].m3;
                r3=a[i].rollno;
            }
            if(hs<=a[i].m1+a[i].m2+a[i].m3)
            {
                hs=a[i].m1+a[i].m2+a[i].m3;
                r4=a[i].rollno;
            }
        }
        System.out.println(r1+" "+hm1);
        System.out.println(r2+" "+hm2);
        System.out.println(r3+" "+hm3);
        System.out.println(r4+" "+hs);
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
*/
