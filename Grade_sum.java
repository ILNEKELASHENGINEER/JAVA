import java.util.*;
class Person{
        int a;
        void calculate(int a){
        this.a =a;
        if(a>0){
        if(a>=90&&a<=100){
            System.out.println("Grade: O");
        }
        if(a>=80&&a<90){
            System.out.println("Grade: E");
        }
        if(a>=70&&a<80){
            System.out.println("Grade: A");
        }
        if(a>=55&&a<70){
            System.out.println("Grade: P");
        }
        if(a>=40&&a<55){
            System.out.println("Grade: D");
        }
        if(a<40){
            System.out.println("Grade: T");
        }}
        else{
            System.out.println("Wrong input");
        }
    }
   
}
class Student extends Person{
    String fname,lname;
    int id;
    void hell(String fname, String lname, int id){
    //int id;
    System.out.println("Name: "+lname+" "+fname);
    System.out.println("ID: "+id);}
   // calculate()
}

class Main{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Student s = new Student();
        String fname,lname;
        int id,sum=0;
        fname = in.nextLine();
        lname = in.nextLine();
        id = in.nextInt();
        s.hell(fname,lname,id);
        int a = in.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
            sum = sum+arr[i];
            }
          //  System.out.println(sum);
        Person p = new Person();
        p.calculate(sum/a);
    }
}
